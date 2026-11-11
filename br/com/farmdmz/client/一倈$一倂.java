package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倆;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;

final class 一倂 extends Button {
  boolean 一倀;
  
  boolean 一倁;
  
  boolean 一倂;
  
  boolean 一倃;
  
  boolean 一倄;
  
  int 一倅;
  
  BooleanSupplier 一倆 = () -> false;
  
  BooleanSupplier 一倇;
  
  一倂(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, Button.OnPress paramOnPress) {
    super(paramInt1, paramInt2, paramInt3, paramInt4, 一倍.一倀(paramString), paramOnPress, f_252438_);
  }
  
  protected void m_87963_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    boolean bool1 = (this.一倆.getAsBoolean() || (this.一倇 != null && this.一倇.getAsBoolean())) ? true : false;
    int i = m_252754_();
    int j = m_252907_();
    int k = m_5711_();
    int m = m_93694_();
    if (this.一倄) {
      一個.一倀(paramGuiGraphics, i, j, k, m, 7, -420822893);
      一個.一倀(paramGuiGraphics, i + 2, j + 2, k - 4, m - 4, 5, m_198029_() ? -2647194 : -171801775);
      一個.一倀(paramGuiGraphics, 一倈.一倇, i + 9, j + 8, 17, 17, 17, 17, -13887729);
      return;
    } 
    if (this.一倃) {
      一個.一倀(paramGuiGraphics, i, j, k, m, 17, -420822893);
      一個.一倀(paramGuiGraphics, i + 2, j + 2, k - 4, m - 4, 15, m_198029_() ? -2647194 : -171801775);
      paramGuiGraphics.m_280509_(i + 11, j + 16, i + 23, j + 18, -13887729);
      paramGuiGraphics.m_280509_(i + 10, j + 14, i + 13, j + 20, -13887729);
      return;
    } 
    if (this.一倁) {
      if (bool1 || m_198029_()) {
        一個.一倀(paramGuiGraphics, i, j, k, m, 7, 921087096);
        一個.一倀(paramGuiGraphics, i + 1, j + 1, k - 2, m - 2, 6, -1735240141);
      } 
      一倈.一倀(paramGuiGraphics, this.一倅, i + 7, j + 6, 18, (bool1 || m_198029_()));
      一個.一倀(paramGuiGraphics, 一個.一倁(m_6035_().getString()), i + 29, j + 7, -536870913, 一個.一倊);
      switch (this.一倅) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        default:
          break;
      } 
      boolean bool = false;
      一個.一倀(paramGuiGraphics, i + k - 19, j + 11, 7, 7, 3, bool ? -14035334 : -1344396974);
      paramGuiGraphics.m_280509_(i, j + m - 1, i + k, j + m, 1222220388);
      return;
    } 
    if (this.一倇 != null) {
      if (m_198029_())
        一個.一倀(paramGuiGraphics, i, j, k, m, 4, 921087096); 
      一個.一倀(paramGuiGraphics, i + 5, j + 2, 60, 20, 4, -1672664292);
      一個.一倀(paramGuiGraphics, i + (bool1 ? 27 : 6), j + 3, 37, 18, 3, bool1 ? -14112921 : -5624751);
      一個.一倁(paramGuiGraphics, bool1 ? 一倆.一倀("6TEYYl6hOwrJFTBU3TOrvdLFgW+368fpGnoEZNrs") : 一倆.一倀("D6Nn3xXvPbxlrwi0d0SnlxObidoDNWwQaEkBkZ/q5Q=="), i + (bool1 ? 45 : 24), j + 5, -1, 一個.一倉);
      一個.一倀(paramGuiGraphics, 一倈.一倀(m_6035_().getString(), k - 78, 一個.一倆), i + 75, j + 3, this.f_93623_ ? -728112 : -1864646488, 一個.一倆);
      return;
    } 
    int n = (this.f_93623_ && !this.一倀) ? -420822893 : 921087096;
    一個.一倀(paramGuiGraphics, i, j, k, m, 5, n);
    一個.一倀(paramGuiGraphics, i + 2, j + 2, k - 4, m - 4, 3, !this.f_93623_ ? -2007811541 : (this.一倀 ? -11561732 : (m_198029_() ? -2647194 : -171801775)));
    String str = m_6035_().getString().toUpperCase(Locale.ROOT);
    boolean bool2 = !this.f_93623_ ? true : (this.一倀 ? true : true);
    一個.一倁(paramGuiGraphics, 一倈.一倀(一個.一倁(str), k - 12, 一個.一倏), i + k / 2, j + (m - 13) / 2, bool2, 一個.一倏);
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倈$一倂.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */