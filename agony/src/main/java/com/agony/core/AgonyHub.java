package com.agony.core;

import com.agony.AgonyMod;
import com.agony.command.CommandManager;
import com.agony.config.AgonyConfig;
import com.agony.farm.AutoFarm;
import com.agony.fish.AutoFish;
import com.agony.fish.FishProbe;
import com.agony.fish.WarriorsBridge;
import com.agony.timer.TimerManager;
import net.minecraft.client.Minecraft;

/**
 * Ponto central: reúne rastreador de teleporte, comandos, estado salvo e as duas automações.
 * Cada automação roda isolada por try/catch: um erro numa não interrompe a outra.
 */
public final class AgonyHub {
    private static AgonyHub instance;

    public static AgonyHub get() {
        if (instance == null) instance = new AgonyHub();
        return instance;
    }

    public final TeleportTracker tracker = new TeleportTracker();
    public final FarmLocator locator;
    public final StateStore store = new StateStore();
    public final CommandManager commands = new CommandManager();
    public final AutoFarm farm;
    public final WarriorsBridge bridge = WarriorsBridge.create();
    public final AutoFish fish;
    public final FishProbe fishProbe = new FishProbe();

    private final TimerManager.Delay resumeDelay = new TimerManager.Delay();
    private boolean focusGuardActive;
    private boolean savedPauseOnLostFocus;

    private AgonyHub() {
        store.load();
        locator = new FarmLocator(store);
        farm = new AutoFarm(commands, tracker, store, locator);
        farm.loadSaved();
        fish = new AutoFish(commands, tracker, bridge);
        farm.setGate(fish::isSafeToInterrupt);
        fish.setFarmBusy(farm::isBusy);
    }

    public void tick(Minecraft mc) {
        if (resumeDelay.isDone()) {
            resumeDelay.cancel();
            farm.start(mc);
        }
        try {
            farm.tick(mc);
        } catch (Exception e) {
            AgonyMod.LOGGER.error("[AGONY] erro no Auto Trigo", e);
            farm.stop("erro interno (veja o log)", false);
        }
        updateFish(mc);
        try {
            fishProbe.tick(mc);
        } catch (Exception e) {
            AgonyMod.LOGGER.error("[AGONY] erro na sonda", e);
        }
        updateFocusGuard(mc);
    }

    /** Chamado a cada frame (e a cada tick): a pesca precisa de resposta rápida. */
    public void frame(Minecraft mc) {
        updateFish(mc);
    }

    private void updateFish(Minecraft mc) {
        try {
            fish.update(mc);
        } catch (Exception e) {
            AgonyMod.LOGGER.error("[AGONY] erro no Auto Peixe", e);
            fish.stop("erro interno (veja o log)", false);
        }
    }

    /** Ao entrar no mundo: só retoma se o usuário habilitou a opção específica. */
    public void onLogin() {
        if (AgonyConfig.RESUME_ON_JOIN.get() && store.data().farmWasRunning) {
            resumeDelay.start(8000); // dá tempo de o mundo carregar
        }
    }

    public void onLogout() {
        resumeDelay.cancel();
        farm.stop("você saiu do mundo/servidor", false);
        fish.stop("você saiu do mundo/servidor", false);
        tracker.reset();
    }

    /**
     * Com "pausar ao perder o foco" ligado, o Minecraft abre o menu de pausa quando outra janela fica
     * em primeiro plano, e esse menu bloquearia os cliques da automação. Desliga enquanto houver automação.
     */
    private void updateFocusGuard(Minecraft mc) {
        if (mc.options == null) return;
        boolean need = AgonyConfig.DISABLE_PAUSE_ON_LOST_FOCUS.get() && (farm.isRunning() || fish.isRunning());
        if (need && !focusGuardActive) {
            savedPauseOnLostFocus = mc.options.pauseOnLostFocus;
            mc.options.pauseOnLostFocus = false;
            focusGuardActive = true;
        } else if (!need && focusGuardActive) {
            mc.options.pauseOnLostFocus = savedPauseOnLostFocus;
            focusGuardActive = false;
        }
    }
}
