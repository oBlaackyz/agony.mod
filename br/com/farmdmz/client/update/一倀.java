package br.com.farmdmz.client.update;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倃;
import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.client.一倊;
import br.com.farmdmz.update.UpdateInstaller;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.forgespi.language.IModFileInfo;

public final class 一倀 {
  private static final long 一倀 = TimeUnit.MINUTES.toNanos(1L);
  
  private static final ExecutorService 一倁;
  
  private static volatile boolean 一倂;
  
  private static 一倀 一倃 = 一倀.IDLE;
  
  private static String 一倄 = 一倆.一倀("MDmLMvMYg3EfG0pv6F3Qn0GgGBwM6m57E4CHLQ==");
  
  private static String 一倅 = 一倆.一倀("NKkj+59OmNqs6Hdj9MJ50QHzwQSHC5+z6gt5CQ==");
  
  private static String 一倆 = 一倆.一倀("qsz713K38Rb5dHbscA2KwvWffyCnxLSt4pcCJw==");
  
  private static String 一倇 = 一倆.一倀("3f4bX6vQUizjdwSeEwskwR+MSDNNvh0EXDaR+Q==");
  
  private static long 一倈;
  
  private static int 一倉;
  
  private static br.com.farmdmz.update.一倀 一倊;
  
  private static Path 一個;
  
  public static String 一倀() {
    ModList modList = ModList.get();
    return (modList == null) ? 一倆.一倀("6sDV1Q8TZ7anhcg5ChSUlkcyyU2UU5ceecxlLw==") : modList.getModContainerById(一倆.一倀("Sr0bF4/dmd8dJL5F85rsLVdvP4NsbUkBKfaBe/9UTrmHquc=")).map(paramModContainer -> paramModContainer.getModInfo().getVersion().toString()).orElse(一倆.一倀("pr1nSgxYzE28x1F9qOd5owqhXQ91URe6XZ5wTg=="));
  }
  
  public static boolean 一倁() {
    return 一倂;
  }
  
  public static void 一倀(String paramString) {
    一倀(一倂 ? 一倄 : paramString, false);
  }
  
  public static void 一倀(String paramString1, String paramString2) {
    boolean bool1 = !一倂 ? true : false;
    if (bool1) {
      一倄 = paramString1;
      一倂 = true;
    } 
    if (paramString2 != null && !paramString2.isBlank())
      try {
        br.com.farmdmz.update.一倀.一倀(paramString2, paramString2);
        if (一倆.isEmpty() || br.com.farmdmz.update.一倀.一倀(paramString2, 一倆) > 0)
          一倆 = paramString2; 
      } catch (IllegalArgumentException illegalArgumentException) {} 
    if (一倃 == 一倀.DOWNLOADING || 一倃 == 一倀.INSTALLING)
      return; 
    boolean bool2 = (一倊 != null && !一倀(一倊)) ? true : false;
    if (bool2)
      一倆(); 
    一倀(一倄, (bool1 || bool2));
  }
  
  public static void 一倀(Screen paramScreen) {
    br.com.farmdmz.client.一倀 一倀1;
    Screen screen;
    Minecraft minecraft = Minecraft.m_91087_();
    if (!一倂 || minecraft.f_91080_ instanceof 一倁)
      return; 
    if (paramScreen instanceof 一倃) {
      一倃 一倃 = (一倃)paramScreen;
      paramScreen = 一倃.一倀();
    } 
    if (paramScreen instanceof 一倊) {
      一倊 一倊 = (一倊)paramScreen;
      一倀1 = 一倊.一倀();
    } 
    if (一倀1 instanceof br.com.farmdmz.client.一倀) {
      br.com.farmdmz.client.一倀 一倀2 = 一倀1;
      screen = 一倀2.一倀();
    } 
    minecraft.m_91152_(new 一倁(screen));
  }
  
  public static boolean 一倁(Screen paramScreen) {
    一倁 一倁;
    if (paramScreen instanceof 一倁) {
      一倁 = (一倁)paramScreen;
    } else {
      return false;
    } 
    一倁.m_7379_();
    return true;
  }
  
  static 一倀 一倂() {
    return 一倃;
  }
  
  static String 一倃() {
    return 一倇;
  }
  
  static String 一倄() {
    return (一倊 != null && 一倀(一倊)) ? 一倊.一倂() : (一倆.isEmpty() ? 一倆.一倀("K/m8vIW9Tv5tMHNfkivT//c0sYBmoAiyaJ3N5P9W+wIyOj1OIE40suc=") : 一倆);
  }
  
  static void 一倅() {
    switch (null.一倀[一倃.ordinal()]) {
      case 1:
        一倀(一倄, true);
        break;
      case 2:
        一倇();
        break;
      case 3:
        一倈();
        break;
    } 
  }
  
  private static void 一倀(String paramString, boolean paramBoolean) {
    String str1;
    if (一倃 != 一倀.IDLE && 一倃 != 一倀.WAITING && 一倃 != 一倀.CHECKING)
      return; 
    try {
      str1 = 一倂.一倀(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      if (一倂) {
        一倉++;
        一倁(一倆.一倀("JGD2fxQJHv3YO60fZ6ykP/UZ79F72C9MmnR8+1ABF1Lo0HOkomZnDoOmrFtuME7P49TCgwVeo/KOOggTKNRGFld1TIR1IfWT+GU/c/fRUHaiWH1f224t+kEhO3u34DAxaP4tI5s3"));
      } 
      return;
    } 
    long l = System.nanoTime();
    if (str1.equals(一倅) && (一倃 == 一倀.CHECKING || (!paramBoolean && l - 一倈 < 一倀)))
      return; 
    一倅 = str1;
    一倈 = l;
    一倃 = 一倀.CHECKING;
    一倇 = 一倆.一倀("4n40aEPD1kVyQUC0H3enEz1dqZWc83NiYzHUdA==");
    int i = ++一倉;
    String str2 = 一倀();
    一倀(() -> {
          br.com.farmdmz.update.一倀 一倀1 = 一倂.一倁(paramString1);
          if (一倀1 == null || br.com.farmdmz.update.一倀.一倀(一倀1.一倂(), paramString2) <= 0)
            return null; 
          一倀1.一倀();
          return 一倀1;
        }(param一倀, paramException) -> {
          if (paramInt != 一倉 || 一倃 != 一倀.CHECKING)
            return; 
          if (!一倂 && !paramString.equals(一倂.一倀())) {
            一倃 = 一倀.IDLE;
            一倅 = 一倆.一倀("F2AhQl56ajMQcQZ19GE0zpg8xpahB+stBieEQQ==");
            return;
          } 
          if (param一倀 == null || !一倀(param一倀)) {
            if (一倂) {
              一倁((paramException == null) ? 一倆.一倀("kO8t+y7GaQmrZPy0I1j1yWFXHOxrU0N2lc8tZ9CO0/wKLQ2XEmkwrgGxL51KoaLKKFYcWRK8b4gvyp016PdnX/pNTYFO5tRygi4UJqkekUl/ciXHWN5niSEXyIUW") : 一倆.一倀("jkmeYtvYJb0jflmjhQoMXAM1F4+UH19FD+bQcNnRiXMDT8QeEF3jUMOgupLOHhOljAth/Wwybfjk/ueoar2LTJkuc2wItCHGR58kZ9a09vZ+jtSIxGWVs6SrGJGozbhC00CfDG0="));
            } else {
              一倃 = 一倀.IDLE;
            } 
            return;
          } 
          一倄 = paramString;
          一倆 = param一倀.一倂();
          一倊 = param一倀;
          一倃 = 一倀.AVAILABLE;
          一倂 = true;
        });
  }
  
  private static boolean 一倀(br.com.farmdmz.update.一倀 param一倀) {
    return (一倆.isEmpty() || br.com.farmdmz.update.一倀.一倀(param一倀.一倂(), 一倆) >= 0);
  }
  
  private static void 一倁(String paramString) {
    一倃 = 一倀.WAITING;
    一倇 = paramString;
  }
  
  private static void 一倆() {
    Path path = 一個;
    一個 = null;
    一倊 = null;
    一倁(一倆.一倀("5jNlyvNEFzaOfFqb4vK5iTWqHDDu01t8ri0paw=="));
    if (path != null)
      一倁.execute(() -> 一倀(paramPath)); 
  }
  
  private static void 一倇() {
    br.com.farmdmz.update.一倀 一倀1 = 一倊;
    String str = 一倄;
    一倃 = 一倀.DOWNLOADING;
    一倇 = 一倆.一倀("X+XTVLye67/cBXXceT2/3X2liNj1NufiSb54Cg==");
    一倀(() -> 一倀(paramString, param一倀), (paramPath, paramException) -> {
          if (!一倀(param一倀)) {
            if (paramPath != null)
              一倁.execute(()); 
            一倆();
            一倀(一倄, true);
          } else if (paramException != null) {
            一倃 = 一倀.AVAILABLE;
            一倇 = 一倆.一倀("wEs63/RpovZ2r4k+bqL3G2X13qa+aF+obCa1yQJbx9DtxE8xJvrnSEiCuvOeGZuO0o4aHqDAxtK+BflgljhaCxBilbHNS8bQ5Om0VcU9wbHtTpnyq+rFaeVMhjk=");
          } else {
            一個 = paramPath;
            一倃 = 一倀.READY;
          } 
        });
  }
  
  private static Path 一倀(String paramString, br.com.farmdmz.update.一倀 param一倀) throws Exception {
    Path path1 = FMLPaths.GAMEDIR.get().toRealPath(new java.nio.file.LinkOption[0]);
    Path path2 = FMLPaths.MODSDIR.get().toAbsolutePath().normalize();
    if (Files.exists(path2, new java.nio.file.LinkOption[0]))
      path2 = path2.toRealPath(new java.nio.file.LinkOption[0]); 
    Path path3 = path1.resolve(一倆.一倀("Mpj60JB9a5TTydwgqLpIemkLICqYQWxw4OP+ysZcQc3JtSwT350zJ45CKtwViQvAhg=="));
    if (path3.startsWith(path2) || Files.isSymbolicLink(path3))
      throw new IOException(一倆.一倀("8m+4JGBfn7S2wMxUDBWejGAaBA9NFKS9c159lMZMUe6HDBsSnviawI78RySzimPGSDVpN8Ubjn9wlNPFJQs/Fn3sj/eoWf+eEl1Q3Q==")); 
    Files.createDirectories(path3, (FileAttribute<?>[])new FileAttribute[0]);
    if (!path3.toRealPath(new java.nio.file.LinkOption[0]).equals(path3))
      throw new IOException(一倆.一倀("l/BN2ANsZ2+zk2oW6PyIFdEguhl5eYJKa2JQ7AGOMSvm4D+Ghifg7VJXFmXTkRUZlpI0bdlVP/p6altPQzJcJb4aMa9vDBQOlAamuw==")); 
    Path path4 = Files.createTempDirectory(path3, 一倆.一倀("j6xfPoTKqsuCABsKfA+uZ8f0s8jIJ1AsQ8AIRWkSwDaqLXcs3g=="), (FileAttribute<?>[])new FileAttribute[0]).resolve(一倆.一倀("zO3VN6YXxBdz/pjIt+1YbXAivrvtbANF4ZPiQBEWZNKN2kwsdyNk"));
    boolean bool = false;
    try {
      一倂.一倀(paramString, param一倀, path4);
      param一倀.一倀(path4);
      bool = true;
      return path4;
    } finally {
      if (!bool)
        一倀(path4); 
    } 
  }
  
  private static void 一倈() {
    br.com.farmdmz.update.一倀 一倀1 = 一倊;
    Path path = 一個;
    String str = 一倀();
    一倃 = 一倀.INSTALLING;
    一倇 = 一倆.一倀("KbM2xfcrNSfiIC5L8bISWxSsgW0gmGoCY1+K5w==");
    一倀(() -> {
          IModFileInfo iModFileInfo = ModList.get().getModFileById(一倆.一倀("UfkNJe6jF57qsOwYy3zQFdUV4Y+LGJ/Fxb3nzzkZolRoMqo="));
          if (iModFileInfo == null)
            throw new IOException(一倆.一倀("savwGMdjMx+k1SfXS2CZ6cccVNAgwVn56JfPq/IiqLf36NViSa6xx+PfJJHSsFeEaeC9POdClmbNGjuwA1EbyCAX+exy8F4+/0EZyfQ=")); 
          Process process = UpdateInstaller.一倀(iModFileInfo.getFile().getFilePath(), FMLPaths.MODSDIR.get(), paramPath, paramPath.getParent().getParent(), param一倀, paramString);
          一倀(paramPath);
          return process;
        }(paramProcess, paramException) -> {
          if (paramException != null) {
            if (!一倀(param一倀)) {
              一倆();
              一倀(一倄, true);
            } else {
              一倃 = 一倀.READY;
              一倇 = 一倆.一倀("kdxoCClmlEuIkqWKDeHaLEe4Rtnfu8RQpwf1aeIqs6QRNfvgLXYjYhqyx4RgVWYI5GLNQ2mfn5IbB0sJ0o4gE9ppuQfdlAS7p4VwE+CGMp5uirTba0rn8P41Oy0LOGHBq7zYUClrsTvAiSxn1rcJITY=");
            } 
            return;
          } 
          一個 = null;
          Minecraft.m_91087_().m_91395_();
        });
  }
  
  private static void 一倀(Path paramPath) {
    try {
      Files.deleteIfExists(paramPath);
      Files.deleteIfExists(paramPath.getParent());
    } catch (IOException|SecurityException iOException) {}
  }
  
  private static <T> void 一倀(Callable<T> paramCallable, BiConsumer<T, Exception> paramBiConsumer) {
    Minecraft minecraft = Minecraft.m_91087_();
    一倁.execute(() -> {
          try {
            Object object = paramCallable.call();
            paramMinecraft.execute(());
          } catch (Exception exception) {
            paramMinecraft.execute(());
          } 
        });
  }
  
  static {
    一倁 = Executors.newSingleThreadExecutor(paramRunnable -> {
          Thread thread = new Thread(paramRunnable, 一倆.一倀("YAZRKI9TLZiHVtO5gBce9y/3E/7JAraomy0tHQmYTOOz9ROQj8e+ah7MtO2fBOc="));
          thread.setDaemon(true);
          return (ThreadFactory)thread;
        });
  }
  
  enum 一倀 {
    IDLE, CHECKING, WAITING, AVAILABLE, DOWNLOADING, READY, INSTALLING;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\clien\\update\一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */