package br.com.farmdmz.core;

import br.com.farmdmz.client.auth.一倆;
import java.util.Locale;

public final class 一倄 {
  private static final long 一倀 = 30000L;
  
  private static final long 一倁 = 750L;
  
  private static final long 一倂 = 5000L;
  
  private static final double 一倃 = 0.04D;
  
  private boolean 一倄;
  
  private String 一倅 = 一倆.一倀("YLY2ljaPnhdIFTVGGykTEMtLHtVxNA9C+jJY7g==");
  
  private String 一倆 = 一倆.一倀("LKAKNKvJvONU19Cern89Zs7roQo0uuYjzhObBw==");
  
  private long 一倇 = -1L;
  
  private long 一倈;
  
  private long 一倉;
  
  private long 一倊;
  
  private long 一個;
  
  private double 一倌;
  
  private double 一倍;
  
  private double 一倎;
  
  private boolean 一倏;
  
  private boolean 一倐;
  
  private boolean 一們;
  
  private int 一倒;
  
  public void 一倀(String paramString1, String paramString2, long paramLong1, long paramLong2) {
    this.一倅 = 一倁(paramString1);
    this.一倆 = 一倁(paramString2);
    this.一倄 = true;
    this.一倇 = -1L;
    this.一倈 = Math.max(8000L, Math.max(0L, paramLong2) + 3000L);
    this.一倉 = paramLong1;
    this.一倊 = this.一個 = 0L;
    this.一倏 = this.一倐 = this.一們 = false;
    this.一倒 = 0;
  }
  
  public void 一倀() {
    this.一倄 = false;
    this.一倏 = this.一倐 = this.一們 = false;
    this.一倊 = this.一個 = 0L;
    this.一倇 = -1L;
  }
  
  public void 一倀(long paramLong) {
    if (!this.一倄)
      return; 
    this.一們 = false;
    this.一倐 = true;
    this.一倊 = paramLong + this.一倈;
    this.一個 = Math.max(this.一個, paramLong + 5000L);
  }
  
  public 一倁 一倀(一倂 param一倂) {
    if (param一倂 == null)
      throw new IllegalArgumentException(一倆.一倀("g/FjxGk0ePiqxDfF9IqvTguvS5l723BKkwZEuSqznNRDcFot")); 
    if (!this.一倄)
      return 一倀(一倀.STOP, 一倆.一倀("pjlJQRpIwKsakfxGWoKUJT7fV1jxiN/MZVhqTcQmsjdvoIYxu6UD")); 
    String str1 = 一倁(param一倂.一倃());
    String str2 = 一倁(param一倂.一倄());
    if (!this.一倅.isEmpty() && !str1.isEmpty() && !this.一倅.equals(str1))
      return 一倀(一倆.一倀("7MrgR4rP10A3aDmWdjFgr1tZEC/EQc3eB6C2gssA/UEizoZLH1TrncAG8kul9DLi9CK3aGMMcg65xYMvR4pgb0k=")); 
    if (!this.一倆.isEmpty() && !str2.isEmpty() && !this.一倆.equals(str2))
      return 一倀(一倆.一倀("1OjG6TxkjWtthd065Sue3K7GBKIHNmPgVggTQl8p9cuAsyVFg6bCzoUoHaTryiWlftoG7zFdOAnYXZT1NraJirrXEBY=")); 
    if (this.一倅.isEmpty() && !str1.isEmpty())
      this.一倅 = str1; 
    if (this.一倆.isEmpty() && !str2.isEmpty())
      this.一倆 = str2; 
    if (param一倂.一倂())
      return 一倀(一倆.一倀("h/V3jZ8G1DjvL5vpsmvtUIZe0U5zFz3LplPCdxYS2+KCHiqAgZ20uDH0g2IC75aBECRkSCQNgQ==")); 
    if (!param一倂.一倁()) {
      if (this.一倇 < 0L)
        this.一倇 = param一倂.一倀(); 
      return (param一倂.一倀() - this.一倇 >= 30000L) ? 一倀(一倆.一倀("vOwBo3KmLWhl/THqthVBUGVq8bGRSxizkOnxLfcm6nXS4UYuCMghccjXnUczER14Gh0gKJCsQ1Vnuj2+K4K4lVgqckMFvuk7rxFKp7ELP1z5UIugbLqrFab9ZA==")) : 一倀(一倀.WAIT, 一倆.一倀("xmfH7dx80BVrnYD4Xzvelct6Ul9Vr1xZ4qtPNTntJ0E3gDsoGNjOEiwz5xhyuSNO1800JjuIl8rqShFKAcA08AEoyea2Zb7PiA=="));
    } 
    if (this.一倇 >= 0L) {
      this.一倇 = -1L;
      this.一倏 = false;
    } 
    boolean bool1 = (Double.isFinite(param一倂.一倈()) && Double.isFinite(param一倂.一倉()) && Double.isFinite(param一倂.一倊())) ? true : false;
    boolean bool2 = (bool1 && 一倁(param一倂)) ? true : false;
    if (param一倂.一倅()) {
      this.一倐 = this.一們 = false;
      this.一倊 = this.一個 = 0L;
      this.一倒 = 0;
      return 一倀(一倀.READY, 一倆.一倀("n+mNb26CvJNNd7twZsV5LLworX86IUObFAUPGg=="));
    } 
    if (!param一倂.一倆()) {
      this.一們 = false;
      if (this.一倐 && bool2) {
        this.一倐 = false;
        this.一倊 = 0L;
      } 
      return 一倀(一倀.READY, 一倆.一倀("z1zc41qm79n15fZhNcuGU6QjODY+kuUruvab8A=="));
    } 
    if (!param一倂.一倇()) {
      this.一倐 = this.一們 = false;
      return 一倀(一倀.WAIT, 一倆.一倀("Cqy/1yxkQBoADf0CVOMGUMDb7aSOblDJY+t/3tBeghXIVnO2jkYQPD446lQZMZpMsBhr06y2Hl3IS8eU2kwbQw=="));
    } 
    if (!bool1) {
      this.一倏 = false;
      return 一倀(一倀.WAIT, 一倆.一倀("r8OJqoxF2DN2LIRSYYb9dBDrOPIOgtrxLSRFPGQ1RHAP46prxjNwwRziWgmNUIW7j8nCxe2/UanHBlf4Pg=="));
    } 
    if (this.一倐) {
      if (bool2) {
        this.一倐 = this.一們 = false;
        this.一倊 = 0L;
        return 一倀(一倀.WAIT, 一倆.一倀("jKXDAfYZOnRW4cqc5ZytY/Ih0ijXm/4YqYteOleKCJNHz8KIoUlAx9cWLDC3gLSrQXaIYXggG9PTLUZF7U2mfn8spoOOEsH/5mUICB+yueyxfrWBclQmQ4ktExK0bw=="));
      } 
      if (param一倂.一倀() < this.一倊)
        return 一倀(一倀.WAIT, 一倆.一倀("WNnVEOUDTcmA0XWQV3cIr5/uLEYKq4UFROHcRZ67BoGZ0bn+NiJvXPLOKjtInRv8OtNM7brLM1Stm2pWHpv07J/iCmYV+kxRMp4AtzA5pBv4lg==")); 
      this.一倐 = this.一們 = false;
      this.一倊 = 0L;
      this.一倒++;
      long l = Math.min(60000L, 5000L << Math.min(4, this.一倒 - 1));
      this.一個 = param一倂.一倀() + l;
      return 一倀(一倀.WAIT, 一倆.一倀("wscXMf5IvwOJIcKNpKo2HhMvKqBEKlrNp5eJ4iMppGYyPgjTtpuSnVlqgzRTKBofukFdC398jgUqhqmGX6ZeGkAGl+Qi0xDROTChSZ0F7LzVjJNJDC5coc5H"));
    } 
    if (this.一們) {
      if (!bool2)
        return 一倀(一倀.WAIT, 一倆.一倀("/bVg85osmRFMz5AquLPx7VtLGilVrJamzSPxSHFUl0giRxCpb/iIOM2qAXNJdcGz9VPjOcV5co1IDcY=")); 
      this.一們 = false;
    } 
    if (param一倂.一倀() - this.一倉 < 750L)
      return 一倀(一倀.WAIT, 一倆.一倀("C+Mbbh+JxkM7RYSOwRlhm7GxIC07+uQvegiWuB1IrNgj1hZBHJVb7tVngoWNj7Lts2C3DVHUack0Op7/TC3qJAWmeuSASf1JsXMprdQQAYvnYm3Y6co=")); 
    if (param一倂.一倀() < this.一個)
      return 一倀(一倀.WAIT, 一倆.一倀("E+wnfWnVAwXtQBD5G+Fsf+TZ8qZXeSewZEiXBzmH0922CzSOTyNqD1D9shsmpYgaiAKk8D84siDtE7uMIAcEiPNUEN7Wv5JgKRJE06ug32wfHQ==")); 
    this.一們 = true;
    return 一倀(一倀.SEND_WARP, 一倆.一倀("RhLyzd51rLaAmxs/YlSx9yl0hZ9h0iAcBe5ayCesN9Kp4HWnXaKP8+AY4UdovyPY+GLJ"));
  }
  
  private boolean 一倁(一倂 param一倂) {
    if (!this.一倏) {
      this.一倌 = param一倂.一倈();
      this.一倍 = param一倂.一倉();
      this.一倎 = param一倂.一倊();
      this.一倉 = param一倂.一倀();
      this.一倏 = true;
      return false;
    } 
    boolean bool = (Math.hypot(param一倂.一倈() - this.一倌, param一倂.一倊() - this.一倎) > 0.04D || Math.abs(param一倂.一倉() - this.一倍) > 0.04D) ? true : false;
    if (bool) {
      this.一倌 = param一倂.一倈();
      this.一倍 = param一倂.一倉();
      this.一倎 = param一倂.一倊();
      this.一倉 = param一倂.一倀();
    } 
    return bool;
  }
  
  private 一倁 一倀(String paramString) {
    一倀();
    return 一倀(一倀.STOP, paramString);
  }
  
  private static 一倁 一倀(一倀 param一倀, String paramString) {
    return new 一倁(param一倀, paramString);
  }
  
  private static String 一倁(String paramString) {
    return (paramString == null) ? 一倆.一倀("nZzLD4NXwQiliVsSvhqAm0pJzrTQZltU/fxTsw==") : paramString.trim().toLowerCase(Locale.ROOT);
  }
  
  public enum 一倀 {
    READY, WAIT, SEND_WARP, STOP;
  }
  
  public static final class 一倁 extends Record {
    private final 一倄.一倀 一倀;
    
    private final String 一倁;
    
    public 一倁(一倄.一倀 param1一倀, String param1String) {
      this.一倀 = param1一倀;
      this.一倁 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倄$一倁;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倄$一倁;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倄$一倁;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public 一倄.一倀 一倀() {
      return this.一倀;
    }
    
    public String 一倁() {
      return this.一倁;
    }
  }
  
  public static final class 一倂 extends Record {
    private final long 一倀;
    
    private final boolean 一倁;
    
    private final boolean 一倂;
    
    private final String 一倃;
    
    private final String 一倄;
    
    private final boolean 一倅;
    
    private final boolean 一倆;
    
    private final boolean 一倇;
    
    private final double 一倈;
    
    private final double 一倉;
    
    private final double 一倊;
    
    public 一倂(long param1Long, boolean param1Boolean1, boolean param1Boolean2, String param1String1, String param1String2, boolean param1Boolean3, boolean param1Boolean4, boolean param1Boolean5, double param1Double1, double param1Double2, double param1Double3) {
      this.一倀 = param1Long;
      this.一倁 = param1Boolean1;
      this.一倂 = param1Boolean2;
      this.一倃 = param1String1;
      this.一倄 = param1String2;
      this.一倅 = param1Boolean3;
      this.一倆 = param1Boolean4;
      this.一倇 = param1Boolean5;
      this.一倈 = param1Double1;
      this.一倉 = param1Double2;
      this.一倊 = param1Double3;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倄$一倂;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倄$一倂;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倄$一倂;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public long 一倀() {
      return this.一倀;
    }
    
    public boolean 一倁() {
      return this.一倁;
    }
    
    public boolean 一倂() {
      return this.一倂;
    }
    
    public String 一倃() {
      return this.一倃;
    }
    
    public String 一倄() {
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
    
    public double 一倈() {
      return this.一倈;
    }
    
    public double 一倉() {
      return this.一倉;
    }
    
    public double 一倊() {
      return this.一倊;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倄.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */