package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倄;
import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.client.update.一倀;
import br.com.farmdmz.core.一倈;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public final class 一倊 extends Screen {
  private static final ResourceLocation 一倀 = new ResourceLocation(一倆.一倀("2S0gol3XZYbx6u/ghj1hCgx5h/+P1MO+xblBJtH3mY0PoD4="), 一倆.一倀("F5YDDj/UNXTYLQaVFTYH0AKkHEDfjWoUZbBGWBm3bjypRoIJd6GSkxtUz/hpH9RdrXRyI1LjfHU="));
  
  private static final ResourceLocation 一倁 = 一個.一倀(一倆.一倀("r7KX+NF2Eq/v+J+6g/ObNMJoXVgYwVKbuSn+pM9spRCU7TnSL1qH+sQ/"));
  
  private static final ResourceLocation 一倂 = 一個.一倀(一倆.一倀("3T4Ur63qcMVDRTkls7rEuO7/Dq71C5SJXmAulAciCzrz5MIEFTjVYMlVsuU76e7g9CU="));
  
  private static final int 一倃 = 4;
  
  private static final String[] 一倄 = new String[] { 一倆.一倀("x0hBIFnV+8NfK27d/Stf8RNosoLDp8E+U/nZZCMDNNrr"), 一倆.一倀("OqcqRgGQWTBnTN0ob0UBoSFOuSLcqqzx9i03YBl9XaEt"), 一倆.一倀("em+zEf0S55xOARMKm8HQqbFLqn/S90xD0U0RX5oKjXh3tFErlMQ8S4o="), 一倆.一倀("XMyMaqSVnxXg+gJo3MM48IV9dOLrk7sEgEIKchVNcw=="), 一倆.一倀("xKj9NeStKW0/+h0AX4470y2vC6i7qzRyBF5UviLgRI6t9QMDFfwSOA==") };
  
  private static final ResourceLocation[] 一倅 = new ResourceLocation[] { 一個.一倀(一倆.一倀("DZWWxYpcEyTlC/s4EakXLehAsGIPE0mHl9VgGQt3iStVHwacnRU1O6wm4ICe0g==")), 一個.一倀(一倆.一倀("NK6+TJ1XyXVLUR94CG2rH0DY0Q3KJxdvQ/z5IOEcSuSe85eisxYWnk1h5n4+7w==")), 一個.一倀(一倆.一倀("IdTLJNRxOrry7GkaQN1BN8LwvJl/wwPvcsPppuFMSvaFKy7Npu54IeozPH6leplDQHs=")), 一個.一倀(一倆.一倀("ApVgtpwyOl6rAD2CDE7nQGNGGb/uOQzoMPbmIvh5r1kFieSBH/TxzP9yDMY=")) };
  
  private static final int 一倆 = 355;
  
  private static final int 一倇 = 226;
  
  private final 一倀 一倈;
  
  private PostChain 一倉;
  
  private int 一倊;
  
  private int 一個;
  
  private boolean 一倌;
  
  private float 一倍;
  
  private int 一倎;
  
  private int 一倏;
  
  private int 一倐;
  
  private 一倈.一倀 一們;
  
  private 一倈.一倀 一倒;
  
  private double 一倓;
  
  private boolean 一倔;
  
  private boolean 一倕;
  
  private double 一倖;
  
  public 一倊(一倀 param一倀) {
    this(param一倀, 0);
  }
  
  public 一倊(一倀 param一倀, int paramInt) {
    super((Component)Component.m_237113_(一倆.一倀("Y+AJypFiMZitC4zHi2Y6Lp3ug5G/Kz5siwfL53A/YAzUlf19cm7hDhiB/IKTu0g=")));
    this.一倈 = param一倀;
    this.一們 = this.一倒 = 一倈.一倀(一倂.一倇(), 一倂.一倆());
    this.一倐 = Math.max(0, Math.min(一倄.length - 1, paramInt));
    List<Integer> list = 一倃();
    int i = list.indexOf(Integer.valueOf(this.一倐));
    if (i < 0) {
      this.一倐 = ((Integer)list.get(0)).intValue();
    } else {
      this.一倓 = 一倈.一倀(this.一們, 一倈.一倀(i, 0.0D) + 226.0D - 610.0D);
    } 
  }
  
  public 一倀 一倀() {
    return this.一倈;
  }
  
  public int 一倁() {
    return this.一倐;
  }
  
  public 一倈.一倀 一倂() {
    return this.一們;
  }
  
  public List<Integer> 一倃() {
    return 一倈.一倀(this.一們);
  }
  
  public double 一倄() {
    return this.一倓;
  }
  
  protected void m_7856_() {
    double d = (this.f_96541_ == null) ? 1.0D : this.f_96541_.m_91268_().m_85449_();
    this.一倍 = (float)Math.min(1.0D / d, Math.min(this.f_96543_ / 1000.0D, this.f_96544_ / 623.0D));
    this.一倍 = Math.max(0.1F, this.一倍);
    this.一倎 = Math.round((this.f_96543_ - 1000.0F * this.一倍) / 2.0F);
    this.一倏 = Math.round((this.f_96544_ - 623.0F * this.一倍) / 2.0F);
    this.一倓 = 一倈.一倀(this.一們, this.一倓);
    this.一倕 = false;
  }
  
  public void m_86600_() {
    if (一倀.一倁()) {
      一倀.一倀(this.一倈.一倀());
      return;
    } 
    一倈.一倀 一倀1 = 一倈.一倀(一倂.一倇(), 一倂.一倆());
    if (一倀1 != this.一倒) {
      this.一倒 = 一倀1;
      if (!this.一倔)
        一倀(一倀1); 
    } 
  }
  
  public void m_88315_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    if (this.f_96541_ != null && this.f_96541_.f_91073_ == null && this.一倈.一倀() != null)
      this.一倈.一倀().m_88315_(paramGuiGraphics, paramInt1, paramInt2, paramFloat); 
    一倀(paramGuiGraphics, paramFloat);
    paramGuiGraphics.m_280168_().m_85836_();
    paramGuiGraphics.m_280168_().m_252880_(this.一倎, this.一倏, 300.0F);
    paramGuiGraphics.m_280168_().m_85841_(this.一倍, this.一倍, 1.0F);
    一倀(paramGuiGraphics);
    一倁(paramGuiGraphics);
    一倂(paramGuiGraphics);
    paramGuiGraphics.m_280588_(Math.round(this.一倎 + 225.0F * this.一倍), Math.round(this.一倏 + 93.0F * this.一倍), Math.round(this.一倎 + 955.0F * this.一倍), Math.round(this.一倏 + 610.0F * this.一倍));
    List<Integer> list = 一倃();
    double d1 = 一倀(paramInt1);
    double d2 = 一倁(paramInt2);
    for (byte b = 0; b < list.size(); b++) {
      int i = (int)Math.round(一倈.一倀(b, this.一倓));
      if (i < 610 && i + 226 > 93)
        一倀(paramGuiGraphics, ((Integer)list.get(b)).intValue(), 一倈.一倀(b), i, d1, d2); 
    } 
    paramGuiGraphics.m_280618_();
    一倃(paramGuiGraphics);
    paramGuiGraphics.m_280168_().m_85849_();
    paramGuiGraphics.m_280262_();
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, float paramFloat) {
    if (this.f_96541_ == null || this.一倌)
      return; 
    try {
      paramGuiGraphics.m_280262_();
      RenderTarget renderTarget = this.f_96541_.m_91385_();
      if (this.一倉 == null)
        this.一倉 = new PostChain(this.f_96541_.m_91097_(), this.f_96541_.m_91098_(), renderTarget, 一倀); 
      if (this.一倊 != renderTarget.f_83915_ || this.一個 != renderTarget.f_83916_) {
        this.一倊 = renderTarget.f_83915_;
        this.一個 = renderTarget.f_83916_;
        this.一倉.m_110025_(this.一倊, this.一個);
      } 
      this.一倉.m_110023_(paramFloat);
      renderTarget.m_83947_(true);
      RenderSystem.clear(256, Minecraft.f_91002_);
    } catch (Exception exception) {
      this.一倌 = true;
      if (this.一倉 != null) {
        this.一倉.close();
        this.一倉 = null;
      } 
      this.f_96541_.m_91385_().m_83947_(true);
      System.err.println("n2NPT2S+IzPCXwqgPGehGDhZggf4JPe6lpNFD96wOzHtAeluI65yS0AHfWpn7B+tZRaGqrElm7EwPlrNZ3lWou3nYnjm8VM=");
    } 
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics) {
    一個.一倀(paramGuiGraphics, 0, 4, 997, 615, 9, 1882202648);
    一個.一倀(paramGuiGraphics, 2, 5, 992, 612, 8, 1346316058);
    一個.一倀(paramGuiGraphics, 5, 8, 986, 606, 6, -1306126061);
    一個.一倀(paramGuiGraphics);
    paramGuiGraphics.m_280509_(5, 8, 991, 74, 1614356245);
    paramGuiGraphics.m_280509_(5, 74, 991, 75, 1222220388);
    paramGuiGraphics.m_280509_(216, 75, 217, 612, 1222220388);
    一個.一倀(paramGuiGraphics, 5, 93, 211, 519, 8, 1614356245);
  }
  
  private void 一倁(GuiGraphics paramGuiGraphics) {
    一倅.一倀(paramGuiGraphics, 24, 23, 33);
    一個.一倀(paramGuiGraphics, 800, 23, 125, 34, 7, -420822893);
    一個.一倀(paramGuiGraphics, 801, 24, 123, 32, 6, -171801775);
    一個.一倁(paramGuiGraphics, 一個.一倁(一倆.一倀("XMkDqGVnVt/5W6iqbDSNbcqc59+sExWZg6kwX9le9+bQ")), 862, 33, -13887729, 一個.一倊);
    一個.一倀(paramGuiGraphics, 941, 23, 34, 34, 7, -420822893);
    一個.一倀(paramGuiGraphics, 943, 25, 30, 30, 5, -171801775);
    一個.一倀(paramGuiGraphics, 一倁, 950, 31, 17, 17, 17, 17, -13887729);
  }
  
  private void 一倂(GuiGraphics paramGuiGraphics) {
    for (一倈.一倀 一倀1 : 一倈.一倀.values()) {
      int i = 93 + 一倀1.ordinal() * 40;
      if (一倀1 == this.一們) {
        一個.一倀(paramGuiGraphics, 4, i - 1, 212, 36, 8, 921087096);
        一個.一倀(paramGuiGraphics, 5, i, 210, 32, 5, -1735240141);
      } 
      一個.一倀(paramGuiGraphics, 一個.一倁(一倀1.一倀().toUpperCase(Locale.ROOT)), 24, i + 11, -728112, 一個.一倊);
      if (一倀1 == this.一倒 && 一倂.一倈())
        一個.一倀(paramGuiGraphics, 197, i + 13, 7, 7, 3, -14035334); 
      paramGuiGraphics.m_280509_(5, i + 34, 215, i + 35, 1222220388);
    } 
    一個.一倀(paramGuiGraphics, 一倆.一倀("sx0N1GPQl/b+sES02tshk714r7fdHNRWLVd92mR5O4BCUy2Q7Q=="), 24, 243, -2375512, 一個.一倏);
    一個.一倀(paramGuiGraphics, 一倂.一倇(), 24, 269, 一倂.一倈() ? -8134991 : -2375512, 一個.一倇);
  }
  
  private void 一倃(GuiGraphics paramGuiGraphics) {
    if (一倈.一倁(this.一們) == 0)
      return; 
    int i = (int)Math.round(一倈.一倁(this.一們, this.一倓));
    int j = (int)Math.round(一倈.一倂(this.一們));
    一個.一倀(paramGuiGraphics, 968, 105, 8, 505, 4, -1672664292);
    一個.一倀(paramGuiGraphics, 969, i, 6, j, 3, this.一倕 ? -420822893 : -857891740);
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2) {
    boolean bool = (paramDouble2 >= 93.0D && paramDouble2 < 610.0D && 一倀(paramDouble1, paramDouble2, paramInt2, paramInt3, 355, 226)) ? true : false;
    一個.一倀(paramGuiGraphics, paramInt2, paramInt3, 355, 226, 12, 921087096);
    一個.一倀(paramGuiGraphics, paramInt2 + 1, paramInt3 + 1, 353, 224, 11, bool ? -2142819555 : 1614356245);
    if (paramInt1 == 4) {
      一倀(paramGuiGraphics, paramInt2 + 151, paramInt3 + 33, 52);
    } else {
      一個.一倀(paramGuiGraphics, 一倅[paramInt1], paramInt2 + 151, paramInt3 + 33, 52, 52, 52, 52, -637534209);
    } 
    一個.一倁(paramGuiGraphics, 一倄[paramInt1], paramInt2 + 177, paramInt3 + 107, -728112, 一個.一倌);
    paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 145, paramInt2 + 355 - 1, paramInt3 + 185, bool ? -2647194 : -171801775);
    paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 145, paramInt2 + 355 - 1, paramInt3 + 146, -420822893);
    paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 183, paramInt2 + 355 - 1, paramInt3 + 184, -420822893);
    paramGuiGraphics.m_280509_(paramInt2 + 355 - 41, paramInt3 + 146, paramInt2 + 355 - 40, paramInt3 + 184, 1222220388);
    一個.一倀(paramGuiGraphics, 一倂, paramInt2 + 355 - 30, paramInt3 + 157, 18, 18, 20, 20, -13887729);
    一個.一倀(paramGuiGraphics, 一倆.一倀("6olP4wipATy1E7M0bfUrcel1+qzBUSxHDI/kAv0j2aZLPOy71z4="), paramInt2 + 157, paramInt3 + 155, -13887729, 一個.一倎, 1);
    一個.一倀(paramGuiGraphics, paramInt2 + 1, paramInt3 + 184, 353, 41, 10, 921087096);
    int i = 一倂(paramInt1);
    if (bool)
      i = 0xFF000000 | i & 0xFFFFFF; 
    一個.一倀(paramGuiGraphics, paramInt2 + 2, paramInt3 + 185, 351, 39, 9, i);
    一個.一倀(paramGuiGraphics, 一倃(paramInt1), paramInt2 + 177, paramInt3 + 194, -728112, 一個.一倎, 1);
  }
  
  private static void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt3 * 3 / 4;
    一個.一倀(paramGuiGraphics, paramInt1, paramInt2, paramInt3, i, Math.max(3, paramInt3 / 7), -13001597);
    paramGuiGraphics.m_280509_(paramInt1 + paramInt3 / 5, paramInt2 + i, paramInt1 + paramInt3 / 3, paramInt2 + paramInt3, -13001597);
    int j = Math.max(2, paramInt3 / 10);
    for (byte b = 1; b <= 3; b++) {
      int k = paramInt1 + paramInt3 * b / 4 - j / 2;
      int m = paramInt2 + i / 2 - j / 2;
      paramGuiGraphics.m_280509_(k, m, k + j, m + j, -1);
    } 
  }
  
  private static boolean 一倀(int paramInt) {
    return (paramInt == 4) ? 一倂.一倄() : 一倂.一倀(一倅(paramInt));
  }
  
  private static String 一倁(int paramInt) {
    return (paramInt == 4) ? 一倆.一倀("6wBOaYLVxCspzPEG5/bMsTUK+NIeJdlNYdh32XMHJKo=") : 一倅(paramInt).一倂();
  }
  
  private static int 一倂(int paramInt) {
    return !一倀(paramInt) ? -581222352 : (!一倄(paramInt) ? -560583100 : ((paramInt == 0 && 一倇.一倃()) ? -566927465 : ((paramInt == 1 && 一倇.一倊() && !一倇.一倄()) ? -566927465 : ((paramInt == 2 && !一倇.一倆()) ? -566927465 : ((paramInt == 3 && !一倇.一倈()) ? -566927465 : -568893380)))));
  }
  
  private static String 一倃(int paramInt) {
    if (!一倀(paramInt))
      return "2QU7SBu3FI6ZbV37n24v3vdzQ1z/RYcs+toWUACyfvHkmu4="; 
    switch (paramInt) {
      case 0:
        return 一倇.一倃() ? "ZpPcJk6QbN0pxeLMUcqU4TI0beOz+gS5BE3AqerWQuZPMDw3ub5WdUNh1YWwO1c=" : (一倇.一倁() ? 一倆.一倀("9c6UxtJa2FYTurGPzgHAfH+G4xDWydt9qdE/i0b/oEbLkMwYQHKIJoRd") : 一倆.一倀("NWzknuHgmXdUHZ3iGXhoT+hj7i0ELweW24ErcygiPjDVyI/5ORzH96QrQQ=="));
      case 1:
        return !一倇.一倌() ? 一倆.一倀("fGUQD6PIY0AuOT4aMkJDIDbm9F8dxwxAtg+ojOyTwe6LP2IRrIh4Rm+S1A==") : ((一倇.一倊() && !一倇.一倄()) ? 一倆.一倀("zIKY6HubZcZmlxfBS74KqFBhbLvcaZCUuG3RnPGxqLH/cb4pWPk8c7npesWRmTA=") : 一倆.一倀("nTdeDBf1JllRRZXE5H+3VFqerSJudOP4ViYRY9MIsaXCHFhLhse1rXLwUw=="));
      case 2:
        return !一倇.一倅() ? 一倆.一倀("8ift1bmqYseT3B7/nfkkzhR8g67+vg2aprlPQ+jbg7mR2trVc6OIHqZ28g==") : (一倇.一倆() ? 一倆.一倀("cqDe8rzxt/tR4hjVJfkBKan9Juki3V9ILJopU2nofoqFsoG4KSq8w+yv") : 一倆.一倀("UecxkqY8hgpYGh7vFNrC5j15fq2QTQ+IOhEu8lQwHlQUiOpSdOJddI7kinPuphQ="));
      case 3:
      
      case 4:
        return 一倂.一倁() ? "aeStnYOWoxx4KFqvgaHYL4ZIN9oR/ExtB6jS5dFuoOiyh0viDHI5EMQ=" : 一倆.一倀("pEZvvilaBRKxmRptSEJvBHpAtc1p7qmj6NeGF4KBBblPDpcFm24R6GD2sw==");
    } 
    return 一倆.一倀("I1ueDlpjxLfjNOGQdPpLosp7AgpWK5a7OVlKI9eT+dvtOzA=");
  }
  
  private static String 一倅() {
    if (!一倇.一倇())
      return 一倆.一倀("1Mud2i2juttFK92d07vHkArWnXGP4QnznON/1lGz4qlCkJCcQ84dN5pKjA=="); 
    if (!一倇.一倈())
      return 一倆.一倀("datw9jvR9gfSpCmvD7iir5r1c1SXXVWhkMiPLCJnl8UgbphlTd2L7UIEzLDEdTw="); 
    String str = 一倇.一倉().toLowerCase(Locale.ROOT);
    return str.contains(一倆.一倀("pcloPU05S/hSYIaIe+3fZv6+D5yFUzPO21tYbUl8Rhp5ZXt5")) ? 一倆.一倀("iztXmOgoK1wgCRfug+YqGAjhlLza/RfIqIqkCIwuU+pHEIgnX9wmwtAtBkBH") : (str.contains(一倆.一倀("FDGn/sU9igh2UHm6almu4Mvbc29b6xDOYJWhVvkeCeTX5xH+")) ? 一倆.一倀("14/FtmphzvX/pWaC/VSTJ243gJs2Fad166bGZqHPJNQ1lqaiKyLvK/mimZZh") : ((str.contains(一倆.一倀("ZbyradMkY5dX/v+KJglEHqtQZAU8CIcjokDREtfRSGA=")) || str.contains(一倆.一倀("hi2vjXrek7FEEjcABUzDBYXjXb7ANhYWj6EhpnBD+ZG/zLonK5pl"))) ? (str.contains(一倆.一倀("k1536IxRe8fJXYj8tSTX7v//eAUK5eLaiRKjTMiW6Q==")) ? 一倆.一倀("rUbWQhbHzjtiWpFCt7gSMpvT4PR14U5ftjhVJhry9VTKOezVyoUuY2WC/E1e3dvG") : 一倆.一倀("/stMDkEG3Pzx411SLzPkww4ji/fsgziHoIrrsjZQJkUOQzEfVqqMTlLY+V/bpdoH")) : (str.contains(一倆.一倀("ELqxYtZZtSPtfsB33QIC1yTKNCgB/gw18id0pdLrXNvh4OC0Rw==")) ? 一倆.一倀("chREo31ME+2CiKDevudhWWaUsdkf96dFI2wZhC1mBMIem51ti9jYRVrAFjCp2qeDB5U=") : (str.contains(一倆.一倀("SDLCsSFv5d90rSgX5IJXWHFKyJFLx+U4mYOquh4I5Q==")) ? 一倆.一倀("Iymt/ASVq6ShgqeIr+c2ExYtuCPujb7TMDd8qIr1TdMIp2pRD58upv6ErK80oJmLaddS") : 一倆.一倀("LPQZ0LiEwgdd0w+WAVl34v1MYEy/ui21rDK58csASYQSOws2LZhGPE63OXLJuLdbDYWb")))));
  }
  
  private static boolean 一倄(int paramInt) {
    switch (paramInt) {
      case 0:
      
      case 1:
      
      case 2:
      
      case 3:
      
      case 4:
      
    } 
    return false;
  }
  
  private static 一倄.一倀 一倅(int paramInt) {
    switch (paramInt) {
      case 0:
      
      case 1:
      
      case 2:
      
      case 3:
      
    } 
    throw new IllegalArgumentException(一倆.一倀("SkJHezfxytQs6TSv5T20/ygZSouNg5Gl24qorwchkiZFmVF/gMptj50JQ7+OJag="));
  }
  
  private static String 一倀(long paramLong) {
    long l = (Math.max(0L, paramLong) + 999L) / 1000L;
    return String.format(一倆.一倀("Wv4OwuQhnEf55ryvzbpfY2F9YXaG1EtKqp4L2QENA+ELpZwDjA=="), new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) });
  }
  
  private int 一倆() {
    switch (this.一倐) {
      case 1:
      
      case 2:
      
    } 
    return this.一倐;
  }
  
  private void 一倇() {
    if (this.f_96541_ != null && this.一倐 == 4) {
      this.f_96541_.m_91152_(new 一倃(this));
      return;
    } 
    if (this.f_96541_ != null)
      this.f_96541_.m_91152_(new 一倈(this, 一倆())); 
  }
  
  private void 一倈() {
    try {
      switch (this.一倐) {
        case 0:
          一倇.一們();
          return;
        case 1:
          一倇.一倍();
          return;
        case 2:
          一倇.一倓();
          return;
        case 3:
          一倇.一倒();
          return;
        case 4:
          一倂.一倅();
          return;
      } 
      return;
    } catch (IOException|IllegalArgumentException iOException) {
      一倇();
      return;
    } 
  }
  
  private double 一倀(double paramDouble) {
    return (paramDouble - this.一倎) / this.一倍;
  }
  
  private double 一倁(double paramDouble) {
    return (paramDouble - this.一倏) / this.一倍;
  }
  
  private static boolean 一倀(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramDouble1 >= paramInt1 && paramDouble1 < (paramInt1 + paramInt3) && paramDouble2 >= paramInt2 && paramDouble2 < (paramInt2 + paramInt4));
  }
  
  private void 一倀(一倈.一倀 param一倀) {
    this.一們 = param一倀;
    this.一倓 = 0.0D;
    this.一倕 = false;
    if (!一倃().contains(Integer.valueOf(this.一倐)))
      this.一倐 = ((Integer)一倃().get(0)).intValue(); 
  }
  
  public boolean m_6375_(double paramDouble1, double paramDouble2, int paramInt) {
    if (paramInt != 0)
      return super.m_6375_(paramDouble1, paramDouble2, paramInt); 
    double d1 = 一倀(paramDouble1);
    double d2 = 一倁(paramDouble2);
    if (一倀(d1, d2, 800, 23, 125, 34)) {
      一倂.一倀(this);
      return true;
    } 
    if (一倀(d1, d2, 941, 23, 35, 35)) {
      m_7379_();
      return true;
    } 
    for (一倈.一倀 一倀1 : 一倈.一倀.values()) {
      if (一倀(d1, d2, 5, 93 + 一倀1.ordinal() * 40, 211, 34)) {
        一倀(一倀1);
        this.一倔 = true;
        return true;
      } 
    } 
    if (一倈.一倁(this.一們) > 0 && 一倀(d1, d2, 966, 105, 14, 505)) {
      double d3 = 一倈.一倁(this.一們, this.一倓);
      double d4 = 一倈.一倂(this.一們);
      if (d2 >= d3 && d2 < d3 + d4) {
        this.一倖 = d2 - d3;
      } else {
        this.一倖 = d4 / 2.0D;
        this.一倓 = 一倈.一倂(this.一們, d2 - this.一倖);
      } 
      this.一倕 = true;
      return true;
    } 
    int i = 一倈.一倀(this.一們, d1, d2, this.一倓);
    if (i >= 0) {
      this.一倐 = i;
      int j = 一倃().indexOf(Integer.valueOf(i));
      double d = 一倈.一倀(j, this.一倓);
      if (d2 >= d + 184.0D) {
        一倈();
      } else if (d2 >= d + 145.0D) {
        一倇();
      } 
      return true;
    } 
    return 一倀(d1, d2, 2, 5, 992, 612);
  }
  
  public boolean m_6050_(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    double d1 = 一倀(paramDouble1);
    double d2 = 一倁(paramDouble2);
    if (d1 >= 217.0D && d1 < 991.0D && d2 >= 93.0D && d2 < 610.0D) {
      this.一倓 = 一倈.一倀(this.一們, this.一倓, paramDouble4);
      return true;
    } 
    return super.m_6050_(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
  }
  
  public boolean m_7979_(double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4) {
    if (paramInt == 0 && this.一倕) {
      this.一倓 = 一倈.一倂(this.一們, 一倁(paramDouble2) - this.一倖);
      return true;
    } 
    return super.m_7979_(paramDouble1, paramDouble2, paramInt, paramDouble3, paramDouble4);
  }
  
  public boolean m_6348_(double paramDouble1, double paramDouble2, int paramInt) {
    if (paramInt == 0 && this.一倕) {
      this.一倕 = false;
      return true;
    } 
    return super.m_6348_(paramDouble1, paramDouble2, paramInt);
  }
  
  public boolean m_7933_(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 256) {
      m_7379_();
      return true;
    } 
    if (paramInt1 == 268) {
      if (this.f_96541_ != null)
        this.f_96541_.m_91152_(this.一倈.一倀()); 
      return true;
    } 
    return super.m_7933_(paramInt1, paramInt2, paramInt3);
  }
  
  public void m_7861_() {
    if (this.一倉 != null) {
      this.一倉.close();
      this.一倉 = null;
    } 
    this.一倊 = this.一個 = 0;
  }
  
  public void m_7379_() {
    if (this.f_96541_ != null)
      this.f_96541_.m_91152_(this.一倈); 
  }
  
  public boolean m_7043_() {
    return false;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倊.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */