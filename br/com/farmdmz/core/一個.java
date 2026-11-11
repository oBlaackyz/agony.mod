package br.com.farmdmz.core;

import br.com.farmdmz.client.auth.一倆;
import java.util.ArrayList;
import java.util.Comparator;

public final class 一個 {
  public static final long 一倀 = 150L;
  
  public static final long 一倁 = 10L;
  
  public static 一倁 一倀(long paramLong1, long paramLong2, long paramLong3, 一倃 param一倃1, 一倃 param一倃2) {
    return 一倀(paramLong1, paramLong2, paramLong3, param一倃1, param一倃2, 150L, 150L);
  }
  
  public static 一倁 一倀(long paramLong1, long paramLong2, long paramLong3, 一倃 param一倃1, 一倃 param一倃2, long paramLong4, long paramLong5) {
    if (paramLong1 < 0L || paramLong2 < 0L || paramLong3 < 0L || paramLong4 < 150L || paramLong5 < 150L)
      return new 一倁(一倄.INVALID_STOCK, null, 一倆.一倀("mHdrKs+coiSmW8c1XNXV40hhHSXwiKfzR/s/ow=="), 0L); 
    ArrayList<一倀> arrayList = new ArrayList(2);
    if (paramLong1 < paramLong4)
      arrayList.add(new 一倀(一倂.SEEDS, paramLong1, paramLong4, param一倃1)); 
    if (paramLong2 < paramLong5)
      arrayList.add(new 一倀(一倂.FERTILIZER, paramLong2, paramLong5, param一倃2)); 
    if (arrayList.isEmpty())
      return new 一倁(一倄.TARGET_MET, null, 一倆.一倀("wWhyr5ic/HIpIFS6G0ZOmdr7VMMKfMkrlGTb5A=="), 0L); 
    arrayList.sort(Comparator.comparingLong(一倀::一倁));
    long l = paramLong3;
    for (一倀 一倀1 : arrayList) {
      一倃 一倃1 = 一倀1.一倃();
      if (一倃1 == null || 一倃1.一倀() == null || 一倃1.一倀().isBlank() || 一倃1.一倂() < 0L)
        return new 一倁(一倄.OFFER_UNAVAILABLE, 一倀1.一倀(), 一倆.一倀("H2Xf2KSPaEoLaFVhIlJY747IePpLP5eNelNLMg=="), 0L); 
      if (一倃1.一倁() != 10L)
        return new 一倁(一倄.WRONG_LOT, 一倀1.一倀(), 一倃1.一倀(), 一倃1.一倂()); 
      long l1 = 一倀1.一倂() - 一倀1.一倁();
      long l2 = l1 / 10L + ((l1 % 10L == 0L) ? 0L : 1L);
      if (一倃1.一倂() > 0L && l2 > l / 一倃1.一倂())
        return new 一倁(一倄.INSUFFICIENT_FUNDS, 一倀1.一倀(), 一倃1.一倀(), 一倃1.一倂()); 
      l -= l2 * 一倃1.一倂();
    } 
    一倀 一倀 = arrayList.get(0);
    return new 一倁(一倄.BUY, 一倀.一倀(), 一倀.一倃().一倀(), 一倀.一倃().一倂());
  }
  
  public static final class 一倃 extends Record {
    private final String 一倀;
    
    private final long 一倁;
    
    private final long 一倂;
    
    public 一倃(String param1String, long param1Long1, long param1Long2) {
      this.一倀 = param1String;
      this.一倁 = param1Long1;
      this.一倂 = param1Long2;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一個$一倃;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一個$一倃;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一個$一倃;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public String 一倀() {
      return this.一倀;
    }
    
    public long 一倁() {
      return this.一倁;
    }
    
    public long 一倂() {
      return this.一倂;
    }
  }
  
  public static final class 一倁 extends Record {
    private final 一個.一倄 一倀;
    
    private final 一個.一倂 一倁;
    
    private final String 一倂;
    
    private final long 一倃;
    
    public 一倁(一個.一倄 param1一倄, 一個.一倂 param1一倂, String param1String, long param1Long) {
      this.一倀 = param1一倄;
      this.一倁 = param1一倂;
      this.一倂 = param1String;
      this.一倃 = param1Long;
    }
    
    public boolean 一倀() {
      return (this.一倀 == 一個.一倄.BUY);
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一個$一倁;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一個$一倁;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一個$一倁;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public 一個.一倄 一倁() {
      return this.一倀;
    }
    
    public 一個.一倂 一倂() {
      return this.一倁;
    }
    
    public String 一倃() {
      return this.一倂;
    }
    
    public long 一倄() {
      return this.一倃;
    }
  }
  
  public enum 一倄 {
    BUY, TARGET_MET, INVALID_STOCK, OFFER_UNAVAILABLE, WRONG_LOT, INSUFFICIENT_FUNDS;
  }
  
  public enum 一倂 {
    SEEDS, FERTILIZER;
  }
  
  private static final class 一倀 extends Record {
    private final 一個.一倂 一倀;
    
    private final long 一倁;
    
    private final long 一倂;
    
    private final 一個.一倃 一倃;
    
    private 一倀(一個.一倂 param1一倂, long param1Long1, long param1Long2, 一個.一倃 param1一倃) {
      this.一倀 = param1一倂;
      this.一倁 = param1Long1;
      this.一倂 = param1Long2;
      this.一倃 = param1一倃;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一個$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一個$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一個$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public 一個.一倂 一倀() {
      return this.一倀;
    }
    
    public long 一倁() {
      return this.一倁;
    }
    
    public long 一倂() {
      return this.一倂;
    }
    
    public 一個.一倃 一倃() {
      return this.一倃;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一個.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */