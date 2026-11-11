package br.com.farmdmz.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.FormattedText;

final class 一倀 extends Button {
  private final boolean 一倀;
  
  private boolean 一倁;
  
  一倀(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean, Button.OnPress paramOnPress) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, 一個.一倀(paramString, 一個.一倊), paramOnPress, f_252438_);
    this.一倀 = paramBoolean;
  }
  
  protected void m_87963_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    int i = (this.f_93623_ && !this.一倀) ? -420822893 : 921087096;
    一個.一倀(paramGuiGraphics, m_252754_(), m_252907_(), m_5711_(), m_93694_(), 5, i);
    int j = this.一倀 ? -447769348 : -171801775;
    if (m_198029_())
      j = this.一倀 ? -9918977 : -2647194; 
    if (!this.f_93623_ && !this.一倀)
      j = -2007811541; 
    一個.一倀(paramGuiGraphics, m_252754_() + 1, m_252907_() + 1, m_5711_() - 2, m_93694_() - 2, 4, j);
    int k = !this.f_93623_ ? -1864646488 : (this.一倀 ? -728112 : -13887729);
    if (this.一倁) {
      一個.一倀(paramGuiGraphics, 一倃.一倁, m_252754_() + 9, m_252907_() + 8, 17, 17, 17, 17, k);
    } else {
      paramGuiGraphics.m_280614_((Minecraft.m_91087_()).f_91062_, m_6035_(), m_252754_() + (m_5711_() - (Minecraft.m_91087_()).f_91062_.m_92852_((FormattedText)m_6035_())) / 2, m_252907_() + (m_93694_() - 9) / 2, k, false);
    } 
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倃$一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */