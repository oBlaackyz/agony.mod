package br.com.farmdmz.core;

import br.com.farmdmz.client.auth.一倆;

public final class 一倊 {
  private static final double 一倀 = 0.01D;
  
  private boolean 一倁;
  
  public 一倀 一倀(double paramDouble1, double paramDouble2) {
    if (!Double.isFinite(paramDouble1) || !Double.isFinite(paramDouble2) || paramDouble1 < 0.0D || paramDouble2 <= 0.0D)
      return 一倀.UNKNOWN; 
    if (this.一倁) {
      if (paramDouble1 >= paramDouble2)
        this.一倁 = false; 
    } else if (paramDouble1 <= paramDouble2 * 0.01D) {
      this.一倁 = true;
    } 
    return this.一倁 ? 一倀.RECOVERING : 一倀.READY;
  }
  
  public void 一倀() {
    this.一倁 = false;
  }
  
  public boolean 一倁() {
    return this.一倁;
  }
  
  public enum 一倀 {
    READY, RECOVERING, UNKNOWN;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倊.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */