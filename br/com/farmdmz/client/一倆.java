package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倄;
import br.com.farmdmz.client.auth.一倆;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;

public final class 一倆 {
  private static final String 一倀 = 一倆.一倀("6xSYYxSK5zK4z9MNg6fywSE0/+GEjXqKfqIn2w2Wy8WFCb6V40UA8+5WfcvqbANexrGWa9D3esdfgaNKpCTWnq4ZIoGcdDnd6skshmsZ/PRED8ftbteJsjU=");
  
  private static final String 一倁 = 一倆.一倀("wq3BcQKz2JNX7Hy+TFQk+XOk4TMO0FeCaPOE4Uh5P7nUCblo5HkIe1SKBMwxA8su6fNkcuzK53MxFoy7eIv4iI55mWEByRvRiPQ0j6uSKs9eyKzB4h+hLbBvik2H9F0=");
  
  private static final String 一倂 = 一倆.一倀("7u8oUQQPjB/7hbR6oMF52eoePXhW8+mUu35u8u4s0rgPRKk+OMWnQIgIi1Wpch5Y7mVVAThqMJJNiRHf5f+YDsWzTtSq+a4wTinCBIgTn/POb9mNWiMXMy9RRGVkDG5h");
  
  private static final Map<一倂, Field> 一倃 = new ConcurrentHashMap<>();
  
  private static final Map<一倂, Method> 一倄 = new ConcurrentHashMap<>();
  
  private static final Map<Screen, 一倁> 一倅 = new WeakHashMap<>();
  
  private static final Map<Screen, 一倁> 一倆 = new WeakHashMap<>();
  
  private static volatile Class<?> 一倇;
  
  public static 一倅 一倀() {
    try {
      Class<?> clazz = 一倇;
      if (clazz == null) {
        clazz = Class.forName(一倆.一倀("8mxdf64RSv4c0d5IIjW1zGTe9SYms/CnJ4i+OkdaxPjkXkWJgZ4w1wObrkRk7kkddpadHwZZAZWZy8sDUArLbsXnBw5ZoVgLildRaGEzD0sFo074OkOIzE8="), false, 一倆.class.getClassLoader());
        一倇 = clazz;
      } 
      boolean bool = ((Boolean)一倀(clazz, 一倆.一倀("STc0IIj6hN7e14AuhOGiCNPdq5Pb12YyzqNPIzcKv8rbPw=="), new Class[0]).invoke(null, new Object[0])).booleanValue();
      Object object = 一倀(clazz, 一倆.一倀("y5NqHJEjxDfmQteLV8bMc+QLcyUKY5idcqnQaEFCnvipzg=="), new Class[0]).invoke(null, new Object[0]);
      if (object == null)
        return new 一倅(true, bool, List.of(), 一倆.一倀("ti9YbmfIxX14SCz8NrChDTPs/7/Z7vSvpAxJRT97pN0Z5RVZ54iAiZPlWJ/0nZT3ohHiwU+CZmrV")); 
      List<?> list1 = 一倁(一倀(object, 一倆.一倀("INmN8+zfjFRQT/GIZlhcllJOw88+axardt2fOir1LwT6GHY6Sg==")));
      List<?> list2 = 一倁(一倀(object, 一倆.一倀("ggGfv09d6AQj1z3lsS8rMi85FnZJvBDTDANUNw7k0q1p6EVxvr7Z")));
      double d1 = Math.max(0.1D, 一倀(一倀(object, 一倆.一倀("gzJy5KT2vafZMcfZRgLgzRPi4mVa2/xaZqZfIyISjYEGf1gyXMTI6alp"))).doubleValue());
      double d2 = Math.max(0.1D, 一倀(一倀(object, 一倆.一倀("sIN8mlO97wU+iRhj4i2bEV7o1gbfLB/bhjZEgRxX453DufUd9DKgy/SM"))).doubleValue());
      if (!Double.isFinite(d1) || !Double.isFinite(d2))
        throw new IllegalArgumentException(一倆.一倀("4Yg+oLT8HSCbcr/OvjZEtTAW2uyOgslCU/T25LFyHp0SQG4vNSH9wSSAyij+xAmBUO5ab1+H1ozYWkA=")); 
      ArrayList<一倀> arrayList = new ArrayList(list1.size());
      for (byte b = 0; b < list1.size(); b++) {
        BlockPos blockPos;
        Object object1 = list1.get(b);
        if (object1 instanceof BlockPos) {
          blockPos = (BlockPos)object1;
        } else {
          throw new IllegalArgumentException(一倆.一倀("pnjhWoxuIuDp/fPJ35zPYOKA/kofQFvxrO8T3l4/QVqV48JqqpD/OE+GnF6gxWF9YgPv1cGeJiBjzwfP"));
        } 
        long l = (b < list2.size() && list2.get(b) != null) ? 一倀(list2.get(b)).longValue() : 0L;
        String str = 一倂(一倀(object, 一倆.一倀("bFU4uPT8I78h2v/FcfA1VnB5/JKH8s1L5wz+iHeKmbXC"), new Class[] { int.class }, new Object[] { Integer.valueOf(b) }));
        arrayList.add(new 一倀(b, blockPos.m_123341_() + 0.5D, blockPos.m_123342_(), blockPos.m_123343_() + 0.5D, d1, d2, l, str));
      } 
      return new 一倅(true, bool, List.copyOf(arrayList), 一倆.一倀("KaEHNZTIx6oUkCn7MG0bA0tCvesAJGFv5SHCAA=="));
    } catch (ClassNotFoundException classNotFoundException) {
      return new 一倅(false, false, List.of(), 一倆.一倀("7xk6cUOLU5JVJcaCn7PT8yisV3YZv0nLMT9co/0gJcR9LVdW1Fmg3ceH9QeUvHg3Pma94epRsIU="));
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      return new 一倅(false, false, List.of(), 一倀(reflectiveOperationException));
    } 
  }
  
  public static 一倃 一倀(Screen paramScreen) {
    return 一倀(paramScreen, false);
  }
  
  public static Object 一倁(Screen paramScreen) {
    if (!一倄(paramScreen))
      return null; 
    try {
      return 一倁(paramScreen, 一倆.一倀("/FRmBouj0vpCD7zrhU0bHDjp/MnQ2P4F7wYi6TH7kCrb"));
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      return null;
    } 
  }
  
  public static 一倃 一倀(Screen paramScreen, boolean paramBoolean) {
    if (!一倄(paramScreen))
      return new 一倃(false, -1, -1, 0L, false, 一倆.一倀("V9hQ0AGnvt4knpaY0HKoS7t5NufQXqHAyhOiAw==")); 
    try {
      一倎.一倀 一倀 = 一倎.一倀(paramScreen);
      if (!一倀.一倄())
        return 一倀(一倀, false); 
      Object object = 一倀.一倀();
      一倁 一倁1 = 一倆.get(paramScreen);
      一倁 一倁2 = 一倅.get(paramScreen);
      boolean bool1 = (一倁2 == null || 一倁2.一倀() != object) ? true : false;
      boolean bool2 = (paramBoolean && paramScreen == (Minecraft.m_91087_()).f_91080_ && bool1) ? true : false;
      if (bool2)
        return 一倀(一倀, true); 
      一倄 一倄 = 一倅(paramScreen);
      boolean bool3 = (bool1 && 一倄 != null && 一倁1 != null && 一倁1.一倀() == object && 一倁1.一倁() == 一倄.一倀() && (一倁2 == null || 一倁2.一倁() != 一倄.一倀())) ? true : false;
      return 一倀(一倀, bool3);
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      return new 一倃(true, -1, -1, 0L, false, 一倀(reflectiveOperationException));
    } 
  }
  
  public static 一倃 一倀(Screen paramScreen, int paramInt) {
    if (!一倄(paramScreen))
      return new 一倃(false, -1, -1, 0L, false, 一倆.一倀("ZYnTRZketBdPCCELQF8ZVruwbP/GuPNc+9h3BQ==")); 
    try {
      一倎.一倀 一倀 = 一倎.一倀(paramScreen);
      if (一倀.一倁() != paramInt)
        return new 一倃(true, 一倀.一倁(), 一倀.一倂(), 一倀.一倃(), false, 一倆.一倀("82S/FiDRi+3WIQhQgTQwgX+TsZka1Q+7Zbk1yAg8NDvzvU7sq5jU3VOrKEmB2FiczFgrnK2K0KVBoiazEJv8CYxi+GmOCBAxpr2Rew==")); 
      一倁 一倁 = 一倅.get(paramScreen);
      return 一倀(一倀, (一倀.一倄() && (一倁 == null || 一倁.一倀() != 一倀.一倀())));
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      return new 一倃(true, -1, -1, 0L, false, 一倀(reflectiveOperationException));
    } 
  }
  
  public static boolean 一倁(Screen paramScreen, int paramInt) {
    if (!一倂.一倀(一倄.一倀.WHEAT) || !一倇.一倁() || !(一倇.一倀()).background || !一倄(paramScreen))
      return false; 
    try {
      一倎.一倀 一倀 = 一倎.一倀(paramScreen);
      if (一倀.一倁() != paramInt || !一倀.一倄())
        return false; 
      一倁 一倁 = 一倅.get(paramScreen);
      if (一倁 != null && 一倁.一倀() == 一倀.一倀())
        return false; 
      Class<?> clazz = Class.forName(一倆.一倀("gzXux+JvX6o0LkArd0zOFjDZA474iomZX8lKsTHNJ7JJvrkCTbI6ziu04TjYX9TDb6Z8FATp92TY9109FVBuaILbc0Bp8nYiLxcmyc6Ta9IpAk4Vg1AaFzjrDd8RSXGc"), false, 一倆.class.getClassLoader());
      if (一倁(paramScreen, 一倆.一倀("JZjEtJZgc3oi7hB6lBtBgyvWJjvoAygCIcBmsgL2xoCI")) != 一倀.一倀())
        return false; 
      boolean bool = (一倀.一倂() == 2) ? true : ((一倀.一倂() == 0) ? true : true);
      if (bool)
        return false; 
      一倎.一倀(paramScreen, clazz, bool, paramInt);
      一倅.put(paramScreen, new 一倁(一倀.一倀(), null));
      return true;
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      return false;
    } 
  }
  
  private static 一倃 一倀(一倎.一倀 param一倀, boolean paramBoolean) {
    return new 一倃(true, param一倀.一倁(), param一倀.一倂(), param一倀.一倃(), paramBoolean, param一倀.一倅());
  }
  
  public static void 一倂(Screen paramScreen) {
    if (!一倄(paramScreen))
      return; 
    try {
      一倄 一倄 = 一倂(paramScreen, true);
      一倁 一倁 = 一倆.get(paramScreen);
      if (一倄 != null && (一倁 == null || 一倁.一倁() != 一倄.一倀()))
        一倆.put(paramScreen, new 一倁(一倁(paramScreen, 一倆.一倀("raqohJ1rMAnQ4O4NyDWWeu85EDlc9RmnTHpBufucIM1m")), 一倄.一倀())); 
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {}
  }
  
  public static boolean 一倃(Screen paramScreen) {
    return 一倁(paramScreen, false);
  }
  
  public static boolean 一倁(Screen paramScreen, boolean paramBoolean) {
    一倃 一倃 = 一倀(paramScreen, paramBoolean);
    if (!一倃.一倀() || !一倃.一倄())
      return false; 
    try {
      if (paramBoolean) {
        Object object1 = 一倁(paramScreen, 一倆.一倀("EJDKArhlL4qJ6PMx7PwuSwGpULVyEFWc/0kwczgeatc3"));
        一倁 一倁 = 一倅.get(paramScreen);
        if (object1 == null || (一倁 != null && 一倁.一倀() == object1))
          return false; 
        boolean bool = (一倃.一倂() == 2) ? true : ((一倃.一倂() == 0) ? true : true);
        if (bool)
          return false; 
        Class<?> clazz = Class.forName(一倆.一倀("FFv8IXxdj/szR8Iwz6vziS0nwYgeDE916uxPjtXjIAj8BPtPiINDHyenPo98h8yNaZi8Sdbs6WuznJ+qp2b06qPBJjvqIVvPczTg/8hFnXfgMNzOJGEbFf1DXLS6F+tf"), false, 一倆.class.getClassLoader());
        一倎.一倀(paramScreen, clazz, bool, 一倃.一倁());
        一倅.put(paramScreen, new 一倁(object1, null));
        return true;
      } 
      一倄 一倄 = 一倅(paramScreen);
      if (一倄 == null)
        return false; 
      Object object = 一倁(paramScreen, 一倆.一倀("/tGs5Hj3FQGHF4AAQzB7ua3rw3TTpJJfxUKZyAeq6gf4"));
      boolean bool1 = paramScreen.m_6375_(一倄.一倁(), 一倄.一倂(), 0);
      if (!bool1)
        return false; 
      boolean bool2 = paramScreen.m_6348_(一倄.一倁(), 一倄.一倂(), 0);
      if (bool2)
        一倅.put(paramScreen, new 一倁(object, 一倄.一倀())); 
      return bool2;
    } catch (ReflectiveOperationException|RuntimeException|LinkageError reflectiveOperationException) {
      return false;
    } 
  }
  
  private static 一倄 一倅(Screen paramScreen) throws ReflectiveOperationException {
    return 一倂(paramScreen, false);
  }
  
  private static 一倄 一倂(Screen paramScreen, boolean paramBoolean) throws ReflectiveOperationException {
    if (!paramBoolean && ((Boolean)一倀(paramScreen, 一倆.一倀("hvgI+YdNWTvlaRQL8piX9u5p9q79RiwD7YIVxpob8adkuEL9yrLX"))).booleanValue())
      return null; 
    Object object = 一倀(paramScreen, 一倆.一倀("UqsIT285A5zLADsLJrdjsvGOJWYruLSUbOb+EUlP"));
    if (object == null)
      return null; 
    for (Object object1 : 一倁(一倀(paramScreen, 一倆.一倀("Jzy3+3Hv8eHoebBChDEt/Q6wJ7uRJxoyvc7pN7U9Dk4=")))) {
      int i = 一倀(一倁(object1, 一倆.一倀("oRjdhC/viI52AQVxrUj7FKXhqm2D8MKo+AryQUY="))).intValue();
      int j = 一倀(一倁(object1, 一倆.一倀("6GxjFdknU0UYz2yKVAl4ZVmZVuwCAqyJM1IAnVU="))).intValue();
      int k = 一倀(一倁(object1, 一倆.一倀("c0EMvMu1Z0xC2GdscH7ZGJfAQ6cCcd6W0c2mxXk="))).intValue();
      int m = 一倀(一倁(object1, 一倆.一倀("L9EjXROZNAVJqtUSZpOo6ncDyylQw/LB/NJTx2Y="))).intValue();
      if (i != 112 || k != 280 || m != 24)
        continue; 
      int n = Math.max(j, 一倀(一倁(object1, 一倆.一倀("L0uEWPzeoEdfFSOkHBhj2CEFMoz30SpPiC22mliJ0qH0lg=="))).intValue());
      int i1 = Math.min(j + m, 一倀(一倁(object1, 一倆.一倀("q8lljPunXmsQFIgO8oSK+bQEJ7icQnncLMee3ROIXg7HGw=="))).intValue());
      if (n >= i1)
        continue; 
      double d1 = i + k / 2.0D;
      double d2 = (n + i1) / 2.0D;
      double d3 = 一倀(一倀(object, 一倆.一倀("ynZd+BIDBGMaBh14FnDa8AD8j1g16Vumg/Df1K9K71Ce"), new Class[] { double.class }, new Object[] { Double.valueOf(d1) })).doubleValue();
      double d4 = 一倀(一倀(object, 一倆.一倀("OcLkSRjLOEnszW7Rjl7y71TKWWksdA3z33qsA0C9xUzl"), new Class[] { double.class }, new Object[] { Double.valueOf(d2) })).doubleValue();
      if (Double.isFinite(d3) && Double.isFinite(d4) && d3 >= 0.0D && d3 < paramScreen.f_96543_ && d4 >= 0.0D && d4 < paramScreen.f_96544_)
        return new 一倄(object1, d3, d4); 
    } 
    return null;
  }
  
  private static long 一倀(List<?> paramList, String paramString) throws ReflectiveOperationException {
    for (Object object : paramList) {
      if (paramString.equals(一倂(一倁(object, 一倆.一倀("6JZPJeQJMlVEzQ6rNyaSe/8xVcx7Gjst8XTmFN57")))))
        return 一倀(一倁(object, 一倆.一倀("kJs4GRf9IvTqDEYSrQWoiC273QTBydbQqi8GNRRoTTCQfhLFlYA="))).longValue(); 
    } 
    return 0L;
  }
  
  static boolean 一倄(Screen paramScreen) {
    if (paramScreen == null)
      return false; 
    for (Class<?> clazz = paramScreen.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
      if (一倆.一倀("+gDkPybapoSKfLUXj+nDaQgHjt/7yZHPxQL1egaBzhZkJMRm3VGEGO4tTyEVHs6BUybcB/EBFnTfmJZyr6Jk7gA0JJZg5k2YzUF19604YjatU4ppkhS07Ai2DHuNvF0=").equals(clazz.getName()))
        return true; 
    } 
    return false;
  }
  
  private static Object 一倀(Object paramObject, String paramString) throws ReflectiveOperationException {
    一倂 一倂 = new 一倂(paramObject.getClass(), paramString, List.of());
    Field field = 一倃.get(一倂);
    if (field == null) {
      Class<?> clazz = paramObject.getClass();
      while (clazz != null) {
        try {
          field = clazz.getDeclaredField(paramString);
          break;
        } catch (NoSuchFieldException noSuchFieldException) {
          clazz = clazz.getSuperclass();
        } 
      } 
      if (field == null)
        throw new NoSuchFieldException(paramString); 
      field.setAccessible(true);
      一倃.put(一倂, field);
    } 
    return field.get(paramObject);
  }
  
  private static Method 一倀(Class<?> paramClass, String paramString, Class<?>... paramVarArgs) throws ReflectiveOperationException {
    一倂 一倂 = new 一倂(paramClass, paramString, List.of(paramVarArgs));
    Method method = 一倄.get(一倂);
    if (method == null) {
      Class<?> clazz = paramClass;
      while (clazz != null) {
        try {
          method = clazz.getDeclaredMethod(paramString, paramVarArgs);
          break;
        } catch (NoSuchMethodException noSuchMethodException) {
          clazz = clazz.getSuperclass();
        } 
      } 
      if (method == null)
        throw new NoSuchMethodException(paramString); 
      method.setAccessible(true);
      一倄.put(一倂, method);
    } 
    return method;
  }
  
  private static Object 一倁(Object paramObject, String paramString) throws ReflectiveOperationException {
    return 一倀(paramObject.getClass(), paramString, new Class[0]).invoke(paramObject, new Object[0]);
  }
  
  private static Object 一倀(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object... paramVarArgs) throws ReflectiveOperationException {
    return 一倀(paramObject.getClass(), paramString, paramArrayOfClass).invoke(paramObject, paramVarArgs);
  }
  
  private static Number 一倀(Object paramObject) {
    if (paramObject instanceof Number)
      return (Number)paramObject; 
    throw new IllegalArgumentException(一倆.一倀("muAdUylLQ+fsdLug7kZEsb53KYEZY0DrGGqWHZhnITQSVQ91HDFt5X3ZmpIqz04ZnNUd5m4e8nwhK6LJz0jW6GM="));
  }
  
  private static List<?> 一倁(Object paramObject) {
    if (paramObject instanceof List)
      return (List)paramObject; 
    throw new IllegalArgumentException(一倆.一倀("lxP8KX6ucHfjvl6J58D5V/BxK2YMk4n6J9OJFhinoc30UisrjFTWG/+nsczFd9yt/cotld5dUEk="));
  }
  
  private static String 一倂(Object paramObject) {
    return (paramObject == null) ? 一倆.一倀("LpPwPsnQk6k4B3U/+oD02o2rqucYvWWGX+i4pw==") : paramObject.toString().trim();
  }
  
  private static String 一倀(Throwable paramThrowable) {
    if (paramThrowable instanceof InvocationTargetException) {
      InvocationTargetException invocationTargetException = (InvocationTargetException)paramThrowable;
      if (invocationTargetException.getCause() != null)
        paramThrowable = invocationTargetException.getCause(); 
    } 
    String str = (paramThrowable instanceof NoSuchFieldException || paramThrowable instanceof NoSuchMethodException) ? "wvi5GsdV0ZloTIk6pebWDrYLdVWEbCk7xIdZp4aaxw==" : 一倆.一倀("AFwRTOdv14e2vV3vXlW2rptEfa+h9RCpFawZPg==");
    return "eF6UTCca38q6BdKcFOqsZeE+s3XCQvlJ6kTWnC+jWo1B5lAnfTczvqdExWtPGyO2WkVmElZ2XGYXBFyM+ALhPW2h";
  }
  
  public static final class 一倅 extends Record {
    private final boolean 一倀;
    
    private final boolean 一倁;
    
    private final List<一倆.一倀> 一倂;
    
    private final String 一倃;
    
    public 一倅(boolean param1Boolean1, boolean param1Boolean2, List<一倆.一倀> param1List, String param1String) {
      this.一倀 = param1Boolean1;
      this.一倁 = param1Boolean2;
      this.一倂 = param1List;
      this.一倃 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倆$一倅;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倆$一倅;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倆$一倅;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public boolean 一倀() {
      return this.一倀;
    }
    
    public boolean 一倁() {
      return this.一倁;
    }
    
    public List<一倆.一倀> 一倂() {
      return this.一倂;
    }
    
    public String 一倃() {
      return this.一倃;
    }
  }
  
  public static final class 一倀 extends Record {
    private final int 一倀;
    
    private final double 一倁;
    
    private final double 一倂;
    
    private final double 一倃;
    
    private final double 一倄;
    
    private final double 一倅;
    
    private final long 一倆;
    
    private final String 一倇;
    
    public 一倀(int param1Int, double param1Double1, double param1Double2, double param1Double3, double param1Double4, double param1Double5, long param1Long, String param1String) {
      this.一倀 = param1Int;
      this.一倁 = param1Double1;
      this.一倂 = param1Double2;
      this.一倃 = param1Double3;
      this.一倄 = param1Double4;
      this.一倅 = param1Double5;
      this.一倆 = param1Long;
      this.一倇 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倆$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倆$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倆$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public int 一倀() {
      return this.一倀;
    }
    
    public double 一倁() {
      return this.一倁;
    }
    
    public double 一倂() {
      return this.一倂;
    }
    
    public double 一倃() {
      return this.一倃;
    }
    
    public double 一倄() {
      return this.一倄;
    }
    
    public double 一倅() {
      return this.一倅;
    }
    
    public long 一倆() {
      return this.一倆;
    }
    
    public String 一倇() {
      return this.一倇;
    }
  }
  
  public static final class 一倃 extends Record {
    private final boolean 一倀;
    
    private final int 一倁;
    
    private final int 一倂;
    
    private final long 一倃;
    
    private final boolean 一倄;
    
    private final String 一倅;
    
    public 一倃(boolean param1Boolean1, int param1Int1, int param1Int2, long param1Long, boolean param1Boolean2, String param1String) {
      this.一倀 = param1Boolean1;
      this.一倁 = param1Int1;
      this.一倂 = param1Int2;
      this.一倃 = param1Long;
      this.一倄 = param1Boolean2;
      this.一倅 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倆$一倃;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倆$一倃;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倆$一倃;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public boolean 一倀() {
      return this.一倀;
    }
    
    public int 一倁() {
      return this.一倁;
    }
    
    public int 一倂() {
      return this.一倂;
    }
    
    public long 一倃() {
      return this.一倃;
    }
    
    public boolean 一倄() {
      return this.一倄;
    }
    
    public String 一倅() {
      return this.一倅;
    }
  }
  
  private static final class 一倁 extends Record {
    private final Object 一倀;
    
    private final Object 一倁;
    
    private 一倁(Object param1Object1, Object param1Object2) {
      this.一倀 = param1Object1;
      this.一倁 = param1Object2;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倆$一倁;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倆$一倁;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倆$一倁;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public Object 一倀() {
      return this.一倀;
    }
    
    public Object 一倁() {
      return this.一倁;
    }
  }
  
  private static final class 一倄 extends Record {
    private final Object 一倀;
    
    private final double 一倁;
    
    private final double 一倂;
    
    private 一倄(Object param1Object, double param1Double1, double param1Double2) {
      this.一倀 = param1Object;
      this.一倁 = param1Double1;
      this.一倂 = param1Double2;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倆$一倄;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倆$一倄;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倆$一倄;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public Object 一倀() {
      return this.一倀;
    }
    
    public double 一倁() {
      return this.一倁;
    }
    
    public double 一倂() {
      return this.一倂;
    }
  }
  
  private static final class 一倂 extends Record {
    private final Class<?> 一倀;
    
    private final String 一倁;
    
    private final List<Class<?>> 一倂;
    
    private 一倂(Class<?> param1Class, String param1String, List<Class<?>> param1List) {
      this.一倀 = param1Class;
      this.一倁 = param1String;
      this.一倂 = param1List;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倆$一倂;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倆$一倂;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倆$一倂;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public Class<?> 一倀() {
      return this.一倀;
    }
    
    public String 一倁() {
      return this.一倁;
    }
    
    public List<Class<?>> 一倂() {
      return this.一倂;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倆.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */