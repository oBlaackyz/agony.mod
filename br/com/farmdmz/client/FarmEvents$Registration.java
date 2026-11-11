package br.com.farmdmz.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = "farmdmz", value = {Dist.CLIENT}, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class Registration {
  @SubscribeEvent
  public static void keys(RegisterKeyMappingsEvent paramRegisterKeyMappingsEvent) {
    paramRegisterKeyMappingsEvent.register(FarmEvents.一倀);
    paramRegisterKeyMappingsEvent.register(FarmEvents.一倁);
  }
  
  @SubscribeEvent
  public static void setup(FMLClientSetupEvent paramFMLClientSetupEvent) {
    ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> new ConfigScreenHandler.ConfigScreenFactory(()));
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\FarmEvents$Registration.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */