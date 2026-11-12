package com.agony;

import com.agony.config.AgonyConfig;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

/** Classe principal do AGONY. Registra a config e inicializa o lado do cliente. */
@Mod(AgonyMod.MOD_ID)
public class AgonyMod {
    public static final String MOD_ID = "agony";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AgonyMod() {
        // Gera/lê config/agony-client.toml (salvo em disco e restaurado ao reiniciar o jogo).
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, AgonyConfig.SPEC);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            ClientBootstrap.init();
        }
    }
}
