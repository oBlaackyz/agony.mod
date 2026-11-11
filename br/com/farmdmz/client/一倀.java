package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.client.update.一倀;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public final class 一倀 extends Screen {
  private static final int 一倀 = 1920;
  
  private static final int 一倁 = 1011;
  
  private static final ResourceLocation 一倂 = new ResourceLocation(一倆.一倀("iNx/Ur/H3iVokcJ6F8YTDPNb6WdtpV22W7zMGn10jX6ocwE="), 一倆.一倀("dh7HoKpYVis4TlHACsUWeUgxm27+t2XdM/rSd2Fqd0nGzRqoTtn8CKA6vt2uHUiuKAQDoAtd+Ws="));
  
  private final Screen 一倃;
  
  private PostChain 一倄;
  
  private int 一倅;
  
  private int 一倆;
  
  private boolean 一倇;
  
  private float 一倈;
  
  private float 一倉;
  
  private float 一倊;
  
  public 一倀(Screen paramScreen) {
    super((Component)Component.m_237113_(一倆.一倀("dOXGCW6a/XjBFILXAeeu9vWuuxi3Qvv5OA1rkzVIw+CVmfVhiFwDiQ==")));
    this.一倃 = paramScreen;
  }
  
  public Screen 一倀() {
    return this.一倃;
  }
  
  protected void m_7856_() {
    一倀.一倀(一倂.一倀());
    this.一倈 = Math.min(this.f_96543_ / 1920.0F, this.f_96544_ / 1011.0F);
    this.一倉 = (this.f_96543_ - 1920.0F * this.一倈) / 2.0F;
    this.一倊 = (this.f_96544_ - 1011.0F * this.一倈) / 2.0F;
    m_142416_((GuiEventListener)一倀(858, 474, 205, () -> {
            if (一倂.一倁(this))
              this.f_96541_.m_91152_(new 一倊(this)); 
          }));
  }
  
  public void m_86600_() {
    if (一倀.一倁())
      一倀.一倀(this.一倃); 
  }
  
  private 一倀 一倀(int paramInt1, int paramInt2, int paramInt3, Runnable paramRunnable) {
    int i = Math.round(this.一倉 + paramInt1 * this.一倈);
    int j = Math.round(this.一倊 + paramInt2 * this.一倈);
    int k = Math.round(this.一倉 + (paramInt1 + paramInt3) * this.一倈);
    int m = Math.round(this.一倊 + (paramInt2 + 60) * this.一倈);
    return new 一倀(i, j, Math.max(1, k - i), Math.max(1, m - j), paramInt3, paramRunnable);
  }
  
  public void m_88315_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    if (this.f_96541_ != null && this.f_96541_.f_91073_ == null && this.一倃 != null)
      this.一倃.m_88315_(paramGuiGraphics, paramInt1, paramInt2, paramFloat); 
    一倀(paramGuiGraphics, paramFloat);
    for (GuiEventListener guiEventListener : m_6702_()) {
      if (guiEventListener instanceof Renderable) {
        Renderable renderable = (Renderable)guiEventListener;
        renderable.m_88315_(paramGuiGraphics, paramInt1, paramInt2, paramFloat);
      } 
    } 
    paramGuiGraphics.m_280262_();
    RenderSystem.enableBlend();
    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    paramGuiGraphics.m_280168_().m_85836_();
    paramGuiGraphics.m_280168_().m_252880_(this.一倉, this.一倊, 400.0F);
    paramGuiGraphics.m_280168_().m_85841_(this.一倈, this.一倈, 1.0F);
    一倅.一倀(paramGuiGraphics, 960, 304);
    paramGuiGraphics.m_280168_().m_85849_();
    paramGuiGraphics.m_280262_();
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, float paramFloat) {
    if (this.f_96541_ == null || this.一倇)
      return; 
    try {
      paramGuiGraphics.m_280262_();
      RenderTarget renderTarget = this.f_96541_.m_91385_();
      if (this.一倄 == null)
        this.一倄 = new PostChain(this.f_96541_.m_91097_(), this.f_96541_.m_91098_(), renderTarget, 一倂); 
      if (this.一倅 != renderTarget.f_83915_ || this.一倆 != renderTarget.f_83916_) {
        this.一倅 = renderTarget.f_83915_;
        this.一倆 = renderTarget.f_83916_;
        this.一倄.m_110025_(this.一倅, this.一倆);
      } 
      this.一倄.m_110023_(paramFloat);
      renderTarget.m_83947_(true);
      RenderSystem.clear(256, Minecraft.f_91002_);
    } catch (Exception exception) {
      this.一倇 = true;
      if (this.一倄 != null) {
        this.一倄.close();
        this.一倄 = null;
      } 
      this.f_96541_.m_91385_().m_83947_(true);
      System.err.println("D0JMeY8Y80jxZ6t8ukWjA6hLp8d3J8gzZQ85DpLqoS13CrEA/QFtc+0rdFi+3BkmJoexE+eej8DQCxP0Tz1uRguLeU10iMm4");
    } 
  }
  
  public void m_7861_() {
    if (this.一倄 != null) {
      this.一倄.close();
      this.一倄 = null;
    } 
    this.一倅 = this.一倆 = 0;
  }
  
  public void m_7379_() {
    if (this.f_96541_ != null)
      this.f_96541_.m_91152_(this.一倃); 
  }
  
  public boolean m_7043_() {
    return false;
  }
  
  private static final class 一倀 extends Button {
    private static final ResourceLocation 一倀 = 一個.一倀(一倆.一倀("1NiytjLnGHWLe1NYN0XDyCWSppe/ktF4T13EQBnmun7yMoQr17OsLblBd7a5"));
    
    private final int 一倁;
    
    一倀(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, Runnable param1Runnable) {
      super(param1Int1, param1Int2, param1Int3, param1Int4, (Component)Component.m_237113_(一倆.一倀("zEup8lj2VtT7R2GFbzY40v8RHv9Uj6/StSiIdjbh5pc=")), param1Button -> param1Runnable.run(), f_252438_);
      this.一倁 = param1Int5;
    }
    
    protected void m_87963_(GuiGraphics param1GuiGraphics, int param1Int1, int param1Int2, float param1Float) {
      param1GuiGraphics.m_280168_().m_85836_();
      param1GuiGraphics.m_280168_().m_252880_(m_252754_(), m_252907_(), 0.0F);
      param1GuiGraphics.m_280168_().m_85841_(m_5711_() / this.一倁, m_93694_() / 60.0F, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      一倀(param1GuiGraphics, 0, this.一倁);
      if (m_198029_())
        一倀(param1GuiGraphics, 60, this.一倁); 
      一個.一倁(param1GuiGraphics, 一倆.一倀("dZpBzd43vPFEcFlkBGZPTaG2zih6zfvkCMmzOd0dPsI="), this.一倁 / 2, 16, -526345, 一個.一們);
      param1GuiGraphics.m_280168_().m_85849_();
    }
    
    private static void 一倀(GuiGraphics param1GuiGraphics, int param1Int1, int param1Int2) {
      byte b = 8;
      int i = 60 - 2 * b;
      一倀(param1GuiGraphics, 0, 0, b, b, param1Int1, 0, b, b);
      一倀(param1GuiGraphics, b, 0, param1Int2 - 2 * b, b, param1Int1 + b, 0, i, b);
      一倀(param1GuiGraphics, param1Int2 - b, 0, b, b, param1Int1 + 60 - b, 0, b, b);
      一倀(param1GuiGraphics, 0, b, b, i, param1Int1, b, b, i);
      一倀(param1GuiGraphics, b, b, param1Int2 - 2 * b, i, param1Int1 + b, b, i, i);
      一倀(param1GuiGraphics, param1Int2 - b, b, b, i, param1Int1 + 60 - b, b, b, i);
      一倀(param1GuiGraphics, 0, 60 - b, b, b, param1Int1, 60 - b, b, b);
      一倀(param1GuiGraphics, b, 60 - b, param1Int2 - 2 * b, b, param1Int1 + b, 60 - b, i, b);
      一倀(param1GuiGraphics, param1Int2 - b, 60 - b, b, b, param1Int1 + 60 - b, 60 - b, b, b);
    }
    
    private static void 一倀(GuiGraphics param1GuiGraphics, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      param1GuiGraphics.m_280168_().m_85836_();
      param1GuiGraphics.m_280168_().m_252880_(param1Int1, param1Int2, 0.0F);
      param1GuiGraphics.m_280168_().m_85841_(param1Int3 / param1Int7, param1Int4 / param1Int8, 1.0F);
      param1GuiGraphics.m_280163_(一倀, 0, 0, param1Int5, param1Int6, param1Int7, param1Int8, 120, 60);
      param1GuiGraphics.m_280168_().m_85849_();
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */