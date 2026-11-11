package br.com.farmdmz.core;

import br.com.farmdmz.client.auth.一倆;

public final class 一倌 {
  private static final long 一倀 = 9000L;
  
  private static final long 一倁 = 2000L;
  
  private static final long 一倂 = 5000L;
  
  private static final long 一倃 = 10000L;
  
  private static final int 一倄 = 3;
  
  private boolean 一倅;
  
  private boolean 一倆;
  
  private boolean 一倇;
  
  private 一倃 一倈 = 一倃.IDLE;
  
  private long 一倉;
  
  private long 一倊;
  
  private long 一個;
  
  private long 一倌;
  
  private int 一倍;
  
  private int 一倎;
  
  public void 一倀() {
    this.一倅 = false;
    this.一倆 = false;
    this.一倇 = false;
    this.一倈 = 一倃.IDLE;
    this.一倉 = this.一個 = this.一倌 = 0L;
    this.一倊 = -1L;
    this.一倍 = this.一倎 = 0;
  }
  
  public void 一倀(long paramLong) {
    if (this.一倈 == 一倃.ENTER_OFFERED) {
      this.一倈 = 一倃.ENTER_PENDING;
      this.一倉 = paramLong + 9000L;
    } 
  }
  
  public void 一倁(long paramLong) {
    if (this.一倈 == 一倃.EXIT_OFFERED) {
      this.一倈 = 一倃.EXIT_PENDING;
      this.一倉 = paramLong + 9000L;
    } 
  }
  
  public 一倁 一倀(一倂 param一倂) {
    if (param一倂 == null)
      throw new IllegalArgumentException(一倆.一倀("ZC2rOAHFqawWckeIikRjA2Xn33N+tx/gADbW+l3Wa9naruBM")); 
    if (!param一倂.一倁()) {
      一倀();
      return 一倀(一倀.NONE, 一倆.一倀("5uwb0vEx6p+V3webDCxasuVa/Uolr+nfmkueKmZ7Hi8sMpc9WfbK"));
    } 
    if (!this.一倅) {
      一倀();
      this.一倅 = true;
    } 
    if (param一倂.一倄() == 0L)
      this.一倆 = true; 
    if (param一倂.一倂() <= 0L)
      return !param一倂.一倃() ? 一倀(一倀.NONE, 一倆.一倀("zHG2a7iP0jOUCTWysEJbRcQvkE7JedT9COgd1NuQHEpX/LDjZopcp2DnLe+IWX2jqPc7//yQPnUpBCr2lA==")) : 一倀(param一倂, false); 
    if (!param一倂.一倅())
      return 一倀(一倀.WAIT, 一倆.一倀("Uvpbs8QxWG0owfZG/YaddS438RbZbjMs8Aalo99pImJxumcYfyBZVFIrhA8HMuYGdV+liV8RUIDcIHH4lW4=")); 
    if (param一倂.一倃()) {
      if (this.一倈 == 一倃.ENTER_OFFERED || this.一倈 == 一倃.ENTER_PENDING) {
        this.一倈 = 一倃.IDLE;
        this.一倍 = 0;
        this.一個 = 0L;
      } 
      if (this.一倆 || this.一倇)
        return 一倀(param一倂, false); 
      if (param一倂.一倄() < 0L) {
        if (this.一倊 < 0L)
          this.一倊 = param一倂.一倀(); 
        if (param一倂.一倀() - this.一倊 < 10000L)
          return 一倀(一倀.WAIT, 一倆.一倀("QpW8QYt6Yhc5bbQB491BQRcCk0kSMe4yBiPpVEAZOU1OXP7HzT1rIWWy11Cq9bJRJEmgxdQtIusSb2SJyw6dvVKIBrE=")); 
        this.一倇 = true;
        return 一倀(param一倂, false);
      } 
      this.一倊 = -1L;
      this.一倈 = 一倃.IDLE;
      return 一倀(一倀.TRAIN, 一倆.一倀("jzcTdFauy/umgNWAK7pNM7DeH7RGCfeeUxKQC12+vT4qmhd4o8+9J7S7FVXuDSQUHo+9rv5wUPB1ZtYFiRYNqI1l46x1"));
    } 
    this.一倊 = -1L;
    if (this.一倈 == 一倃.EXIT_OFFERED || this.一倈 == 一倃.EXIT_PENDING) {
      this.一倈 = 一倃.IDLE;
      this.一倎 = 0;
      this.一倌 = 0L;
    } 
    return (this.一倆 || this.一倇) ? 一倀(一倀.FISH, 一倆.一倀("8er+XsbEARXuru8KEFi4XonEB473yaq2tS4o13FIeD1iRHn1VpivnXhKBSOjtBHkUCCpDHXKAzWJ89WcUczp+aJEIjQ=")) : 一倀(param一倂, true);
  }
  
  private 一倁 一倀(一倂 param一倂, boolean paramBoolean) {
    if (!param一倂.一倅())
      return 一倀(一倀.WAIT, 一倆.一倀("aXDJUHFm4VHAYceeqqmRFP5tOFoOrhsS+acg3WuLUC3jctTc6azTtcAOgYcYu5QSxt9pK1Zj0mnLN59C4ND8bQ==")); 
    一倃 一倃1 = paramBoolean ? 一倃.ENTER_OFFERED : 一倃.EXIT_OFFERED;
    一倃 一倃2 = paramBoolean ? 一倃.ENTER_PENDING : 一倃.EXIT_PENDING;
    if (this.一倈 != 一倃.IDLE && this.一倈 != 一倃1 && this.一倈 != 一倃2)
      this.一倈 = 一倃.IDLE; 
    if (this.一倈 == 一倃1) {
      if (param一倂.一倀() < this.一倉)
        return 一倀(一倀.WAIT, paramBoolean ? 一倆.一倀("TOEmyk1W0fsIyLCoKgKe7W8VEbKcAdrx/Fu586Zaej5H1gx6HcmQRFhAph7JWBLAMSDGd/n2eHHdkbHXvXhZHHo7ZY4=") : 一倆.一倀("SmDLKX4ZRIELVs2f2zvZHoEw33GoMa/JtllwMxNt9N5EZrZZcUXFP6Uerlanm6hGYAmfiC2B4sa8muPuJbRBe44=")); 
      this.一倈 = 一倃.IDLE;
      if (paramBoolean) {
        this.一個 = param一倂.一倀() + 5000L;
      } else {
        this.一倌 = param一倂.一倀() + 5000L;
      } 
      return 一倀(一倀.WAIT, 一倆.一倀("jRx9gY7UdFBRIBMF/LHjf9PTHSZ+dG/HYrxpRVSnLEGNEACZqXfESuF+Qq8UVlxposVyCyRyVeeFPRi6KOZlKSCnSgRzxIE="));
    } 
    if (this.一倈 == 一倃2) {
      if (param一倂.一倀() < this.一倉)
        return 一倀(一倀.WAIT, paramBoolean ? 一倆.一倀("Ib+y0SVRkEcv0dtO0lmrJ+BJr80otL6U1A7OM6yhgaPyfknL4RqSR2RBD4/Gp7ekCAm8kdllKps1kTY=") : 一倆.一倀("6YVhfGDlSAt+/Gv6wUFGNhVS+5zXuWjMdI8WJEV0kkqHuYinMdbLgqpFqTd+MT7vC4Go2Bj6U69A8g==")); 
      this.一倈 = 一倃.IDLE;
      long l = 一倀(paramBoolean ? ++this.一倍 : ++this.一倎);
      if (paramBoolean && this.一倍 >= 3) {
        this.一倇 = true;
        return 一倀(一倀.FISH, 一倆.一倀("pBtIjIC6D9UfPkuCfGJL1XLUDRtjp03cJoil8JzjWQvimlDRb6xUc8s/oUUqATrC/6U/TY4pxPJdewyq9phO0Rny4Sw="));
      } 
      if (paramBoolean) {
        this.一個 = param一倂.一倀() + l;
      } else {
        this.一倌 = param一倂.一倀() + l;
      } 
      return 一倀(一倀.WAIT, 一倆.一倀("DaDOm9ekOIcvi4GtkFn2s/3fn4SiECa9fGEerwMpAMfHeWKR4PIBAie5b/FPkBa9CNt6g9vp20t6QLlc8BaOPyiY40I+7Jw9hXNHNJ5OEeA="));
    } 
    if (param一倂.一倀() < (paramBoolean ? this.一個 : this.一倌))
      return 一倀(一倀.WAIT, 一倆.一倀("1z8+zCNBGrHwov1OfDfKHFRnVlwCMxsy9a+/CMuDBDYf/N9+V53FvezOunpxlsshN/gjwxwRyaOxFVqeWq1ggJJrJig=")); 
    this.一倈 = 一倃1;
    this.一倉 = param一倂.一倀() + 2000L;
    return 一倀(paramBoolean ? 一倀.ENTER : 一倀.EXIT, paramBoolean ? 一倆.一倀("yQQ+wClFswC/bwtnrIivsBMHMvIDi6006++ENgRLcpTpZbk8kRNFMHxTz6lLIiYnUQ==") : 一倆.一倀("bQy/elpC1k31akRGA7IPJIe7Cz9UoOZvIFqF/BYGe/UCiAdDlHkF2cBFUczbEpo="));
  }
  
  private static long 一倀(int paramInt) {
    return Math.min(60000L, 5000L << Math.min(4, paramInt - 1));
  }
  
  private static 一倁 一倀(一倀 param一倀, String paramString) {
    return new 一倁(param一倀, paramString);
  }
  
  private enum 一倃 {
    IDLE, ENTER_OFFERED, ENTER_PENDING, EXIT_OFFERED, EXIT_PENDING;
  }
  
  public static final class 一倂 extends Record {
    private final long 一倀;
    
    private final boolean 一倁;
    
    private final long 一倂;
    
    private final boolean 一倃;
    
    private final long 一倄;
    
    private final boolean 一倅;
    
    public 一倂(long param1Long1, boolean param1Boolean1, long param1Long2, boolean param1Boolean2, long param1Long3, boolean param1Boolean3) {
      this.一倀 = param1Long1;
      this.一倁 = param1Boolean1;
      this.一倂 = param1Long2;
      this.一倃 = param1Boolean2;
      this.一倄 = param1Long3;
      this.一倅 = param1Boolean3;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倌$一倂;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倌$一倂;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倌$一倂;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public long 一倀() {
      return this.一倀;
    }
    
    public boolean 一倁() {
      return this.一倁;
    }
    
    public long 一倂() {
      return this.一倂;
    }
    
    public boolean 一倃() {
      return this.一倃;
    }
    
    public long 一倄() {
      return this.一倄;
    }
    
    public boolean 一倅() {
      return this.一倅;
    }
  }
  
  public enum 一倀 {
    ENTER, TRAIN, EXIT, FISH, WAIT, NONE;
  }
  
  public static final class 一倁 extends Record {
    private final 一倌.一倀 一倀;
    
    private final String 一倁;
    
    public 一倁(一倌.一倀 param1一倀, String param1String) {
      this.一倀 = param1一倀;
      this.一倁 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倌$一倁;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倌$一倁;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倌$一倁;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public 一倌.一倀 一倀() {
      return this.一倀;
    }
    
    public String 一倁() {
      return this.一倁;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倌.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */