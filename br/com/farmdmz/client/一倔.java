package br.com.farmdmz.client;

final class 一倔<S, D> {
  static final long 一倀 = 30000L;
  
  static final long 一倁 = 1500L;
  
  static final long 一倂 = 750L;
  
  private S 一倃;
  
  private D 一倄;
  
  private int 一倅 = -1;
  
  private int 一倆 = -1;
  
  private long 一倇;
  
  private long 一倈;
  
  private long 一倉;
  
  private long 一倊;
  
  private boolean 一個;
  
  void 一倀() {
    this.一倃 = null;
    this.一倄 = null;
    this.一倅 = this.一倆 = -1;
    this.一倇 = this.一倈 = this.一倉 = this.一倊 = 0L;
    this.一個 = false;
  }
  
  void 一倀(int paramInt, long paramLong1, long paramLong2) {
    if (paramInt < 0 || paramLong1 < 0L || paramLong2 <= 0L || paramLong2 > 30000L) {
      一倀();
      return;
    } 
    if (一倁(paramInt, paramLong1))
      return; 
    if (this.一倅 != paramInt || !一倀(paramInt, paramLong1))
      一倂(); 
    this.一倆 = paramInt;
    this.一倉 = paramLong1;
    this.一倊 = paramLong1 + paramLong2;
  }
  
  boolean 一倀(int paramInt, S paramS, D paramD, long paramLong) {
    if (!一倁(paramInt, paramLong) || paramS == null || paramD == null)
      return false; 
    if (this.一倅 == paramInt && this.一倄 == paramD)
      return false; 
    一倂(paramInt, paramS, paramD, paramLong);
    this.一倆 = -1;
    this.一倉 = this.一倊 = 0L;
    return true;
  }
  
  void 一倁(int paramInt, S paramS, D paramD, long paramLong) {
    if (paramInt < 0 || paramS == null || paramD == null || paramLong < 0L)
      return; 
    if (this.一倅 == paramInt && this.一倃 == paramS && this.一倄 == paramD && 一倀(paramInt, paramLong))
      return; 
    if (this.一倆 >= 0 && this.一倆 != paramInt)
      return; 
    一倂(paramInt, paramS, paramD, paramLong);
  }
  
  boolean 一倀(int paramInt, long paramLong) {
    if (this.一倃 == null || this.一倄 == null || this.一倅 != paramInt || paramLong < this.一倇)
      return false; 
    if (paramLong - this.一倇 > 30000L) {
      一倂();
      return false;
    } 
    return true;
  }
  
  boolean 一倁(int paramInt, long paramLong) {
    return (paramInt >= 0 && this.一倆 == paramInt && paramLong >= this.一倉 && paramLong <= this.一倊);
  }
  
  boolean 一倂(int paramInt, long paramLong) {
    return (一倀(paramInt, paramLong) && this.一倆 < 0 && !this.一個);
  }
  
  boolean 一倃(int paramInt, long paramLong) {
    return (paramInt < 0 || paramLong < 0L || 一倁(paramInt, paramLong)) ? false : ((!一倀(paramInt, paramLong) || this.一倆 >= 0 || paramLong >= this.一倈));
  }
  
  void 一倄(int paramInt, long paramLong) {
    if (一倀(paramInt, paramLong)) {
      this.一個 = true;
      this.一倈 = Math.min(this.一倈, paramLong + 750L);
    } 
  }
  
  S 一倅(int paramInt, long paramLong) {
    return 一倀(paramInt, paramLong) ? this.一倃 : null;
  }
  
  D 一倆(int paramInt, long paramLong) {
    return 一倀(paramInt, paramLong) ? this.一倄 : null;
  }
  
  int 一倁() {
    return this.一倆;
  }
  
  private void 一倂(int paramInt, S paramS, D paramD, long paramLong) {
    this.一倅 = paramInt;
    this.一倃 = paramS;
    this.一倄 = paramD;
    this.一倇 = paramLong;
    this.一倈 = paramLong + 1500L;
    this.一個 = false;
  }
  
  private void 一倂() {
    this.一倅 = -1;
    this.一倃 = null;
    this.一倄 = null;
    this.一倇 = this.一倈 = 0L;
    this.一個 = false;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倔.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */