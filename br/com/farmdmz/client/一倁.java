package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倄;
import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.core.一倅;
import br.com.farmdmz.core.一倆;
import br.com.farmdmz.core.一倇;
import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.Connection;

final class 一倁 {
  private static final 一倅 一倀 = new 一倅();
  
  private static final Minecraft 一倁 = Minecraft.m_91087_();
  
  private static 一倀 一倂;
  
  private static boolean 一倃;
  
  private static boolean 一倄;
  
  private static boolean 一倅;
  
  private static boolean 一倆;
  
  private static String 一倇 = 一倆.一倀("t4EWPOWq4kJrsGddbwSX7VTXzy+9UW08hXD94A==");
  
  private static final br.com.farmdmz.core.一倁 一倈 = new br.com.farmdmz.core.一倁();
  
  private static Connection 一倉;
  
  private static final 一倅.一倀 一倊 = new 一倅.一倀() {
      public boolean running() {
        return (一倁.一倏() && 一倁.一倀((一倁.一倐()).一倁));
      }
      
      public void start() {
        if (一倂.一倀(一倄.一倀.FISHING) && 一倁.一倊() && 一倁.一倏() && !running())
          一倁.一倁((一倁.一倐()).一倂); 
      }
      
      public void stop() {
        if (running())
          一倁.一倁((一倁.一倐()).一倃); 
      }
    };
  
  private static final 一倆 一個 = new 一倆(一倊, System::currentTimeMillis, () -> 一倇, 一倁::一倁, 一倁::一個);
  
  private static final 一倅.一倀 一倌 = (一倅.一倀)一個;
  
  static void 一倀() {
    if (一倆) {
      一倅 = false;
      return;
    } 
    if (!一倏())
      return; 
    一倆 = true;
    一倅 = false;
    一倀.一倀(一倌);
  }
  
  static void 一倁() {
    一倀(true);
  }
  
  static void 一倀(boolean paramBoolean) {
    if (!一倆)
      return; 
    一倅 = !paramBoolean;
    if (!一倏()) {
      一倆 = false;
      return;
    } 
    if (!paramBoolean) {
      一倀.一倃(一倌, false, 一倉(), 一倎());
      return;
    } 
    一倇 = 一倆.一倀("zXbfxXYmMprgqpe6ah6foeTRCQrAe257xHRCyw==");
    一倀.一倀(一倌, 一倉(), 一倎());
    一倆 = false;
  }
  
  static void 一倀(boolean paramBoolean1, boolean paramBoolean2) {
    一倀(paramBoolean1, paramBoolean2, true);
  }
  
  private static void 一倀(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (!一倏()) {
      一個.stop();
      return;
    } 
    if (一個.一倀() && !一倌())
      一倍(); 
    if (!paramBoolean1 && !一倅 && 一倆)
      一倀(true); 
    一倀.一倃(一倌, (paramBoolean2 && !一倅), 一倉(), 一倎());
    if (paramBoolean3 && 一個.一倀()) {
      一倆.一倀 一倀1 = 一個.一倀(一倌(), (一倊() && 一倎()));
      if (一倀1 == 一倆.一倀.CANCELLED || 一倀1 == 一倆.一倀.FAILED)
        一倍(); 
    } 
  }
  
  static boolean 一倁(boolean paramBoolean1, boolean paramBoolean2) {
    if (!一倂.一倀(一倄.一倀.FISHING)) {
      一倈();
      return false;
    } 
    if (!一倏())
      return false; 
    一倀(paramBoolean1, paramBoolean2, false);
    return 一倀.一倁(一倌, (paramBoolean2 && !一倅), 一倉(), 一倎());
  }
  
  static void 一倁(boolean paramBoolean) {
    一倀(paramBoolean, 一倆.一倀("QR4x65Q2ONzmhUM4zKYbeNTYnnBwmNEGd+PiGg=="));
  }
  
  static void 一倀(boolean paramBoolean, String paramString) {
    if (!一倆)
      return; 
    一倇 = (paramString == null) ? 一倆.一倀("By00sHwz6V7i1cchY69DCiZ6OX7oz51UDEXcMg==") : paramString;
    if (一倏())
      一倀.一倀(一倌, (paramBoolean && !一倅), 一倉(), 一倎()); 
  }
  
  static void 一倂() {
    一倇 = 一倆.一倀("a3CauPcpV8qiVqenQNyzpulb+O/syL3irDEG7w==");
    if (一倏())
      一倀.一倁(一倌); 
  }
  
  static void 一倃() {
    一倇 = 一倆.一倀("LcJFW61ByTi6C3crli1c+9yo5xyyjw78SGpaJw==");
    if (一倏()) {
      一倀.一倂(一倌);
    } else {
      一個.stop();
    } 
  }
  
  static boolean 一倄() {
    return (一倏() && 一倀.一倃(一倌));
  }
  
  static boolean 一倅() {
    return (一倏() && 一倌.running());
  }
  
  static boolean 一倆() {
    return 一個.一倀();
  }
  
  static String 一倇() {
    return !一個.一倂().isEmpty() ? 一個.一倂() : (一個.一倀() ? "5NoMOaT+dSwdX3t+14/6fEIPSLrjoGEX5cNuUwM9LdjnkTDocvfpISrdp74udkAazvhrqoAe+jhFczDAays=" : (一倅() ? 一倆.一倀("r4Mx/TeHNTwBqsguBHg70nrxxYWCrtFBIsaOcYMWvOMl347HtubDJQ==") : 一倆.一倀("cvQY9NVC7KBI60UumrlsT75kOhsyhk7lDY2I4D8EHyNl3VcqOsuz9To=")));
  }
  
  static boolean 一倀(String paramString) {
    if (!一個.一倀(paramString))
      return false; 
    一倍();
    return true;
  }
  
  static void 一倈() {
    一個.stop();
    一倇 = 一倆.一倀("0o1TkrsAKOA4KLKIEHx+ZDA7NunQXhh8yQLqtQ==");
    if (一倏()) {
      一倀.一倁(一倌);
      一倀.一倂(一倌);
      一倀.一倀(一倌, false, false);
    } 
    一倅 = 一倆 = false;
  }
  
  private static boolean 一倉() {
    return (一倂.一倀(一倄.一倀.FISHING) && (一倊() || (一個.一倀() && 一倌())));
  }
  
  private static boolean 一倊() {
    return (一倁.f_91074_ != null && 一倁.f_91073_ != null && 一倁.f_91072_ != null && 一倁.m_91403_() != null && 一倁.f_91074_.m_6084_());
  }
  
  private static void 一倁(String paramString) {
    if (!一倂.一倀(一倄.一倀.FISHING) || !一倊())
      throw new IllegalStateException(一倆.一倀("TLVoLISyDxvkpOF1oWEmq/u+9x+Dk9fGxLITQe4zSne4p1kfE6sDWqZNHIkVahtBX2pOjIV4pK7GQ3NaPKBcPtF1BQ==")); 
    一倉 = 一倁.m_91403_().m_104910_();
    一倈.一倀(一倉, 一倂.一倁(), 一倂.一倂());
    一倉.一倀(一倇.一倁.FISHING, paramString, System.currentTimeMillis());
  }
  
  private static void 一個() {
    一倉.一倀(一倇.一倁.FISHING);
    一倈.一倀();
    一倉 = null;
  }
  
  private static boolean 一倌() {
    if (!一倂.一倀(一倄.一倀.FISHING) || 一倉 == null || (一倁.f_91074_ != null && !一倁.f_91074_.m_6084_()))
      return false; 
    ClientPacketListener clientPacketListener = 一倁.m_91403_();
    br.com.farmdmz.core.一倁.一倀 一倀1 = 一倈.一倀((clientPacketListener == null) ? null : clientPacketListener.m_104910_(), 一倉.m_129536_(), 一倊(), 一倂.一倁(), 一倂.一倂());
    return (一倀1 == br.com.farmdmz.core.一倁.一倀.READY || 一倀1 == br.com.farmdmz.core.一倁.一倀.WAITING_FOR_WORLD);
  }
  
  private static void 一倍() {
    一倇 = 一倆.一倀("TvtVWQokrQv2lFVUqwZdyhGahWv81zpXW0SR1g==");
    if (一倏())
      一倀.一倂(一倌); 
  }
  
  private static boolean 一倎() {
    return !(一倁.f_91080_ instanceof 一倈);
  }
  
  private static boolean 一倏() {
    return (一倐() != null && !一倄);
  }
  
  private static 一倀 一倐() {
    if (!一倃) {
      一倃 = true;
      try {
        Class<?> clazz = Class.forName(一倆.一倀("pGjeYJJj0VqTbgaGFyyNzrpTpzYRjaS8XSRtyou7r7Pj8szQV7iVQcfxyLb3Bs2TDToLYYM9b6DH7A2l0+3EPArHQ/BsBg=="));
        一倂 = new 一倀(clazz.getMethod(一倆.一倀("AowNFMXg4UQpFbeQo5xdYaPIbZ4G+d2UyM4HHC2K5Q=="), new Class[0]), clazz.getMethod(一倆.一倀("EFjhZffFVQH/jqny8sxzMR/G0qvYvUGMOnxB+bZr4H+YQMA="), new Class[0]), clazz.getMethod(一倆.一倀("YxkOmtXqH4ZsbLvrizlbDgIWEkTT0DvwvvtnZ1fYeLkwjw=="), new Class[0]), clazz.getMethod(一倆.一倀("xrFj/2uVsA6vH/vPWiLgC3XvRtEXb+k1AQky1gU41D0="), new Class[0]));
      } catch (ClassNotFoundException classNotFoundException) {
      
      } catch (ReflectiveOperationException|LinkageError reflectiveOperationException) {
        一倀(reflectiveOperationException);
      } 
    } 
    return 一倂;
  }
  
  private static boolean 一倀(Method paramMethod) {
    Object object = 一倁(paramMethod);
    return Boolean.TRUE.equals(object);
  }
  
  private static Object 一倁(Method paramMethod) {
    if (一倄)
      return null; 
    try {
      Object object = (一倐()).一倀.invoke(null, new Object[0]);
      return paramMethod.invoke(object, new Object[0]);
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      一倀(reflectiveOperationException);
      return null;
    } 
  }
  
  private static void 一倀(Throwable paramThrowable) {
    // Byte code:
    //   0: getstatic br/com/farmdmz/client/一倁.一倄 : Z
    //   3: ifeq -> 7
    //   6: return
    //   7: iconst_1
    //   8: putstatic br/com/farmdmz/client/一倁.一倄 : Z
    //   11: aload_0
    //   12: instanceof java/lang/reflect/InvocationTargetException
    //   15: ifeq -> 37
    //   18: aload_0
    //   19: checkcast java/lang/reflect/InvocationTargetException
    //   22: astore_2
    //   23: aload_2
    //   24: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   27: ifnull -> 37
    //   30: aload_2
    //   31: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   34: goto -> 38
    //   37: aload_0
    //   38: astore_1
    //   39: invokestatic getLogger : ()Lorg/slf4j/Logger;
    //   42: ldc_w 'H/ppkyLjpY/y6I6HITK5y4KgIVBiY+K1jgZpfOcH6KykeusxmSEnNdLQloWmX8JoCfmsDjsyjdGmLX8oMDhPS3hbgU0LnB5ilIWG04Rm'
    //   45: invokestatic 一倀 : (Ljava/lang/String;)Ljava/lang/String;
    //   48: aload_1
    //   49: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   54: return
  }
  
  private static final class 一倀 extends Record {
    private final Method 一倀;
    
    private final Method 一倁;
    
    private final Method 一倂;
    
    private final Method 一倃;
    
    private 一倀(Method param1Method1, Method param1Method2, Method param1Method3, Method param1Method4) {
      this.一倀 = param1Method1;
      this.一倁 = param1Method2;
      this.一倂 = param1Method3;
      this.一倃 = param1Method4;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倁$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倁$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倁$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public Method 一倀() {
      return this.一倀;
    }
    
    public Method 一倁() {
      return this.一倁;
    }
    
    public Method 一倂() {
      return this.一倂;
    }
    
    public Method 一倃() {
      return this.一倃;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倁.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */