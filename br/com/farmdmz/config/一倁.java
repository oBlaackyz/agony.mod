package br.com.farmdmz.config;

import br.com.farmdmz.client.auth.一倆;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import net.minecraftforge.fml.loading.FMLPaths;

public final class 一倁 {
  private static final Gson 一倀;
  
  private static final String 一倁 = 一倆.一倀("gUPkA4u4AWH4W0cMapOD4abjDsz9f4XkHCsNV5x/Can3zJHXLObcYILAzMKc1cyaiPClvy67Fq5flA==");
  
  private static final String 一倂 = 一倆.一倀("lKCH+7CLGhwJLnVR1R1g45n67AvQHs92NvFrZnN+ViYRSWBUUGDJr8Q4sCEMOswkif0VCRQ=");
  
  public static 一倀 一倀() {
    return 一倀(FMLPaths.CONFIGDIR.get());
  }
  
  static 一倀 一倀(Path paramPath) {
    Path path1 = paramPath.resolve(一倆.一倀("dGy8imppaJOesDtwTno9DjqL0LQQq6mwbBtECXpJNAyBPNpnMT+xwAxPXNtYxHFR8PdTrBOle6Di8w=="));
    Path path2 = Files.notExists(path1, new LinkOption[] { LinkOption.NOFOLLOW_LINKS }) ? paramPath.resolve(一倆.一倀("CxmYYd3YjxbRaKBX+BbAaV1JQr7nNqz11QCvHFKH4djSG6Pqfpr7EVIYOMT0xqEnuVT/SKs=")) : path1;
    if (Files.notExists(path2, new LinkOption[] { LinkOption.NOFOLLOW_LINKS }))
      return new 一倀(); 
    try {
      BufferedReader bufferedReader = Files.newBufferedReader(path2, StandardCharsets.UTF_8);
      try {
        一倀 一倀1 = (一倀)一倀.fromJson(bufferedReader, 一倀.class);
        if (一倀1 == null)
          throw new IllegalArgumentException(一倆.一倀("uZJZx2f7yAhLdrW8KOay4owd7rp+jzWSqO16XvCmhPGxMeeCS5k=")); 
        一倀1.一倁();
        一倀 一倀2 = 一倀1;
        if (bufferedReader != null)
          bufferedReader.close(); 
        return 一倀2;
      } catch (Throwable throwable) {
        if (bufferedReader != null)
          try {
            bufferedReader.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } catch (Exception exception) {
      try {
        Files.copy(path2, paramPath.resolve(一倆.一倀("lWAiSzQhZlGgjCUjPfW3U2PJsB9KIphSA0yGQhPJ1LvVuZNlMAQqjv4AHd1E4tcpLEklqgFshsQT4BtiAgluNmrJcKafnQ==")), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
      } catch (IOException iOException) {
        LogUtils.getLogger().warn(一倆.一倀("4kiB7DzzABZctiicMECQ4hxiS2uPYMbLGpG7PoarpZidhdluIIG+EOYRaCOcjsA39Szj3KQvq6Oy8j+ix3BP3Le776l0iad+ewlTnqi1vOOtTyutnqkQo9rcZ1g="), iOException);
      } 
      LogUtils.getLogger().warn(一倆.一倀("T6mEOky4G7rFaUcDKCCcglDx2EFc8DDvnkukxLl9BYu+3gJDriAm6HY0nqzbd3/lQU8SdvGeKFUI+o9aOW+Y5V9kfc9rmDQr3KGMi1w="), exception);
      return new 一倀();
    } 
  }
  
  public static void 一倀(一倀 param一倀) throws IOException {
    一倀(FMLPaths.CONFIGDIR.get(), param一倀);
  }
  
  static void 一倀(Path paramPath, 一倀 param一倀) throws IOException {
    一倀 一倀1 = param一倀.一倀();
    一倀1.一倁();
    Files.createDirectories(paramPath, (FileAttribute<?>[])new FileAttribute[0]);
    Path path1 = paramPath.resolve(一倆.一倀("Xr1Iwwx39/EMNEnHPENzuOJa5vH+jSdqmJ5F6JLACVzcNWX9t49SIiWaQLve0R79j1cAcNVpgg6Hrw=="));
    if (Files.exists(path1, new LinkOption[0]))
      Files.copy(path1, paramPath.resolve(一倆.一倀("OSaj5FGzOAFAEdlBVHtlynJ13hqTzsmVCo3qUamXOl4bvlRat1+03zgF9hUITJtj38vqVAbzpAbTMIp1R08=")), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING }); 
    Path path2 = Files.createTempFile(paramPath, 一倆.一倀("PAVS0Xe8aixgCSss6ATORF6R++Fix7vbPt40737ePPt39XjUcTUnWx0cdlFPoyVwQEHsp1Q3"), 一倆.一倀("ZY2t74cnDTc+yrRO0CauyDZEAS41AJ4hE0RXgbeKkEY="), (FileAttribute<?>[])new FileAttribute[0]);
    try {
      Files.writeString(path2, "+LzPg6FU57+pR4BYneCY9eoUrsR2Sw7znrZ02ABE", StandardCharsets.UTF_8, new java.nio.file.OpenOption[0]);
      try {
        Files.move(path2, path1, new CopyOption[] { StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING });
      } catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
        Files.move(path2, path1, new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
      } 
    } finally {
      Files.deleteIfExists(path2);
    } 
  }
  
  static {
    一倀 = (new GsonBuilder()).setPrettyPrinting().create();
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\config\一倁.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */