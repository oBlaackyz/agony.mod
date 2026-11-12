package com.agony.input;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

/** Gerenciador de teclas. INSERT abre o painel (reconfigurável em Controles). */
public final class KeyManager {
    public static final KeyMapping PANEL_KEY = new KeyMapping(
            "key.agony.panel", KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_INSERT, "key.categories.agony");

    /** Com qualquer tela aberta (ex.: /canteiro 1 aberto à mão), grava a estrutura dela no log. */
    public static final KeyMapping DIAG_KEY = new KeyMapping(
            "key.agony.diag", KeyConflictContext.UNIVERSAL,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_END, "key.categories.agony");

    private KeyManager() {}

    public static void onRegisterKeys(RegisterKeyMappingsEvent event) {
        event.register(PANEL_KEY);
        event.register(DIAG_KEY);
    }
}
