package br.com.farmdmz.client.auth;

import br.com.farmdmz.client.update.一倀;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.fml.loading.FMLPaths;

public final class 一倂 {
  private static final Minecraft 一倀 = Minecraft.m_91087_();
  
  private static final Gson 一倁 = (new GsonBuilder()).setPrettyPrinting().create();
  
  private static final long 一倂 = 30000L;
  
  private static String 一倃 = 一倏();
  
  private static String 一倄 = 一倆.一倀("SyKvFEQBZ0T6VqFtvAVfANYT3qJt8U/wgjXwjA==");
  
  private static String 一倅 = 一倆.一倀("DRS7TK1VBRizhUdEI/neOoJiYgobeA0eZGv5kg==");
  
  private static String 一倆 = 一倆.一倀("FfJWiR5X/WyvtbTPIXl/gsFvwKpGPpD8jLpEBg==");
  
  private static String 一倇 = 一倆.一倀("pVhELWCOT9nUm6PWAHam6UCl8IcuEralkWHWNQ==");
  
  private static String 一倈 = 一倆.一倀("lwmc55xNRu+IRb8NMioLz3XBmF2sVdoRWVzjRFXzx5YP+RKaGT9ANerVySXqhoJymgkqo68RYh2RwdzBJ2rO3wMrgm6M15faki0=");
  
  private static long 一倉;
  
  private static boolean 一倊;
  
  private static boolean 一個;
  
  private static boolean 一倌;
  
  private static boolean 一倍;
  
  private static 一倄 一倎 = 一倄.一倀();
  
  private static volatile int 一倏;
  
  private static volatile boolean 一倐;
  
  public static String 一倀() {
    return 一倃;
  }
  
  public static String 一倁() {
    return 一倅;
  }
  
  public static String 一倂() {
    return 一倀.m_91094_().m_92546_();
  }
  
  public static String 一倃() {
    return 一倈;
  }
  
  public static boolean 一倄() {
    return 一倌;
  }
  
  public static boolean 一倅() {
    return (!一倐 && !一倄.isEmpty() && 一倊);
  }
  
  public static boolean 一倆() {
    return (一倅() && 一倆.一倀("nOxGde5LeZ1QWtjXjhW/W2OOtB2+nu1jyaYDT50w9cGn").equals(一倆));
  }
  
  public static String 一倇() {
    return 一倎.一倁();
  }
  
  public static boolean 一倈() {
    return (一倅() && 一個 && !一倀.一倁() && 一倇.equalsIgnoreCase(一倂()));
  }
  
  public static boolean 一倀(一倄.一倀 param一倀) {
    return (一倈() && 一倎.一倀(param一倀));
  }
  
  public static boolean 一倀(Screen paramScreen, 一倄.一倀 param一倀) {
    if (一倀(param一倀))
      return true; 
    if (一倈())
      一倈 = "dIcE15IFXqrVPeEnDA0Y987IrNpf9y4NQGN9zIq0z+ewi9hcyzRAIc43BrFlhZIZKHQkr7oJx9ST/w=="; 
    一倀(paramScreen);
    return false;
  }
  
  public static void 一倀(Screen paramScreen) {
    if (一倀.一倁()) {
      一倀.一倀(paramScreen);
      return;
    } 
    if (!(一倀.f_91080_ instanceof 一倃))
      一倀.m_91152_(new 一倃(paramScreen)); 
  }
  
  public static boolean 一倁(Screen paramScreen) {
    if (一倈())
      return true; 
    一倀(paramScreen);
    return false;
  }
  
  public static boolean 一倀(String paramString) {
    if (一倐)
      return false; 
    try {
      String str = 一倂(paramString);
      Path path1 = FMLPaths.CONFIGDIR.get().resolve(一倆.一倀("y1MYukOYxpaa625CuBfIO1AsijwH6YvpTWhkGmPD1CZH4nHsEBifgZWKxtIO2KS9iMU="));
      Files.createDirectories(path1.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
      JsonObject jsonObject = new JsonObject();
      jsonObject.addProperty(一倆.一倀("rKNxFVovYcRYHnqMoBhfG3i2UUUVZSh/mYYvwtA7sKv8HsM="), str);
      Path path2 = path1.resolveSibling("1UKnoLLQE0wMAI9rF2Utn/laD2+qzH+AXXXG3xQzuLBp");
      Files.writeString(path2, 一倁.toJson((JsonElement)jsonObject), StandardCharsets.UTF_8, new java.nio.file.OpenOption[0]);
      try {
        Files.move(path2, path1, new CopyOption[] { StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING });
      } catch (IOException iOException) {
        Files.move(path2, path1, new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
      } 
      if (!一倃.equals(str))
        一倎(); 
      一倃 = str;
      一倈 = 一倆.一倀("KCHGFQhyO+9YY8fLb7l0JM8CIaXdVzCYUmcgnxDXFC6Ppj5EGza0cGYAeNe7q27cCqo=");
      return true;
    } catch (IllegalArgumentException illegalArgumentException) {
      一倈 = illegalArgumentException.getMessage();
    } catch (IOException iOException) {
      一倈 = 一倆.一倀("iFmqoHT7KWTEA0FKz2deVsnMOjB02kGa7oK58/t/pnRWSFV0KC7JjUjJAEEJQtyLuzBba9rWRHawb6Jp/StJsmFeqzGL4TnF");
    } 
    return false;
  }
  
  public static void 一倀(String paramString1, String paramString2) {
    一倀(一倆.一倀("LyMd8zeef+NqHj7Z6Qg7eOHpCaW9PnUfeyMYKYtFYwEs8TWTCTKjxIdcIQ=="), paramString1, paramString2, 一倂(), 一倆.一倀("ztaugtmZesZxI5uaXwZB1vpDaYEF1dHzv21kZA=="));
  }
  
  public static void 一倀(String paramString1, String paramString2, String paramString3, String paramString4) {
    if (paramString3 == null || !paramString3.trim().matches(一倆.一倀("wR1nNr9Oxedgjs9tQjFEFH6LQmlsa388DiKzDkAuGSvwgFcNbA19+fBjdAUIsg=="))) {
      一倈 = 一倆.一倀("rrSw44+EAhKeBLmzvLA1+xPa8ZeOQ4tkK6LIkMJJ/Nt53deZMi9sj/iGRcGivJxUW1FoQawwf7dUFhGKAofX+7BwJ2MbG9L1Ed1DsENRM04rwpoo6+Yg");
      return;
    } 
    if (!paramString3.trim().equalsIgnoreCase(一倂())) {
      一倈 = "sJ4xPwAnNs5xnkiP4wp0Dzb0aVaBHkwmHCDFGIsU7eiC3JXGlSTskNzuuGXWUM4jFU+mZPZcmPNOIDEMLFebSw==";
      return;
    } 
    一倀(一倆.一倀("VhzsjUaL/ulwrDYX2b/NOFw+myXKiB8s1h3LojKolrL49J3f33tw38Mtxeaw4w=="), paramString1, paramString2, paramString3.trim(), paramString4);
  }
  
  private static void 一倀(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    if (一倐 || 一倌)
      return; 
    if (paramString2 == null || paramString2.trim().isEmpty() || paramString3 == null || paramString3.isEmpty()) {
      一倈 = 一倆.一倀("QeKvX8hoHUe9tI2VnnutzTRzwIo0VLBeBoc1A54qtFPd7iFZYkdWvhFR5lPnG+rX");
      return;
    } 
    一倎();
    一倌 = true;
    一倍 = false;
    int i = ++一倏;
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty(一倆.一倀("RryX5F3gLtAZQrOnL7KtYBjJBKoqxuRJseP+HmTCrdM="), paramString2.trim());
    jsonObject.addProperty(一倆.一倀("TujP6L0Ja/p/uWnF3gLsGs5QwQdQ4/tHob4zZ4poR9bZgk9H"), paramString3);
    jsonObject.addProperty(一倆.一倀("WqfLMZkFENPvBfO6M+ftZqeO+ZcEkhx7wbbc6Q1BvJIueIpeS2P1Mfz3"), paramString4);
    if (paramString5 != null && !paramString5.trim().isEmpty())
      jsonObject.addProperty(一倆.一倀("okuOI6b36GWjB8XgcZFOQkXdHw03FVKjq8YapVLy9A=="), paramString5.trim()); 
    一倈 = paramString1.endsWith(一倆.一倀("xCElCtq6R6zJAl0kH/aQO0H6RS80/ECAxxQOfmMqgn7cV32N")) ? 一倆.一倀("gNUgLCkrmUqGLowSez7SUIQsXWmC+LKevqL828vAFJ7sx1dp9Y1tYmOucRM=") : 一倆.一倀("M3ZOYOFh80eg5CK/3zYH9KE9kclxV9P90WAZEEgXhCc7py1ViHqkKHJnQQ==");
    String str = 一倃;
    一倁.一倀(一倆.一倀("bjmkxhGL58dQoEQmkG+A43W+w+GfvlwugUPMEX0jrHI="), "sDgxE/wybCJxKBUtS/Ws7Zkg75ngjrgkeidEeRRl", 一倁.toJson((JsonElement)jsonObject), 一倆.一倀("DeMwHeT/taCF1GfgRPWywISiUA/YybW5JUyg9Q=="), 一倀.一倀()).whenComplete((param一倀, paramThrowable) -> 一倀(paramInt, (), ()));
  }
  
  public static void 一倁(String paramString) {
    if (一倐 || 一倌)
      return; 
    if (!一倅()) {
      一倈 = 一倆.一倀("N7i4r4X8PT57gFMd+sPBDP4GkNOpOXUSWHxWLxfjCDFBKcSE6FnW1w+EohumUDO8PjkGQ1fDqrWJl7MUu6DK5gcv6yX9o67IIg==");
      return;
    } 
    if (paramString == null || paramString.trim().isEmpty()) {
      一倈 = 一倆.一倀("stoIT/yJqmhKPQ5zxgrcOstoxRoMQhQ/nnDAAk0qr1yDWYlVNnRZWbg=");
      return;
    } 
    一倌 = true;
    一倍 = false;
    int i = ++一倏;
    String str = 一倂();
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty(一倆.一倀("3662P4oYcLvVLMTs8cc2bWnJEQQWI5biukMZl383lA=="), paramString.trim());
    jsonObject.addProperty(一倆.一倀("+LKMUFyDZ8JqnDgu57z1Hv3lIMsHuD6LKWOhbbowDhRwQoJfyLSDUo7N"), str);
    一倈 = 一倆.一倀("QjneczvmfFPciQHm7D23TrKnqoF9BvMKKJkTtWAtZsYq9jQjoXZF2ITTU94=");
    一倀(一倆.一倀("+eebqae5SRBJJqvVUSAwYzve2o1IcpxibqgFWp1d/vc="), 一倆.一倀("JXV1KF44paCVBehGfIGPoi/8Aav8KgetH99G01LTfA859cC+gM9OHyYASbM="), jsonObject, 一倄).whenComplete((param一倀, paramThrowable) -> 一倀(paramInt, ()));
  }
  
  public static void 一倉() {
    一倎();
    一倈 = 一倆.一倀("c33xo5H/SCePznPEclKtKFaOvSbdQJE/2JUFlwjclwUh4Dng/0Y+rM+RYrj2hQ==");
  }
  
  public static void 一倊() {
    一倐 = true;
    一倎();
    一倈 = 一倆.一倀("LBN4GqlS8rM5C8bSdSl4H5tx/S/6KV5nLLo5bEfBPvojKmMXA+8NcKaML0yn");
  }
  
  public static void 一個() {
    if (一倐 || 一倄.isEmpty())
      return; 
    long l = System.currentTimeMillis();
    if (!一倇.equalsIgnoreCase(一倂())) {
      一倎();
      一倈 = 一倆.一倀("01B8L9Sy4dsetLeyrbx5CHYYcqlr0Vjsr2dnS5BIFXvZ7fkPSmNs4pYPeg7DNpfkk8D5LHZ4YJYHlIHdkus35QPQ8BTOLw==");
      return;
    } 
    if (一倌 || 一倍 || l < 一倉)
      return; 
    一倍 = true;
    int i = 一倏;
    一倀(一倆.一倀("LdX9tL2lXW8euaXQhTB0FJaidXXelmNSimOcxtGEbw=="), 一倆.一倀("vLTj/vMwioOegZGf17MTplpG3/Ozm4vcfyVGWAKrvNG5FRJK/Nyswg=="), (JsonObject)null, 一倄).whenComplete((param一倀, paramThrowable) -> 一倀(paramInt, ()));
  }
  
  private static void 一倀(JsonObject paramJsonObject) {
    JsonObject jsonObject = paramJsonObject.getAsJsonObject(一倆.一倀("MtepGVjy8CfcFl7si2w4M19idKJmzLRyOrXe25OURX8="));
    if (jsonObject == null || !一倆.一倀("AjXmCMXq9rgbMiYXQOB0jatXk6Zddgtyiyw3im8BGMhpSQ==").equals(一倀(jsonObject, 一倆.一倀("AtpKcGWLzOsE5DL3MBU+vJh47i40DA4xNvDAOcV/oln8vQ==")))) {
      一倀(false);
      一倈 = 一倆.一倀("K50nxO35Adj0+9FmKuQ4aOuhtjycq76K3GAI8kqDXjKwpbMBhv/sWc2TNVOg+qYqSDsqu2++PjPd06BUNOLczA==");
      return;
    } 
    一倅.一倀(paramJsonObject);
    一倅 = 一倀(jsonObject, 一倆.一倀("N+LgXQ/b1rSaHWUCcMCnpcDpjxODEwMWSWBOFsIuQwg="));
    一倆 = 一倀(jsonObject, 一倆.一倀("qqL5NO3b1RPgPl9FD6iZ4hBaMzT4bVIsSH56p5415Rw="));
    if (一倅.isEmpty())
      throw new IllegalArgumentException(); 
    一倊 = true;
    JsonElement jsonElement = paramJsonObject.get(一倆.一倀("3mgjNZ/o7EfatDt+UfbQNc6ysEaleGsgDMeutjbkhc/OObdHrCKuaNdyuw=="));
    if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean() && jsonElement.getAsBoolean()) {
      boolean bool = 一倀.一倁();
      一倀.一倀(一倃, 一倀(paramJsonObject, 一倆.一倀("QStxp52eLwf+n3ktDdbutMxqXZWCMRyoPxznY+Ug5jziUzKHiovkMRzw")));
      if (!bool)
        一倀.一倀(一倀.f_91080_); 
    } 
    一倎 = 一倄.一倀(paramJsonObject);
    一個 = 一倎.一倂();
    一倈 = 一倀(paramJsonObject, 一倆.一倀("vlH/i9D/qkP8Groqo/gAZZiNSzK6KkUPMLZHXP3QT18ZeA=="));
    if (!一個 && paramJsonObject.has(一倆.一倀("gqtXFlLfknBmhnzLv6IisyI+rO104KYaXjq9dQBQTmRODQ==")) && paramJsonObject.get(一倆.一倀("xUB0/Zqng+YjT5cR9yMt8HDwdKDtFVuDdE6TPd4TShF3qg==")).isJsonPrimitive() && paramJsonObject.get(一倆.一倀("FOZautLQgyaWkaNLHJAoG+GAOmPW3xW+MUbTzcei155W7A==")).getAsJsonPrimitive().isBoolean() && paramJsonObject.get(一倆.一倀("FGLC2hldTyxU7clnYf/hfwUC1nt7LVa63R2DiQa0Lw5w/A==")).getAsBoolean())
      一倈 = 一倆.一倀("/9BlWkZ4FL+iponS1Bkcm3pP5XIaHvmompKRRxEbwD//feIbDuCJQk5uZ6dmSfGGSqookL2FwjoufljLrYHPE1RHtpEAjliB7mZ5mIYOtmnFw9928rg3jAaRisadjzUX6q50czC8H9tfWHPS6914"); 
    if (一倈.isBlank())
      一倈 = 一個 ? 一倆.一倀("ybfsHrRqOUALRU2yfoO3NrcVM6xzLAlC9btTy2m1ugBlxI6tZxFMw57R9g==") : 一倆.一倀("vmPEdccjj0YHFI2mm9pi1S+c7TnXg6JEL6P6K7rBjAOLCZPMHON+5YRA//SorgGQ+SBUGZ+xyf/O5t9EEREJSQXX"); 
    一倉 = System.currentTimeMillis() + 30000L;
  }
  
  private static CompletableFuture<一倁.一倀> 一倀(String paramString1, String paramString2, JsonObject paramJsonObject, String paramString3) {
    return 一倁.一倀(paramString1, "eqSMje4Re3WAG5R0SuR/KX7qMdTW0YkvpXoSwW6T", (paramJsonObject == null) ? null : 一倁.toJson((JsonElement)paramJsonObject), paramString3, 一倀.一倀());
  }
  
  private static boolean 一倀(一倁.一倀 param一倀) {
    return (param一倀 != null && param一倀.一倀() >= 200 && param一倀.一倀() < 300);
  }
  
  private static JsonObject 一倁(一倁.一倀 param一倀) {
    if (param一倀.一倁().length() > 65536)
      throw new IllegalArgumentException(); 
    return (JsonObject)一倁.fromJson(param一倀.一倁(), JsonObject.class);
  }
  
  private static String 一倂(一倁.一倀 param一倀) {
    try {
      String str = 一倀(一倁(param一倀), 一倆.一倀("oiTeE32u4OtGSIMwFKBx0UKuIeVaLnzPIRrEiSBbLlKpxg=="));
      if (!str.isBlank())
        return (str.length() > 220) ? str.substring(0, 220) : str; 
    } catch (RuntimeException runtimeException) {}
    return "cph9JXt4BVMujRha1wzFwUWRdVYrciFVLzeHZQx1wSzSjO+3X3+SFKf+/LbInjEzLdVjL17/gHgXhU355g==";
  }
  
  private static String 一倀(JsonObject paramJsonObject, String paramString) {
    JsonElement jsonElement = paramJsonObject.get(paramString);
    return (jsonElement == null || jsonElement.isJsonNull()) ? 一倆.一倀("oqEr/WBtsU2hGTnE0XNGDAgjMaj9JceIqqKtMQ==") : jsonElement.getAsString();
  }
  
  private static void 一倌() {
    一倎();
    一倈 = 一倆.一倀("nXJMWD8O+BlEwCJgufKUkO949slmw1Kb6UtU+qqrqtkjGj5/VAmzx8FfBTaRu9Aw/kXvEXXoY1D0TrvmPJu82zfER/rraKqzSsWSGN56abulnphNk4kMH8kjHv5LucI45A==");
  }
  
  private static void 一倍() {
    一倄 = 一倅 = 一倆 = 一倇 = 一倆.一倀("D0ybJIbMBTX3bLV7LN7w3rjUpt5Jd01OoAhRmg==");
    一倊 = 一個 = false;
    一倎 = 一倄.一倀();
    一倉 = 0L;
  }
  
  private static void 一倎() {
    一倀(true);
  }
  
  private static void 一倀(boolean paramBoolean) {
    String str1 = 一倄;
    String str2 = 一倃;
    一倏++;
    一倍();
    一倌 = 一倍 = false;
    if (paramBoolean && !str1.isEmpty())
      一倁.一倀("uGDqBATHVVDDVd5cnjhZ6djzQiGSx6/CMcgoTBjMczuDOGx5Aa0aOO7bXHfd", str1); 
  }
  
  private static void 一倀(String paramString, 一倁.一倀 param一倀) {
    if (!一倀(param一倀))
      return; 
    try {
      String str = 一倀(一倁(param一倀), 一倆.一倀("KN0Gm5mAV4voo3c/qmNOvjj49AiIkVWZBwXG54EhN+uH"));
      if (!str.isEmpty())
        一倁.一倀("GO2OQB1q9cWFpduqNN5BuijKdjfW5ZsSxmsuSCmtlmqZ3K8gLjwnDUi9gQRn", str); 
    } catch (RuntimeException runtimeException) {}
  }
  
  private static void 一倀(int paramInt, Runnable paramRunnable) {
    一倀(paramInt, paramRunnable, () -> {
        
        });
  }
  
  private static void 一倀(int paramInt, Runnable paramRunnable1, Runnable paramRunnable2) {
    if (一倐 || paramInt != 一倏) {
      paramRunnable2.run();
      return;
    } 
    try {
      一倀.execute(() -> {
            if (一倐 || paramInt != 一倏) {
              paramRunnable1.run();
            } else {
              paramRunnable2.run();
            } 
          });
    } catch (RuntimeException runtimeException) {
      paramRunnable2.run();
      if (!一倐)
        throw runtimeException; 
    } 
  }
  
  private static String 一倏() {
    return 一倀.一倀(FMLPaths.CONFIGDIR.get());
  }
  
  private static String 一倂(String paramString) {
    return 一倀.一倀(paramString);
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\auth\一倂.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */