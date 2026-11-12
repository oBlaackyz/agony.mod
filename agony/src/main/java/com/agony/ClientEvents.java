package com.agony;

import com.agony.core.AgonyHub;
import com.agony.input.KeyManager;
import com.agony.ui.AgonyScreen;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import com.agony.farm.HarvestUi;
import com.agony.util.Msg;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/**
 * Ponte entre o Forge e o AGONY. Não contém lógica de automação:
 * apenas repassa tick, chat e login/logout para o AgonyHub.
 * (O hub é obtido sob demanda, só depois que a config já foi carregada.)
 */
public class ClientEvents {

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        Minecraft mc = Minecraft.getInstance();

        while (KeyManager.PANEL_KEY.consumeClick()) {
            if (mc.screen == null) mc.setScreen(new AgonyScreen());
        }
        AgonyHub.get().tick(mc);
    }

    /** END com uma tela aberta: grava no log a estrutura da tela (para ajustar o clique do trigo). */
    @SubscribeEvent
    public void onScreenKey(ScreenEvent.KeyPressed.Pre event) {
        if (KeyManager.DIAG_KEY.matches(event.getKeyCode(), event.getScanCode())) {
            HarvestUi.dumpDeep(event.getScreen());
            Msg.chat("Diagnóstico da tela gravado em logs/latest.log.");
            event.setCanceled(true);
        }
    }

    /** Um evento por frame: dá ao Auto Peixe tempo de resposta curto. */
    @SubscribeEvent
    public void onRenderTick(TickEvent.RenderTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        AgonyHub.get().frame(Minecraft.getInstance());
    }

    /** Monitora TODAS as mensagens recebidas (teleportes, cancelamentos...). */
    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event) {
        String text = event.getMessage().getString();
        AgonyHub.get().tracker.onMessage(text);
        AgonyHub.get().fishProbe.onChat(text);
    }

    @SubscribeEvent
    public void onLoggingIn(ClientPlayerNetworkEvent.LoggingIn event) {
        AgonyHub.get().onLogin();
    }

    @SubscribeEvent
    public void onLoggingOut(ClientPlayerNetworkEvent.LoggingOut event) {
        AgonyHub.get().onLogout();
    }
}
