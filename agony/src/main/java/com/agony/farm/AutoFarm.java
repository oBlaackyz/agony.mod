package com.agony.farm;

import com.agony.AgonyMod;
import com.agony.command.CommandManager;
import com.agony.config.AgonyConfig;
import com.agony.core.FarmLocator;
import com.agony.core.StateStore;
import com.agony.core.TeleportTracker;
import com.agony.timer.TimerManager;
import com.agony.util.Msg;
import com.agony.util.TextUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.phys.Vec3;

import java.util.function.BooleanSupplier;

/**
 * Máquina de estados do Auto Trigo. UMA única variável de estado => nunca há duas etapas ao mesmo tempo.
 * Sem threads nem agendadores: tudo roda no tick e só CONSULTA timers (nada fica em segundo plano
 * depois de parar/pausar).
 *
 *  GO_FARM -> WAIT_FARM -> OPEN_CANTEIRO -> WAIT_GUI -> HARVEST -> (próximo canteiro ...)
 *  após o canteiro 4: WAIT_GROWTH (30 min reais) -> novo ciclo.
 *
 * Quem já está na fazenda (perto do local salvo) NÃO é teleportado: vai direto aos canteiros.
 * /ilhafarm só é enviado com o jogador parado (andar durante a contagem do servidor cancela o teleporte).
 * Cancelamento nunca desliga a automação; falhas repetidas entram em espera (BACKOFF) e tentam de novo,
 * para o ciclo seguinte (timer zerado) sempre acontecer sozinho.
 */
public final class AutoFarm {
    public enum State { IDLE, GO_FARM, WAIT_FARM, OPEN_CANTEIRO, WAIT_GUI, HARVEST, WAIT_GROWTH, BACKOFF }

    private static final int LAST_CANTEIRO = 4;
    private static final int MAX_CANCELS = 30;
    private static final int MAX_BACKOFFS = 10;

    private final CommandManager commands;
    private final TeleportTracker tracker;
    private final StateStore store;
    private final FarmLocator locator;

    private final TimerManager.Delay settle = new TimerManager.Delay();
    private final TimerManager.Delay timeout = new TimerManager.Delay();
    private final TimerManager.Delay clickDelay = new TimerManager.Delay();
    private final TimerManager.Delay backoffTimer = new TimerManager.Delay();
    private final TimerManager.Countdown growth = new TimerManager.Countdown();

    private State state = State.IDLE;
    private boolean paused;
    private int canteiro = 1;
    private int teleportRetries;
    private int openRetries;
    private int clickAttempts;
    private int cancels;
    private int backoffs;
    private boolean clicked;
    private boolean guiOpen;
    private boolean forceOpen;     // tenta abrir o canteiro sem /ilhafarm (talvez já esteja na fazenda)
    private boolean mustTeleport;  // ignora "já estou na fazenda" e teleporta
    private boolean probedHere;

    private int baselineArrival;
    private int baselineCancel;
    private Vec3 posAtSend = Vec3.ZERO;
    private ClientLevel levelAtSend;
    private boolean movementSeen;
    private int hudCounter;

    private Vec3 motionPos = Vec3.ZERO;
    private long motionSince = System.nanoTime();
    private boolean waitingStill;
    private boolean waitingReady;
    private long readyWaitSince;

    private BooleanSupplier gate = () -> true; // false = a pesca ainda não pode ser interrompida

    public AutoFarm(CommandManager commands, TeleportTracker tracker, StateStore store, FarmLocator locator) {
        this.commands = commands;
        this.tracker = tracker;
        this.store = store;
        this.locator = locator;
    }

    // ---------- Estado público (usado pelo painel) ----------
    public boolean isRunning() { return state != State.IDLE; }
    public boolean isPaused() { return paused; }
    public void setGate(BooleanSupplier gate) { this.gate = gate; }
    public State getState() { return state; }
    public int getCanteiro() { return canteiro; }
    public boolean hasCountdown() { return growth.isSet(); }
    public long growthRemainingMillis() { return growth.remainingMillis(); }
    public boolean hasFarmAnchor() { return locator.hasAnchor(); }

    /** Ocupado = em ciclo (não está só aguardando o crescimento). Usado para a pesca ceder a vez. */
    public boolean isBusy() { return isRunning() && !paused && state != State.WAIT_GROWTH; }

    public String statusText() {
        if (!isRunning()) return "Parado";
        if (paused) return "Pausado";
        return switch (state) {
            case IDLE -> "Parado";
            case GO_FARM -> waitingStill ? "Aguardando você parar de se mover" : "Indo para a fazenda";
            case WAIT_FARM -> teleportRetries > 0
                    ? "Teleportando (tentativa " + (teleportRetries + 1) + ")" : "Teleportando para a fazenda";
            case OPEN_CANTEIRO, WAIT_GUI -> "Abrindo canteiro " + canteiro + " de " + LAST_CANTEIRO;
            case HARVEST -> waitingReady ? "Aguardando o canteiro " + canteiro + " ficar pronto"
                    : "Colhendo/plantando canteiro " + canteiro + " de " + LAST_CANTEIRO;
            case WAIT_GROWTH -> "Aguardando o crescimento";
            case BACKOFF -> "Nova tentativa em " + TextUtil.formatTime(backoffTimer.remainingMillis());
        };
    }

    /** Restaura a contagem salva em disco (sem iniciar a automação). */
    public void loadSaved() {
        long saved = store.data().farmDeadlineEpochMs;
        if (saved <= 0) return;
        long max = System.currentTimeMillis() + 600L * 60_000L;
        try {
            max = System.currentTimeMillis() + AgonyConfig.GROWTH_MINUTES.get() * 60_000L;
        } catch (IllegalStateException ignored) { /* config ainda não carregada */ }
        growth.restore(Math.min(saved, max)); // protege contra relógio do sistema alterado
    }

    // ---------- Controle ----------
    public void toggle(Minecraft mc) {
        if (isRunning()) stop("interrompido pelo usuário", true);
        else start(mc);
    }

    public void start(Minecraft mc) {
        if (isRunning()) return;
        if (mc.player == null || mc.level == null) {
            Msg.chat("Entre em um mundo/servidor para ligar o Auto Trigo.");
            return;
        }
        paused = false;
        backoffs = 0;
        store.data().farmWasRunning = true;
        store.save();

        if (growth.isSet() && !growth.isDone()) {
            state = State.WAIT_GROWTH; // o trigo ainda está crescendo no servidor: não colher antes da hora
            Msg.chat("Auto Trigo \u00a7aligado\u00a7r. Retomando a contagem: " + TextUtil.formatTime(growth.remainingMillis()) + ".");
        } else {
            clearGrowth();
            beginCycle();
            Msg.chat("Auto Trigo \u00a7aligado\u00a7r.");
        }
    }

    /** Começa um ciclo: o estado GO_FARM decide se precisa teleportar ou se já está na fazenda. */
    private void beginCycle() {
        canteiro = 1;
        teleportRetries = 0;
        openRetries = 0;
        cancels = 0;
        forceOpen = false;
        mustTeleport = false;
        probedHere = false;
        readyWaitSince = 0;
        state = State.GO_FARM;
    }

    /** @param byUser true = parada pedida pelo usuário (não será retomada sozinha ao entrar no mundo). */
    public void stop(String reason, boolean byUser) {
        boolean was = isRunning();
        state = State.IDLE;
        paused = false;
        settle.cancel();
        timeout.cancel();
        clickDelay.cancel();
        backoffTimer.cancel();
        waitingStill = false;
        waitingReady = false;
        // A contagem de crescimento NÃO é apagada: o trigo continua crescendo no servidor.
        if (byUser) {
            store.data().farmWasRunning = false;
            store.save();
        }
        if (was) Msg.chat("Auto Trigo \u00a7cdesligado\u00a7r: " + reason + ".");
    }

    public void setPaused(boolean p) {
        if (!isRunning() || paused == p) return;
        paused = p;
        Msg.chat(p ? "Auto Trigo pausado." : "Auto Trigo retomado.");
    }

    /** Apaga a contagem (ex.: o usuário colheu manualmente). */
    public void resetCountdown() {
        clearGrowth();
        if (state == State.WAIT_GROWTH) Msg.chat("Contagem zerada: o próximo ciclo começa agora.");
    }

    /** Marca o local atual como a fazenda (a partir daí, andar por perto não dispara teleporte). */
    public void markFarmHere(Minecraft mc) {
        if (mc.player == null || mc.level == null) return;
        locator.learn(mc, true);
        Msg.chat("Local da fazenda marcado aqui (raio de " + AgonyConfig.FARM_RADIUS_BLOCKS.get().intValue() + " blocos).");
    }

    private void clearGrowth() {
        growth.clear();
        persistDeadline();
    }

    private void persistDeadline() {
        store.data().farmDeadlineEpochMs = growth.isSet() ? growth.deadlineEpochMs() : 0;
        store.save();
    }

    private boolean atFarm(Minecraft mc) {
        return locator.hasAnchor() ? locator.isNear(mc) : tracker.atFarm();
    }

    private static long ms(double seconds) { return (long) (seconds * 1000.0); }
    private static long nanos(double seconds) { return (long) (seconds * 1_000_000_000.0); }

    // ---------- Tick ----------
    public void tick(Minecraft mc) {
        if (state == State.IDLE) return;
        if (mc.player == null || mc.level == null) {
            stop("jogador/mundo indisponível", false);
            return;
        }
        trackMotion(mc);
        if (!paused) {
            switch (state) {
                case GO_FARM -> tickGoFarm(mc);
                case WAIT_FARM -> tickWaitFarm(mc);
                case OPEN_CANTEIRO -> tickOpenCanteiro(mc);
                case WAIT_GUI -> tickWaitGui(mc);
                case HARVEST -> tickHarvest(mc);
                case WAIT_GROWTH -> tickGrowth();
                case BACKOFF -> tickBackoff();
                default -> { }
            }
        }
        if (state != State.IDLE && ++hudCounter % 20 == 0) {
            String extra = state == State.WAIT_GROWTH ? " " + TextUtil.formatTime(growth.remainingMillis()) : "";
            Msg.actionBar("Agony \u00b7 Trigo: " + statusText() + extra);
        }
    }

    /** Há quanto tempo o jogador está parado (qualquer deslocamento maior que ~2 cm reinicia). */
    private void trackMotion(Minecraft mc) {
        Vec3 p = mc.player.position();
        if (p.distanceToSqr(motionPos) > 0.0004) {
            motionPos = p;
            motionSince = System.nanoTime();
        }
    }

    private double stillSeconds() {
        return (System.nanoTime() - motionSince) / 1.0e9;
    }

    private void tickGoFarm(Minecraft mc) {
        if (!gate.getAsBoolean()) return;              // pesca em fase que não pode ser interrompida
        if (tracker.isForeignPending()) return;        // jogador está em outro teleporte: não interferir
        if (!mustTeleport && atFarm(mc)) {             // já está na fazenda: vai direto aos canteiros
            waitingStill = false;
            Msg.chat("Você já está na fazenda: abrindo os canteiros.");
            openRetries = 0;
            state = State.OPEN_CANTEIRO;
            return;
        }
        waitingStill = stillSeconds() < AgonyConfig.RECOVER_STILL_SECONDS.get();
        if (waitingStill) return;                      // andar cancela o teleporte: espera ficar parado
        if (!commands.send("ilhafarm")) return;        // intervalo mínimo: tenta no próximo tick
        tracker.expectOwnTeleport(false);
        baselineArrival = tracker.arrivalSeq();
        baselineCancel = tracker.cancelSeq();
        posAtSend = mc.player.position();
        levelAtSend = mc.level;
        movementSeen = false;
        settle.start(ms(AgonyConfig.FARM_COMMAND_WAIT_SECONDS.get()));
        timeout.start(ms(AgonyConfig.TELEPORT_TIMEOUT_SECONDS.get()));
        state = State.WAIT_FARM;
    }

    private void tickWaitFarm(Minecraft mc) {
        // 1) Cancelamento: nunca desliga; volta a GO_FARM, que espera o jogador parar antes de reenviar.
        if (tracker.cancelSeq() != baselineCancel) {
            if (++cancels > MAX_CANCELS) {
                stop("teleporte cancelado muitas vezes", false);
                return;
            }
            Msg.chat("Teleporte cancelado pelo servidor. Fique parado que tento de novo.");
            state = State.GO_FARM;
            return;
        }
        if (!movementSeen && (mc.level != levelAtSend || mc.player.position().distanceToSqr(posAtSend) > 4.0)) {
            movementSeen = true;
        }
        boolean settled = settle.isDone();
        boolean chunkReady = mc.level.hasChunkAt(mc.player.blockPosition());
        boolean arrivedMsg = tracker.arrivalSeq() != baselineArrival;

        // 2) Chegada confirmada pela mensagem do servidor + espera mínima + terreno carregado.
        if (arrivedMsg && tracker.lastArrivalIsFarm()) {
            if (settled && chunkReady) onFarmArrived(mc);
            return;
        }
        if (arrivedMsg) { // chegou, mas a outro lugar
            Msg.chat("Chegou a '" + tracker.lastDestination() + "', não à fazenda. Reenviando /ilhafarm.");
            retryFarm("destino incorreto repetidamente");
            return;
        }
        // 3) Sem mensagem dentro do limite.
        if (timeout.isDone() && settled) {
            if (movementSeen && chunkReady) {
                Msg.chat("Sem mensagem de chegada; movimento detectado, seguindo.");
                onFarmArrived(mc);
            } else if (!probedHere) {
                // Nenhum sinal: talvez já esteja na fazenda. Tenta abrir os canteiros daqui, sem reenviar.
                probedHere = true;
                forceOpen = true;
                openRetries = 0;
                Msg.chat("Sem resposta ao /ilhafarm. Tentando abrir os canteiros daqui.");
                state = State.OPEN_CANTEIRO;
            } else {
                Msg.chat("Sem confirmação do teleporte. Reenviando /ilhafarm.");
                retryFarm("teleporte sem confirmação");
            }
        }
    }

    private void onFarmArrived(Minecraft mc) {
        teleportRetries = 0;
        openRetries = 0;
        mustTeleport = false;
        forceOpen = false;
        locator.learn(mc, false);
        state = State.OPEN_CANTEIRO;
    }

    private void retryFarm(String reason) {
        mustTeleport = true;
        if (++teleportRetries > AgonyConfig.MAX_TELEPORT_RETRIES.get()) {
            enterBackoff(reason);
            return;
        }
        state = State.GO_FARM;
    }

    /** Falhas repetidas: espera um tempo e tenta de novo (o ciclo nunca fica parado sozinho). */
    private void enterBackoff(String reason) {
        if (++backoffs > MAX_BACKOFFS) {
            stop(reason + " (várias tentativas)", false);
            return;
        }
        teleportRetries = 0;
        backoffTimer.start(ms(AgonyConfig.FARM_BACKOFF_SECONDS.get()));
        Msg.chat("Não consegui chegar à fazenda (" + reason + "). Nova tentativa em "
                + AgonyConfig.FARM_BACKOFF_SECONDS.get().intValue() + " s.");
        state = State.BACKOFF;
    }

    private void tickBackoff() {
        if (backoffTimer.isDone()) {
            backoffTimer.cancel();
            mustTeleport = true;
            state = State.GO_FARM;
        }
    }

    private void tickOpenCanteiro(Minecraft mc) {
        if (!forceOpen && !atFarm(mc)) { state = State.GO_FARM; return; } // saiu da fazenda: volta antes de continuar
        if (tracker.isForeignPending()) return;
        if (!commands.send("canteiro " + canteiro)) return;
        tracker.expectOwnTeleport(true);
        clicked = false;
        clickAttempts = 0;
        guiOpen = false;
        readyWaitSince = 0;
        waitingReady = false;
        settle.cancel();
        timeout.start(ms(AgonyConfig.CANTEIRO_OPEN_TIMEOUT_SECONDS.get()));
        state = State.WAIT_GUI;
    }

    private void tickWaitGui(Minecraft mc) {
        if (!forceOpen && !atFarm(mc)) { state = State.GO_FARM; return; }
        Screen s = mc.screen;
        if (HarvestUi.isCandidate(s)) {
            if (!guiOpen) { // tela acabou de abrir: espera carregar antes de qualquer interação
                guiOpen = true;
                settle.start(ms(AgonyConfig.GUI_SETTLE_SECONDS.get()));
                locator.learn(mc, false); // a tela abriu aqui: este é um local válido da fazenda
                forceOpen = false;
                if (AgonyConfig.DIAGNOSTICS.get()) HarvestUi.dumpDeep(s);
            }
            if (settle.isDone()) state = State.HARVEST;
            return;
        }
        guiOpen = false;
        if (timeout.isDone()) {
            if (forceOpen) { // não abriu daqui: então precisa mesmo teleportar
                forceOpen = false;
                Msg.chat("Os canteiros não abriram daqui. Enviando /ilhafarm.");
                retryFarm("os canteiros não abriram");
            } else if (++openRetries > 2) {
                Msg.chat("A tela do canteiro " + canteiro + " não abriu. Voltando à fazenda.");
                retryFarm("a tela do canteiro não abriu");
            } else {
                Msg.chat("A tela do canteiro " + canteiro + " não abriu. Reenviando.");
                state = State.OPEN_CANTEIRO;
            }
        }
    }

    /**
     * Colhe/planta com um clique no botão da tela e CONFIRMA pelo aviso do servidor ("Plantado no canteiro N").
     * Antes de clicar, confere a hora de término informada pelo servidor (se o trigo ainda não está pronto,
     * espera até o limite configurado). Sem confirmação, repete o clique poucas vezes (nada de cliques contínuos).
     */
    private void tickHarvest(Minecraft mc) {
        Screen s = mc.screen;
        if (!HarvestUi.isCandidate(s)) { // a tela fechou antes do clique
            state = State.OPEN_CANTEIRO;
            return;
        }
        if (!clicked) {
            if (shouldWaitForReady(s)) return;
            double x, y;
            String how;
            double[] hit;
            AbstractWidget w = HarvestUi.findButton(s);
            if (w != null) {
                x = w.getX() + w.getWidth() / 2.0;
                y = w.getY() + w.getHeight() / 2.0;
                how = "widget";
            } else if ((hit = HarvestUi.findMainButton(s)) != null) {
                x = hit[0];
                y = hit[1];
                how = "area clicavel da tela";
            } else {
                x = s.width * AgonyConfig.FALLBACK_BUTTON_X.get();
                y = s.height * AgonyConfig.FALLBACK_BUTTON_Y.get();
                how = "posicao de reserva";
            }
            HarvestUi.click(s, x, y);
            clicked = true;
            clickAttempts++;
            clickDelay.start(ms(AgonyConfig.AFTER_CLICK_DELAY_SECONDS.get()));
            AgonyMod.LOGGER.info("[AGONY] canteiro {}: clique {} em ({}, {}) via {}", canteiro, clickAttempts, (int) x, (int) y, how);
            return;
        }
        if (!clickDelay.isDone()) return;

        HarvestUi.Toast toast = HarvestUi.readToast(s);
        if (toast == null) { // a tela não expõe o aviso: confia em um clique
            finishCanteiro(s);
            return;
        }
        String msg = TextUtil.normalize(toast.message());
        AgonyMod.LOGGER.info("[AGONY] canteiro {}: aviso do servidor '{}' (ok={})", canteiro, toast.message(), toast.ok());
        if (msg.contains("plantado")) { // colheu e replantou
            finishCanteiro(s);
            return;
        }
        if (!msg.isEmpty() && !toast.ok()) { // o servidor recusou
            Msg.chat("Canteiro " + canteiro + ": " + toast.message());
            finishCanteiro(s);
            return;
        }
        if (clickAttempts >= AgonyConfig.MAX_CLICK_ATTEMPTS.get()) {
            Msg.chat("Canteiro " + canteiro + ": sem confirmação de plantio; seguindo.");
            finishCanteiro(s);
            return;
        }
        clicked = false; // colheu mas ainda não plantou, ou o clique não valeu: mais um clique (limitado)
    }

    /** true = ainda aguardando o servidor liberar a colheita deste canteiro. */
    private boolean shouldWaitForReady(Screen s) {
        HarvestUi.Plot plot = HarvestUi.readPlot(s);
        if (plot == null) return false;
        long remaining = plot.readyAtMs() - System.currentTimeMillis();
        if (remaining <= 5000) {
            waitingReady = false;
            return false;
        }
        long now = System.nanoTime();
        if (readyWaitSince == 0) {
            readyWaitSince = now;
            AgonyMod.LOGGER.info("[AGONY] canteiro {}: ainda crescendo (faltam {}), estado={}",
                    canteiro, TextUtil.formatTime(remaining), plot.state());
        }
        if (now - readyWaitSince < nanos(AgonyConfig.READY_WAIT_MAX_SECONDS.get())) {
            waitingReady = true;
            return true;
        }
        waitingReady = false; // passou do limite: clica mesmo assim (o servidor decide)
        return false;
    }

    private void finishCanteiro(Screen s) {
        long serverReadyAt = 0;
        HarvestUi.Plot plot = HarvestUi.readPlot(s); // antes de fechar a tela
        if (plot != null) serverReadyAt = plot.readyAtMs();
        if (AgonyConfig.CLOSE_SCREEN_AFTER_HARVEST.get()) s.onClose();
        waitingReady = false;
        readyWaitSince = 0;
        if (canteiro < LAST_CANTEIRO) {
            canteiro++;
            openRetries = 0;
            state = State.OPEN_CANTEIRO;
        } else {
            // O temporizador começa SOMENTE agora, depois do canteiro 4. Se o servidor informou a hora em que
            // este canteiro fica pronto (e é coerente), a contagem acompanha essa hora; senão, 30 min a partir de agora.
            long now = System.currentTimeMillis();
            long minutes = AgonyConfig.GROWTH_MINUTES.get();
            long full = minutes * 60_000L;
            if (serverReadyAt > now + 60_000L && serverReadyAt <= now + full + 120_000L) {
                growth.restore(serverReadyAt + 2000L);
            } else {
                growth.startFromNow(full);
            }
            persistDeadline();
            canteiro = 1;
            state = State.WAIT_GROWTH;
            Msg.chat("Canteiros concluídos. Próximo ciclo em " + TextUtil.formatTime(growth.remainingMillis()) + ".");
        }
    }

    /** Timer zerado: começa um novo ciclo (teleporta se não estiver na fazenda, colhe e planta de novo). */
    private void tickGrowth() {
        if (!growth.isSet() || growth.isDone()) {
            clearGrowth();
            Msg.chat("Tempo de crescimento concluído. Iniciando um novo ciclo.");
            beginCycle();
        }
    }
}
