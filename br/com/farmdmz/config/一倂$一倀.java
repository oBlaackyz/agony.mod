package br.com.farmdmz.config;

public final class 一倀 {
  public int number;
  
  public double x;
  
  public double y;
  
  public double z;
  
  public boolean enabled = true;
  
  public 一倀() {}
  
  public 一倀(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
    this.number = paramInt;
    this.x = paramDouble1;
    this.y = paramDouble2;
    this.z = paramDouble3;
  }
  
  public 一倀 一倀() {
    一倀 一倀1 = new 一倀(this.number, this.x, this.y, this.z);
    一倀1.enabled = this.enabled;
    return 一倀1;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\config\一倂$一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */