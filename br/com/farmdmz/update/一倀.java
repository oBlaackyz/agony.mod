package br.com.farmdmz.update;

import br.com.farmdmz.client.auth.一倆;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HexFormat;
import java.util.regex.Pattern;

public final class 一倀 extends Record {
  private final String 一倁;
  
  private final long 一倂;
  
  private final String 一倃;
  
  private final String 一倄;
  
  public static final long 一倀 = 8388608L;
  
  private static final String 一倅 = 一倆.一倀("rFTL1NdXLsupuIjhuZ7Ky30DPuQl4kkaCf86UVW9UaELSnTlSqkb/mrdPQ8xwEbUW45EkoA6vMFz4EgopekU5gA+DMCTCQUVJX684eQ8zVU4KfkCJPK0ag==");
  
  private static final Pattern 一倆 = Pattern.compile(一倆.一倀("1td1cVjRE5tu44JXSZgBWSJNoI8LRGeXAAbFl5NmeoKGDNytT/szkGMkKYmG6rcbMTlPg9bapTi9Xq5dy3a2LDz+Eju0YlNzhWTRAvAkMQ=="));
  
  private static final Pattern 一倇 = Pattern.compile(一倆.一倀("/DqDc3tl8h0r64BQmHw0MTTStZg84YcwRlwXhipTTVMWfHeNfoV52A=="));
  
  public 一倀(String paramString1, long paramLong, String paramString2, String paramString3) {
    一倀(paramString1);
    if (paramLong < 1L || paramLong > 8388608L)
      throw new IllegalArgumentException(一倆.一倀("408qXq3AyILElUUYku/rgkredK5nbBe9UNBNujYbyfRkmmq4kRtqPp62llIOY1WrQg+fj71xDk841pjtcDGa")); 
    if (paramString2 == null || !一倇.matcher(paramString2).matches())
      throw new IllegalArgumentException(一倆.一倀("daF9XBXXZYRPoonPJYX/8CVKGiVzrSgKTGBnWCoPVDWdgzv9N0zKsXUYR/hXDJqtwBpV3ziFQqXZgrFVT7zZ")); 
    if (paramString3 == null || paramString3.length() != 88)
      throw new IllegalArgumentException(一倆.一倀("ox5yvxWeMUAUMmXEb3oMuyGfuW7GCXo+q4/8nuMN/l9NJZnC7QW6MgW4FdK1cu/9t1NurNEZucnkeGltzcalsTJwvyfl+bq0DLQ/A8E=")); 
    byte[] arrayOfByte = Base64.getDecoder().decode(paramString3);
    if (arrayOfByte.length != 64 || !Base64.getEncoder().encodeToString(arrayOfByte).equals(paramString3))
      throw new IllegalArgumentException(一倆.一倀("J6IWTci6WN9EG6Y2q9mHQkzYMr2e1fud5VQVfHM0iLKaL/fWnf+4D8wdQQlGeMrJJI/bif37cC7RDNo28ojN3ut31fsx4h9hStp64jc=")); 
    this.一倁 = paramString1;
    this.一倂 = paramLong;
    this.一倃 = paramString2;
    this.一倄 = paramString3;
  }
  
  public void 一倀() throws GeneralSecurityException {
    一倀(一倁());
  }
  
  static PublicKey 一倁() throws GeneralSecurityException {
    return KeyFactory.getInstance(一倆.一倀("ytpHd7zjyqxaKzpsZnU2DM4xqzAuH/EJjyB+nDzyJfXxZaU=")).generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(一倆.一倀("PKGSySwJSlPRKRD3UvDtRG2hMWFwyE4nWkwmymEsdXC04noSFW46pz1a7VQ18h40fIZ6IAM35WYzNatfgvGu2+YAlzSuqBXyIOkXvoytROe8vPIfMgZj1g=="))));
  }
  
  void 一倀(PublicKey paramPublicKey) throws GeneralSecurityException {
    Signature signature = Signature.getInstance(一倆.一倀("DM3P6mjSdxmXA3gTuPrWFM3UFCKJaDBjgvIGC3ijbmx90SI="));
    signature.initVerify(paramPublicKey);
    signature.update("FyO2JemHKvZQSp8kR8y9QUTDoZjCKzTtwIPM8QoO4pbb+95BZkwq21Cn+x5qAhor5eXgbmiUWmwK".getBytes(StandardCharsets.UTF_8));
    if (!signature.verify(Base64.getDecoder().decode(this.一倄)))
      throw new SignatureException(一倆.一倀("IZwvxCpHfj3TuuRE9beQJHb9fbD9TkvDOcFAFqqavASF/3zj0gGY057CdfAxVQqsKhUcb6qaQJkETP71wp2n/EMa")); 
  }
  
  public void 一倀(Path paramPath) throws IOException {
    if (!this.一倃.equals(一倀(paramPath, this.一倂)))
      throw new IOException(一倆.一倀("w8p1pH8BcmPcY6xPf4hwtUy+YbarVf1EAMpUmsf5v/zOokQ+kDCiBL1foQWV3HU/16FG23Z0yOAHCWlVyRo=")); 
  }
  
  static String 一倀(Path paramPath, long paramLong) throws IOException {
    MessageDigest messageDigest;
    if (!Files.isRegularFile(paramPath, new LinkOption[] { LinkOption.NOFOLLOW_LINKS }))
      throw new IOException("djcKave3Vy+glrY3vt8/+4aiLLtzWu7jg5LuBfJfbg6jbyw4t+O+o+IhOkE="); 
    try {
      messageDigest = MessageDigest.getInstance(一倆.一倀("8faw6EHhnZDlRZWv5B1MhcGcxz8QeKyjN789tMCyAO9/GY4="));
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new AssertionError(noSuchAlgorithmException);
    } 
    long l1 = 0L;
    long l2 = (paramLong > 0L) ? paramLong : 8388608L;
    InputStream inputStream = Files.newInputStream(paramPath, new OpenOption[] { LinkOption.NOFOLLOW_LINKS });
    try {
      byte[] arrayOfByte = new byte[16384];
      int i;
      while ((i = inputStream.read(arrayOfByte)) != -1) {
        l1 += i;
        if (l1 > l2)
          throw new IOException(一倆.一倀("uL//D6p7JeFAArJaea2uGMPaoCb88Hvu8x/eaLmDVR2x5VwMs5ZpnZxyJa8+4n1c93tNOqIvNPxOBamSaA==")); 
        messageDigest.update(arrayOfByte, 0, i);
      } 
      if (inputStream != null)
        inputStream.close(); 
    } catch (Throwable throwable) {
      if (inputStream != null)
        try {
          inputStream.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        }  
      throw throwable;
    } 
    if (l1 == 0L || (paramLong > 0L && l1 != paramLong))
      throw new IOException(一倆.一倀("ZE3hdOH1+tMBzCIHgOG97rcFq3WY37rZswvI56qK+0FFLjOZT6DWWcNnSaCQXoU0bPBs5FaN")); 
    return HexFormat.of().formatHex(messageDigest.digest());
  }
  
  public static int 一倀(String paramString1, String paramString2) {
    String[] arrayOfString1 = 一倀(paramString1);
    String[] arrayOfString2 = 一倀(paramString2);
    for (byte b = 0; b < arrayOfString1.length; b++) {
      int i = Integer.compare(Integer.parseInt(arrayOfString1[b]), Integer.parseInt(arrayOfString2[b]));
      if (i != 0)
        return i; 
    } 
    return 0;
  }
  
  private static String[] 一倀(String paramString) {
    if (paramString == null || !一倆.matcher(paramString).matches())
      throw new IllegalArgumentException(一倆.一倀("AZPbMuHkXVjhgwe+iAYhnoAQmYkTT+Rbc5Er6kvTBtjwkVmvCYSZ9vhqI7lusGU9I5uSBde5gbT6tNSlBTXE")); 
    return paramString.split(一倆.一倀("PRuVO9l6Htlj9nuXbZy4kroyZURkXKiREKyL1Hyl"));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lbr/com/farmdmz/update/一倀;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/update/一倀;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lbr/com/farmdmz/update/一倀;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String 一倂() {
    return this.一倁;
  }
  
  public long 一倃() {
    return this.一倂;
  }
  
  public String 一倄() {
    return this.一倃;
  }
  
  public String 一倅() {
    return this.一倄;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdm\\update\一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */