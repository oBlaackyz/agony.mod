package com.agony.util;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

/** Mensagens locais (nunca enviadas ao servidor). */
public final class Msg {
    private Msg() {}

    public static void chat(String text) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.gui != null) {
            mc.gui.getChat().addMessage(Component.literal("\u00a7c[Agony]\u00a7r " + text));
        }
    }

    public static void actionBar(String text) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.displayClientMessage(Component.literal(text), true);
        }
    }
}
