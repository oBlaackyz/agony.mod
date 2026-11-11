package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倄;
import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.config.一倂;
import br.com.farmdmz.config.一倃;
import br.com.farmdmz.core.一倂;
import br.com.farmdmz.core.一倃;
import br.com.farmdmz.core.一倄;
import br.com.farmdmz.core.一倉;
import br.com.farmdmz.core.一倌;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.player.Input;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;

public final class 一倇 {
  private static final Minecraft 一倀 = Minecraft.m_91087_();
  
  private static final 一倃 一倁 = new 一倃();
  
  private static final 一倉 一倂 = new 一倉();
  
  private static final 一倄 一倃 = new 一倄();
  
  private static final 一倖 一倄 = new 一倖();
  
  private static final 一倌 一倅 = new 一倌();
  
  private static final 一倓 一倆 = new 一倓();
  
  private static final 一倐 一倇 = new 一倐();
  
  private static final long 一倈 = 15000L;
  
  private static final ArrayDeque<String> 一倉 = new ArrayDeque<>();
  
  private static 一倂 一倊 = 一倃.一倀();
  
  private static 一倆.一倅 一個 = new 一倆.一倅(false, false, List.of(), 一倆.一倀("2h/avIr/5S5YYfJdfVkXy3ifckUgc1rFtDxCDNf06m0pOD7cYCWBMk28vR0="));
  
  private static List<一倆.一倀> 一倌 = List.of();
  
  private static String 一倍 = 一倆.一倀("jT5z1CgXRyPiqAL0I6IJZj0A+Szvc7mFFhpyCk3++Tmq9uE=");
  
  private static String 一倎 = 一倆.一倀("15S1Ph6l38jSqtrIOI0psULNeQKc9334P/L3Fw==");
  
  private static boolean 一倏;
  
  private static boolean 一倐;
  
  private static boolean 一們;
  
  private static boolean 一倒;
  
  private static boolean 一倓;
  
  private static boolean 一倔;
  
  private static boolean 一倕;
  
  private static boolean 一倖;
  
  private static boolean 一倗;
  
  private static boolean 一倘;
  
  private static boolean 一候;
  
  private static boolean 一倚;
  
  private static boolean 一倛;
  
  private static boolean 一倜;
  
  private static boolean 一倝;
  
  private static String 一倞 = 一倆.一倀("2GzlwMEvP8YEiwOw52uhJbha4AiGE3FAQD0PVAOwDCTlmGD6SJLE");
  
  private static long 一借;
  
  private static String 丁倀 = 一倆.一倀("ZVLEI7cOOXabjDhqqSulknMl9YYA7amRPrU8G6gsxsSTjSc/Uw/u56gKb4ZF4zbv1A9cFw==");
  
  private static int 丁倁 = -1;
  
  private static int 丁倂 = -1;
  
  private static int 丁倃 = -1;
  
  public static 一倂 一倀() {
    return 一倊;
  }
  
  public static boolean 一倁() {
    return 一倁.一倀();
  }
  
  static int 一倂() {
    return 一倁.一倂();
  }
  
  public static boolean 一倃() {
    return (一倁.一倀() && 一倁.一倅());
  }
  
  public static boolean 一倄() {
    return (一倃() && 一倏() > 0L && !一們 && !一倜);
  }
  
  public static boolean 一倅() {
    return 一倘;
  }
  
  public static boolean 一倆() {
    return (一倘 && 一們 && !一候);
  }
  
  public static boolean 一倇() {
    return 一倜;
  }
  
  public static boolean 一倈() {
    return (一倜 && 一倝);
  }
  
  public static String 一倉() {
    return 一倞;
  }
  
  public static void 一倀(Component paramComponent) {
    if (!一倜 || paramComponent == null)
      return; 
    一倇.一倀(paramComponent.getString());
    一倏.一倀(paramComponent);
  }
  
  static void 一倀(LocalPlayer paramLocalPlayer, Input paramInput) {
    if (!一倂.一倈())
      return; 
    if (一倂.一倀(一倄.一倀.TIME_ROOM) && 一倘 && !一候 && (一倊.timeRoomBackground || (一倀.f_91080_ == null && 一倀.m_91302_())))
      一倆.一倀(paramLocalPlayer, paramInput); 
    if (一倂.一倀(一倄.一倀.ORB) && 一倜 && 一倝 && (一倊.orbBackground || (一倀.f_91080_ == null && 一倀.m_91302_())))
      一倇.一倀(paramLocalPlayer, paramInput); 
  }
  
  public static boolean 一倊() {
    return (一倁.一倀() || (一倘 && !一候) || 一倜);
  }
  
  public static String 一個() {
    return 丁倀;
  }
  
  public static boolean 一倌() {
    return 一倁.一倄();
  }
  
  public static boolean 一倍() {
    if (!一倂.一倀(一倀.f_91080_, 一倄.一倀.FISHING)) {
      一倁.一倈();
      return false;
    } 
    return 一倁.一倁(一倊(), 一倄());
  }
  
  public static void 一倎() {
    一倁.一倃();
  }
  
  public static long 一倏() {
    return 一倁.一倀(System.currentTimeMillis());
  }
  
  public static String 一倐() {
    if (一倃()) {
      long l1 = 一倏();
      if (l1 == 0L)
        return 一倍; 
      long l2 = (l1 + 999L) / 1000L;
      String str = (一倘 && !丁倀.isBlank()) ? 丁倀 : 一倆.一倀("gyKBlOI7oFV14Ww0BkTijciYskuhp7WygD8ss5kHTpVYfLsE4E2maB0E5Y+o1l40");
      return String.format(一倆.一倀("+luMIar/HgOJRS9A9NEml+sk28quVfELxbOG11tnInAxKPzYUIcRE1LVG8fu1yuXLHvQ7S0="), new Object[] { Long.valueOf(l2 / 60L), Long.valueOf(l2 % 60L), str });
    } 
    return (一倜 && 一倝) ? 一倞 : (一倌() ? 一倁.一倇() : 一倍);
  }
  
  public static void 一們() {
    if (一倗 && !一倁.一倀())
      一倀(一倁.一倁()); 
    if (一倁.一倀()) {
      一倀(一倆.一倀("alvUs8aYkN2nkCZKkKoY14bhimAnRgrGLdRR58cNSb5Z+nhbYjhfO8NW4xocI0t/ffNp8hDXVA=="));
      return;
    } 
    if (!一倂.一倀(一倀.f_91080_, 一倄.一倀.WHEAT))
      return; 
    if (一倔) {
      一倃(一倆.一倀("biYQMvVXXqCXZKwfafOBuIqs/RgVoIXFRCW3BP1EA+CwAn/lYLNvFBIzugsBIvW6QPdFcnn7Id+iCh14phOTfwl8rsWXO1DMLalRz5GPniJO5tSmUg=="));
      return;
    } 
    if (一倀.f_91074_ == null || 一倀.f_91073_ == null || 一倀.m_91403_() == null) {
      一倃(一倆.一倀("7fvGTiYPeZjqXQV1s2Ci80U0bimE5TMMHphkQscO1+UWPTuL071/lHmOwcJCY8fTAgz7kseggFpFfNU="));
      return;
    } 
    一個 = 一倆.一倀();
    if (!一個.一倀()) {
      一倃(一個.一倃());
      return;
    } 
    if (一倊.plots.stream().noneMatch(param一倀 -> param一倀.enabled)) {
      一倃(一倆.一倀("sTSprSqlh8DS4W6b800DWtB+HTZQAW9/o3s3kiAHD0aVbtm2ZUShycOM0bQI9bNnsBL4q3WFYM8="));
      return;
    } 
    long l = System.currentTimeMillis();
    一倀(l);
    if (一倘)
      一倅.一倀(); 
    一倓 = false;
    丁倀 = 一倘 ? 一倆.一倀("/qqJayPok0l8gvFMw3tzdcowfXxtx6iZXI6EJA3/bfgAs5txiOLXwRkpSrPxQLmSN392UsfxLpP/iCPp8vx/v67Mkvds5S0=") : 一倆.一倀("dTHyH1mpYXNo4X9npGsxIHdpANatJm3V54T1AYmiOdy079pYY7Z0AVI/6U6fg7v+XQ==");
    一倌 = List.of();
    一倂.一倀();
    WheatBackgroundBridge.一倀();
    一倄.一倀();
    丁倁 = -1;
    丁倂 = 丁倃 = -1;
    一倁.一倀(new 一倃.一倅(false, 一倊.replant, 一倊.actionDelayTicks * 50L, 一倊.teleportWaitTicks * 50L, 一倊.visitTimeoutTicks * 50L, 一倊.openTimeoutTicks * 50L, 一倊.pollSeconds * 1000L, 一倊.retryLimit, true, 一倊.cooldownMinutes * 60000L), l);
    一倗 = true;
    一倁.一倀();
    一倘();
    一倃(一倆.一倀("izoEBqxfDKdyRQ/CSTk7PFKK2eAnw3kvPHYGZNboAkzmyzBWgjihcGj9"));
  }
  
  public static void 一倀(String paramString) {
    一倉.一倀(br.com.farmdmz.core.一倇.一倁.WHEAT);
    if (!一倗) {
      一倃(paramString);
      return;
    } 
    一倗 = false;
    一倁.一倀(paramString);
    boolean bool = (一倘 && !一候) ? true : false;
    if (bool) {
      一倅.一倀();
      一倕 = false;
      丁倀 = 一倆.一倀("95Uwp7I7aYq9YrCkG2mCelLK6pZdluBaJXcPkBy/6vEmZ/fXRg0CWtPKj9axEP71YvcWqg+4ygcEBmRVjVFk");
    } else {
      一倆.一倀();
      一倔 = (一倔 || (一倒 && 一倀.f_91074_ != null && 一倒.一倃().一倁()));
      一們 = 一倔;
      一倒 = false;
      if (!一倔)
        一倗(); 
    } 
    一倓 = false;
    一倂.一倀();
    WheatBackgroundBridge.一倀();
    一倄.一倀();
    丁倁 = -1;
    丁倂 = 丁倃 = -1;
    一倁.一倂();
    if (!bool && !一倜) {
      一倁.一倀(!一倔);
      一倖 = 一倔;
    } 
    一倘();
    一倃(paramString);
  }
  
  public static void 一倀(一倂 param一倂) throws IOException {
    一倂 一倂1 = param一倂.一倀();
    一倂1.一倁();
    一倃.一倁(一倂1);
    if (一倁.一倀()) {
      一倀(一倆.一倀("ZfGm64/RIwG3EGBHDz6OBPIdT4qTUDxKj4e10ENGkbmiiizDxJmdlZUgnlvOuqxX++PpHjMv1eOcPm9ATIEHJZJt5B/E"));
    } else {
      一倃(一倆.一倀("eDd8UeSQUuN+LHJxW3Z5BXNVtMo9wVIwJrFfgnj2BydrZXKj+kDzJnQcZLebmr5j/6br"));
    } 
    一倊 = 一倂1;
    一倌 = List.of();
    一倘();
  }
  
  public static void 一倁(一倂 param一倂) throws IOException {
    一倂 一倂1 = 一倊.一倀();
    一倂1.timeRoomBackground = param一倂.timeRoomBackground;
    一倂1.timeRoomFormKey = param一倂.timeRoomFormKey;
    一倂1.timeRoomFormLabel = param一倂.timeRoomFormLabel;
    一倂1.timeRoomFishingCommand = param一倂.timeRoomFishingCommand;
    一倂1.一倁();
    一倃.一倁(一倂1);
    boolean bool = !一倂1.timeRoomFormKey.equals(一倊.timeRoomFormKey) ? true : false;
    一倊 = 一倂1;
    if (bool)
      一倆.一倀(); 
    一倘();
  }
  
  public static void 一倂(一倂 param一倂) throws IOException {
    一倂 一倂1 = 一倊.一倀();
    一倂1.orbCommand = param一倂.orbCommand;
    一倂1.orbFormKey = param一倂.orbFormKey;
    一倂1.orbFormLabel = param一倂.orbFormLabel;
    一倂1.orbBackground = param一倂.orbBackground;
    一倂1.一倁();
    一倃.一倁(一倂1);
    boolean bool = (!一倂1.orbCommand.equals(一倊.orbCommand) || !一倂1.orbFormKey.equals(一倊.orbFormKey)) ? true : false;
    一倊 = 一倂1;
    if (bool) {
      一倇.一倀();
      一倏.一倔();
      一倝 = false;
    } 
    一倘();
  }
  
  public static boolean 一倒() throws IOException {
    if (一倜) {
      一倜 = false;
      一倝 = false;
      一倇.一倀();
      一倏.一倔();
      一倞 = 一倆.一倀("PkkksNIhCL233L3MwUJDqRtOXEIYMwqoGrEBPwJfyXly8NhBK29TZyi6vpor67wywBrcN4w=");
      if (!一倁.一倀() && (!一倘 || 一候))
        一倁.一倀(true); 
      一倘();
      return false;
    } 
    if (!一倂.一倀(一倀.f_91080_, 一倄.一倀.ORB))
      return false; 
    if (一倊.orbFormKey.isBlank())
      throw new IllegalArgumentException(一倆.一倀("FBk2nrkPf7zguKpVVSJPo7ggETKEmKiAZlUpdWCEs9jpOMY7dsFgw2lUiLG2WwPjJ9Dk0EgSrk7g3l9diq94LwXQ9Mg+QPS7cgSLVfSIRA==")); 
    if (一倀.f_91074_ == null || 一倀.f_91073_ == null || 一倀.m_91403_() == null) {
      一倞 = 一倆.一倀("pxNc1QsHhT/QHhRDz+T6ZAQKr/Pykds93RVkLnP76GjnqIfXGCiBAiVBzdtM3k3vnFrgM0elw6BzPK0=");
      return false;
    } 
    一倜 = true;
    一倝 = false;
    一倇.一倀();
    一倁.一倀();
    一倘();
    一倞 = (一倁.一倀() && !一倃()) ? 一倆.一倀("USA2lfUZXPxN8ZR7uG4sMOJ3rN+wkKAb7a46L9OouPY+l8SXRNPKVupucFR3/jlF4hHfQ8hiwfo=") : ((一倘 && !一候) ? 一倆.一倀("X66KoLWgpuhg+17zgWHJPdYilZScBDCW9aexoMAXNK/7veMcxoqGWjo6f8KU0xTxuN4WBQ==") : 一倆.一倀("XqW/1svgKBSbisU9ob9H29BHAgr7jWjpaT30Uv3VKNnXaXQzSt3xNXE="));
    return true;
  }
  
  public static boolean 一倓() throws IOException {
    if (一倘) {
      一倁(一倆.一倀("v0e8JAhJrNcUj0wgzgEdv/jH7UMR0+7GrAIdM5kCdXj+bUacgwTE29u6S9yTa7rpSLYc401QEg22vAy4QnmJ"));
      return false;
    } 
    if (!一倂.一倀(一倀.f_91080_, 一倄.一倀.TIME_ROOM))
      return false; 
    if (一倊.timeRoomFormKey.isBlank())
      throw new IllegalArgumentException(一倆.一倀("vR4NUPGDNgghYDN6OJC4oBrAzxzqjsjAut46NbDwTYHsRgl9/tHKTejuM7Ziij2DJApE1S6utRcu7rLTfrLbyWeD7MK/iZdcHkCWVbTDZB/n/66PLMIQw19hfg==")); 
    if (一倀.f_91074_ == null || 一倀.f_91073_ == null || 一倀.m_91403_() == null) {
      丁倀 = 一倆.一倀("lGRMmfaruJxKDQt0T1mCeZK4isjL+mwXmxD+38/0qpYtcaQKFUkkL8KCLN2F7SVpBIj8uFDegDf7F2IXBT5bC+t1gZaKXPA=");
      return false;
    } 
    一倘 = true;
    一候 = false;
    一倚 = false;
    一借 = 0L;
    一倔 = false;
    一倖 = false;
    一倅.一倀();
    一倆.一倀();
    一倀(System.currentTimeMillis());
    一倁.一倀();
    一倘();
    丁倀 = 一倁.一倀() ? 一倆.一倀("sKOkJpIappTv1Fv1UKBzLfRVfpJ75CqU82iqHyNh5M5wnLCCdH3A4zs3ewBCizkdMV2otzXegno=") : 一倆.一倀("/o6uJLIHmh2ImEZec4enff5ofYIvQyMsjzC9aoht/u95a8Wi2z3kwbjnmB93BmE5xWBm");
    return true;
  }
  
  private static void 一倁(String paramString) {
    一倘 = false;
    一候 = false;
    一倚 = false;
    一倅.一倀();
    一倆.一倀();
    if (!一倔)
      一倒 = false; 
    一借 = 0L;
    一倕 = false;
    一們 = 一倔;
    丁倀 = paramString;
    一倓 = false;
    一倁.一倂();
    if (!一倁.一倀()) {
      if (!一倜) {
        一倁.一倀(!一倔);
        一倖 = 一倔;
      } 
      if (!一倔)
        一倗(); 
    } 
    一倘();
  }
  
  public static void 一倔() {
    一倉.一倀();
    if (一倁.一倀())
      一倁.一倀(一倆.一倀("4BlZ2v2AgzvJSEmIo9Xze1hGK54IGFFlaVoOaV3qnVsLUqzk2yVFUa2C6WaDHJCa")); 
    一倗 = false;
    一倘 = 一倔 = 一倕 = 一倚 = false;
    一借 = 0L;
    一倅.一倀();
    一倆.一倀();
    一倜 = 一倝 = false;
    一倇.一倀();
    一倏.一倔();
    一倁.一倈();
    一倄.一倀();
    丁倂 = 丁倃 = -1;
    一倗();
    一倘();
  }
  
  private static void 一倀(long paramLong) {
    if (一倛)
      return; 
    一倃.一倀(一倝(), 一倞(), paramLong, 一倊.teleportWaitTicks * 50L);
    一倛 = true;
  }
  
  private static void 一倗() {
    if (!一倛)
      return; 
    一倃.一倀();
    一倛 = false;
  }
  
  private static void 一倘() {
    boolean bool = ((一倁.一倀() && 一倊.background) || (一倘 && !一候 && 一倊.timeRoomBackground) || (一倜 && 一倊.orbBackground) || (一倂.一倁() && 一倂.一倄())) ? true : false;
    if (bool && !一倏) {
      一倐 = 一倀.f_91066_.f_92126_;
      一倀.f_91066_.f_92126_ = false;
      一倏 = true;
    } else if (!bool && 一倏) {
      一倀.f_91066_.f_92126_ = 一倐;
      一倏 = false;
    } 
  }
  
  public static void 一倀(boolean paramBoolean) throws IOException {
    if (一倊.showHud == paramBoolean)
      return; 
    一倂 一倂1 = 一倊.一倀();
    一倂1.showHud = paramBoolean;
    一倃.一倁(一倂1);
    一倊 = 一倂1;
  }
  
  public static void 一倀(int paramInt) throws IOException {
    if (一倀.f_91074_ == null)
      throw new IllegalStateException(一倆.一倀("Amix4R8iAicEbw6IHUyAOv5zM3DnSIf/tzmCOuowdLUm/Czi3W1Dx60xGKD2wXYBl4vSO57jobG4/JmRp88usgvaw+cF4g==")); 
    if (paramInt < 0 || paramInt >= 一倊.plots.size())
      throw new IllegalArgumentException(一倆.一倀("9poRzqexzoLt7XFbTZOAqXsFUT1sIQTzaN8Jstn5InA6oqPcBs6exVOp7yLNYg==")); 
    一倂 一倂1 = 一倊.一倀();
    一倂.一倀 一倀 = 一倂1.plots.get(paramInt);
    一倀.x = 一倀.f_91074_.m_20185_();
    一倀.y = 一倀.f_91074_.m_20186_();
    一倀.z = 一倀.f_91074_.m_20189_();
    一倀(一倂1);
    一倃("6QDY5g0qgG7PffGTaXOWaFgsstPQrJINnU9xx7OOea3BTwFeUagF4qFKWwdboMkC+8ejXz8Cp/sDF3MYekA=");
  }
  
  public static List<String> 一倕() {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("23TUYpN9eyeDoTrM/ku9X1hAGrRA0X2pkl5SajTerQntCzmQBSWwRYl7/6gPk2O2+xTW1Q==");
    for (byte b = 0; b < 一倊.plots.size(); b++) {
      一倂.一倀 一倀 = 一倊.plots.get(b);
      String str = !一倀.enabled ? 一倆.一倀("PrdHjwgInoS3fXJGpMKOTfoe7ibOXjf1jdam+isosXqqGP7x04c=") : 一倆.一倀("RZ53rbukJjqJiRlsAVg897VTPOR4p/glu/O4nxa0gR+4o92o2NYTYlBC5f2JqXqBixewZg==");
      if (一倀.enabled && b < 一倌.size() && 一倌.get(b) != null) {
        一倆.一倀 一倀1 = 一倌.get(b);
        if (!一倀1.一倇().isEmpty()) {
          str = "3eZ4LWnyam4FzTzNpkQnDE+cO1XecZm8GauK3cXkZASq/aa4J4knZA==";
        } else if (一倀1.一倆() <= 0L) {
          str = 一倆.一倀("3gJEdaPN0ZbzpwLRJPa1VK2Ii33d/aCGUVogkv7x+uB4");
        } else if (一倀1.一倆() <= System.currentTimeMillis()) {
          str = 一倆.一倀("Ly5w44oh6L/sGDkU1Rz4uwr/4j3Yx/ScuuiV4QkYdcg7Xb9Wa9P3fNJrfiEzEw==");
        } else {
          long l = (一倀1.一倆() - System.currentTimeMillis() + 999L) / 1000L;
          str = String.format(一倆.一倀("Pfo/gaHZF74dCgD/hNO19Y++roP7cTJ8teR3tViEXT8bUCtmRQdda8VtiveSWy8="), new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) });
        } 
      } 
      arrayList.add("f7E6YDWwMz+4xjCJxMYyGjpLxvbuibwpl3O0PcoDxMLJqlWwNUJXHKU=");
    } 
    arrayList.addAll(一倉);
    return arrayList;
  }
  
  public static void 一倖() {
    Screen screen;
    boolean bool11;
    if (!一倂.一倈()) {
      一倚();
      一倘();
      return;
    } 
    一候();
    boolean bool1 = (一倀.f_91073_ != null && 一倀.f_91074_ != null && 一倀.m_91403_() != null) ? true : false;
    if (!bool1)
      一倆.一倀(); 
    if (!bool1)
      一倂(一倆.一倀("hk2pGTPZfQ+wG7xonPlfCmZXDcLMHOijv4C7r2u9BhcC4dZ+B8nVpq75RANA6KsvjwA5A0M=")); 
    if (一倗 && !一倁.一倀())
      一倀(一倁.一倁()); 
    一倘();
    if (一倘 && bool1 && !一候)
      一倀(System.currentTimeMillis()); 
    if (一倘 && 一候 && 一倚 && bool1) {
      一倒.一倄 一倄2 = 一倒.一倃();
      if (一倄2.一倀() && 一倄2.一倂() > 0) {
        一候 = false;
        一倚 = false;
        一倒 = false;
        一倅.一倀();
        一倀(System.currentTimeMillis());
        一倁.一倀();
        丁倀 = 一倆.一倀("Dfgh/DMmCQhZK9m8evsDpC61x4im2VjoJC/cz+WveX2oOM8TUo+d+RS3VhxRbHoQ606mj8RMWkO8W292LnNw1YheMQ==");
      } 
    } 
    if (bool1) {
      一個 = 一倆.一倀();
      if (一個.一倁()) {
        一倆.一倃 一倃2 = 一倆.一倀(一倀.f_91080_);
        if (一倃2.一倀() && 一倃2.一倁() >= 0)
          一個.一倂().stream().filter(param一倀 -> (param一倀.一倀() == param一倃.一倁())).findFirst().ifPresent(param一倀 -> 一倂.一倀(param一倀.一倀(), param一倀.一倆(), param一倃.一倂(), param一倃.一倃())); 
        一倌 = 一倀(一個.一倂().stream().map(param一倀 -> new 一倆.一倀(param一倀.一倀(), param一倀.一倁(), param一倀.一倂(), param一倀.一倃(), param一倀.一倄(), param一倀.一倅(), 一倂.一倀(param一倀.一倀(), param一倀.一倆()), param一倀.一倇())).toList());
      } 
    } 
    if (一倔) {
      一倆.一倀();
      if (bool1) {
        一倒.一倄 一倄2 = 一倒.一倃();
        if (一倄2.一倀() && 一倄2.一倁()) {
          一們 = true;
          丁倀 = 一倆.一倀("TpRJS6mlhHgpjU2927H/iOXqm47lxGE7lc1kj37GZSJ9QFpj358gYhiZP1ciA5NA/fZL");
          一倁.一倀(一倁.一倀(), false);
          if (一倒.一倀(一倀.f_91080_))
            一倀.f_91080_.m_7379_(); 
          if (一倀.f_91080_ == null || 一倊.timeRoomBackground)
            一倒.一倊(); 
          return;
        } 
        if (一倄2.一倀()) {
          一倔 = false;
          一們 = false;
          if (一倖) {
            一倁.一倀(true);
            一倖 = false;
          } 
          if (!一倁.一倀() && !一倘)
            一倗(); 
        } 
      } 
    } 
    if (一倕 && bool1 && 一個.一倁()) {
      一倕 = false;
      一倒 = false;
    } 
    boolean bool2 = 一倁.一倀();
    if (!bool2 && (!一倘 || 一候) && !一倜) {
      一倁.一倀(false, false);
      return;
    } 
    long l = System.currentTimeMillis();
    if (bool1 && !一個.一倀() && (bool2 || (一倘 && !一候))) {
      一倆.一倀();
      if (bool2)
        一倀(一個.一倃()); 
      if (一倘) {
        一候 = true;
        丁倀 = 一個.一倃();
        if (!一倁.一倀() && !一倜)
          一倁.一倀(true); 
      } 
      return;
    } 
    boolean bool3 = (bool2 && 一倊.background && 一倛()) ? true : false;
    boolean bool4 = (bool2 && bool3 && bool1 && 一個.一倁()) ? true : false;
    if (bool4 && 丁倁 < 0 && 一倁.一倂() >= 0 && (WheatBackgroundBridge.一倁(一倁.一倂(), l) || WheatBackgroundBridge.一倂(一倁.一倂(), l)))
      丁倁 = 一倁.一倂(); 
    if (!bool4 && 丁倁 >= 0) {
      丁倁 = -1;
      一倁.一倁(l);
    } 
    if (bool4 && 丁倁 >= 0 && 一倁.一倆() && !一倄.一倁() && WheatBackgroundBridge.一倄(丁倁, l))
      一倁(丁倁, l); 
    boolean bool5 = (bool2 && 一倊.background && !一倀.m_91302_()) ? true : false;
    一倆.一倃 一倃1 = (bool4 && 丁倁 >= 0) ? 一倀(丁倁, l) : 一倆.一倀(一倀.f_91080_, bool5);
    if (bool4 && 一倃1.一倀() && 一倃1.一倁() >= 0 && 一倃1.一倂() >= 0 && 一倃1.一倂() <= 2) {
      一倆.一倃 一倃2 = 一倃1;
      一個.一倂().stream().filter(param一倀 -> (param一倀.一倀() == param一倃.一倁())).findFirst().ifPresent(param一倀 -> 一倂.一倀(param一倀.一倀(), param一倀.一倆(), param一倃.一倂(), param一倃.一倃()));
    } 
    List list = (List)(bool2 ? 一倁(l) : List.of());
    if (bool2 && bool1 && 一倃())
      一倁.一倀(new 一倃.一倆(l, true, true, true, true, 0.0D, 一倃.一倂.OTHER, -1, 一倃.一倄.UNKNOWN, false, 一倆.一倀("E8B0LVQ8DnDfJZvaT4G2FjtmK1vsYHq6aAa7Qg=="), list)); 
    if (一倘 && !一候 && bool1) {
      一倒.一倄 一倄2 = 一倒.一倃();
      if (!一倄2.一倀()) {
        一倆.一倀();
        一們 = false;
        丁倀 = 一倄2.一倇();
        if (bool2 && 一倃() && !一倓 && !一倜)
          一倜(); 
        if (!bool2) {
          一候 = true;
          if (!一倜) {
            一倁.一倀(true);
            return;
          } 
        } 
      } else {
        if (一倄2.一倁())
          一借 = 0L; 
        long l1 = bool2 ? 一倁.一倀(l) : 2305843009213693951L;
        long l2 = bool2 ? Math.max(0L, l1 - 15000L) : l1;
        一倌.一倁 一倁2 = 一倅.一倀(new 一倌.一倂(l, true, l2, 一倄2.一倁(), 一倄2.一倂(), true));
        丁倀 = 一倁2.一倁();
        if (一倁2.一倀() != 一倌.一倀.FISH)
          一倂(一倆.一倀("H+8jjUPv/v50SNN/GTHFWhQdaf0YpP/FU2zS7vzqGZ9WBqImT7ZTXSzLeASAZAs+7ORmEg==")); 
        boolean bool = (一倊.timeRoomBackground || (一倀.m_91302_() && 一倀.f_91080_ == null)) ? true : false;
        switch (null.一倀[一倁2.一倀().ordinal()]) {
          case 1:
            一倁.一倂();
            一們 = true;
            一倆.一倀();
            一倁.一倀(true, false);
            if (bool) {
              一倀.m_91403_().m_246623_(一倆.一倀("PSXglhdU7vd4dsamnh4QKO+gi15xIKorFzlgYOE6fZcsOUAVgpDU"));
              一倅.一倀(l);
              一倒 = true;
              一借 = l;
              一倃(丁倀);
              return;
            } 
            break;
          case 2:
            一倁.一倂();
            一們 = true;
            一倁.一倀(true, false);
            if (bool) {
              丁倀 = 一倆.一倀(一倄2, 一倊.timeRoomFormKey, l);
            } else {
              一倆.一倀();
            } 
            一倃(丁倀);
            return;
          case 3:
            一倁.一倂();
            一們 = true;
            一倆.一倀();
            一倁.一倀(true, false);
            if (一倒.一倀(一倀.f_91080_))
              一倀.f_91080_.m_7379_(); 
            if (bool && 一倒.一倊()) {
              一倅.一倁(l);
              一倃(丁倀);
            } 
            return;
          case 4:
            一倆.一倀();
            一們 = false;
            if (!bool2) {
              一候 = true;
              一倚 = (一倄2.一倂() == 0);
              丁倀 = 一倚 ? 一倆.一倀("wBkj9tdmWNQywqiVktFrU9kiVcte70qqqXeBFkczrurha179kiQwok8ckzy5hLpZqtAzPUlkmkJv0i5Cpw343ZKIBvEdGHHu6aVfS8KaCA==") : 一倆.一倀("jZs50RcptybmVSDnwqvdsLI5ajfKG5qsPGE1sFlLG30LgmC9rko0deW/utW2t5h8shCsPRlJVpMZapV6wzT9JTts0iKA+U6FUv+w38GAGBYhWgGskZxd3BC39dnD");
              if (!一倜)
                一倁.一倀(true); 
              一倗();
              if (!一倜)
                return; 
            } 
            if (一倜) {
              丁倀 = 一倆.一倀("FS/ykvQVK54tnh0MNbzEqIrZ/Rvnc/lviv/SdAYySRWhP3Z8XBGX8OOkdVbJfmuBbAY2GmC+CULpa2isOH+t8ZU8exgxIs9m1Q1QjGov");
              break;
            } 
            if (!一倓 && bool)
              一倜(); 
            break;
          case 5:
            一倆.一倀();
            if (!一倄2.一倁() && 一借 > 0L && l - 一借 >= 9000L) {
              一倒 = false;
              一借 = 0L;
            } 
            一們 = (一倄2.一倁() || 一倒);
            if (一倄2.一倁() || 一倒) {
              一倁.一倀(true, false);
              一倃(丁倀);
              return;
            } 
            break;
          case 6:
            一倆.一倀();
            一們 = (一倒 && 一倃() && l1 <= 15000L);
            break;
        } 
      } 
    } else if (!一倘) {
      一們 = (一倔 || 一倕);
    } 
    if (一倓 && (!一倃() || 一倏() == 0L)) {
      一倁.一倂();
      一倓 = false;
    } 
    boolean bool6 = (一倜 && bool1 && (!bool2 || 一倃()) && (!一倘 || 一候 || (!一們 && !一倒)) && !一倔) ? true : false;
    if (bool6) {
      一倝 = true;
      一倞 = 一倇.一倀(一倊, l);
    } else if (一倜) {
      一倂(!bool1 ? 一倆.一倀("wKxSgK8rvBoqx6EGI/xCBZ1YrRXAZPxmQfhxtaf7nzDqLGWIUsk8NIWwLixW0KVua96x1pY=") : ((bool2 && !一倃()) ? 一倆.一倀("CUIYhbrBjgYDGV2XOKM0OTlHBAsRcB3aX+sYoQ8MZoPpnlbSySN0GQ8jT4NNfjGcCzFUSSyCfRo=") : 一倆.一倀("jlnuH5lO0ZL3mkQyoHINW+SBHH5Sr0x7uNWMUsms6iAKRnkmMhvYNWplE80j9UO/xD0BWw==")));
    } 
    一倁.一倀(一倊(), 一倄());
    boolean bool7 = (一倀.f_91080_ == null || 一倃1.一倀() || bool3 || (一倘 && 一倊.timeRoomBackground)) ? true : false;
    boolean bool8 = (一倀.m_91302_() || (bool2 && 一倊.background) || (一倘 && 一倊.timeRoomBackground)) ? true : false;
    boolean bool9 = (bool2 && (!一倃() || 一倏() == 0L || 一倕) && bool7 && bool8) ? true : false;
    一倄.一倁 一倁 = 一倃.一倀(new 一倄.一倂(l, bool1, (一倀.f_91074_ != null && 一倀.f_91074_.m_21224_()), 一倝(), 一倞(), (bool1 && 一個.一倁()), bool9, (一倊.autoTeleport || 一倒 || 一倕), bool1 ? 一倀.f_91074_.m_20185_() : Double.NaN, bool1 ? 一倀.f_91074_.m_20186_() : Double.NaN, bool1 ? 一倀.f_91074_.m_20189_() : Double.NaN));
    if (一倁.一倀() == 一倄.一倀.STOP) {
      if (bool2)
        一倀(一倁.一倁()); 
      if (一倘) {
        一候 = true;
        丁倀 = 一倁.一倁();
        if (!一倁.一倀())
          一倁.一倀(true); 
      } 
      一倛 = false;
      return;
    } 
    if (一倁.一倀() == 一倄.一倀.WAIT) {
      一倁.一倁(l);
      一倃(一倁.一倁());
      return;
    } 
    if (一倁.一倀() == 一倄.一倀.SEND_WARP) {
      一倁.一倁(l);
      一倂(l);
      一倃(一倁.一倁());
      return;
    } 
    if (!bool2)
      return; 
    boolean bool10 = ((一倀.f_91080_ instanceof 一倈 && !bool3) || (!一倊.background && !一倀.m_91302_()) || (一倀.f_91080_ != null && !一倃1.一倀() && !bool3) || !一個.一倁() || 一倃1.一倅().startsWith(一倆.一倀("H7HKNFAuRNRCZ9TRUW5CzHXiF0gEc4AuhYOReQZlptYoQJFUtrwK9A=="))) ? true : false;
    int i = 一倃1.一倁();
    switch (一倃1.一倂()) {
      case 0:
      
      case 1:
      
      case 2:
      
      default:
        break;
    } 
    一倃.一倄 一倄1 = 一倃.一倄.UNKNOWN;
    一倃.一倆 一倆 = new 一倃.一倆(l, true, true, bool10, true, 0.0D, 一倃1.一倀() ? 一倃.一倂.FARM : ((一倀.f_91080_ == null || bool3) ? 一倃.一倂.CLOSED : 一倃.一倂.OTHER), i, 一倄1, 一倃1.一倄(), 一倃1.一倅(), list);
    一倃.一倁 一倁1 = null;
    if (!bool10) {
      boolean bool12 = (一倃1.一倀() && i == 一倁.一倂() && 一倃1.一倂() >= 0 && 一倃1.一倂() <= 2) ? true : false;
      boolean bool = 一倄.一倁();
      boolean bool13 = (bool12 && 一倁.一倆() && (一倃1.一倂() == 2 || (一倃1.一倂() == 0 && 一倊.replant))) ? true : false;
      if (bool || bool13) {
        if (bool12 && (!bool || i == 丁倂)) {
          丁倂 = i;
          丁倃 = 一倃1.一倂();
        } 
        Object object = bool3 ? WheatBackgroundBridge.一倃(丁倂, l) : 一倆.一倁(一倀.f_91080_);
        if (!一倃1.一倀() || i != 丁倂)
          object = null; 
        int j = 丁倂;
        一倖.一倁 一倁2 = 一倄.一倀(object, j, 丁倃, 一倊.replant, bool3, l, () -> 一倁(paramInt));
        if (一倁2.一倁() == 一倖.一倂.FAIL) {
          一倀(一倁2.一倂());
          return;
        } 
        if (一倁2.一倁() == 一倖.一倂.SKIP) {
          一倄.一倀();
          丁倂 = 丁倃 = -1;
          一倁1 = 一倁.一倀(l, 一倁2.一倂());
        } 
        if (一倁2.一倀()) {
          一倁.一倀(new 一倃.一倆(l, true, true, true, true, 0.0D, 一倆.一倆(), 一倆.一倇(), 一倆.一倈(), 一倆.一倉(), 一倆.一倊(), list));
          一倃("TyF8vXc56R1ie7D4F8mfgthF7ag1o6zrjWEFgTuqCm0r+GIrZKkDmaRGYpLIarfu");
          return;
        } 
      } 
    } 
    if (一倁1 == null)
      一倁1 = 一倁.一倀(一倆); 
    if (一倁.一倀())
      一倁.一倀(true, 一倄()); 
    一倃(一倁1.一倂());
    switch (null.一倁[一倁1.一倀().ordinal()]) {
      case 1:
        一倂(l);
        break;
      case 2:
        一倀(一倆.一倀("qHGR8g8urSkYsuRhzoD4y/BsYJoOQ45dsbEqgfaxoygmM3qUt1Hbz/RhmtAtZ0m21bVWbImCHHRQzR+TM9HI8ts7fEsnpC83jsFpJL2/7Y1zCAYFpWb7J+Et"));
        break;
      case 3:
        if (bool4) {
          丁倁 = 一倁1.一倁();
          一倁(丁倁, l);
          return;
        } 
        if (一倀.f_91080_ != null) {
          一倀(一倀.f_91080_);
          一倁.一倁(l);
          一倃(一倆.一倀("RiAJ/frxi3qDVAjhd0u0QuGwYviTc8BtH9PHeYnv4lZNVWLdwQQ8cDKvgvEkhzGrWPrVMMptzkYFv4OMEJRtj1rESJDYO27Ge5Xv/A=="));
          return;
        } 
        if (一倊.background)
          WheatBackgroundBridge.一倀(一倁1.一倁(), 一倊.openTimeoutTicks * 50L); 
        一倀.m_91403_().m_246623_(一倂.一倀(一倊.plotCommand, 一倁1.一倁()));
        break;
      case 4:
      case 5:
        if (!一倃1.一倀() || i != 一倁1.一倁()) {
          一倀(一倆.一倀("Kk330iZHdTmJHhm4KjqrYQPBXywf8v/lB170TKbQdag+KD6lTarQcz2Qk+cTUnF4nbam9qfIvkN+CPNLkayN83uytgUCsY34UTmvdA=="));
          return;
        } 
        screen = 一倀.f_91080_;
        bool11 = bool4 ? WheatBackgroundBridge.一倀(i, (一倁1.一倀() == 一倃.一倀.COLLECT), l) : 一倆.一倁(screen, bool5);
        if (!bool11) {
          if (bool4) {
            WheatBackgroundBridge.一倀();
          } else {
            一倀(screen);
          } 
          一倁.一倁(l);
          一倃(一倆.一倀("fuDasN3S6UupLetkmaHxnB01F2prXIAzsMHOh8CmdwPlU39925Hpwv/hWl9ywqdWkAUq7yqiwx+M72HHdLXsBrGTqnqUUzmWAhRTBMfc3YrNHwZeCaKQNMo="));
        } 
        break;
      case 6:
        if (bool4) {
          丁倁 = -1;
          WheatBackgroundBridge.一倀();
          break;
        } 
        if (一倃1.一倀() && 一倀.f_91080_ != null)
          一倀.f_91080_.m_7379_(); 
        break;
      case 7:
        一倀(一倁1.一倂());
        break;
    } 
    if (一倗 && !一倁.一倀())
      一倀(一倁.一倁()); 
  }
  
  private static void 一倀(Screen paramScreen) {
    if (paramScreen == 一倀.f_91080_ && 一倆.一倄(paramScreen)) {
      WheatBackgroundBridge.一倀();
      paramScreen.m_7379_();
    } 
  }
  
  private static void 一候() {
    if (!一倂.一倀(一倄.一倀.TIME_ROOM) && (一倘 || 一們 || 一倔 || 一倕)) {
      一倆.一倀();
      一倅.一倀();
      一倘 = 一們 = 一倒 = 一倔 = 一倕 = false;
      一候 = 一倚 = 一倓 = false;
      一倖 = false;
      一借 = 0L;
      一倁.一倂();
      丁倀 = 一倆.一倀("jD/DbD5XjKBn7hK/3l1XCCJ4rdwaoLnUcvj89VdhGkdpIadXnEi+cQhEtUYtF1vEXuZTHhJlkXX1");
    } 
    if (!一倂.一倀(一倄.一倀.ORB) && (一倜 || 一倝)) {
      一倇.一倀();
      一倜 = 一倝 = false;
      一倏.一倔();
      一倞 = 一倆.一倀("vFUzaoyyB1dSmg5TYpGaE7P9UwAIBITKn0/oQITg2a0tA3LUYbPP+06rT12s1vM=");
    } 
    if (!一倂.一倀(一倄.一倀.WHEAT) && (一倗 || 一倁.一倀()))
      一倀(一倆.一倀("PZagXQ8zBzCCxap5PaaH/jpm0FTdhwm52fPK7/VbWulNpqj5V3KW0PCsauP9Wdr2M2QlxYZuAE/LcRvZNK6uZfWxkd8=")); 
    if (!一倂.一倀(一倄.一倀.FISHING))
      一倁.一倈(); 
    if (!一倁.一倀() && !一倘 && !一倜) {
      一倗();
      一倁.一倀(true);
    } 
  }
  
  private static void 一倚() {
    一倉.一倀();
    boolean bool = (一倗 || 一倁.一倀() || 一倘 || 一們 || 一倔 || 一倜 || 一倝 || 一倛) ? true : false;
    一倁.一倈();
    if (!bool)
      return; 
    一倁.一倀(一倆.一倀("oHekDbtNkeg2nd0Hgim1K67LHsYKSMQZewZLg7qACfw9mR0XqxiFo2LTt5rE6MUBkQ9hHPFr"));
    一倗 = false;
    一倘 = 一們 = 一倒 = 一倔 = 一倕 = false;
    一候 = 一倚 = 一倓 = false;
    一倖 = false;
    一借 = 0L;
    一倅.一倀();
    一倆.一倀();
    一倜 = 一倝 = false;
    一倇.一倀();
    一倏.一倔();
    一倂.一倀();
    WheatBackgroundBridge.一倀();
    一倄.一倀();
    丁倁 = 丁倂 = 丁倃 = -1;
    一倗();
    一倘();
    丁倀 = 一倞 = 一倆.一倀("7ocTaErTXCl5fndCxTo7HVlw1Sn7X44ljrZ70l37TOlYAUTe+amvkYQSvN/muj3WIji5LPLK");
    一倃(一倆.一倀("LxVnfH4DUY0/CF8x9P99BnybTqhW5i+Q/ZN/6UtnJKk4CZqkd+/m8LCraTQU9ng/ctBOKEaOk3Ip1zmQp7Rx15zbn6uDKQM="));
  }
  
  private static List<一倃.一倃> 一倁(long paramLong) {
    ArrayList<一倃.一倃> arrayList = new ArrayList();
    for (byte b = 0; b < 一倊.plots.size(); b++) {
      一倂.一倀 一倀 = 一倊.plots.get(b);
      一倆.一倀 一倀1 = (b < 一倌.size()) ? 一倌.get(b) : null;
      一倃.一倄 一倄1 = (一倀1 == null) ? 一倃.一倄.UNKNOWN : (!一倀1.一倇().isEmpty() ? 一倃.一倄.LOCKED : ((一倀1.一倆() <= 0L) ? 一倃.一倄.EMPTY : ((一倀1.一倆() > paramLong) ? 一倃.一倄.GROWING : 一倃.一倄.READY)));
      arrayList.add(new 一倃.一倃(b, 一倀.enabled, 一倄1, (一倀1 == null) ? 0L : 一倀1.一倆()));
    } 
    return arrayList;
  }
  
  private static 一倆.一倃 一倀(int paramInt, long paramLong) {
    if (!WheatBackgroundBridge.一倁(paramInt, paramLong))
      return new 一倆.一倃(false, -1, -1, 0L, false, 一倆.一倀("MwqJi9lsIDMiFYqnuzWwl5igAcfmnv3F33W2qy21m5uUZrM8mHdjSY9UzJlo2M0ovrfnt+xQWU1Wrm0=")); 
    WheatBackgroundBridge.一倀 一倀 = WheatBackgroundBridge.一倅(paramInt, paramLong);
    return !一倀.一倀() ? new 一倆.一倃(false, -1, -1, 0L, false, 一倀.一倅()) : new 一倆.一倃(true, paramInt, 一倀.一倂(), 一倀.一倃(), 一倀.一倄(), 一倀.一倅());
  }
  
  private static boolean 一倛() {
    return 一倄.一倀(一倀.f_91080_);
  }
  
  private static void 一倜() {
    一倓 = true;
    一倁.一倀(一倄(), 一倊.timeRoomFishingCommand);
    丁倀 = 一倆.一倀("+JJ5FbEEUL/ftUn6ROq4dnGHvHLFfnrm1FsnvMwbSQMQjM0X+YOV0CIweByNcvvqdIbMm7u7J/JcM8ZNy9w=");
  }
  
  static void 一倀(br.com.farmdmz.core.一倇.一倀 param一倀, String paramString) {
    switch (null.一倂[param一倀.一倀().ordinal()]) {
      case 1:
        if (!一倁.一倀(param一倀.一倁()))
          return; 
        if (一倓)
          丁倀 = paramString; 
        break;
      case 2:
        if (!一倜)
          return; 
        一倜 = 一倝 = false;
        一倇.一倀();
        一倏.一倔();
        一倞 = paramString;
        if (!一倁.一倀() && (!一倘 || 一候))
          一倁.一倀(true); 
        break;
      case 3:
        if (一倘)
          一倁(paramString); 
        if (一倗)
          一倀(paramString); 
        一倗();
        break;
    } 
    一倘();
    一倃(paramString);
    if (一倀.f_91074_ != null)
      一倀.f_91074_.m_5661_((Component)Component.m_237113_("M6SB/qvx4XAgxV91dQokJhEjKsbYjVtqqbX1LdOACIhY1h/Ht0c9xRagC+I="), false); 
  }
  
  private static void 一倂(String paramString) {
    if (一倝)
      一倇.一倀(); 
    一倏.一倔();
    一倝 = false;
    if (一倜)
      一倞 = paramString; 
  }
  
  private static List<一倆.一倀> 一倀(List<一倆.一倀> paramList) {
    ArrayList<一倆.一倀> arrayList = new ArrayList();
    for (一倂.一倀 一倀 : 一倊.plots)
      arrayList.add(paramList.stream().filter(param一倀1 -> (param一倀1.一倀() == param一倀.number - 1)).findFirst().orElse(null)); 
    return arrayList;
  }
  
  private static void 一倂(long paramLong) {
    一倂.一倀();
    一倆.一倃 一倃1 = 一倆.一倀(一倀.f_91080_);
    if (一倃1.一倀())
      一倀.f_91080_.m_7379_(); 
    一倉.一倀(br.com.farmdmz.core.一倇.一倁.WHEAT, 一倊.teleportCommand, paramLong);
    一倃.一倀(paramLong);
  }
  
  private static void 一倁(int paramInt) {
    if (paramInt < 0 || 一倀.m_91403_() == null)
      throw new IllegalStateException(一倆.一倀("CH5A31VZoZQMoFIsaDKY7+mtKOTXQvIkRnmF0T8G9k1AoOT9YVv9kLHRNlrVneNVFGRKcSPwb8SHRvkdr+E=")); 
    一倆.一倃 一倃1 = 一倆.一倀(一倀.f_91080_);
    if (一倃1.一倀())
      一倀.f_91080_.m_7379_(); 
    if (一倛() && 一倊.background) {
      丁倁 = paramInt;
      一倁(paramInt, System.currentTimeMillis());
      return;
    } 
    if (一倊.background)
      WheatBackgroundBridge.一倀(paramInt, 一倊.openTimeoutTicks * 50L); 
    一倀.m_91403_().m_246623_(一倂.一倀(一倊.plotCommand, paramInt));
  }
  
  private static void 一倁(int paramInt, long paramLong) {
    if (WheatBackgroundBridge.一倂(paramInt, paramLong))
      return; 
    WheatBackgroundBridge.一倀(paramInt, 一倊.openTimeoutTicks * 50L);
    一倀.m_91403_().m_246623_(一倂.一倀(一倊.plotCommand, paramInt));
  }
  
  private static String 一倝() {
    GameProfile gameProfile = 一倀.m_294346_();
    return (gameProfile.getId() != null) ? gameProfile.getId().toString() : 一倀.m_91094_().m_92546_().toLowerCase(Locale.ROOT);
  }
  
  private static String 一倞() {
    ServerData serverData = 一倀.m_91089_();
    return (serverData != null) ? serverData.f_105363_.trim().toLowerCase(Locale.ROOT) : (一倀.m_91091_() ? 一倆.一倀("cHh04Hj99FFSJg6toF94M9zQyUureXU7Fx1CgEP3rSQMbwTS5bKTbA==") : 一倆.一倀("8Xz/InGqlISR2jKedvyTuyTih74bCnvlhjKB+Q=="));
  }
  
  private static void 一倃(String paramString) {
    一倍 = (paramString == null) ? 一倆.一倀("NMJZ+S0onE6Q4aB6brfxC2WxAL4EfAAJZE6sng==") : paramString;
    String str = 一倃() ? 一倆.一倀("PKEGQTRTfjxtYnzOEQcBJEsgQTe/BfaIKRVWRNLO21mZQvOk") : 一倍;
    if (!str.equals(一倎) && !一倍.isBlank()) {
      一倎 = str;
      一倉.addFirst(一倍);
      while (一倉.size() > 7)
        一倉.removeLast(); 
      LogUtils.getLogger().info(一倆.一倀("k5e5DTpdBzNVzZMMjq+grafoi+WCtiBRP4/q1TK6zEUmCOyOBhZF5AAx89L2"), 一倍);
    } 
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倇.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */