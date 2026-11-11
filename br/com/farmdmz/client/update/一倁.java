package br.com.farmdmz.client.update;

import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.client.一倅;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;

final class 一倁 extends Screen {
  private final Screen 一倀;
  
  private Button 一倁;
  
  private int 一倂;
  
  private int 一倃;
  
  private int 一倄;
  
  一倁(Screen paramScreen) {
    super((Component)Component.m_237113_(一倆.一倀("BdUYRmuh+WQPbYANExf+RzhMBlI4DaAnbmxyvySso4b8wNTUhwEFEoEUb395ARKuCFSO3NnO")));
    this.一倀 = paramScreen;
  }
  
  protected void m_7856_() {
    this.一倄 = Math.min(420, this.f_96543_ - 24);
    this.一倂 = (this.f_96543_ - this.一倄) / 2;
    this.一倃 = (this.f_96544_ - 158) / 2;
    this.一倁 = (Button)m_142416_((GuiEventListener)Button.m_253074_((Component)Component.m_237119_(), paramButton -> 一倀.一倅()).m_252987_(this.一倂 + 16, this.一倃 + 120, this.一倄 - 116, 22).m_253136_());
    m_142416_((GuiEventListener)Button.m_253074_((Component)Component.m_237113_(一倆.一倀("gy8Sp4zpriu0gTTaNNzRj7QW8ysBHYiiKbXuH/ZFFu1gLg==")), paramButton -> m_7379_()).m_252987_(this.一倂 + this.一倄 - 92, this.一倃 + 120, 76, 22).m_253136_());
    一倀();
  }
  
  public void m_86600_() {
    一倀();
  }
  
  private void 一倀() {
    switch (null.一倀[一倀.一倂().ordinal()]) {
      case 1:
      
      case 2:
        if (一倀.一倃().isEmpty());
      case 3:
      
      case 4:
      
      case 5:
      
      default:
        break;
    } 
    String str = 一倆.一倀("n8Ke887fGcYYdoTPkSnwUQ72MvWoXXWv8KxNaWfDJNWeMrTUnOc1C+2R");
    this.一倁.m_93666_((Component)Component.m_237113_(str));
    switch (null.一倀[一倀.一倂().ordinal()]) {
      case 1:
      case 2:
      case 3:
      
      default:
        break;
    } 
    this.一倁.f_93623_ = false;
  }
  
  public void m_88315_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    paramGuiGraphics.m_280509_(0, 0, this.f_96543_, this.f_96544_, -468380900);
    paramGuiGraphics.m_280509_(this.一倂, this.一倃, this.一倂 + this.一倄, this.一倃 + 158, -14475219);
    paramGuiGraphics.m_280509_(this.一倂, this.一倃, this.一倂 + this.一倄, this.一倃 + 2, -1524103);
    一倅.一倀(paramGuiGraphics, this.一倂 + 16, this.一倃 + 7, 22);
    paramGuiGraphics.m_280614_(this.f_96547_, this.f_96539_, this.一倂 + 16, this.一倃 + 32, -724486, false);
    String str = 一倀.一倀();
    paramGuiGraphics.m_280056_(this.f_96547_, "VJIMu1y8PF5XOUJhHcm8KsGC6k+CzN3FEHCLTWenPcpq4e5NxyCKaQ==", this.一倂 + 16, this.一倃 + 52, -3159589, false);
    paramGuiGraphics.m_280056_(this.f_96547_, "Hsll3EaRrH3k837HiMth4Cketz8aQ85Wp53/K2zv/WqKLCHJLMLsPtsR", this.一倂 + 16, this.一倃 + 65, -3159589, false);
    paramGuiGraphics.m_280554_(this.f_96547_, (FormattedText)Component.m_237113_(一倁()), this.一倂 + 16, this.一倃 + 86, this.一倄 - 32, -1712400);
    for (GuiEventListener guiEventListener : m_6702_()) {
      if (guiEventListener instanceof Renderable) {
        Renderable renderable = (Renderable)guiEventListener;
        renderable.m_88315_(paramGuiGraphics, paramInt1, paramInt2, paramFloat);
      } 
    } 
  }
  
  private String 一倁() {
    if (!一倀.一倃().isEmpty())
      return 一倀.一倃(); 
    switch (null.一倀[一倀.一倂().ordinal()]) {
      case 2:
      
      case 4:
      
      case 3:
      
      case 5:
      
    } 
    return 一倆.一倀("KCWhRZNKKaQD60D64h0+lk7qr8pD96oMnA2NxfkoT3x85nSyrpxBDjAuJGhpzWe52oyCIFhDDbOINm8Xr3j9hAF/4g==");
  }
  
  public void m_7379_() {
    if (this.f_96541_ != null)
      this.f_96541_.m_91152_(this.一倀); 
  }
  
  public boolean m_7043_() {
    return false;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\clien\\update\一倁.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */