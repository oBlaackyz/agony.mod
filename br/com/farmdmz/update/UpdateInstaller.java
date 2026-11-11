package br.com.farmdmz.update;

import br.com.farmdmz.client.auth.一倆;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

public final class UpdateInstaller {
  private static final String 一倀 = 一倆.一倀("FuzuNLZSltMmAJJn4HfFiUjQRbMyBRN7WqgGZ2tTaAo0zdYEY5LutY4=");
  
  private static final String 一倁 = 一倆.一倀("8C4mxp/x9WDupNpVDu+4uZU5SiDHWy96l48tuhRxsfuZ");
  
  private static final int 一倂 = 65536;
  
  private static final Pattern 一倃 = Pattern.compile(一倆.一倀("1ON9jDtde5Y7jRcLO2w8vSc0TPLa+2LgtshHx85gDbZUVLcatianGx+8J/WEmqr/bOS8U/zzVA=="));
  
  public static Process 一倀(Path paramPath1, Path paramPath2, Path paramPath3, Path paramPath4, 一倀 param一倀, String paramString) throws IOException, GeneralSecurityException {
    一倀(param一倀, paramString);
    param一倀.一倀();
    Path path1 = 一倀(paramPath2);
    Path path2 = 一倀(paramPath1, path1);
    Path path3 = 一倁(一倀(paramPath4), path1);
    Path path4 = 一倁(一倁(paramPath3), path1);
    String str = 一倀.一倀(path2, -1L);
    一倁(path2, paramString);
    一倀(path4, param一倀);
    Path path5 = Files.createTempDirectory(path3, 一倆.一倀("Z40qBZjbx6zONcgjIZXwE345TekdUfNKh7g7iFv0hnY="), (FileAttribute<?>[])new FileAttribute[0]);
    Path path6 = path5.resolve(一倆.一倀("JQEDuHCbjEK/EFK5MIGGcgGhCUJnG51q9ibbGgLQZUg2OQXceD8="));
    Path path7 = path5.resolve(一倆.一倀("OTrWFqFi59wF5vZbY6fLS9CakEzmRIyjVXrtQ5CSkQByuinDVWCAA3U="));
    Files.copy(path2, path6, new CopyOption[] { LinkOption.NOFOLLOW_LINKS });
    一倀(path6, str);
    Files.copy(path4, path7, new CopyOption[] { LinkOption.NOFOLLOW_LINKS });
    一倀(path7, param一倀);
    boolean bool = System.getProperty(一倆.一倀("d5crUSNzyBB/4LrMPBlswNduDZR1rdhAD06Dbx9uLhNMSt0=")).toLowerCase(Locale.ROOT).startsWith(一倆.一倀("ds4cPcFeO7ShAyNcZ0x20cG4A0on98OYekptmvGqO+zqF3k="));
    Path path8 = Path.of(System.getProperty(一倆.一倀("HAcDOTQEJFvC63bWLZ7hkwwU0UW3I4PZj3r7nvhO6G2ld8SdJg==")), new String[] { 一倆.一倀("laMUqgHEgAPGkK4WmjT7iuwaWhLCeaqJKagMcVDIyA=="), bool ? 一倆.一倀("qJdm+YbyCG7SUkeSmO1GNR2CVxqfqd/qo4baL00SOuQTtkY23Q==") : 一倆.一倀("/2nEo8jYHnmJ3LH777nJZjuK4GwgU8KMNkLvtEv0lcc=") });
    ProcessHandle processHandle = ProcessHandle.current();
    long l = ((Long)processHandle.info().startInstant().<Long>map(Instant::toEpochMilli).orElse(Long.valueOf(-1L))).longValue();
    Process process = (new ProcessBuilder(new String[] { 
          path8.toString(), 一倆.一倀("IbgfTwiQUKlEk3xzKuuYzvN+2AA9ft91zhQLEQNOzw=="), path6.toString(), UpdateInstaller.class.getName(), Long.toString(processHandle.pid()), Long.toString(l), path2.toString(), path1.toString(), path5.toString(), paramString, 
          str, param一倀.一倂(), Long.toString(param一倀.一倃()), param一倀.一倄(), param一倀.一倅() })).redirectErrorStream(true).redirectOutput(ProcessBuilder.Redirect.to(path5.resolve(一倆.一倀("KmnyPAiQqmsAT7xyFyN2kaDvbGLj+Gk02x4Q0acgdAAOqpElxIs=")).toFile())).start();
    try {
      一倀(process, path5);
      return process;
    } catch (IOException iOException) {
      process.destroyForcibly();
      throw iOException;
    } 
  }
  
  private static void 一倀(Process paramProcess, Path paramPath) throws IOException {
    long l = System.nanoTime() + TimeUnit.SECONDS.toNanos(10L);
    while (paramProcess.isAlive() && System.nanoTime() < l) {
      if (Files.isRegularFile(paramPath.resolve(一倆.一倀("XcpPBRsfA0TeYMzYZY3Y/sRcePSKdWECaH/JHpxt/K8+")), new LinkOption[] { LinkOption.NOFOLLOW_LINKS }))
        return; 
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Thread.currentThread().interrupt();
        throw new IOException(一倆.一倀("6E8hvMW2Kzk03KgwqW/l/DfONsHvVy5ycJ5eo+xrwXlcMmYkbfthZ5AqLpvxu5Syhv6772LbBBzyZkBWI+DyOAG9e7QA4z0="), interruptedException);
      } 
    } 
    throw new IOException("L91YmDdmb7f+5jCRd7/GASg6XdTB3X0EMlCpYPv0ZbTG6rSri86H14xdvpinid1kskHrZp9s+Y1PCbNdyPzO1xs=");
  }
  
  public static void main(String[] paramArrayOfString) {
    try {
      if (paramArrayOfString.length != 11)
        throw new IOException(一倆.一倀("spli5CnBVtZLSWec3rMKNp3iSA866vgbWA4AN8ik/puI38em7RO1iaibBHJNuvS7aXkAUGHiPkWLeiZ3rjSzHw==")); 
      long l1 = Long.parseLong(paramArrayOfString[0]);
      long l2 = Long.parseLong(paramArrayOfString[1]);
      Path path1 = Path.of(paramArrayOfString[2], new String[0]);
      Path path2 = 一倀(Path.of(paramArrayOfString[3], new String[0]));
      Path path3 = 一倁(一倀(Path.of(paramArrayOfString[4], new String[0])), path2);
      String str1 = paramArrayOfString[5];
      String str2 = paramArrayOfString[6];
      一倀 一倀 = new 一倀(paramArrayOfString[7], Long.parseLong(paramArrayOfString[8]), paramArrayOfString[9], paramArrayOfString[10]);
      PublicKey publicKey = 一倀.一倁();
      一倀(一倀, str1);
      一倀.一倀(publicKey);
      Path path4 = 一倁(path3.resolve(一倆.一倀("MnHAuYxaGvM5M/Z1wwBUQszwpKcCd4gaJLPtHRxsHJC+VcrmDYmtis8=")));
      一倀(path4, 一倀);
      System.out.println("qf7WD+THe9AuqSWeUd+FMwPeZAoDIGkEjPOUS9IjSzXE4GpZVinovqKLNp2O/RJpSskPqQYpTknXoxTPOYJ1he2r2j7s");
      Files.createFile(path3.resolve(一倆.一倀("QkGaSOKWCQDkwBc37nlVoyOch1Nc05M4dTtbMF/DaskD")), (FileAttribute<?>[])new FileAttribute[0]);
      一倀(l1, l2);
      一倀(path1, path2, path4, path3, 一倀, str1, str2, publicKey);
      System.out.println("tqnRzjA/At/nCNbSKdITdyxDZ0f2p63tfliP0ud1u5ZJB78M2aJh/FSDNHZq9a1AmJ1qjBReCQ8u9g==");
      try {
        Files.deleteIfExists(path4);
      } catch (IOException iOException) {
        System.err.println("W0jIjPcjT4o3QgKPCnYaJVqXOE53XA9AGgNXUKFyIyE3M4lIKrAXRTvCvb0PJDxWBKNg0o/OiEf3SHbt/sinUb/j");
      } 
    } catch (Exception exception) {
      System.err.println("XVYyx9bUzZgNYD1kwHOjFQPK6BZmnb6j+S3blPeaKuLZeHhWvLqD8ejC3vUeyiSNfmxefXijzw==");
      System.exit(1);
    } 
  }
  
  private static void 一倀(long paramLong1, long paramLong2) throws Exception {
    if (paramLong1 <= 0L || paramLong1 == ProcessHandle.current().pid())
      throw new IOException(一倆.一倀("vqjH1XMffF11Lzo7ibBrkOCaFFEhxfyKh8AbD4XBI+6xpbvEFfevtC+YDEUBXMACIPE=")); 
    ProcessHandle processHandle = ProcessHandle.of(paramLong1).orElse(null);
    if (processHandle == null)
      return; 
    long l = ((Long)processHandle.info().startInstant().<Long>map(Instant::toEpochMilli).orElse(Long.valueOf(-1L))).longValue();
    if (paramLong2 >= 0L && l >= 0L && paramLong2 != l)
      return; 
    processHandle.onExit().get(3L, TimeUnit.MINUTES);
  }
  
  static void 一倀(Path paramPath1, Path paramPath2, Path paramPath3, Path paramPath4, 一倀 param一倀, String paramString1, String paramString2, PublicKey paramPublicKey) throws IOException, GeneralSecurityException {
    一倀(param一倀, paramString1);
    param一倀.一倀(paramPublicKey);
    Path path1 = 一倀(paramPath2);
    Path path2 = 一倀(paramPath1, path1);
    Path path3 = 一倁(一倀(paramPath4), path1);
    Path path4 = 一倁(一倁(paramPath3), path1);
    Path path5 = path1.resolve(一倆.一倀("Y43r8RgjUyxnKlC/qoeUzQc7OUK5qJm9gFtuOjjEoSYOB34cQcQaKVfeCwie2Haa3ZP/Mdc="));
    try {
      FileChannel fileChannel = FileChannel.open(path5, new OpenOption[] { StandardOpenOption.CREATE, StandardOpenOption.WRITE, LinkOption.NOFOLLOW_LINKS });
      try {
        FileLock fileLock = fileChannel.tryLock();
        try {
          if (fileLock == null)
            throw new IOException(一倆.一倀("swxi0DDBrBIbNbQFwpcYkycWQHbUAiCmhLAYPlxxzxaNBO7tt9nme73DmNbBoouMf66DJkkN5fxaDSLB4zg/ia7+pavBF8/OUsP5Y+gl6SlmxlA=")); 
          一倀(path2, paramString2);
          一倁(path2, paramString1);
          Path path = Files.createTempFile(path1, 一倆.一倀("SqR2UR8rD2xbBgmZn5JjuNkvxvY3sKmu1yS1W5XTgJ2wVHHWp0NeCd+rmJ4uGbx0Mw=="), 一倆.一倀("XR1RDQW/K44DpFSGaulGRWGvAUQF5p535C5RZksbNNajTk5c"), (FileAttribute<?>[])new FileAttribute[0]);
          try {
            Files.copy(path4, path, new CopyOption[] { StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS });
            一倀(path, param一倀);
            Path path6 = path3.resolve(一倆.一倀("7xF9+2qaJlIvGlsArQhzDvpemXnrW/jatm+2iZycbnOV53bkMqk="));
            Files.copy(path2, path6, new CopyOption[] { LinkOption.NOFOLLOW_LINKS });
            一倀(path6, paramString2);
            一倀(path2, paramString2);
            Files.move(path, path2, new CopyOption[] { StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING });
          } finally {
            Files.deleteIfExists(path);
          } 
          if (fileLock != null)
            fileLock.close(); 
        } catch (Throwable throwable) {
          if (fileLock != null)
            try {
              fileLock.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            }  
          throw throwable;
        } 
        if (fileChannel != null)
          fileChannel.close(); 
      } catch (Throwable throwable) {
        if (fileChannel != null)
          try {
            fileChannel.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } catch (OverlappingFileLockException overlappingFileLockException) {
      throw new IOException(一倆.一倀("yk4K/4qC4rGFzOIrGbC+iU74E9evC7ryJ0AH2uj3tFIZg5uV1rOG36gt2ijpOKRNckWImEQIRxpFQ/PkOvhIurtcoQdmAEqYaXidZTzHaK16rsA="), overlappingFileLockException);
    } 
  }
  
  private static void 一倀(一倀 param一倀, String paramString) throws IOException {
    if (一倀.一倀(param一倀.一倂(), paramString) <= 0)
      throw new IOException(一倆.一倀("/by/qcVw0H7JoDa4Sp/kyvCdiSr3iI+kePTNckMflHk3k3tCL+s9pdNZRlv1zMnBLHG25qTOdo71VcxzU9Jz+bt41tzHN6TPzauBoBLIWZga4tfZ+PI=")); 
  }
  
  private static void 一倀(Path paramPath, String paramString) throws IOException {
    if (!一倀.一倀(paramPath, -1L).equals(paramString))
      throw new IOException(一倆.一倀("32RLqioXJSTzcFRLbUOzDr/MlHh3hvj9UZncW/xrZbmISId+WlTb9NwcJunM4dtzanoIGtQxxMhvmlFvmwqXPoCZz/Zag+E=")); 
  }
  
  private static Path 一倀(Path paramPath1, Path paramPath2) throws IOException {
    Path path = 一倁(paramPath1);
    if (!paramPath2.equals(path.getParent()) || !path.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(一倆.一倀("Qzw32s+ph/hRuVvbj5AJ9hvnHOWrFrYHLNmNryVp6ro=")))
      throw new IOException(一倆.一倀("P3s2neibWQFUXE+s+1DUocKWCO1P/ehTjeM9tj1egtdti+/SqiIFMNt+7aeNyvjqyow8p8UuCqtN1ypvSMkgA+x2DRnQ0wsHRCfD0sKZVyVw9WAwA+B+kH4r43gK")); 
    return path;
  }
  
  private static Path 一倀(Path paramPath) throws IOException {
    Path path = paramPath.toAbsolutePath().normalize();
    if (!Files.isDirectory(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS }))
      throw new IOException("R8mHgEDtPxMhn4OcSR431ZaRe3Yall4Fyty/PsNphM2Y4RK97QdeV0RZNrZuTQ=="); 
    return 一倂(path);
  }
  
  private static Path 一倁(Path paramPath) throws IOException {
    Path path = paramPath.toAbsolutePath().normalize();
    if (!Files.isRegularFile(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS }))
      throw new IOException("WLmjtaiSEmrRldsuflAqnx3mMGn3Gn9/8rI7UkpsNOXBuBK3RxpIdjirKYBVglnh"); 
    return 一倂(path);
  }
  
  private static Path 一倂(Path paramPath) throws IOException {
    Path path = paramPath.toRealPath(new LinkOption[0]);
    if (!path.equals(paramPath.toRealPath(new LinkOption[] { LinkOption.NOFOLLOW_LINKS })))
      throw new IOException("TxX1SDiYI9mxAVTuZTGhmLr4vt1Y9nZzHBRaQQxJTAUZ2YEIm7UKsJDGCi+D8dNKrEqq9Q=="); 
    return path;
  }
  
  private static Path 一倁(Path paramPath1, Path paramPath2) throws IOException {
    if (paramPath1.startsWith(paramPath2))
      throw new IOException(一倆.一倀("h3onK6PgW1owPdUlcxrAaNUZTfqBWKOj/zhl9WcCq6kTqQ3ZHTmg7XDas+4y9ZEed0FiztZihwJgxpBkokYSZWS+q9KH/8xzf0YDuQew+A==")); 
    return paramPath1;
  }
  
  private static void 一倀(Path paramPath, 一倀 param一倀) throws IOException {
    param一倀.一倀(paramPath);
    一倁(paramPath, param一倀.一倂());
  }
  
  private static void 一倁(Path paramPath, String paramString) throws IOException {
    JarFile jarFile = new JarFile(paramPath.toFile(), false);
    try {
      String str = 一倆.一倀("D3qcptAat65I3/m1lAyF6z8pzKBDFUcKI6pSNzDuS/uxkwZxZn40cgQiHmK7JA==");
      JarEntry jarEntry = jarFile.getJarEntry(str);
      if (jarEntry != null && !jarEntry.isDirectory() && jarFile.stream().filter(paramJarEntry -> paramString.equals(paramJarEntry.getName())).count() == 1L) {
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        try {
          byte[] arrayOfByte = inputStream.readNBytes(65537);
          if (arrayOfByte.length <= 65536 && 一倀(new String(arrayOfByte, StandardCharsets.UTF_8), paramString)) {
            if (inputStream != null)
              inputStream.close(); 
            jarFile.close();
            return;
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
      } 
      jarFile.close();
    } catch (Throwable throwable) {
      try {
        jarFile.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
    throw new IOException("Oz1gUW22Vcn+TrXlash/CVZw8LNPzzcZfEGvNgXqJ78pbhXU8c3h5knuNwgn3esEKL0oaNLA94q0EIQHHwwgLeEn4iDm/1/OjB/BWbCSN8avlRU=");
  }
  
  private static boolean 一倀(String paramString1, String paramString2) {
    byte b = 0;
    boolean bool = false;
    boolean bool1 = false;
    boolean bool2 = false;
    CharSequence charSequence = null;
    for (String str1 : paramString1.split(一倆.一倀("GWIwHZLuIZlWbFytsiXtMoA8jCh/14fTynQpGlHw"))) {
      String str2 = str1.strip();
      if (charSequence != null) {
        if (str2.contains(charSequence))
          charSequence = null; 
      } else if (!str2.isEmpty() && !str2.startsWith(一倆.一倀("7AXIPqNrCwu/sOfUfgA+x0xUFVFxsWToFkpAvJk="))) {
        if (str2.startsWith(一倆.一倀("gMuwwjMG7CkVLbENSjE7TcyiaAUm1GSpCoO4aPE="))) {
          bool = 一倃.matcher(str2).matches();
          if (bool)
            b++; 
        } else {
          int i = str2.indexOf('=');
          if (i >= 0) {
            String str3 = str2.substring(0, i).strip();
            String str4 = str2.substring(i + 1).strip();
            if (bool && str3.equals(一倆.一倀("zypvDWKp1MBJH3/RBj6CyTRl4Y0oIFcWb9pGwfJG1Niu"))) {
              if (bool1 || !一倁(str4, 一倆.一倀("mWjI/1xfUQcLEYA2JuHXrg4RN1a/cOd5qLhsTEYhE2r+7FY=")))
                return false; 
              bool1 = true;
            } 
            if (bool && str3.equals(一倆.一倀("n5a7jw3lXaE7Z5mjdgWghe/PG+fs+8xeamKTxZCZFmHmkXQ="))) {
              if (bool2 || !一倁(str4, paramString2))
                return false; 
              bool2 = true;
            } 
            if (str4.startsWith(一倆.一倀("CMogBaQZid0XrCC99HfuWqCyeWsgm1l3H+3jvKnFdg==")) || str4.startsWith(一倆.一倀("MDPw/Xh2FeSZmsHb+eOxE+SQYj9Wpih5kJmNXKRSxA=="))) {
              String str = str4.substring(0, 3);
              if (str4.indexOf(str, 3) < 0)
                charSequence = str; 
            } 
          } 
        } 
      } 
    } 
    return (b == 1 && bool1 && bool2 && charSequence == null);
  }
  
  private static boolean 一倁(String paramString1, String paramString2) {
    String str1 = "gjYmzchtQTjsOJc8rNcJtwPskk4TsU+UcRd3Z+UIfA==";
    if (!paramString1.startsWith(str1))
      return false; 
    String str2 = paramString1.substring(str1.length()).strip();
    return (str2.isEmpty() || str2.startsWith(一倆.一倀("674UzMDnfuh+vEzjyFYpDbSUnnQYJ0nttLupN10=")));
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdm\\update\UpdateInstaller.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */