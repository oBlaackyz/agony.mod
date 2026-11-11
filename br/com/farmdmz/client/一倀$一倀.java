package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倆;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

final class 一倀 extends Button {
  private static final ResourceLocation 一倀 = 一個.一倀(一倆.一倀("1NiytjLnGHWLe1NYN0XDyCWSppe/ktF4T13EQBnmun7yMoQr17OsLblBd7a5"));
  
  private final int 一倁;
  
  一倀(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Runnable paramRunnable) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, (Component)Component.m_237113_(一倆.一倀("zEup8lj2VtT7R2GFbzY40v8RHv9Uj6/StSiIdjbh5pc=")), paramButton -> paramRunnable.run(), f_252438_);
    this.一倁 = paramInt5;
  }
  
  protected void m_87963_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    paramGuiGraphics.m_280168_().m_85836_();
    paramGuiGraphics.m_280168_().m_252880_(m_252754_(), m_252907_(), 0.0F);
    paramGuiGraphics.m_280168_().m_85841_(m_5711_() / this.一倁, m_93694_() / 60.0F, 1.0F);
    RenderSystem.enableBlend();
    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    一倀(paramGuiGraphics, 0, this.一倁);
    if (m_198029_())
      一倀(paramGuiGraphics, 60, this.一倁); 
    一個.一倁(paramGuiGraphics, 一倆.一倀("dZpBzd43vPFEcFlkBGZPTaG2zih6zfvkCMmzOd0dPsI="), this.一倁 / 2, 16, -526345, 一個.一們);
    paramGuiGraphics.m_280168_().m_85849_();
  }
  
  private static void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2) {
    byte b = 8;
    int i = 60 - 2 * b;
    一倀(paramGuiGraphics, 0, 0, b, b, paramInt1, 0, b, b);
    一倀(paramGuiGraphics, b, 0, paramInt2 - 2 * b, b, paramInt1 + b, 0, i, b);
    一倀(paramGuiGraphics, paramInt2 - b, 0, b, b, paramInt1 + 60 - b, 0, b, b);
    一倀(paramGuiGraphics, 0, b, b, i, paramInt1, b, b, i);
    一倀(paramGuiGraphics, b, b, paramInt2 - 2 * b, i, paramInt1 + b, b, i, i);
    一倀(paramGuiGraphics, paramInt2 - b, b, b, i, paramInt1 + 60 - b, b, b, i);
    一倀(paramGuiGraphics, 0, 60 - b, b, b, paramInt1, 60 - b, b, b);
    一倀(paramGuiGraphics, b, 60 - b, paramInt2 - 2 * b, b, paramInt1 + b, 60 - b, i, b);
    一倀(paramGuiGraphics, paramInt2 - b, 60 - b, b, b, paramInt1 + 60 - b, 60 - b, b, b);
  }
  
  private static void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    paramGuiGraphics.m_280168_().m_85836_();
    paramGuiGraphics.m_280168_().m_252880_(paramInt1, paramInt2, 0.0F);
    paramGuiGraphics.m_280168_().m_85841_(paramInt3 / paramInt7, paramInt4 / paramInt8, 1.0F);
    paramGuiGraphics.m_280163_(一倀, 0, 0, paramInt5, paramInt6, paramInt7, paramInt8, 120, 60);
    paramGuiGraphics.m_280168_().m_85849_();
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倀$一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */