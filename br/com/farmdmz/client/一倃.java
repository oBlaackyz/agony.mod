package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倆;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;

public final class 一倃 extends Screen {
  private static final ResourceLocation 一倀 = new ResourceLocation(一倆.一倀("pZvT5pWZ6wRLcOfRIQxljl9EAwPNYBtGHIk+PV9Xpb+IV5g="), 一倆.一倀("azjuqc18t34N4Z4GX9FIUsyyzuyZQrYttTiB5Q1YIGqcTSI4MeNqLvBHDxtl3SL6UBaB+TKV3Sw="));
  
  private static final ResourceLocation 一倁 = 一個.一倀(一倆.一倀("9E3Co8VStXuGztTGFSRqDzdS21MPGIuiFBPuiYoR0KSDHCOwuphAgjgd"));
  
  private final Screen 一倂;
  
  private EditBox 一倃;
  
  private EditBox 一倄;
  
  private 一倀 一倅;
  
  private String 一倆;
  
  private String 一倇;
  
  private String 一倈 = 一倆.一倀("lTmyLGQhm61r81ukMX41Hb/GPwmCoWXPNDQ/Dw==");
  
  private boolean 一倉;
  
  private float 一倊;
  
  private int 一個;
  
  private int 一倌;
  
  private PostChain 一倍;
  
  private int 一倎;
  
  private int 一倏;
  
  private boolean 一倐;
  
  public 一倃(Screen paramScreen) {
    super((Component)Component.m_237113_(一倆.一倀("p4lUvgEAOHA0OuVHP2IVAl1s50UN221kyextH/JSrK+m/hEk2Shc+sbxPj+O5uSJxU8OtRLVdA==")));
    this.一倂 = paramScreen;
    br.com.farmdmz.config.一倀 一倀1 = 一倂.一倀();
    this.一倆 = 一倀1.message;
    this.一倇 = Integer.toString(一倀1.intervalSeconds);
  }
  
  public Screen 一倀() {
    return this.一倂;
  }
  
  protected void m_7856_() {
    if (this.一倃 != null)
      this.一倆 = this.一倃.m_94155_(); 
    if (this.一倄 != null)
      this.一倇 = this.一倄.m_94155_(); 
    double d = (this.f_96541_ == null) ? 1.0D : this.f_96541_.m_91268_().m_85449_();
    this.一倊 = (float)Math.min(1.0D / d, Math.min(this.f_96543_ / 1000.0D, this.f_96544_ / 623.0D));
    this.一倊 = Math.max(0.1F, this.一倊);
    this.一個 = Math.round((this.f_96543_ - 1000.0F * this.一倊) / 2.0F);
    this.一倌 = Math.round((this.f_96544_ - 623.0F * this.一倊) / 2.0F);
    m_142416_((GuiEventListener)new 一倀(241, 124, 34, 34, 一倆.一倀("GLDJFo5iv7HiUo/FOFhv5Y5VjUevNzLpurkPLEc="), false, paramButton -> m_7379_()));
    ((一倀)m_142416_((GuiEventListener)new 一倀(941, 23, 34, 34, 一倆.一倀("TfdA1RA070Fem8XKMYDeN7k6kDId8OUW7NXUNg=="), false, paramButton -> m_7379_()))).一倁 = true;
    this.一倃 = (EditBox)m_142416_((GuiEventListener)new EditBox(this.f_96547_, 253, 244, 700, 30, (Component)Component.m_237113_(一倆.一倀("7rdvMvoLQ4a/SnBbL+EJWbf3hTFtRMN214q/jWtD7SHlLiUZNdV23GshnYTPpqZj0oE="))));
    this.一倃.m_94199_(254);
    this.一倃.m_94202_(-728112);
    this.一倃.m_257771_(一個.一倀(一倆.一倀("FTt/d4bbOF+tG93I36rstW1wVSDNwU8yah8N2P7yQiFrWHM7pwvdskvP9geB"), 一個.一倐));
    this.一倃.m_94144_(this.一倆);
    this.一倄 = (EditBox)m_142416_((GuiEventListener)new EditBox(this.f_96547_, 253, 335, 210, 30, (Component)Component.m_237113_(一倆.一倀("cvj9XCIWbYrlb8sEyOSz8DdxeVmFyFWBGAUP2vPww6aCo7qycwy21z7FIOv8bmXyMg=="))));
    this.一倄.m_94199_(5);
    this.一倄.m_94153_(paramString -> (paramString.isEmpty() || paramString.matches(一倆.一倀("QW6hfaH4dcurzlpph96AAs9GqSbKjVnvwPtxwYFBQmV++g=="))));
    this.一倄.m_94202_(-728112);
    this.一倄.m_94144_(this.一倇);
    m_142416_((GuiEventListener)new 一倀(605, 581, 180, 26, 一倆.一倀("B1R5lcJhKp1rqa0QOAkeGQ2JwMBCGPAslP6QISbhKhl5Dg=="), false, paramButton -> 一倀(true)));
    this.一倅 = (一倀)m_142416_((GuiEventListener)new 一倀(794, 581, 180, 26, 一倆.一倀("aW89FF/tFSK4B4n63zdkT8zYFbPxqcP1peyjxc61aDQJ"), true, paramButton -> 一倃()));
    一倄();
    m_264313_((GuiEventListener)this.一倃);
  }
  
  private boolean 一倀(boolean paramBoolean) {
    try {
      br.com.farmdmz.config.一倀 一倀1 = 一倂.一倀().一倀();
      一倀1.message = this.一倃.m_94155_();
      String str = this.一倄.m_94155_();
      if (str.isBlank())
        throw new IllegalArgumentException(一倆.一倀("3ogNSgYpEeTXFhsueSimCjcTJPsG/C137oPy1ucHq/JA5utczG9m2GzxFDaEfEh91GSLttoDPKWD8E83")); 
      try {
        一倀1.intervalSeconds = Integer.parseInt(str);
      } catch (NumberFormatException numberFormatException) {
        throw new IllegalArgumentException(一倆.一倀("qIpthLMp3lxiquCDFIEVWEyFHq9GAc82x1dXNMsDDgrtguRVASZpvTcf0Y8BARPWSHvQXBNKJ10P/LAbeyM9iRP/AS3b"));
      } 
      一倂.一倀(一倀1);
      br.com.farmdmz.config.一倀 一倀2 = 一倂.一倀();
      this.一倆 = 一倀2.message;
      this.一倇 = Integer.toString(一倀2.intervalSeconds);
      this.一倃.m_94144_(this.一倆);
      this.一倄.m_94144_(this.一倇);
      this.一倉 = false;
      if (paramBoolean)
        this.一倈 = 一倂.一倁() ? 一倆.一倀("h633C/jR9+V2LlqISUV3MpYhD45uaZ1S+Q7UUEOqHHWJ2klCzZDfpPH5e4X02FZMFpVmOtKth6uuEJwSocRKqy438ei7WNuEd4uctFc0mwMeD41mxV9ItFc=") : 一倆.一倀("5W0lrHjSgdZGgBROxEqDmYsMhIdAun5veyJ4oGpy67Z7eRbwF1Q7ZyMpSKfq7/PovXEj1Kgq3oAplOQt5CAwPLXkKVtt4jyg/nNNIuodtGoAKkY="); 
      return true;
    } catch (IOException|IllegalArgumentException iOException) {
      this.一倈 = (iOException.getMessage() == null) ? 一倆.一倀("PmRLYzKdqMQPIX6uVY7IyNLMv8Ma+4y7Uoy5pwixueO404CZTNmkzNobqTllrsq5O7iY2sOCaveVTr8lDcMw7EM=") : iOException.getMessage();
      this.一倉 = true;
      return false;
    } 
  }
  
  private void 一倃() {
    try {
      if (一倂.一倁()) {
        一倂.一倅();
      } else {
        if (!一倀(false))
          return; 
        一倂.一倅();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      this.一倈 = illegalArgumentException.getMessage();
      this.一倉 = true;
      return;
    } 
    this.一倈 = 一倂.一倂();
    this.一倉 = (!一倂.一倁() && !this.一倈.toLowerCase(Locale.ROOT).contains(一倆.一倀("LNPQKNyZlbn3l1ad7jeyiV/3zvgzLfXfNb28Ge3BKLR2dw==")));
    一倄();
  }
  
  private void 一倄() {
    if (this.一倅 != null)
      this.一倅.m_93666_(一個.一倀(一倂.一倁() ? 一倆.一倀("GZ8tXgpOg6G2NqCiWRl64Od0c4ADcITJPzTosYeEBQli3w==") : 一倆.一倀("bM1aA0O5HY99fCQ2W/auX39gqQCELBPGo74XkJBRlyqH"), 一個.一倊)); 
  }
  
  public void m_86600_() {
    一倄();
  }
  
  public void m_88315_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    if (this.f_96541_ != null && this.f_96541_.f_91073_ == null && this.一倂 != null) {
      Screen screen2 = this.一倂;
      一倊 一倊 = (一倊)screen2;
      Screen screen1 = (screen2 instanceof 一倊) ? 一倊.一倀() : this.一倂;
      if (screen1 instanceof 一倀) {
        一倀 一倀1 = (一倀)screen1;
        screen1 = 一倀1.一倀();
      } 
      if (screen1 != null)
        screen1.m_88315_(paramGuiGraphics, paramInt1, paramInt2, paramFloat); 
    } 
    一倀(paramGuiGraphics, paramFloat);
    paramGuiGraphics.m_280168_().m_85836_();
    paramGuiGraphics.m_280168_().m_252880_(this.一個, this.一倌, 300.0F);
    paramGuiGraphics.m_280168_().m_85841_(this.一倊, this.一倊, 1.0F);
    一倀(paramGuiGraphics);
    一倅.一倀(paramGuiGraphics, 24, 23, 33);
    一個.一倀(paramGuiGraphics, 5, 92, 211, 32, 7, 921087096);
    一個.一倀(paramGuiGraphics, 6, 93, 209, 29, 5, -1735240141);
    一倀(paramGuiGraphics, 15, 101);
    一個.一倀(paramGuiGraphics, 一個.一倁(一倆.一倀("2TPLyBPM2QLRphgqpIHFIJD7vd3MyXbLbRasJoJFSXPhk4WSL/sPvA==")), 45, 102, -728112, 一個.一倊);
    一個.一倀(paramGuiGraphics, 一倆.一倀("7WG1CigTbJaTIy3Bd1X3n2dOkJiKnWKWZDkGBYq/19ic4OaG3bvBOvQ="), 295, 132, -728112, 一個.一倍);
    paramGuiGraphics.m_280509_(228, 173, 978, 174, 1222220388);
    一個.一倀(paramGuiGraphics, 一倆.一倀("2+JL9i6Yy90Py0Od4ZZ0l4CzYy+R/VV+b0fjWe1NbmuT4Thk0F4q9QzyraHVtX0YT4KRRATAmtQa2AUSy71hbK1M+OsPkascrVpz3R4A1CXePqM="), 253, 188, -2375512, 一個.一倐);
    一個.一倀(paramGuiGraphics, 一倆.一倀("t5qKIIpFseNdj9Dq+WZ1bA0VnyN+o2+U1Tb9MAxn15OtVH79UsRPpt0k"), 253, 218, -728112, 一個.一倊);
    一個.一倀(paramGuiGraphics, 一倆.一倀("P9yz5UBVHaQskscCZBkDRPw53uEjexWu/9xb6lT/Uc/Vj+E4nytTFiqh8bBXxgU/lW5Of3GcTULOPsFdRccXbDOxiIFcRlVrAksVseucRGy69SqAnytN586fCxCXnACWTMdsT/o7"), 253, 287, -2375512, 一個.一倐);
    一個.一倀(paramGuiGraphics, 一倆.一倀("Ak7c38SJWt9xQgcSXour5skFJBf7KepevKoy64DA+FkHARE16uS3HTXl1IocdwPT"), 253, 309, -728112, 一個.一倊);
    一個.一倀(paramGuiGraphics, 一倆.一倀("LEaarh0ZZFkI/GTD2z8VGGVL7/VMdawqKhV8jVZN13cCxeTglhuQQzgMmMWYZZLyXJZq2JjaAgNgOHhE+1YBGNUOfLmoSbjguD4t9JBiltbT+l9l"), 481, 344, -2375512, 一個.一倐);
    一個.一倀(paramGuiGraphics, 一倆.一倀("rhQz8OWQonPCjyQ7wopuLTCkz24NhL170V3wamLgLGfW8cqCZcdrggNAce0a0dciEToudvcfMdRMhlbvYqybRk193mxMEymH1epmwu5KSahPLGjXRdvvuhVBXItlllcZ"), 253, 393, -2375512, 一個.一倐);
    一個.一倀(paramGuiGraphics, 一倆.一倀("nEfow01igg+c+lRhrgi5TVTiSMI10WIKjR5vsNq8pKzaZapPojSWwGmwojSkGneEOK6K41DRlPrPSSRy1nYRmJuHpP3x5HBZwDdLzefwTExVIGRQguY7+ebiOkdXNz851q7NnT6HPvL9lCdt"), 253, 421, -2375512, 一個.一倐);
    paramGuiGraphics.m_280509_(253, 452, 953, 453, 1222220388);
    int i = 一倂.一倁() ? -8134991 : -2375512;
    一倀(paramGuiGraphics, 一倂.一倂(), 253, 467, i, 700, 2);
    if (一倂.一倁())
      一個.一倀(paramGuiGraphics, "PqkctcsAybKrO/BvshdjAY001J86DMAi+fEJ8IU51qJ4Sq0GOO144c/O4p4w", 253, 500, i, 一個.一倐); 
    if (!this.一倈.isBlank())
      一倀(paramGuiGraphics, this.一倈, 253, 538, this.一倉 ? -1339998 : -6364226, 700, 2); 
    int j = (int)一倀(paramInt1);
    int k = (int)一倁(paramInt2);
    for (GuiEventListener guiEventListener : m_6702_()) {
      if (guiEventListener instanceof Renderable) {
        Renderable renderable = (Renderable)guiEventListener;
        renderable.m_88315_(paramGuiGraphics, j, k, paramFloat);
      } 
    } 
    paramGuiGraphics.m_280168_().m_85849_();
    paramGuiGraphics.m_280262_();
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics) {
    一個.一倀(paramGuiGraphics, 0, 4, 997, 615, 9, 1882202648);
    一個.一倀(paramGuiGraphics, 2, 5, 992, 612, 8, 1346316058);
    一個.一倀(paramGuiGraphics, 5, 8, 986, 606, 6, -1306126061);
    一個.一倁(paramGuiGraphics);
    paramGuiGraphics.m_280509_(5, 8, 991, 74, 1614356245);
    paramGuiGraphics.m_280509_(5, 74, 991, 75, 1222220388);
    paramGuiGraphics.m_280509_(216, 75, 217, 612, 1222220388);
    一個.一倀(paramGuiGraphics, 5, 93, 211, 388, 8, -2142819555);
    一個.一倀(paramGuiGraphics, 228, 112, 750, 445, 10, -2142819555);
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    List<FormattedCharSequence> list = this.f_96547_.m_92923_((FormattedText)一個.一倀(paramString, 一個.一倐), paramInt4);
    for (byte b = 0; b < Math.min(paramInt5, list.size()); b++)
      paramGuiGraphics.m_280649_(this.f_96547_, list.get(b), paramInt1, paramInt2 + b * 16, paramInt3, false); 
  }
  
  private static void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2) {
    一個.一倀(paramGuiGraphics, paramInt1, paramInt2, 22, 15, 4, -8664600);
    paramGuiGraphics.m_280509_(paramInt1 + 4, paramInt2 + 13, paramInt1 + 9, paramInt2 + 18, -8664600);
    for (byte b = 0; b < 3; b++)
      paramGuiGraphics.m_280509_(paramInt1 + 5 + b * 5, paramInt2 + 6, paramInt1 + 7 + b * 5, paramInt2 + 8, -14597551); 
  }
  
  private static String 一倀(long paramLong) {
    long l = Math.max(0L, (paramLong + 999L) / 1000L);
    return String.format(Locale.ROOT, 一倆.一倀("fgG5vKTdsEun7m72rQypZDqWgi04beyVPuJNOwl04NI4iW3P3w=="), new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) });
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, float paramFloat) {
    if (this.f_96541_ == null || this.一倐)
      return; 
    try {
      paramGuiGraphics.m_280262_();
      RenderTarget renderTarget = this.f_96541_.m_91385_();
      if (this.一倍 == null)
        this.一倍 = new PostChain(this.f_96541_.m_91097_(), this.f_96541_.m_91098_(), renderTarget, 一倀); 
      if (this.一倎 != renderTarget.f_83915_ || this.一倏 != renderTarget.f_83916_) {
        this.一倎 = renderTarget.f_83915_;
        this.一倏 = renderTarget.f_83916_;
        this.一倍.m_110025_(this.一倎, this.一倏);
      } 
      this.一倍.m_110023_(paramFloat);
      renderTarget.m_83947_(true);
      RenderSystem.clear(256, Minecraft.f_91002_);
    } catch (Exception exception) {
      this.一倐 = true;
      if (this.一倍 != null) {
        this.一倍.close();
        this.一倍 = null;
      } 
      this.f_96541_.m_91385_().m_83947_(true);
    } 
  }
  
  private double 一倀(double paramDouble) {
    return (paramDouble - this.一個) / this.一倊;
  }
  
  private double 一倁(double paramDouble) {
    return (paramDouble - this.一倌) / this.一倊;
  }
  
  public boolean m_6375_(double paramDouble1, double paramDouble2, int paramInt) {
    return super.m_6375_(一倀(paramDouble1), 一倁(paramDouble2), paramInt);
  }
  
  public boolean m_6348_(double paramDouble1, double paramDouble2, int paramInt) {
    return super.m_6348_(一倀(paramDouble1), 一倁(paramDouble2), paramInt);
  }
  
  public boolean m_7979_(double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4) {
    return super.m_7979_(一倀(paramDouble1), 一倁(paramDouble2), paramInt, paramDouble3 / this.一倊, paramDouble4 / this.一倊);
  }
  
  public boolean m_7933_(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 268) {
      一倂();
      return true;
    } 
    if (paramInt1 == 260) {
      一倁();
      return true;
    } 
    if (paramInt1 == 256) {
      m_7379_();
      return true;
    } 
    return super.m_7933_(paramInt1, paramInt2, paramInt3);
  }
  
  public void m_7379_() {
    if (this.f_96541_ != null)
      this.f_96541_.m_91152_(this.一倂); 
  }
  
  public void 一倁() {
    if (this.f_96541_ == null)
      return; 
    Screen screen = this.一倂;
    if (screen instanceof 一倊) {
      一倊 一倊 = (一倊)screen;
      this.f_96541_.m_91152_(一倊.一倀());
    } else {
      this.f_96541_.m_91152_((this.一倂 instanceof 一倀) ? this.一倂 : new 一倀(this.一倂));
    } 
  }
  
  public void 一倂() {
    if (this.f_96541_ == null)
      return; 
    Screen screen2 = this.一倂;
    一倊 一倊 = (一倊)screen2;
    Screen screen1 = (screen2 instanceof 一倊) ? 一倊.一倀() : this.一倂;
    一倀 一倀1 = (一倀)screen1;
    this.f_96541_.m_91152_((screen1 instanceof 一倀) ? 一倀1.一倀() : screen1);
  }
  
  public void m_7861_() {
    if (this.一倍 != null) {
      this.一倍.close();
      this.一倍 = null;
    } 
    this.一倎 = this.一倏 = 0;
  }
  
  public boolean m_7043_() {
    return false;
  }
  
  private static final class 一倀 extends Button {
    private final boolean 一倀;
    
    private boolean 一倁;
    
    一倀(int param1Int1, int param1Int2, int param1Int3, int param1Int4, String param1String, boolean param1Boolean, Button.OnPress param1OnPress) {
      super(param1Int1, param1Int2, param1Int3, param1Int4, 一個.一倀(param1String, 一個.一倊), param1OnPress, f_252438_);
      this.一倀 = param1Boolean;
    }
    
    protected void m_87963_(GuiGraphics param1GuiGraphics, int param1Int1, int param1Int2, float param1Float) {
      int i = (this.f_93623_ && !this.一倀) ? -420822893 : 921087096;
      一個.一倀(param1GuiGraphics, m_252754_(), m_252907_(), m_5711_(), m_93694_(), 5, i);
      int j = this.一倀 ? -447769348 : -171801775;
      if (m_198029_())
        j = this.一倀 ? -9918977 : -2647194; 
      if (!this.f_93623_ && !this.一倀)
        j = -2007811541; 
      一個.一倀(param1GuiGraphics, m_252754_() + 1, m_252907_() + 1, m_5711_() - 2, m_93694_() - 2, 4, j);
      int k = !this.f_93623_ ? -1864646488 : (this.一倀 ? -728112 : -13887729);
      if (this.一倁) {
        一個.一倀(param1GuiGraphics, 一倃.一倁, m_252754_() + 9, m_252907_() + 8, 17, 17, 17, 17, k);
      } else {
        param1GuiGraphics.m_280614_((Minecraft.m_91087_()).f_91062_, m_6035_(), m_252754_() + (m_5711_() - (Minecraft.m_91087_()).f_91062_.m_92852_((FormattedText)m_6035_())) / 2, m_252907_() + (m_93694_() - 9) / 2, k, false);
      } 
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倃.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */