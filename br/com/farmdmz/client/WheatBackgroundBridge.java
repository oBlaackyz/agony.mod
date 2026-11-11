package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倄;
import br.com.farmdmz.client.auth.一倆;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = "farmdmz", value = {Dist.CLIENT})
public final class WheatBackgroundBridge {
  private static final 一倔<Screen, Object> 一倀 = new 一倔<>();
  
  public static void 一倀() {
    一倀.一倀();
  }
  
  public static void 一倀(int paramInt, long paramLong) {
    if (!一倁()) {
      一倀();
      return;
    } 
    一倀.一倀(paramInt, System.currentTimeMillis(), paramLong);
  }
  
  public static boolean 一倁(int paramInt, long paramLong) {
    return (一倁() && 一倀.一倀(paramInt, paramLong));
  }
  
  public static boolean 一倂(int paramInt, long paramLong) {
    return (一倁() && 一倀.一倁(paramInt, paramLong));
  }
  
  public static Object 一倃(int paramInt, long paramLong) {
    return 一倁() ? 一倀.一倆(paramInt, paramLong) : null;
  }
  
  public static boolean 一倄(int paramInt, long paramLong) {
    if (!一倁()) {
      一倀();
      return false;
    } 
    if (一倀.一倁(paramInt, paramLong))
      return false; 
    Screen screen = 一倀.一倅(paramInt, paramLong);
    return (screen != null && 一倆.一倁(screen) != 一倀.一倆(paramInt, paramLong)) ? true : 一倀.一倃(paramInt, paramLong);
  }
  
  @SubscribeEvent
  public static void preservePauseScreen(ScreenEvent.Opening paramOpening) {
    if (!一倁()) {
      一倀();
      return;
    } 
    Screen screen1 = paramOpening.getCurrentScreen();
    Screen screen2 = paramOpening.getNewScreen();
    long l = System.currentTimeMillis();
    if (一倆.一倄(screen1) && 一倄.一倀(screen2)) {
      int j = 一倇.一倂();
      if (j >= 0)
        一倀(screen1, j, l, true); 
      return;
    } 
    int i = 一倀.一倁();
    if (!一倆.一倄(screen2) || !一倀.一倁(i, l))
      return; 
    if (一倀(screen2, i, l, false) && 一倄.一倀(screen1))
      paramOpening.setNewScreen(screen1); 
  }
  
  private static boolean 一倀(Screen paramScreen, int paramInt, long paramLong, boolean paramBoolean) {
    try {
      一倎.一倀 一倀 = 一倎.一倀(paramScreen);
      if (一倀.一倀() == null || 一倀.一倁() != paramInt || 一倀.一倂() < 0 || 一倀.一倂() > 2)
        return false; 
      if (paramBoolean) {
        一倀.一倁(paramInt, paramScreen, 一倀.一倀(), paramLong);
        return 一倀.一倀(paramInt, paramLong);
      } 
      return 一倀.一倀(paramInt, paramScreen, 一倀.一倀(), paramLong);
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      LogUtils.getLogger().warn(一倆.一倀("VDl8MRZddMpSUnP/LCI38xhnrA4T+Wyn2qKNvWFdW8X3JpLWQUFnCpBnb7XnxTIcU5h5I5UbDXXyZEbwcAU/H+NPNR4LV50vog6szCjFDxZahxGrAyXdwrO63G29XCGRBQbWT4v453wreSk="), 一倀(reflectiveOperationException));
      return false;
    } 
  }
  
  public static 一倀 一倅(int paramInt, long paramLong) {
    if (!一倁())
      return 一倀(paramInt, 一倆.一倀("6rojGG7oD638MdG7unF644KDEyGefz2cZJprlqKJPfENXCYR/EGQ58eFY24L54JssduTjnV4USLWEAqmM2onvA==")); 
    Screen screen = 一倀.一倅(paramInt, paramLong);
    if (screen == null)
      return 一倀(paramInt, 一倆.一倀("xdHt3KXMva7kaQmTk5Kv4GEwpoUnMB6c++wjQfCKG2g1jZalwYnEcjwlv2uNtSjuhKG1T3K0WyLpFpP8m2sMqsg=")); 
    一倆.一倃 一倃 = 一倆.一倀(screen, paramInt);
    if (!一倃.一倀() || 一倃.一倁() != paramInt || 一倃.一倂() < 0 || 一倃.一倂() > 2)
      return 一倀(paramInt, 一倃.一倅().isBlank() ? 一倆.一倀("Ti/D9ZtEl4p0n8DCkwJi3w0rxPSjBU9pLsM2SwQChaWXWa0y3CZnWycdTCvzhqPpGrwa8WUN3ZA=") : 一倃.一倅()); 
    boolean bool1 = (一倆.一倁(screen) == 一倀.一倆(paramInt, paramLong)) ? true : false;
    boolean bool2 = (bool1 && 一倀.一倂(paramInt, paramLong)) ? true : false;
    String str = bool2 ? 一倃.一倅() : 一倆.一倀("5kfspIqBGeH1rBQaAsH9Gm0iJqBzBDmZ2vcRbQ==");
    return new 一倀(true, paramInt, 一倃.一倂(), 一倃.一倃(), (bool2 && 一倃.一倄()), str);
  }
  
  public static boolean 一倀(int paramInt, boolean paramBoolean, long paramLong) {
    Minecraft minecraft = Minecraft.m_91087_();
    if (!一倁() || minecraft.f_91074_ == null || minecraft.f_91073_ == null || minecraft.m_91403_() == null || !一倀.一倂(paramInt, paramLong))
      return false; 
    一倀 一倀 = 一倅(paramInt, paramLong);
    Screen screen = 一倀.一倅(paramInt, paramLong);
    if (!一倀.一倀() || !一倀.一倄() || 一倀.一倂() != (paramBoolean ? 2 : 0) || screen == null || 一倆.一倁(screen) != 一倀.一倆(paramInt, paramLong))
      return false; 
    if (!一倆.一倁(screen, paramInt))
      return false; 
    一倀.一倄(paramInt, paramLong);
    return true;
  }
  
  private static boolean 一倁() {
    return (一倇.一倁() && (一倇.一倀()).background && 一倂.一倀(一倄.一倀.WHEAT));
  }
  
  private static 一倀 一倀(int paramInt, String paramString) {
    return new 一倀(false, paramInt, -1, 0L, false, paramString);
  }
  
  private static String 一倀(Throwable paramThrowable) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/lang/reflect/InvocationTargetException
    //   4: ifeq -> 26
    //   7: aload_0
    //   8: checkcast java/lang/reflect/InvocationTargetException
    //   11: astore_2
    //   12: aload_2
    //   13: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   16: ifnull -> 26
    //   19: aload_2
    //   20: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   23: goto -> 27
    //   26: aload_0
    //   27: astore_1
    //   28: aload_1
    //   29: invokevirtual getClass : ()Ljava/lang/Class;
    //   32: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   35: aload_1
    //   36: invokevirtual getMessage : ()Ljava/lang/String;
    //   39: ifnonnull -> 51
    //   42: ldc_w 'l0QTrkgxs2xgFWQtgBxAVCq+0cvNl+ZwMnLdPQ=='
    //   45: invokestatic 一倀 : (Ljava/lang/String;)Ljava/lang/String;
    //   48: goto -> 60
    //   51: aload_1
    //   52: invokevirtual getMessage : ()Ljava/lang/String;
    //   55: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   60: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   65: areturn
  }
  
  public static final class 一倀 extends Record {
    private final boolean 一倀;
    
    private final int 一倁;
    
    private final int 一倂;
    
    private final long 一倃;
    
    private final boolean 一倄;
    
    private final String 一倅;
    
    public 一倀(boolean param1Boolean1, int param1Int1, int param1Int2, long param1Long, boolean param1Boolean2, String param1String) {
      this.一倀 = param1Boolean1;
      this.一倁 = param1Int1;
      this.一倂 = param1Int2;
      this.一倃 = param1Long;
      this.一倄 = param1Boolean2;
      this.一倅 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/WheatBackgroundBridge$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/WheatBackgroundBridge$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/WheatBackgroundBridge$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public boolean 一倀() {
      return this.一倀;
    }
    
    public int 一倁() {
      return this.一倁;
    }
    
    public int 一倂() {
      return this.一倂;
    }
    
    public long 一倃() {
      return this.一倃;
    }
    
    public boolean 一倄() {
      return this.一倄;
    }
    
    public String 一倅() {
      return this.一倅;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\WheatBackgroundBridge.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */