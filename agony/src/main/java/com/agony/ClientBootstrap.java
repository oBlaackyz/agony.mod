package com.agony;

import com.agony.input.KeyManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/** Registro dos eventos de cliente. Fica separado para não carregar código de cliente em servidor. */
final class ClientBootstrap {
    private ClientBootstrap() {}

    static void init() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(KeyManager::onRegisterKeys);
        MinecraftForge.EVENT_BUS.register(new ClientEvents());
    }
}
