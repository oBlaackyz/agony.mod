package com.agony.command;

import com.agony.config.AgonyConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;

/**
 * Envia comandos EXISTENTES do servidor pelo cliente (não recria nenhum comando).
 * Intervalo mínimo global entre envios: impede comandos repetidos acidentais e kick por spam.
 */
public final class CommandManager {
    private long lastSentMillis = 0;

    /** @return true se enviou; false se ainda em intervalo ou sem conexão (tente no próximo tick). */
    public boolean send(String command) {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player == null || player.connection == null) return false;

        long gap = (long) (AgonyConfig.COMMAND_MIN_GAP_SECONDS.get() * 1000.0);
        long now = System.currentTimeMillis();
        if (now - lastSentMillis < gap) return false;

        String clean = command.startsWith("/") ? command.substring(1) : command;
        player.connection.sendCommand(clean);
        lastSentMillis = now;
        return true;
    }
}
