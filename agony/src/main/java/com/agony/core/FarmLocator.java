package com.agony.core;

import com.agony.config.AgonyConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.world.phys.Vec3;

/**
 * Sabe onde fica a fazenda. O local é aprendido quando o teleporte para a fazenda é confirmado ou quando a
 * tela de um canteiro abre, ou marcado à mão no painel, e fica salvo em disco (por servidor e dimensão).
 * Assim, quem já está na fazenda (mesmo andando por ela) não é teleportado de novo.
 */
public final class FarmLocator {
    private final StateStore store;

    public FarmLocator(StateStore store) {
        this.store = store;
    }

    public boolean hasAnchor() { return store.data().farmAnchorSet; }

    /** @param force true = sobrescreve sempre (marcação manual). */
    public void learn(Minecraft mc, boolean force) {
        if (mc.player == null || mc.level == null) return;
        StateStore.Data d = store.data();
        String dim = mc.level.dimension().location().toString();
        String server = serverId(mc);
        Vec3 p = mc.player.position();
        if (!force && d.farmAnchorSet && dim.equals(d.farmAnchorDim) && server.equals(d.farmAnchorServer)) {
            double dx = p.x - d.farmAnchorX, dz = p.z - d.farmAnchorZ;
            if (dx * dx + dz * dz < 9.0) return; // praticamente no mesmo lugar: não regrava o arquivo
        }
        d.farmAnchorSet = true;
        d.farmAnchorX = p.x;
        d.farmAnchorY = p.y;
        d.farmAnchorZ = p.z;
        d.farmAnchorDim = dim;
        d.farmAnchorServer = server;
        store.save();
    }

    /** true se o jogador está perto do local salvo (mesmo servidor e dimensão). */
    public boolean isNear(Minecraft mc) {
        StateStore.Data d = store.data();
        if (!d.farmAnchorSet || mc.player == null || mc.level == null) return false;
        if (!mc.level.dimension().location().toString().equals(d.farmAnchorDim) || !serverId(mc).equals(d.farmAnchorServer)) {
            return false;
        }
        Vec3 p = mc.player.position();
        double dx = p.x - d.farmAnchorX, dz = p.z - d.farmAnchorZ;
        double r = AgonyConfig.FARM_RADIUS_BLOCKS.get();
        return dx * dx + dz * dz <= r * r && Math.abs(p.y - d.farmAnchorY) <= 64.0;
    }

    private static String serverId(Minecraft mc) {
        ServerData sd = mc.getCurrentServer();
        return sd == null || sd.ip == null ? "singleplayer" : sd.ip;
    }
}
