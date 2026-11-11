package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倃;
import br.com.farmdmz.client.auth.一倄;
import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.client.update.一倀;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.event.GameShuttingDownEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = "farmdmz", value = {Dist.CLIENT})
public final class FarmEvents {
  private static final KeyMapping 一倀 = new KeyMapping(一倆.一倀("x/Vcs9k15ix/CIJ8kcVSVwJCae3Xrw/06s16Mev0N65IjYnhivgfF2Ldgy1ul6CQMw=="), 260, 一倆.一倀("Iu+AgrrGH3/gMspQriH/QAO7H7YxlP21zTvNu8mpM6NXJHxa3hzWx8LRypv0sV3Lg7c="));
  
  private static final KeyMapping 一倁 = new KeyMapping(一倆.一倀("jxR5G1IiLIiZvO6MT+zIiNi6yWuI6VlitSgSVQ+hbWzqtPs3yx1fLamV6ySoFfWRRO8="), 268, 一倆.一倀("hIFERooe7qed1fUwTkLch53G5w47woXTUGNVvct0T3+NWLfeNQVFsspY/OGJFUQXofs="));
  
  @SubscribeEvent
  public static void keys(InputEvent.Key paramKey) {
    if (paramKey.getAction() != 1)
      return; 
    一倀(paramKey.getKey(), paramKey.getScanCode());
  }
  
  @SubscribeEvent
  public static void screenKeys(ScreenEvent.KeyPressed.Pre paramPre) {
    if (paramPre.getScreen() instanceof net.minecraft.client.gui.screens.controls.KeyBindsScreen)
      return; 
    if (一倀(paramPre.getKeyCode(), paramPre.getScanCode()))
      paramPre.setCanceled(true); 
  }
  
  @SubscribeEvent
  public static void keepRoomTrainingBehindPause(ScreenEvent.Opening paramOpening) {
    if (一倂.一倀(一倄.一倀.TIME_ROOM) && paramOpening.getCurrentScreen() != null && !一倒.一倀(paramOpening.getCurrentScreen()) && 一倇.一倅() && (一倇.一倀()).timeRoomBackground && 一倒.一倀(paramOpening.getNewScreen()))
      paramOpening.setNewScreen(paramOpening.getCurrentScreen()); 
  }
  
  @SubscribeEvent(priority = EventPriority.HIGH)
  public static void keepOrbTradeBehindPause(ScreenEvent.Opening paramOpening) {
    if (一倂.一倀(一倄.一倀.ORB) && (一倇.一倀()).orbBackground && 一倏.一倀(paramOpening.getCurrentScreen(), paramOpening.getNewScreen()))
      paramOpening.setNewScreen(paramOpening.getCurrentScreen()); 
  }
  
  private static boolean 一倀(int paramInt1, int paramInt2) {
    Minecraft minecraft = Minecraft.m_91087_();
    if (一倀.m_90832_(paramInt1, paramInt2)) {
      if (一倀.一倁()) {
        一倀.一倀(minecraft.f_91080_);
        return true;
      } 
      if (minecraft.f_91080_ instanceof 一倃)
        return true; 
      Screen screen1 = minecraft.f_91080_;
      if (screen1 instanceof 一倃) {
        一倃 一倃 = (一倃)screen1;
        一倃.一倁();
        return true;
      } 
      Screen screen2 = minecraft.f_91080_;
      if (screen2 instanceof 一倈) {
        一倈 一倈 = (一倈)screen2;
        一倈.一倀();
      } else {
        screen2 = minecraft.f_91080_;
        if (screen2 instanceof 一倊) {
          screen1 = screen2;
          minecraft.m_91152_(screen1.一倀());
        } else if (!(minecraft.f_91080_ instanceof 一倀)) {
          minecraft.m_91152_(new 一倀(minecraft.f_91080_));
        } 
      } 
      return true;
    } 
    if (一倁.m_90832_(paramInt1, paramInt2)) {
      if (一倀.一倁(minecraft.f_91080_))
        return true; 
      Screen screen = minecraft.f_91080_;
      if (screen instanceof 一倃) {
        一倃 一倃 = (一倃)screen;
        一倃.一倂();
        return true;
      } 
      screen = minecraft.f_91080_;
      if (screen instanceof 一倃) {
        一倃 一倃 = (一倃)screen;
        一倃.一倁();
        return true;
      } 
      screen = minecraft.f_91080_;
      if (screen instanceof 一倈) {
        一倈 一倈 = (一倈)screen;
        一倈.一倁();
        return true;
      } 
      screen = minecraft.f_91080_;
      if (screen instanceof 一倊) {
        一倊 一倊 = (一倊)screen;
        一倊.一倀().m_7379_();
        return true;
      } 
      screen = minecraft.f_91080_;
      if (screen instanceof 一倀) {
        一倀 一倀 = (一倀)screen;
        一倀.m_7379_();
        return true;
      } 
    } 
    return false;
  }
  
  @SubscribeEvent(priority = EventPriority.HIGHEST)
  public static void tick(TickEvent.ClientTickEvent paramClientTickEvent) {
    if (paramClientTickEvent.phase == TickEvent.Phase.END) {
      一倂.一個();
      一倏.一倅();
      一倇.一倖();
      一倂.一倆();
    } 
  }
  
  @SubscribeEvent
  public static void orbInventoryNotice(ClientChatReceivedEvent paramClientChatReceivedEvent) {
    一倇.一倀(paramClientChatReceivedEvent.getMessage());
    if (paramClientChatReceivedEvent instanceof ClientChatReceivedEvent.System)
      一倉.一倀(paramClientChatReceivedEvent.getMessage()); 
  }
  
  @SubscribeEvent(priority = EventPriority.HIGHEST)
  public static void manualCommand(ScreenEvent.KeyPressed.Pre paramPre) {
    if (paramPre.getKeyCode() == 257 || paramPre.getKeyCode() == 335) {
      Screen screen = paramPre.getScreen();
      if (screen instanceof ChatScreen) {
        ChatScreen chatScreen = (ChatScreen)screen;
        GuiEventListener guiEventListener = chatScreen.m_7222_();
        if (guiEventListener instanceof EditBox) {
          EditBox editBox = (EditBox)guiEventListener;
          if (editBox.m_94155_().trim().startsWith(一倆.一倀("LFKaWq4G0536GTMiFLDYXtvi2S7k6zt51kuXmOA=")))
            一倉.一倀(); 
        } 
      } 
    } 
  }
  
  @SubscribeEvent(priority = EventPriority.HIGHEST)
  public static void maintainRoomKi(TickEvent.ClientTickEvent paramClientTickEvent) {
    if (paramClientTickEvent.phase == TickEvent.Phase.END && 一倂.一倀(一倄.一倀.TIME_ROOM))
      一倒.一倂(); 
  }
  
  @SubscribeEvent(priority = EventPriority.LOWEST)
  public static void roomMovement(MovementInputUpdateEvent paramMovementInputUpdateEvent) {
    LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
    if (localPlayer != null && paramMovementInputUpdateEvent.getEntity() == localPlayer)
      一倇.一倀(localPlayer, paramMovementInputUpdateEvent.getInput()); 
  }
  
  @SubscribeEvent
  public static void rendered(TickEvent.RenderTickEvent paramRenderTickEvent) {
    if (paramRenderTickEvent.phase == TickEvent.Phase.END) {
      一倆.一倂((Minecraft.m_91087_()).f_91080_);
      一倏.一倅();
    } 
  }
  
  @SubscribeEvent
  public static void shutdown(GameShuttingDownEvent paramGameShuttingDownEvent) {
    一倂.一倊();
    一倂.一倇();
    一倇.一倔();
  }
  
  @SubscribeEvent
  public static void disconnected(ClientPlayerNetworkEvent.LoggingOut paramLoggingOut) {
    一倉.一倀();
    一倁.一倈();
    一倂.一倈();
  }
  
  @EventBusSubscriber(modid = "farmdmz", value = {Dist.CLIENT}, bus = Mod.EventBusSubscriber.Bus.MOD)
  public static final class Registration {
    @SubscribeEvent
    public static void keys(RegisterKeyMappingsEvent param1RegisterKeyMappingsEvent) {
      param1RegisterKeyMappingsEvent.register(FarmEvents.一倀);
      param1RegisterKeyMappingsEvent.register(FarmEvents.一倁);
    }
    
    @SubscribeEvent
    public static void setup(FMLClientSetupEvent param1FMLClientSetupEvent) {
      ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> new ConfigScreenHandler.ConfigScreenFactory(()));
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\FarmEvents.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */