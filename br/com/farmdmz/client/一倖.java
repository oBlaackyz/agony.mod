package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.core.一個;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class 一倖 {
  private static final long 一倀 = 750L;
  
  private static final long 一倁 = 2000L;
  
  private static final long 一倂 = 2000L;
  
  private static final long 一倃 = 30000L;
  
  private static final int 一倄 = 3;
  
  private final Function<Object, 一倕.一倂> 一倅;
  
  private final BiFunction<Object, String, 一倕.一倁> 一倆;
  
  private 一倀 一倇;
  
  private 一倁 一倈;
  
  private boolean 一倉;
  
  private long 一倊;
  
  private long 一個 = -1L;
  
  private long 一倌 = -1L;
  
  private int 一倍;
  
  public 一倖() {
    this(一倕::一倀, 一倕::一倀);
  }
  
  一倖(Function<Object, 一倕.一倂> paramFunction, BiFunction<Object, String, 一倕.一倁> paramBiFunction) {
    this.一倅 = paramFunction;
    this.一倆 = paramBiFunction;
  }
  
  public void 一倀() {
    this.一倇 = null;
    this.一倈 = null;
    this.一倉 = false;
    this.一倊 = 0L;
    this.一個 = this.一倌 = -1L;
    this.一倍 = 0;
    一倕.一倀();
  }
  
  public boolean 一倁() {
    return (this.一倉 && this.一倈 == null);
  }
  
  public 一倁 一倀(Object paramObject, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, long paramLong, Runnable paramRunnable) {
    if (this.一倈 != null)
      return this.一倈; 
    if (paramInt1 < 0 || paramInt2 < 0 || paramInt2 > 2 || paramLong < 0L)
      return 一倀(一倆.一倀("BQ+W6D4ZRJS9F5Vu0qQ9In3NXK/muC7fVIKcojxamJMzEYRCXIQOZejmgC+r4SCRGbklXuVv7KWRVAMrBfKj+VVmXV2Qr2kl8Q==")); 
    this.一倉 = true;
    一倕.一倂 一倂 = this.一倅.apply(paramObject);
    if (this.一倇 != null) {
      if (paramInt1 != this.一倇.一倀())
        return 一倀(一倆.一倀("uLb8TDkFc+f+LnxY7/9YLSM4/M/3ImNKCD/+BTLwjZ++9PTYLXasSb3zGqhMBbvschLueFpFuZtkel6HQDlaDI42MRE8LzzU")); 
      if (一倂.一倀() && 一倀(一倂, this.一倇.一倁()) >= this.一倇.一倂() + 10L) {
        this.一倇 = null;
        this.一倌 = -1L;
        this.一倍 = 0;
        this.一倊 = 0L;
      } else {
        if (paramLong - this.一倇.一倃() >= 30000L)
          return 一倀(一倆.一倀("Fcu5LqwhzejejEKBGdC8ncuse0UbYw4uCy+0hiToStLCo3eyG4IVbXNoTOWOMhTebxdSuxV9SfSugOHsRbGraG4Z3Iagpc51fMzWacdaadU1lyFZVsYM9I+9/2rkHPTU99gqNePqx9iByXF4VQ==")); 
        if (!一倂.一倀() || !一倂.一倇())
          return 一倀(paramLong, paramRunnable); 
        if (this.一倌 >= 0L) {
          this.一倌 = -1L;
          this.一倍 = 0;
          this.一倊 = paramLong + (paramBoolean2 ? 750L : 2000L);
        } 
        return 一倀(paramLong, paramRunnable, 一倆.一倀("yNRTAqJorge6Rpu5Lyb26kJ0GEdNCwgVdA57sDhNMMbwhsBZefqk5Y/1n33eWAxEu+2AkCfY07JgTsZju2AhJ9M98rE2p2SBmdVUPw=="), 一倆.一倀("dNEot3Ubrn1Gc+m5sgzlS5UXiVYOtrZSCdcanCvLpXzxYPkN1MeaCOE6iVT+GrvwvYIQLJyv8hT/34KDI0PaRFQkpe/UbvQhvbMY2GWX12zoHFyVxvSdZ2w5YsQbXQ=="));
      } 
    } 
    if (!一倂.一倀()) {
      if (this.一倌 >= 0L)
        return 一倀(paramLong, paramRunnable); 
      if (this.一個 < 0L)
        this.一個 = paramLong; 
      if (paramLong - this.一個 >= 10000L)
        return 一倀(一倂.一倈()); 
      if (this.一倊 == 0L)
        this.一倊 = paramLong + 750L; 
      return 一倀(paramLong, paramRunnable, 一倂.一倈(), 一倆.一倀("ex+sQXtFmgLrzUVNHDna0HNSe032Jtys6KVyQ6W50CAX0I/pDS/PYAIFKLNjRBo+VbamozgaC6CC95NJjIa6tsL9ywQ8nwbIjDLKJBZK"));
    } 
    this.一個 = -1L;
    if (!一倂.一倇())
      return 一倀(paramLong, paramRunnable); 
    this.一倌 = -1L;
    this.一倍 = 0;
    this.一倊 = 0L;
    long l1 = 150L;
    long l2 = 150L;
    if (paramInt2 == 0 && paramBoolean1) {
      一倕.一倀 一倀1 = 一倕.一倀(paramObject, paramInt1);
      if (!一倀1.一倀())
        return 一倀(一倀1.一倃()); 
      l1 += 一倀1.一倁();
      l2 += 一倀1.一倂();
    } 
    一個.一倁 一倁1 = 一個.一倀(一倂.一倁(), 一倂.一倂(), 一倂.一倄(), 一倂.一倅(), 一倂.一倆(), l1, l2);
    if (一倁1.一倁() == 一個.一倄.TARGET_MET) {
      this.一倉 = false;
      return new 一倁(一倂.DONE, 一倆.一倀("Zh5GwdXvE6JPPjxl+B6885nw/ky4McYWet/Ibj8wjINGIH4HwVsSw7ZH/1xGpeyBDaWtZrPWdLSxhPdXSi4setLd"));
    } 
    if (!一倁1.一倀())
      return 一倀(一倀(一倁1.一倁())); 
    long l3 = 一倀(一倂, 一倁1.一倃());
    一倕.一倁 一倁2 = this.一倆.apply(paramObject, 一倁1.一倃());
    if (!一倁2.一倀())
      return 一倀(一倁2.一倁()); 
    this.一倇 = new 一倀(paramInt1, 一倁1.一倃(), l3, paramLong);
    this.一倊 = paramLong + (paramBoolean2 ? 750L : 2000L);
    this.一倍 = 0;
    return new 一倁(一倂.WAIT, 一倁2.一倁());
  }
  
  private 一倁 一倀(long paramLong, Runnable paramRunnable, String paramString1, String paramString2) {
    if (paramLong < this.一倊)
      return new 一倁(一倂.WAIT, paramString1); 
    if (this.一倍 >= 3)
      return 一倀(paramString2); 
    if (paramRunnable == null)
      return 一倀(一倆.一倀("oLkrU2l3vysFFHpvEAknkGwxjMYZTu+35nnA1Yl9wn0sSBOBI7ZATdAQXxvNDpfjVBqxorZegB3aM+AGrLmnRZODyxUA3rnuL/c9X5KF")); 
    try {
      paramRunnable.run();
    } catch (RuntimeException runtimeException) {
      return 一倀("38dovggZywKe5q4U32b/lhLfBvFZULNeKqwnSIeyZpV8IDpAT6bUbABx6YtD/ML9kHFTXHZ2WQM16bM=");
    } 
    this.一倍++;
    this.一倊 = paramLong + 2000L;
    return new 一倁(一倂.WAIT, paramString1);
  }
  
  private 一倁 一倀(long paramLong, Runnable paramRunnable) {
    if (this.一倌 < 0L)
      this.一倌 = paramLong; 
    if (this.一倇 == null && paramLong - this.一倌 >= 30000L) {
      this.一倉 = false;
      this.一倌 = this.一個 = -1L;
      this.一倍 = 0;
      this.一倊 = 0L;
      return new 一倁(一倂.SKIP, 一倆.一倀("qG9SjTNGGVFfamH4P5FBE6eqDyNSkDbxNT93AfT8tPEZ44j95cD0BiPXT6anQLno5KzksagX+7+dDJ7uTVODJ17tZp1G8RkNAH8JlA=="));
    } 
    String str = 一倆.一倀("vNRhprPNHBcQdcn+Taiwtbv4TswQq/nYseVkk0aIv7kAPj5fNaXB5UKZ7k/dNRBmYCV7uS2mu1Qp4nI43wSYKgwxpw==");
    if (this.一倊 == 0L)
      this.一倊 = paramLong + 750L; 
    if (paramLong < this.一倊 || paramRunnable == null)
      return new 一倁(一倂.WAIT, str); 
    try {
      paramRunnable.run();
    } catch (RuntimeException runtimeException) {}
    this.一倍++;
    this.一倊 = paramLong + ((this.一倍 < 3) ? 2000L : 10000L);
    return new 一倁(一倂.WAIT, str);
  }
  
  private 一倁 一倀(String paramString) {
    this.一倉 = false;
    this.一倈 = new 一倁(一倂.FAIL, paramString);
    return this.一倈;
  }
  
  private static long 一倀(一倕.一倂 param一倂, String paramString) {
    return 一倆.一倀("cJhIwsAtzkeePMSoKXj1vcNqaZzoWVYMqJiqPUmH7lnpOKI=").equals(paramString) ? param一倂.一倁() : (一倆.一倀("DqnpWVZ2mTsSBifJHKB3HKtQZsoQ3ohcc2C1JaexXs1C").equals(paramString) ? param一倂.一倂() : -1L);
  }
  
  private static String 一倀(一個.一倄 param一倄) {
    switch (null.一倀[param一倄.ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      
      case 4:
      
    } 
    return 一倆.一倀("qvLF0o/61IZ48rUmL9zPpuYpdbnsSw4y4ZJ4ZZFGi9pzthYFjLm4yfabavd9Gbb0aPbz2CVV0KkYlvpytw==");
  }
  
  private static final class 一倀 extends Record {
    private final int 一倀;
    
    private final String 一倁;
    
    private final long 一倂;
    
    private final long 一倃;
    
    private 一倀(int param1Int, String param1String, long param1Long1, long param1Long2) {
      this.一倀 = param1Int;
      this.一倁 = param1String;
      this.一倂 = param1Long1;
      this.一倃 = param1Long2;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倖$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倖$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倖$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public int 一倀() {
      return this.一倀;
    }
    
    public String 一倁() {
      return this.一倁;
    }
    
    public long 一倂() {
      return this.一倂;
    }
    
    public long 一倃() {
      return this.一倃;
    }
  }
  
  public static final class 一倁 extends Record {
    private final 一倖.一倂 一倀;
    
    private final String 一倁;
    
    public 一倁(一倖.一倂 param1一倂, String param1String) {
      this.一倀 = param1一倂;
      this.一倁 = param1String;
    }
    
    public boolean 一倀() {
      return (this.一倀 == 一倖.一倂.WAIT);
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倖$一倁;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倖$一倁;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倖$一倁;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public 一倖.一倂 一倁() {
      return this.一倀;
    }
    
    public String 一倂() {
      return this.一倁;
    }
  }
  
  public enum 一倂 {
    WAIT, DONE, SKIP, FAIL;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倖.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */