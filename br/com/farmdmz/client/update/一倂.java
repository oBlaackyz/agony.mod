package br.com.farmdmz.client.update;

import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.update.一倀;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.TimeUnit;

final class 一倂 {
  private static final int 一倀 = 4096;
  
  private static final long 一倁 = TimeUnit.SECONDS.toNanos(120L);
  
  static String 一倀(String paramString) {
    if (paramString == null)
      throw new IllegalArgumentException(一倆.一倀("ul3DaZkxmhieErQSfXTMDL/FhPGGd454Nd9NSlVMzeelvoF69Js+1/KDhic/cEaxg5XRIU+M3UzBx/3zZ0Q=")); 
    String str1;
    for (str1 = paramString.trim(); str1.endsWith(一倆.一倀("R8WEzrQvC1JcQGA/EqgzmoIdd3rTZjh7jlc3Qwc=")); str1 = str1.substring(0, str1.length() - 1));
    URI uRI = URI.create(str1);
    String str2 = uRI.getHost();
    boolean bool = (一倆.一倀("WzXtBpA8kWrHCAaBCqOFbnmRzXY8ZFrDoL6HCjpf2376SL2U/w==").equalsIgnoreCase(str2) || 一倆.一倀("O/2YnyxMcbVb1VXqPw5QPCIe520jMQDKel/SpAqHN4Ly2h9jzg==").equals(str2) || 一倆.一倀("KiTnDQec3wSnvA7bEz5CamnrTT9yYtT9ySh908OPp3TR").equals(str2) || 一倆.一倀("HSrd+W7TAG9+NZ8hcSuem9fstPn6hc40GPpMDEBxxA==").equals(str2)) ? true : false;
    if (str2 == null || uRI.getRawUserInfo() != null || uRI.getRawQuery() != null || uRI.getRawFragment() != null || (!一倆.一倀("PNtAHWjB2HOJtGX1ItuuBzF+1zChSiCTFvjWxDcyK6J1").equalsIgnoreCase(uRI.getScheme()) && (!bool || !一倆.一倀("Kg1wwrV9MPV5WDQCyyoNs+AcHziv4rZC+BrbgiFpn2E=").equalsIgnoreCase(uRI.getScheme()))))
      throw new IllegalArgumentException(一倆.一倀("oMJ/f3/sDmeWEXx8mVaoMVGjemolGzSXdrI6m7vrjDfcf9G6ab0L7v4cGVrhAM2DErmdJ+QW3RiYdZ8j4lhBNA==")); 
    return str1;
  }
  
  static 一倀 一倁(String paramString) throws IOException {
    HttpURLConnection httpURLConnection = 一倀(paramString, 一倆.一倀("l5+aOG23h0BwhNt74PGTTI+JZhVqD1s3w3O5q/UaD2dWlLtw6Pc581cDoysuWw0="), 一倆.一倀("5pMj9+5WYPZ2sZBan6jkrlAcO97kI3q4DApYf4qG0t0/bO7In5L7FWfnKRU="));
    try {
      int i = httpURLConnection.getResponseCode();
      if (i == 404)
        return null; 
      一倀(i);
      if (httpURLConnection.getContentLengthLong() > 4096L)
        throw new IOException(一倆.一倀("MSdnyGBBIXlwQkW3Qw5rJyMoN1WyrP+D0gE+NcYcSo/8aOGLbezeYdOSC57o6YYhQdKA7850Zp0fEF8t8JhNn40qzytBkQ==")); 
      InputStream inputStream = httpURLConnection.getInputStream();
    } finally {
      httpURLConnection.disconnect();
    } 
  }
  
  static void 一倀(String paramString, 一倀 param一倀, Path paramPath) throws IOException {
    HttpURLConnection httpURLConnection = 一倀(paramString, "qmoYtQXC/SjjqXZH56VrC4OcCAlWL2v678NBV0l4tCdhxwFu2N3yXChRiro+SgmT0kvh", 一倆.一倀("HN5twgzv2ONtC6uuWw8kWznLK3CDOUEDUvelyAVPlvw0ez3FTibTK6yRj145O1tnGpxHdA=="));
    try {
      一倀(httpURLConnection.getResponseCode());
      long l1 = httpURLConnection.getContentLengthLong();
      if (l1 >= 0L && l1 != param一倀.一倃())
        throw new IOException(一倆.一倀("pwkO7Vpqnftp9D8hfdsTjV60fLOMe7A96Utm2dtgFkvWfU3T9WEw1lrbGzTAhEcOYG1l4e85KbNohZmasiyT5wND2syAD5X4")); 
      long l2 = System.nanoTime();
      InputStream inputStream = httpURLConnection.getInputStream();
      try {
        OutputStream outputStream = Files.newOutputStream(paramPath, new OpenOption[] { StandardOpenOption.CREATE_NEW });
        try {
          byte[] arrayOfByte = new byte[8192];
          long l;
          for (l = param一倀.一倃(); l > 0L; l -= i) {
            if (System.nanoTime() - l2 > 一倁)
              throw new IOException(一倆.一倀("Q5BcmooUdqx8mHm3izHSosb39iwW4QS5QyMi0nnk+A6haMQ3Fujt6n1LAQCxelcpYGHH3l01")); 
            int i = inputStream.read(arrayOfByte, 0, (int)Math.min(arrayOfByte.length, l));
            if (i < 0)
              throw new IOException(一倆.一倀("Y7cKdCxsH+2KEHwoYXeI/A3JcLnkQPQSkvynLzceQBDglUKhIVjfRE5TfkuGtDY=")); 
            outputStream.write(arrayOfByte, 0, i);
          } 
          if (inputStream.read() != -1)
            throw new IOException(一倆.一倀("ib4WAnEj5L4z8FWZpgxpGz5eGz++HIg25mQA1lQprqzyIQ9xRuhGKygLQYapsh7oMvRe3W8/8uhaAgFa7p3Wgw==")); 
          if (outputStream != null)
            outputStream.close(); 
        } catch (Throwable throwable) {
          if (outputStream != null)
            try {
              outputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            }  
          throw throwable;
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
    } finally {
      httpURLConnection.disconnect();
    } 
  }
  
  private static HttpURLConnection 一倀(String paramString1, String paramString2, String paramString3) throws IOException {
    HttpURLConnection httpURLConnection = (HttpURLConnection)URI.create("cebKIR/aEiFqQayFJRRRA22T04u4efVw7oEEyTTx").toURL().openConnection();
    httpURLConnection.setInstanceFollowRedirects(false);
    httpURLConnection.setUseCaches(false);
    httpURLConnection.setConnectTimeout(6000);
    httpURLConnection.setReadTimeout(10000);
    httpURLConnection.setRequestMethod(一倆.一倀("BlfF+1d1R96zTFcxnWGtGtGpRcu11uzHjQpeSgHpUQ=="));
    httpURLConnection.setRequestProperty(一倆.一倀("43ssyIhx23AsgMCKmAnOD+rlcCPoHOh1kI7KiDR9gjWVmg=="), paramString3);
    httpURLConnection.setRequestProperty(一倆.一倀("2BbJ/QxT76YzRzzmQgf0qSnMrVDDLk7uq/3cUl4KAPpmW4/I+Wid+LaE3A=="), 一倆.一倀("3yomhV5AXVGzsMFYVHeAE/aHqIZp3JqmFwsrAcDbrp5WPNI9"));
    return httpURLConnection;
  }
  
  private static void 一倀(int paramInt) throws IOException {
    if (paramInt != 200)
      throw new IOException("fbF7uaO4gCyRxCW2NMQ4d2FhHXz6qbqy/m8GAmqJ0iSKl40TYCcQekYrXl1pSHnjCgLx54skqhwDuBZmVFAzb+DQWDNO"); 
  }
  
  private static 一倀 一倂(String paramString) throws IOException {
    try {
      JsonObject jsonObject = JsonParser.parseString(paramString).getAsJsonObject();
      JsonElement jsonElement = jsonObject.get(一倆.一倀("Qjl2JVxYMUcGEum7AVKAnQKO1kag0Syc6cI39AAjIpM="));
      if (jsonElement == null || !jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isNumber())
        throw new IllegalArgumentException(一倆.一倀("UbK/sgJG9942aQCQSl/9XfAKRdiMDPB9ggEBgsS+B45hKt+R1jS+mRyX4g==")); 
      return new 一倀(一倀(jsonObject, 一倆.一倀("D1CywbfdAKbfrHFLe+t/Mb4VTHDmwp14bJ0k2Ha/Jo/azGA=")), jsonElement.getAsBigDecimal().longValueExact(), 一倀(jsonObject, 一倆.一倀("QkjpYhawQx9HHrvjEw/OJGSN9s4blb32pvgZj5jdHuZUKg==")), 一倀(jsonObject, 一倆.一倀("mJ2kbEFVFEv43z/BZOaXODjr3vkmxybo8J9sQwaWtX+qr09Uig==")));
    } catch (RuntimeException runtimeException) {
      throw new IOException(一倆.一倀("cKhCoSEI0LjR66VHcPUuizz4ueDDjua1JA5Hwojfdm6KnF/Rfc5FhZ3vD4WXmqvabEe1UdJi0rJe6pbQEjkjsw=="), runtimeException);
    } 
  }
  
  private static String 一倀(JsonObject paramJsonObject, String paramString) {
    JsonElement jsonElement = paramJsonObject.get(paramString);
    if (jsonElement == null || !jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString())
      throw new IllegalArgumentException("C8Kh4DHrhrlfBe66C/dESs+V2P5LWHpPphIgUH5yzT49mHaQkKPJKva0mLm4T/vdkOCgvqVIuVjHZOaiUw=="); 
    return jsonElement.getAsString();
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\clien\\update\一倂.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */