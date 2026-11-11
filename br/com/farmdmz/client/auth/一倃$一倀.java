package br.com.farmdmz.client.auth;

import br.com.farmdmz.client.一個;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.FormattedText;

final class 一倀 extends Button {
  private final boolean 一倀;
  
  一倀(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean, Button.OnPress paramOnPress) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, 一倃.一倀(paramString, true), paramOnPress, f_252438_);
    this.一倀 = paramBoolean;
  }
  
  protected void m_87963_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    int i = (this.f_93623_ && (this.一倀 || m_198029_())) ? -420822893 : 921087096;
    一個.一倀(paramGuiGraphics, m_252754_(), m_252907_(), m_5711_(), m_93694_(), 5, i);
    int j = this.一倀 ? -171801775 : -446415577;
    if (m_198029_())
      j = this.一倀 ? -2647194 : -260355027; 
    if (!this.f_93623_)
      j = -2007811541; 
    一個.一倀(paramGuiGraphics, m_252754_() + 1, m_252907_() + 1, m_5711_() - 2, m_93694_() - 2, 4, j);
    Font font = (Minecraft.m_91087_()).f_91062_;
    int k = this.f_93623_ ? (this.一倀 ? -13887729 : -728112) : -1864646488;
    paramGuiGraphics.m_280614_(font, m_6035_(), m_252754_() + (m_5711_() - font.m_92852_((FormattedText)m_6035_())) / 2, m_252907_() + (m_93694_() - 9) / 2, k, false);
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\auth\一倃$一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */