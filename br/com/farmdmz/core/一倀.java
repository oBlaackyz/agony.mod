package br.com.farmdmz.core;

import br.com.farmdmz.client.auth.一倆;

public final class 一倀 {
  private boolean 一倀;
  
  private long 一倁;
  
  private long 一倂;
  
  public void 一倀(long paramLong1, long paramLong2) {
    if (paramLong2 <= 0L)
      throw new IllegalArgumentException(一倆.一倀("OZapeZNr+znq+aXXoLB8u8kijAoRLJAqzUksuAUAjRMDxyVPDb49lrO/QaqebiM=")); 
    this.一倁 = paramLong2;
    this.一倀 = true;
    一倀(paramLong1);
  }
  
  public void 一倀() {
    this.一倀 = false;
    this.一倂 = this.一倁 = 0L;
  }
  
  public void 一倀(long paramLong) {
    if (this.一倀)
      this.一倂 = 一倃(paramLong); 
  }
  
  public boolean 一倁(long paramLong) {
    if (!this.一倀 || paramLong < this.一倂)
      return false; 
    this.一倂 = 一倃(paramLong);
    return true;
  }
  
  public long 一倂(long paramLong) {
    return this.一倀 ? Math.max(0L, this.一倂 - paramLong) : 0L;
  }
  
  private long 一倃(long paramLong) {
    return (paramLong > Long.MAX_VALUE - this.一倁) ? Long.MAX_VALUE : (paramLong + this.一倁);
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */