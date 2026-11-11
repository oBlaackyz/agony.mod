package br.com.farmdmz.core;

import java.util.HashMap;
import java.util.Map;

public final class 一倉 {
  private final Map<Integer, 一倀> 一倀 = new HashMap<>();
  
  public void 一倀(int paramInt1, long paramLong1, int paramInt2, long paramLong2) {
    if (paramInt1 < 0)
      return; 
    if (paramInt2 < 0 || paramInt2 > 2 || (paramInt2 == 1 && paramLong2 <= 0L))
      return; 
    long l = (paramInt2 == 0) ? 0L : paramLong2;
    一倀 一倀 = this.一倀.get(Integer.valueOf(paramInt1));
    if (一倀 != null && 一倀.一倂() == paramInt2 && 一倀.一倁() == l)
      return; 
    this.一倀.put(Integer.valueOf(paramInt1), new 一倀(paramLong1, l, paramInt2, (paramInt2 != 2)));
  }
  
  public long 一倀(int paramInt, long paramLong) {
    一倀 一倀 = this.一倀.get(Integer.valueOf(paramInt));
    if (一倀 == null || !一倀.一倃())
      return paramLong; 
    if (一倀.一倀() != paramLong) {
      this.一倀.put(Integer.valueOf(paramInt), new 一倀(一倀.一倀(), 一倀.一倁(), 一倀.一倂(), false));
      return paramLong;
    } 
    return 一倀.一倁();
  }
  
  public void 一倀() {
    this.一倀.clear();
  }
  
  private static final class 一倀 extends Record {
    private final long 一倀;
    
    private final long 一倁;
    
    private final int 一倂;
    
    private final boolean 一倃;
    
    private 一倀(long param1Long1, long param1Long2, int param1Int, boolean param1Boolean) {
      this.一倀 = param1Long1;
      this.一倁 = param1Long2;
      this.一倂 = param1Int;
      this.一倃 = param1Boolean;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倉$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倉$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倉$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public long 一倀() {
      return this.一倀;
    }
    
    public long 一倁() {
      return this.一倁;
    }
    
    public int 一倂() {
      return this.一倂;
    }
    
    public boolean 一倃() {
      return this.一倃;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倉.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */