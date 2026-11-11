package br.com.farmdmz.client;

import br.com.farmdmz.core.一倇;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;

final class 一倉 {
  private static final Minecraft 一倀 = Minecraft.m_91087_();
  
  private static final 一倇 一倁 = new 一倇();
  
  private static Connection 一倂;
  
  static void 一倀(一倇.一倁 param一倁, String paramString, long paramLong) {
    if (一倀.m_91403_() == null)
      return; 
    一倂 = 一倀.m_91403_().m_104910_();
    一倁.一倀(param一倁, paramString, paramLong);
    一倀.m_91403_().m_246623_(paramString);
  }
  
  static void 一倀(一倇.一倁 param一倁) {
    一倁.一倀(param一倁);
  }
  
  static void 一倀() {
    一倁.一倀();
    一倂 = null;
  }
  
  static void 一倀(Component paramComponent) {
    if (paramComponent == null)
      return; 
    if (一倂 == null || !一倂.m_129536_() || (一倀.m_91403_() != null && 一倀.m_91403_().m_104910_() != 一倂)) {
      一倀();
      return;
    } 
    if (一倀.m_91403_() == null)
      return; 
    一倇.一倀 一倀 = 一倁.一倀(paramComponent.getString(), System.currentTimeMillis());
    if (一倀 == null)
      return; 
    String str1 = "EbxvjxwmG4DwIHiP8J3Ntri08tKxwCBchyhlVlxQvlvFZBZrYQe6";
    switch (null.一倀[一倀.一倀().ordinal()]) {
      default:
        throw new IncompatibleClassChangeError();
      case 1:
      
      case 2:
      
      case 3:
        break;
    } 
    String str2 = "9Sv7K+r5o4QYwlpc+BEmWr+DaE3XQybImOXMhdMjrP6PrBm1xfUQOh1x6uSPIJiFSgMH8MVq0haAevYMzf/k2j+8O/wMPnaSODX2SQgVFJmY3g==";
    一倇.一倀(一倀, str2);
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倉.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */