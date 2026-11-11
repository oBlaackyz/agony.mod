package br.com.farmdmz.core;

public final class 一倅 extends Record {
  private final boolean 一倀;
  
  private final boolean 一倁;
  
  private final long 一倂;
  
  private final long 一倃;
  
  private final long 一倄;
  
  private final long 一倅;
  
  private final long 一倆;
  
  private final int 一倇;
  
  private final boolean 一倈;
  
  private final long 一倉;
  
  public 一倅(boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt) {
    this(paramBoolean1, paramBoolean2, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramInt, false, 1800000L);
  }
  
  public 一倅(boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt, boolean paramBoolean3, long paramLong6) {
    paramLong1 = Math.max(50L, paramLong1);
    paramLong2 = Math.max(0L, paramLong2);
    paramLong3 = Math.max(1000L, paramLong3);
    paramLong4 = Math.max(250L, paramLong4);
    paramLong5 = Math.max(1000L, paramLong5);
    paramInt = Math.max(0, Math.min(10, paramInt));
    paramLong6 = Math.max(1000L, paramLong6);
    this.一倀 = paramBoolean1;
    this.一倁 = paramBoolean2;
    this.一倂 = paramLong1;
    this.一倃 = paramLong2;
    this.一倄 = paramLong3;
    this.一倅 = paramLong4;
    this.一倆 = paramLong5;
    this.一倇 = paramInt;
    this.一倈 = paramBoolean3;
    this.一倉 = paramLong6;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倃$一倅;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倃$一倅;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倃$一倅;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean 一倀() {
    return this.一倀;
  }
  
  public boolean 一倁() {
    return this.一倁;
  }
  
  public long 一倂() {
    return this.一倂;
  }
  
  public long 一倃() {
    return this.一倃;
  }
  
  public long 一倄() {
    return this.一倄;
  }
  
  public long 一倅() {
    return this.一倅;
  }
  
  public long 一倆() {
    return this.一倆;
  }
  
  public int 一倇() {
    return this.一倇;
  }
  
  public boolean 一倈() {
    return this.一倈;
  }
  
  public long 一倉() {
    return this.一倉;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倃$一倅.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */