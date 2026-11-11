package br.com.farmdmz.client.auth;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class 一倁 {
  static final int 一倀 = 65536;
  
  private static final ExecutorService 一倁;
  
  static CompletableFuture<一倀> 一倀(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    return CompletableFuture.supplyAsync(() -> 一倀(paramString1, paramString2, paramString3, paramString4, paramString5, 6000, 10000), 一倁);
  }
  
  static void 一倀(String paramString1, String paramString2) {
    if (paramString2 == null || paramString2.isEmpty())
      return; 
    try {
      Thread thread = new Thread(() -> {
            try {
              一倀(一倆.一倀("96tXKhP+UFpL/pN1LSZhm0vQmrhirGqKKhpsu159nHM="), paramString1, 一倆.一倀("uqxjuHjIInA7N+oiB/9WcW6Gisd7nxWSME7qgL1a"), paramString2, 一倆.一倀("gD0gKH77sc/+cDKpNFejXeNv8oBw+GmlE3jXTw=="), 1000, 1000);
            } catch (RuntimeException runtimeException) {}
          }一倆.一倀("uUlVFEX4UX/mi3Y+lhTfeo7UlrCIiFlq093LTeG8YrDOQDs0GDxQuR3E1b95/v5r2nc4pA=="));
      thread.setDaemon(true);
      thread.start();
    } catch (RuntimeException runtimeException) {}
  }
  
  private static 一倀 一倀(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2) {
    HttpURLConnection httpURLConnection = null;
    try {
      httpURLConnection = (HttpURLConnection)URI.create(paramString2).toURL().openConnection();
      httpURLConnection.setConnectTimeout(paramInt1);
      httpURLConnection.setReadTimeout(paramInt2);
      httpURLConnection.setInstanceFollowRedirects(false);
      httpURLConnection.setUseCaches(false);
      httpURLConnection.setRequestMethod(paramString1);
      httpURLConnection.setRequestProperty(一倆.一倀("vs3XP4K6zp9ctVnhaG8UpsbndLEyeOkoJUSSIUKT+hrmiA=="), 一倆.一倀("weLqQpUPnmd0XO1bSvIByMRCtzVDRAbSFhu8VNSWcRJjwXJjduO+2R7oCjk="));
      httpURLConnection.setRequestProperty(一倆.一倀("74+aQdmZeowgRihjxsZp/rTcXVW6RMSWIZAok20TtYizp+AxXQpV8B2v9R/5mMm37qni"), 一倆.一倀("u/NCzjLzdUq1NV4i4x/e129wUlSmHgiXGme6HCo="));
      httpURLConnection.setRequestProperty(一倆.一倀("uqe1N2DonRaX/+MAvdL5UewTkCRiypJS2McYr8B9fVw2bdEg0T4AMfUqakgLcHYyRSDFkRYsRw=="), 一倆.一倀("Lkqv7FG8oWhtgpJBSmDeBDp6dqjxhciAEvB8F/Y="));
      httpURLConnection.setRequestProperty(一倆.一倀("1N1gM3+QiEG4BkjU1Q9d73dnCOQjRuOOKmoMXnyEXPZdqQFRxQmiInPN5jqdx4XfsMw="), 一倆.一倀("AzqdzhVVBqAHDZCYu66yen/z7vkZKDaRrylm5xBXKZg="));
      if (!paramString5.isBlank())
        httpURLConnection.setRequestProperty(一倆.一倀("DsfwIzOXuE57ae4eoS0CE50QBSSwmFUHFdZ3MsCN51Evj5PNVL8mAqYiE8NqfVb+jqQ="), paramString5); 
      if (paramString4 != null && !paramString4.isEmpty())
        httpURLConnection.setRequestProperty(一倆.一倀("vZykBvjgi2mm43CR8JaFTzUHYUnU2MAtR9sqpDb+ZkEI/oiksM5GT04="), "uyTtFKOns75E+BRLwoGpV+DJ+vXg4VuGPgvjvUgQ42StlGlZ"); 
      if (paramString3 != null) {
        byte[] arrayOfByte = paramString3.getBytes(StandardCharsets.UTF_8);
        httpURLConnection.setRequestProperty(一倆.一倀("ZySfMP25I8p00KTl+jf2oskSzkM7zVLRjwiIJKkpQZ++QgWns0I4kw=="), 一倆.一倀("9taqEV3LDhgRmuLEmzOBBCbFQ1qNZBh6SxfjKECj+bK+fEUFexdmnI+B5FGzgWzvNMiRrA6ZolflXcM="));
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(arrayOfByte.length);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
          outputStream.write(arrayOfByte);
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
      } 
      int i = httpURLConnection.getResponseCode();
      InputStream inputStream = (i >= 400) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
      String str = 一倆.一倀("AQ3N3XRgi4LiLkIgoforj0MA7YMpLVOr3TR5WQ==");
      if (inputStream != null) {
        InputStream inputStream1 = inputStream;
        try {
          byte[] arrayOfByte = inputStream.readNBytes(65537);
          if (arrayOfByte.length > 65536)
            throw new IOException(一倆.一倀("yiYYL9+fsrfCWEK2DUKQZh3vZkWf0yjWkA8F8xaDx5LsS4/gFS/8pPS0+X3/U6mfBRy/Gd/4WQNATGRmkYcThs9zv37iIw==")); 
          str = new String(arrayOfByte, StandardCharsets.UTF_8);
          if (inputStream1 != null)
            inputStream1.close(); 
        } catch (Throwable throwable) {
          if (inputStream1 != null)
            try {
              inputStream1.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            }  
          throw throwable;
        } 
      } 
      return new 一倀(i, str);
    } catch (IOException|RuntimeException iOException) {
      throw new CompletionException(iOException);
    } finally {
      if (httpURLConnection != null)
        httpURLConnection.disconnect(); 
    } 
  }
  
  static {
    一倁 = Executors.newFixedThreadPool(2, paramRunnable -> {
          Thread thread = new Thread(paramRunnable, 一倆.一倀("Y1optTxDuaX7ff0IOvl+Y3dekEb5KpZNbdRqU8C+kLQgMJoZ2wEtqGi0GqN5PiHYxyg="));
          thread.setDaemon(true);
          return (ThreadFactory)thread;
        });
  }
  
  static final class 一倀 extends Record {
    private final int 一倀;
    
    private final String 一倁;
    
    一倀(int param1Int, String param1String) {
      this.一倀 = param1Int;
      this.一倁 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/auth/一倁$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/auth/一倁$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/auth/一倁$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public int 一倀() {
      return this.一倀;
    }
    
    public String 一倁() {
      return this.一倁;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\auth\一倁.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */