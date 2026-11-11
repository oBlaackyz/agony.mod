package br.com.farmdmz.core;

public final class 一倃 extends Record {
  private final int 一倀;
  
  private final boolean 一倁;
  
  private final 一倃.一倄 一倂;
  
  private final long 一倃;
  
  public 一倃(int paramInt, boolean paramBoolean, 一倃.一倄 param一倄, long paramLong) {
    if (param一倄 == null)
      param一倄 = 一倃.一倄.UNKNOWN; 
    this.一倀 = paramInt;
    this.一倁 = paramBoolean;
    this.一倂 = param一倄;
    this.一倃 = paramLong;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倃$一倃;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倃$一倃;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倃$一倃;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int 一倀() {
    return this.一倀;
  }
  
  public boolean 一倁() {
    return this.一倁;
  }
  
  public 一倃.一倄 一倂() {
    return this.一倂;
  }
  
  public long 一倃() {
    return this.一倃;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倃$一倃.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */