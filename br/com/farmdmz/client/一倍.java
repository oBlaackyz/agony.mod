package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倆;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.PlayerFaceRenderer;
import net.minecraft.client.resources.PlayerSkin;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;

public final class 一倍 {
  private static final ResourceLocation 一倀 = 一個.一倐;
  
  private static final ResourceLocation 一倁 = 一個.一倊;
  
  public static Component 一倀(String paramString) {
    return (Component)Component.m_237113_(paramString).m_130938_(paramStyle -> paramStyle.m_131150_(一倀));
  }
  
  public static Component 一倁(String paramString) {
    return (Component)Component.m_237113_(paramString).m_130938_(paramStyle -> paramStyle.m_131150_(一倁));
  }
  
  public static void 一倀(GuiGraphics paramGuiGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    paramGuiGraphics.m_280614_((Minecraft.m_91087_()).f_91062_, 一倀(paramString), paramInt1, paramInt2, paramInt3, false);
  }
  
  public static void 一倁(GuiGraphics paramGuiGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    paramGuiGraphics.m_280614_((Minecraft.m_91087_()).f_91062_, 一倁(paramString), paramInt1, paramInt2, paramInt3, false);
  }
  
  public static int 一倂(String paramString) {
    return (Minecraft.m_91087_()).f_91062_.m_92852_((FormattedText)一倀(paramString));
  }
  
  public static String 一倀(String paramString, int paramInt) {
    return (Minecraft.m_91087_()).f_91062_.m_92854_((FormattedText)一倀(paramString), Math.max(0, paramInt)).getString();
  }
  
  public static String 一倀() {
    Minecraft minecraft = Minecraft.m_91087_();
    return (minecraft.f_91074_ != null) ? minecraft.f_91074_.m_36316_().getName() : minecraft.m_91094_().m_92546_();
  }
  
  public static void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Minecraft minecraft = Minecraft.m_91087_();
    int i = Math.min(28, Math.max(18, paramInt4 - 10));
    int j = paramInt1 + 10;
    int k = paramInt2 + (paramInt4 - i) / 2;
    double d = i / 2.0D;
    PlayerSkin playerSkin = (minecraft.f_91074_ != null) ? minecraft.f_91074_.m_294544_() : minecraft.m_91109_().m_293307_(minecraft.m_294346_());
    int m;
    for (m = 0; m < i; m++) {
      double d1 = m + 0.5D - d;
      int i1 = (int)Math.floor(Math.sqrt(Math.max(0.0D, d * d - d1 * d1)));
      int i2 = j + i / 2 - i1;
      int i3 = j + i / 2 + i1;
      if (i2 < i3) {
        paramGuiGraphics.m_280588_(i2, k + m, i3, k + m + 1);
        PlayerFaceRenderer.m_293067_(paramGuiGraphics, playerSkin, j, k, i);
        paramGuiGraphics.m_280618_();
      } 
    } 
    m = j + i + 8;
    int n = paramInt2 + (paramInt4 - 23) / 2;
    一倁(paramGuiGraphics, 一倀(一倀(), paramInt3 - m - paramInt1 - 8), m, n, -1908506);
    一倀(paramGuiGraphics, 一倀(一倆.一倀("vHs9H5foUzTMBUV4eIdzStHSDm3JQXxP7kA45PFWsm50D2qKoYmX1g33FlFP+Tvgqh1P8MGJMwXnTEXO"), paramInt3 - m - paramInt1 - 8), m, n + 13, -6703677);
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倍.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */