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
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import net.minecraftforge.fml.loading.FMLPaths;

public final class 一倃 {
  private static final Gson 一倁 = (new GsonBuilder()).setPrettyPrinting().create();
  
  public static final Path 一倀 = FMLPaths.CONFIGDIR.get().resolve(一倆.一倀("zs7QSIciJFqmstQ8Xkd7JKkufFiEIZOTP9HLxL9UbU4466iWuAMcRf4="));
  
  public static 一倂 一倀() {
    if (Files.exists(一倀, new java.nio.file.LinkOption[0]))
      try {
        BufferedReader bufferedReader = Files.newBufferedReader(一倀, StandardCharsets.UTF_8);
        try {
          一倂 一倂1 = (一倂)一倁.fromJson(bufferedReader, 一倂.class);
          if (一倂1 == null)
            throw new IllegalArgumentException(一倆.一倀("+9lOO1AyfdbOGb4+speG+3XJU3LJaDGBd+LhPBpQm78d1DSZscA=")); 
          一倂1.一倁();
          一倂 一倂2 = 一倂1;
          if (bufferedReader != null)
            bufferedReader.close(); 
          return 一倂2;
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
          Files.copy(一倀, 一倀.resolveSibling(一倆.一倀("6SHdFN2EsWxAfgOmkoQeArd9cVasaWYG0jwbDH001HI11J8z1+a0NhzBKlNBvslxxupIBvI=")), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
        } catch (IOException iOException) {
          LogUtils.getLogger().warn(一倆.一倀("k6t9gYnKBWrJNbDhnltDguMx6hKVjbQyj3xvYQz9z4Y/jyc1wCF3FQGC2TDxZf6LnTtAo4g+D+U9YIHCeW3jJo+xsTiqdP29C+QNsSPWxibtflc="), iOException);
        } 
        LogUtils.getLogger().warn(一倆.一倀("lPi+v03Ts1UGLLQuVWcHY89MYPTMeuF1/jPE2F+nZalM4hebI5LevjL44A8EMaPkR8JKt68zOiymq9pOvmFNkqulkpZpuqBjuQ+XCltiY1u+ET3KPLLIImWgr21fVzXZu3S+Oy4Vvtfjh+IartU="), 一倀, exception);
        return new 一倂();
      }  
    一倂 一倂 = new 一倂();
    try {
      一倁(一倂);
    } catch (IOException iOException) {
      LogUtils.getLogger().warn(一倆.一倀("IUT/IRlmK8U2VrsUojQ3AUAgGQQtoUlKXxmKAYDLxSN5smDT6xtgAAELNJ0FyZhl23z20o/8kBE2yH06AQc7bBlG4sse6UVjWfwetBdgbw=="), iOException);
    } 
    return 一倂;
  }
  
  public static 一倂 一倀(一倂 param一倂) {
    return param一倂.一倀();
  }
  
  public static void 一倁(一倂 param一倂) throws IOException {
    一倂 一倂1 = param一倂.一倀();
    一倂1.一倁();
    Files.createDirectories(一倀.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
    if (Files.exists(一倀, new java.nio.file.LinkOption[0]))
      Files.copy(一倀, 一倀.resolveSibling(一倆.一倀("p7M8BzVcxVawy5GzcfSGcmUiQzR1KwMY6AZKLfbavSDjjkVaCRY6I7SXhwYT")), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING }); 
    Path path = Files.createTempFile(一倀.getParent(), 一倆.一倀("YhkfMjOfbD8r8n9cLL4Xt3heG+HlOJtIxNFF6+3ab2MJMyr81Q=="), 一倆.一倀("YBBOHJZ+4j4VS8HiT3v/uiTuaK8mMvj8BbdEIpuCe3M="), (FileAttribute<?>[])new FileAttribute[0]);
    try {
      Files.writeString(path, "EJMGz3mVJJ/6YcazX7RDwGgecomF0trnEpzdoKHy", StandardCharsets.UTF_8, new java.nio.file.OpenOption[0]);
      try {
        Files.move(path, 一倀, new CopyOption[] { StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING });
      } catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
        Files.move(path, 一倀, new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
      } 
    } finally {
      Files.deleteIfExists(path);
    } 
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\config\一倃.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */