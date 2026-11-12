package com.agony.fish;

import com.agony.AgonyMod;
import com.agony.command.CommandManager;
import com.agony.config.AgonyConfig;
import com.agony.core.TeleportTracker;
import com.agony.timer.TimerManager;
import com.agony.util.Msg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.phys.Vec3;

import java.util.function.BooleanSupplier;

/**
 * Auto Peixe. Uma única variável de estado; sem threads nem agendadores.
 *
 *  GO_FISH (/home peixe) -> WAIT_FISH (chegada confirmada) -> FISHING (lança, atrai, arco, círculo,
 *  confirma, espera e repete) -> ... ; YIELD = cede a vez ao Auto Trigo quando ele precisa da fazenda.
 *
 * Lê o estado REAL do minigame pela ponte com o mod do servidor: atrai com cliques espaçados, clica no
 * arco só quando o ponteiro está na zona, clica no círculo só quando fecha e confirma só quando o jogo
 * permite. Nunca clica fora da hora.
 * update() é chamado a cada frame e a cada tick (com limite de ~8 ms), então o tempo de resposta é curto.
 */
public final class AutoFish {
    public enum State { IDLE, GO_FISH, WAIT_FISH, FISHING, YIELD }

    private static final long MIN_UPDATE_NANOS = 8_000_000L;

    private final CommandManager commands;
    private final TeleportTracker tracker;
    private final WarriorsBridge bridge;

    private final TimerManager.Delay settle = new TimerManager.Delay();
    private final TimerManager.Delay timeout = new TimerManager.Delay();

    private BooleanSupplier farmBusy = () -> false;
    private State state = State.IDLE;
    private boolean paused;
    private int teleportRetries;
    private int catches;

    private int baselineArrival;
    private int baselineCancel;
    private Vec3 posAtSend = Vec3.ZERO;
    private ClientLevel levelAtSend;
    private boolean movementSeen;

    private FishSnapshot last = FishSnapshot.none();
    private FishSnapshot.Phase lastPhase = FishSnapshot.Phase.NONE;
    private int lastSequence = -1;
    private boolean hadSession;
    private long lastUpdate;
    private long nextStart;
    private long lastStartTry;
    private long startWaitingSince;
    private long lastAttractClick;
    private long lastArcClick;
    private long lastConfirmClick;
    private long phaseSince;
    private boolean circleClicked;
    private boolean catchCounted;
    private int confirmDone;

    public AutoFish(CommandManager commands, TeleportTracker tracker, WarriorsBridge bridge) {
        this.commands = commands;
        this.tracker = tracker;
        this.bridge = bridge;
    }

    public void setFarmBusy(BooleanSupplier supplier) { this.farmBusy = supplier; }

    // ---------- Estado público ----------
    public boolean isAvailable() { return bridge.available(); }
    public boolean isRunning() { return state != State.IDLE; }
    public boolean isPaused() { return paused; }
    public State getState() { return state; }
    public int catches() { return catches; }

    /** O Auto Trigo só começa o ciclo quando a pesca está num ponto em que pode ser interrompida. */
    public boolean isSafeToInterrupt() {
        if (state != State.FISHING || !last.session()) return true;
        return last.phase() == FishSnapshot.Phase.CAST || last.phase() == FishSnapshot.Phase.ATTRACT;
    }

    public String statusText() {
        if (!isRunning()) return bridge.available() ? "Parado" : "Indisponível: " + bridge.unavailableReason();
        if (paused) return "Pausado";
        return switch (state) {
            case IDLE -> "Parado";
            case GO_FISH, WAIT_FISH -> teleportRetries > 0
                    ? "Voltando ao ponto de pesca (tentativa " + (teleportRetries + 1) + ")" : "Indo ao ponto de pesca";
            case YIELD -> "Aguardando o Auto Trigo";
            case FISHING -> fishingText();
        };
    }

    private String fishingText() {
        if (!last.session()) return "Lançando a vara";
        return switch (last.phase()) {
            case NONE, CAST -> "Lançando a vara";
            case ATTRACT -> last.bitePending() ? "Peixe mordeu" : "Atraindo peixes";
            case ARC -> "Minigame: arco";
            case CIRCLE -> "Minigame: círculo";
            case RESULT -> "Confirmando a captura";
            case TRANSITION, CLOSING -> "Minigame em andamento";
        };
    }

    // ---------- Controle ----------
    public void toggle(Minecraft mc) {
        if (isRunning()) stop("interrompido pelo usuário", true);
        else start(mc);
    }

    public void start(Minecraft mc) {
        if (isRunning()) return;
        if (!bridge.available()) {
            Msg.chat("Auto Peixe indisponível: " + bridge.unavailableReason() + ".");
            return;
        }
        if (mc.player == null || mc.level == null) {
            Msg.chat("Entre em um mundo/servidor para ligar o Auto Peixe.");
            return;
        }
        paused = false;
        teleportRetries = 0;
        resetSessionTracking();
        state = State.GO_FISH;
        Msg.chat("Auto Peixe \u00a7aligado\u00a7r.");
    }

    public void stop(String reason, boolean byUser) {
        boolean was = isRunning();
        if (was && byUser) cancelSessionQuietly();
        state = State.IDLE;
        paused = false;
        settle.cancel();
        timeout.cancel();
        if (was) Msg.chat("Auto Peixe \u00a7cdesligado\u00a7r: " + reason + ".");
    }

    public void setPaused(boolean p) {
        if (!isRunning() || paused == p) return;
        paused = p;
        Msg.chat(p ? "Auto Peixe pausado." : "Auto Peixe retomado.");
    }

    private void cancelSessionQuietly() {
        try {
            if (bridge.available() && Minecraft.getInstance().isSameThread()) bridge.cancel();
        } catch (RuntimeException e) {
            AgonyMod.LOGGER.warn("[AGONY] não foi possível cancelar a sessão de pesca", e);
        }
    }

    private void resetSessionTracking() {
        last = FishSnapshot.none();
        lastPhase = FishSnapshot.Phase.NONE;
        lastSequence = -1;
        hadSession = false;
        circleClicked = false;
        catchCounted = false;
        confirmDone = 0;
        startWaitingSince = 0;
    }

    private static long ms(double seconds) { return (long) (seconds * 1000.0); }
    private static long nanos(double seconds) { return (long) (seconds * 1_000_000_000.0); }

    // ---------- Update ----------
    public void update(Minecraft mc) {
        if (state == State.IDLE) return;
        long now = System.nanoTime();
        if (now - lastUpdate < MIN_UPDATE_NANOS) return;
        lastUpdate = now;

        if (mc.player == null || mc.level == null) {
            stop("jogador/mundo indisponível", false);
            return;
        }
        if (paused) return;

        // Prioridade do Auto Trigo: cede a vez quando ele precisa da fazenda e é seguro interromper.
        if (state != State.YIELD && farmBusy.getAsBoolean() && isSafeToInterrupt()) {
            if (state == State.FISHING) cancelSessionQuietly();
            state = State.YIELD;
            resetSessionTracking();
            Msg.chat("Auto Peixe aguardando o Auto Trigo.");
            return;
        }

        switch (state) {
            case YIELD -> {
                if (!farmBusy.getAsBoolean()) {
                    teleportRetries = 0;
                    state = State.GO_FISH;
                }
            }
            case GO_FISH -> tickGoFish(mc);
            case WAIT_FISH -> tickWaitFish(mc);
            case FISHING -> tickFishing(now);
            default -> { }
        }
    }

    private void tickGoFish(Minecraft mc) {
        if (tracker.isForeignPending()) return;
        if (!commands.send("home peixe")) return;
        tracker.expectOwnTeleport(false);
        baselineArrival = tracker.arrivalSeq();
        baselineCancel = tracker.cancelSeq();
        posAtSend = mc.player.position();
        levelAtSend = mc.level;
        movementSeen = false;
        settle.start(ms(AgonyConfig.FISH_COMMAND_WAIT_SECONDS.get()));
        timeout.start(ms(AgonyConfig.TELEPORT_TIMEOUT_SECONDS.get()));
        state = State.WAIT_FISH;
    }

    private void tickWaitFish(Minecraft mc) {
        if (tracker.cancelSeq() != baselineCancel) {
            Msg.chat("Teleporte cancelado pelo servidor. Reenviando /home peixe.");
            retryFish("teleporte cancelado repetidamente");
            return;
        }
        if (!movementSeen && (mc.level != levelAtSend || mc.player.position().distanceToSqr(posAtSend) > 4.0)) {
            movementSeen = true;
        }
        boolean settled = settle.isDone();
        boolean chunkReady = mc.level.hasChunkAt(mc.player.blockPosition());
        boolean arrivedMsg = tracker.arrivalSeq() != baselineArrival;

        if (arrivedMsg) { // qualquer chegada após o nosso comando (o formato exato do /home ainda não foi confirmado)
            if (settled && chunkReady) {
                teleportRetries = 0;
                enterFishing();
            }
            return;
        }
        if (timeout.isDone() && settled) {
            if (movementSeen && chunkReady) {
                Msg.chat("Sem mensagem de chegada; movimento detectado, seguindo.");
                teleportRetries = 0;
                enterFishing();
            } else {
                Msg.chat("Sem confirmação do teleporte. Reenviando /home peixe.");
                retryFish("teleporte sem confirmação");
            }
        }
    }

    private void enterFishing() {
        resetSessionTracking();
        nextStart = System.nanoTime();
        state = State.FISHING;
    }

    private void retryFish(String stopReason) {
        if (++teleportRetries > AgonyConfig.MAX_TELEPORT_RETRIES.get()) {
            stop(stopReason, false);
            return;
        }
        state = State.GO_FISH;
    }

    private void tickFishing(long now) {
        FishSnapshot snap = bridge.sample();
        last = snap;

        if (!snap.session()) {
            if (hadSession) { // a sessão acabou: espera um pouco antes da próxima vara
                hadSession = false;
                lastPhase = FishSnapshot.Phase.NONE;
                nextStart = now + nanos(AgonyConfig.FISH_AFTER_CATCH_WAIT_SECONDS.get());
            }
            tryStart(now);
            return;
        }
        hadSession = true;
        startWaitingSince = 0;
        trackPhase(snap, now);

        switch (snap.phase()) {
            case ATTRACT -> {
                if (!snap.bitePending() && now - lastAttractClick >= nanos(AgonyConfig.FISH_ATTRACT_INTERVAL_SECONDS.get())) {
                    if (bridge.click()) lastAttractClick = now;
                }
                if (now - phaseSince > nanos(AgonyConfig.FISH_ATTRACT_TIMEOUT_SECONDS.get())) {
                    Msg.chat("Nenhum peixe mordeu a tempo. Reiniciando a pesca.");
                    bridge.cancel();
                    phaseSince = now;
                }
            }
            case ARC -> {
                if (snap.arcReady() && now - lastArcClick >= nanos(AgonyConfig.FISH_ARC_COOLDOWN_SECONDS.get())) {
                    if (bridge.click()) lastArcClick = now;
                }
            }
            case CIRCLE -> {
                if (snap.circleReady() && !circleClicked && bridge.click()) circleClicked = true;
            }
            case RESULT -> {
                if (!catchCounted) {
                    catchCounted = true;
                    if (snap.won()) catches++;
                }
                if (snap.canConfirm() && confirmDone < AgonyConfig.FISH_CONFIRM_CLICKS.get()
                        && now - lastConfirmClick >= nanos(AgonyConfig.FISH_CONFIRM_INTERVAL_SECONDS.get())) {
                    if (bridge.click()) {
                        confirmDone++;
                        lastConfirmClick = now;
                    }
                }
            }
            default -> { }
        }

        // Trava: mesma fase por tempo demais fora da atração
        if (snap.phase() != FishSnapshot.Phase.ATTRACT && now - phaseSince > nanos(AgonyConfig.FISH_STUCK_SECONDS.get())) {
            stop("minigame travado na fase " + snap.phase(), false);
        }
    }

    private void trackPhase(FishSnapshot snap, long now) {
        if (snap.phase() != lastPhase || snap.sequence() != lastSequence) {
            if (snap.phase() == FishSnapshot.Phase.RESULT && lastPhase != FishSnapshot.Phase.RESULT) {
                catchCounted = false;
                confirmDone = 0;
            }
            if (snap.phase() != FishSnapshot.Phase.CIRCLE) circleClicked = false;
            lastPhase = snap.phase();
            lastSequence = snap.sequence();
            phaseSince = now;
        }
    }

    /** Sem sessão: tenta lançar a vara (equivale ao botão direito) em intervalos, com limite de espera. */
    private void tryStart(long now) {
        if (now < nextStart) return;
        if (startWaitingSince == 0) startWaitingSince = now;
        if (now - lastStartTry < nanos(AgonyConfig.FISH_START_RETRY_SECONDS.get())) return;
        lastStartTry = now;
        if (bridge.start()) {
            startWaitingSince = 0;
            return;
        }
        if (now - startWaitingSince > nanos(AgonyConfig.FISH_START_TIMEOUT_SECONDS.get())) {
            startWaitingSince = 0;
            Msg.chat("Não foi possível lançar a vara. Voltando ao ponto de pesca.");
            retryFish("não foi possível lançar a vara");
        }
    }
}
