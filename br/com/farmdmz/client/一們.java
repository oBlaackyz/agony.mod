package br.com.farmdmz.client;

import java.util.List;

final class 一們 {
  private int 一倀 = -1;
  
  一倀 一倀(List<一倀> paramList, double paramDouble, boolean paramBoolean) {
    if (paramList == null || !Double.isFinite(paramDouble) || paramDouble <= 0.0D) {
      一倁();
      return null;
    } 
    for (一倀 一倀1 : paramList) {
      if (一倀1 != null && 一倀1.一倀() == this.一倀 && 一倀(一倀1, paramDouble))
        return 一倀1; 
    } 
    this.一倀 = -1;
    if (paramBoolean)
      return null; 
    一倀 一倀 = null;
    for (一倀 一倀1 : paramList) {
      if (一倀(一倀1, paramDouble) && (一倀 == null || 一倀1.一倁() < 一倀.一倁() || (一倀1.一倁() == 一倀.一倁() && 一倀1.一倀() < 一倀.一倀())))
        一倀 = 一倀1; 
    } 
    if (一倀 != null)
      this.一倀 = 一倀.一倀(); 
    return 一倀;
  }
  
  static boolean 一倀(一倀 param一倀, double paramDouble) {
    return (param一倀 != null && param一倀.一倀() >= 0 && Double.isFinite(paramDouble) && paramDouble > 0.0D && param一倀.一倂() && !param一倀.一倃() && param一倀.一倄() && !param一倀.一倅() && param一倀.一倆() && param一倀.一倇() && 一倀(param一倀.一倁(), paramDouble));
  }
  
  static boolean 一倀(double paramDouble1, double paramDouble2) {
    return (Double.isFinite(paramDouble1) && paramDouble1 >= 0.0D && Double.isFinite(paramDouble2) && paramDouble2 > 0.0D && paramDouble1 <= paramDouble2 * paramDouble2);
  }
  
  int 一倀() {
    return this.一倀;
  }
  
  void 一倁() {
    this.一倀 = -1;
  }
  
  static final class 一倀 extends Record {
    private final int 一倀;
    
    private final double 一倁;
    
    private final boolean 一倂;
    
    private final boolean 一倃;
    
    private final boolean 一倄;
    
    private final boolean 一倅;
    
    private final boolean 一倆;
    
    private final boolean 一倇;
    
    一倀(int param1Int, double param1Double, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, boolean param1Boolean4, boolean param1Boolean5, boolean param1Boolean6) {
      this.一倀 = param1Int;
      this.一倁 = param1Double;
      this.一倂 = param1Boolean1;
      this.一倃 = param1Boolean2;
      this.一倄 = param1Boolean3;
      this.一倅 = param1Boolean4;
      this.一倆 = param1Boolean5;
      this.一倇 = param1Boolean6;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一們$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一們$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一們$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public int 一倀() {
      return this.一倀;
    }
    
    public double 一倁() {
      return this.一倁;
    }
    
    public boolean 一倂() {
      return this.一倂;
    }
    
    public boolean 一倃() {
      return this.一倃;
    }
    
    public boolean 一倄() {
      return this.一倄;
    }
    
    public boolean 一倅() {
      return this.一倅;
    }
    
    public boolean 一倆() {
      return this.一倆;
    }
    
    public boolean 一倇() {
      return this.一倇;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一們.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */