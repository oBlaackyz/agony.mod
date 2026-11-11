package br.com.farmdmz.core;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public final class 一倆 implements 一倅.一倀 {
  public static final String 一倀 = br.com.farmdmz.client.auth.一倆.一倀("9bGyD7bIpVClFKWA8xH1iMIMChtzIN+L6QgSlcft6ViunJTzU0U=");
  
  public static final long 一倁 = 5000L;
  
  private final 一倅.一倀 一倂;
  
  private final LongSupplier 一倃;
  
  private final Supplier<String> 一倄;
  
  private final Consumer<String> 一倅;
  
  private final Runnable 一倆;
  
  private boolean 一倇;
  
  private boolean 一倈;
  
  private long 一倉;
  
  private String 一倊 = br.com.farmdmz.client.auth.一倆.一倀("MkR2NVwFF6Zw8tBA5/8Hnx53APLa6OEr1IWbHA==");
  
  private String 一個 = br.com.farmdmz.client.auth.一倆.一倀("78HZKQvfXAkKeT24qVEICLdNprnhvNuErkrOMg==");
  
  public 一倆(一倅.一倀 param一倀, LongSupplier paramLongSupplier, Supplier<String> paramSupplier, Consumer<String> paramConsumer, Runnable paramRunnable) {
    this.一倂 = Objects.<一倅.一倀>requireNonNull(param一倀);
    this.一倃 = Objects.<LongSupplier>requireNonNull(paramLongSupplier);
    this.一倄 = Objects.<Supplier<String>>requireNonNull(paramSupplier);
    this.一倅 = Objects.<Consumer<String>>requireNonNull(paramConsumer);
    this.一倆 = Objects.<Runnable>requireNonNull(paramRunnable);
  }
  
  public boolean running() {
    return (this.一倇 || this.一倂.running());
  }
  
  public boolean 一倀() {
    return this.一倇;
  }
  
  public String 一倁() {
    return this.一倊;
  }
  
  public String 一倂() {
    return this.一個;
  }
  
  public long 一倃() {
    return this.一倇 ? Math.max(0L, this.一倉 - this.一倃.getAsLong()) : 0L;
  }
  
  public void start() {
    if (running())
      return; 
    this.一個 = br.com.farmdmz.client.auth.一倆.一倀("cTtq33reElVL49PYH04JNUxcUKcGEac/rSwCCA==");
    try {
      this.一倊 = 一倁(this.一倄.get());
      this.一倉 = Math.addExact(this.一倃.getAsLong(), 5000L);
      this.一倇 = true;
      this.一倈 = true;
      this.一倅.accept(this.一倊);
    } catch (RuntimeException runtimeException) {
      一倄();
      this.一個 = br.com.farmdmz.client.auth.一倆.一倀("PoFy/C00z3DRMKPAc+Udk6KxchS7iKSNWwGBMxRJj2lih4dLedRu+a2hpXg1in1CF3bSnLNe6n4m30eJ+lEJERJRUUpmqLp7S9ziv7e5siCn");
    } 
  }
  
  public void stop() {
    一倄();
    if (this.一倂.running())
      this.一倂.stop(); 
    this.一個 = br.com.farmdmz.client.auth.一倆.一倀("dFRolJQZ1QWj2Q+wyMPWILGnl8lv76elU960tQ==");
  }
  
  public 一倀 一倀(boolean paramBoolean1, boolean paramBoolean2) {
    if (!this.一倇)
      return 一倀.IDLE; 
    if (!paramBoolean1) {
      stop();
      return 一倀.CANCELLED;
    } 
    if (this.一倂.running())
      this.一倂.stop(); 
    if (!paramBoolean2 || this.一倃.getAsLong() < this.一倉)
      return 一倀.WAITING; 
    this.一倇 = false;
    this.一倉 = 0L;
    try {
      this.一倂.start();
      if (this.一倂.running())
        return 一倀.STARTED; 
    } catch (RuntimeException runtimeException) {}
    一倄();
    this.一個 = br.com.farmdmz.client.auth.一倆.一倀("R0ERoQ/omwnUaHIPxEHC5MwAU4kBc/FrOJ+2OulYx1zOBasvlBx/vNarHIBothyst9ZjCC3vsqIEmmiq2DdTLYNnZKnDU75OispyL16QvV4=");
    return 一倀.FAILED;
  }
  
  public boolean 一倀(String paramString) {
    String str;
    if (!this.一倈 || (!this.一倇 && !this.一倂.running()))
      return false; 
    try {
      str = 一倁(paramString);
    } catch (RuntimeException runtimeException) {
      return false;
    } 
    if (!this.一倊.equalsIgnoreCase(str))
      return false; 
    stop();
    this.一個 = br.com.farmdmz.client.auth.一倆.一倀("hbqmmDtxt2u+O1yMZq7kVZ5du4GYFLUotTRvQ+Cx6pqPJFNAkB81sRLCtaWsTAwyuVrmWHLttjNITIU4r4FONZys4rV5UU6iWOrAV8xEpai3DGfYzoSO+znKZkqmBl7QJw/A");
    return true;
  }
  
  private void 一倄() {
    if (this.一倈)
      this.一倆.run(); 
    this.一倈 = false;
    this.一倇 = false;
    this.一倉 = 0L;
  }
  
  public static String 一倁(String paramString) {
    String str;
    for (str = (paramString == null) ? br.com.farmdmz.client.auth.一倆.一倀("AqKwOSO1q/vedcVOww+8XordRAuNcBMGTax/CQ==") : paramString.trim(); str.startsWith(br.com.farmdmz.client.auth.一倆.一倀("nhgzjncol5R25MO3igm8pTZaAF+vwEGxDAKYi/A=")); str = str.substring(1).trim());
    if (str.isEmpty())
      return br.com.farmdmz.client.auth.一倆.一倀("hbgBGfXfjJleHpU2SgN0LELjwIndSkF26LY0shPuFUYRtv+FOPI="); 
    if (str.length() > 128 || str.indexOf('\n') >= 0 || str.indexOf('\r') >= 0 || str.indexOf(false) >= 0)
      throw new IllegalArgumentException(br.com.farmdmz.client.auth.一倆.一倀("B9DFLl+fQx0kQrdwz6KXv4bfFUvPNSs/Jlb6mo30qSkQlVegO6PsEmBNC6hZ9w6kDGvAdSDj")); 
    return str.replaceAll(br.com.farmdmz.client.auth.一倆.一倀("YEAuNQ8F+GwQHAKlQxkhnpVYNCBtWHJOCt7PZvkLLQ=="), br.com.farmdmz.client.auth.一倆.一倀("ibeKDlUjXPnGfKTXrikqCwwHYWvqrCWQqXilwQE="));
  }
  
  public enum 一倀 {
    IDLE, WAITING, STARTED, CANCELLED, FAILED;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倆.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */