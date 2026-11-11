package br.com.farmdmz.client.auth;

import br.com.farmdmz.client.一倅;
import br.com.farmdmz.client.一倈;
import br.com.farmdmz.client.一倊;
import br.com.farmdmz.client.一個;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;

public final class 一倃 extends Screen {
  private static final int 一倀 = 520;
  
  private static final ResourceLocation 一倁 = new ResourceLocation(一倆.一倀("9xgTBgfoqubOPyMksVJkJBqAt4hT/xyMp+usNGahlNKnedI="), 一倆.一倀("cn9EFIeG1CicC24a7jpZaPKcCQydOqXCnNEbWfGSZiaU+94Zz2KNH/OBeGunbdXYHRyeG3CZgo8="));
  
  private static final ResourceLocation 一倂 = new ResourceLocation(一倆.一倀("fcDcaiiVJJzzOlOFp6wCZfojQNQs7AMki7nXzTQEPsopAqk="), 一倆.一倀("ItprCU5Tg7v0lFim0Y16tkHmH9TwH83dJ2tAZqeZrq6bxQHHEOQS7tM3U2oQwQfAe97dFA1yls8T9WGR1DAYgw=="));
  
  private static final ResourceLocation 一倃 = new ResourceLocation(一倆.一倀("ntx9R+IwFYY2CkhcOK6EvmfUtjqrSMjbyh8IWHSyHENoTPc="), 一倆.一倀("s0WTniZa5Cf6dt7qyCM19YQ0Ll/vlZZsAouPidBmzy1BZcUXtyySoqHeexSzwDBflst9"));
  
  private static final ResourceLocation 一倄 = new ResourceLocation(一倆.一倀("O9/I7uVBeblgDvqqEyKBX6/Qkw40vszaY6OukvC+a3G+kSM="), 一倆.一倀("fsWQ/lx85tMnM+afTmGbeUPbuA6xAJ7YaDL0JJE9pgCoBfHIVrS1LdZAPuh07pN9"));
  
  private final Screen 一倅;
  
  private boolean 一倆;
  
  private boolean 一倇;
  
  private String 一倈 = 一倆.一倀("a+qPIZTow5CwKBLVbmxoZp7nxe0WHcMcvuJvkw==");
  
  private String 一倉 = 一倆.一倀("RNFbbMTfbFx5Ne5TgwMPNzblUvVnE93COrhRVQ==");
  
  private EditBox 一倊;
  
  private EditBox 一個;
  
  private EditBox 一倌;
  
  private EditBox 一倍;
  
  private Button 一倎;
  
  private float 一倏;
  
  private int 一倐;
  
  private int 一們;
  
  private int 一倒;
  
  private PostChain 一倓;
  
  private int 一倔;
  
  private int 一倕;
  
  private boolean 一倖;
  
  public 一倃(Screen paramScreen) {
    super((Component)Component.m_237113_(一倆.一倀("wiXLCiaiS7Jd/iFS4eYG3Kh7euB+s//TnW8RX4Ib6ECshc+qVwS7d/f4SLX68Qiv")));
    this.一倅 = paramScreen;
  }
  
  public Screen 一倀() {
    return this.一倅;
  }
  
  protected void m_7856_() {
    this.一倇 = 一倂.一倅();
    this.一倒 = (this.一倆 && !this.一倇) ? 484 : 424;
    this.一倏 = (float)Math.min(1.0D, Math.min((this.f_96543_ - 16) / 520.0D, (this.f_96544_ - 16) / this.一倒));
    this.一倏 = Math.max(0.1F, this.一倏);
    this.一倐 = Math.round((this.f_96543_ - 520.0F * this.一倏) / 2.0F);
    this.一們 = Math.round((this.f_96544_ - this.一倒 * this.一倏) / 2.0F);
    this.一倊 = this.一個 = this.一倌 = this.一倍 = null;
    m_142416_((GuiEventListener)new 一倀(466, 20, 32, 30, 一倆.一倀("3L2BGbzT/iB4LPQCyUExkXNGEdR/izN4R9dWTiM="), false, paramButton -> m_7379_()));
    if (this.一倇) {
      一倃();
    } else {
      一倂();
    } 
  }
  
  private void 一倂() {
    m_142416_((GuiEventListener)new 一倀(24, 82, 230, 30, 一倆.一倀("b6T/LRIB64vkQdOFWhvEyzvur7xY+psL4zaenxY9Alo5QA=="), !this.一倆, paramButton -> 一倀(false)));
    m_142416_((GuiEventListener)new 一倀(266, 82, 230, 30, 一倆.一倀("9vSHIUw0MWz8A2G2ByVb4qbHTdrILizfGoDXz/o44rxxu+DI3g=="), this.一倆, paramButton -> 一倀(true)));
    this.一倊 = 一倀(24, 144, 472, 一倆.一倀("c093fObk9LxDDvWsOCLSDQnd3LWuWxVjoTNy6sW9o/VXxoPIivvprrc="), 16);
    this.一倊.m_94144_(this.一倈.isEmpty() ? 一倂.一倂() : this.一倈);
    if (this.一倆) {
      this.一個 = 一倀(24, 204, 472, 一倆.一倀("+BihcjPScWV78PQm0PCgZPfJLIawQcedBJLlh78KeHsqoGAuINwE9gpHe6KjwUJt+kQsbAANDlfwaQ=="), 16);
      this.一個.m_257771_((Component)Component.m_237113_(一倂.一倂()));
      this.一個.m_94144_(this.一倉);
    } 
    this.一倌 = 一倀(24, this.一倆 ? 264 : 204, 472, 一倆.一倀("al3I1pILLBrFHWsEbAk2NAm6yZXdAemX5+wzJt9Bd4yi"), 128);
    this.一倌.m_94149_((paramString, paramInteger) -> FormattedCharSequence.m_13714_(一倆.一倀("st1Jkgm5vHznuf5hr6t0Y51Zr42fUkhgER3ifO0=").repeat(paramString.length()), Style.f_131099_));
    if (this.一倆)
      this.一倍 = 一倀(24, 324, 472, 一倆.一倀("SoyeK/cdSu9vj+oItrXbFdyjEnKU4UzpXprcbd2xdw=="), 128); 
    this.一倎 = (Button)m_142416_((GuiEventListener)new 一倀(24, this.一倆 ? 372 : 312, 472, 32, this.一倆 ? 一倆.一倀("9n6mUj0n82+dynek2ldILMIgeNA2vilx6uDzcm2mS6v0KrBiyXNs") : 一倆.一倀("OXJPnGKy+FY21Yu+q4JZyLMn2+YHax8Vz1/OWE4U5JG+iA=="), true, paramButton -> 一倄()));
    m_264313_((GuiEventListener)this.一倊);
  }
  
  private void 一倃() {
    this.一倍 = 一倀(24, 243, 472, 一倆.一倀("fk29R4EPMy/scNs9TESeDd2JJUHUVwJZqjPN+IcY9Q=="), 128);
    this.一倎 = (Button)m_142416_((GuiEventListener)new 一倀(24, 283, 472, 32, 一倆.一倀("DNVG+YT7YXaLsBSpXE6qR3ClvF8RX8DR5c00MrnfEK0VydXpTB9GEG4="), true, paramButton -> 一倄()));
    m_142416_((GuiEventListener)new 一倀(24, 330, 148, 30, 一倆.一倀("uXTyi4F02cd95HyKO152lhV1j00q4pVnritWDHkIf3/5EFVtq8DAyj8="), false, paramButton -> {
            一倂.一倉();
            m_232761_();
          }));
    if (一倂.一倆())
      m_142416_((GuiEventListener)new 一倀(182, 330, 148, 30, 一倆.一倀("KqeerTX6Sh6UeTDNvzELwSfgibdVDaAjX79Z+nHzW/5Esu3CydDHdw=="), false, paramButton -> Util.m_137581_().m_137646_("pGC3N8g8iiJXmxSmr5fsw75RNCvTzNveBE1O0twJ"))); 
    m_142416_((GuiEventListener)new 一倀(340, 330, 156, 30, 一倆.一倀("40MqPLbMVXT1MNkdysZ/VUZEXlseYJe40T3cv4Z8MYyPWuQzyIGklUUR"), true, paramButton -> {
            if (一倂.一倈())
              m_7379_(); 
          }));
    m_264313_((GuiEventListener)this.一倍);
  }
  
  private EditBox 一倀(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4) {
    EditBox editBox = new EditBox(this.f_96547_, paramInt1, paramInt2, paramInt3, 28, (Component)Component.m_237113_(paramString));
    editBox.m_94199_(paramInt4);
    editBox.m_94182_(true);
    editBox.m_94202_(-728112);
    editBox.m_94205_(-2375512);
    editBox.m_257771_((Component)Component.m_237113_(paramString));
    return (EditBox)m_142416_((GuiEventListener)editBox);
  }
  
  private void 一倀(boolean paramBoolean) {
    if (一倂.一倄())
      return; 
    if (this.一倊 != null)
      this.一倈 = this.一倊.m_94155_(); 
    if (this.一個 != null)
      this.一倉 = this.一個.m_94155_(); 
    this.一倆 = paramBoolean;
    m_232761_();
  }
  
  private void 一倄() {
    if (一倂.一倄())
      return; 
    if (this.一倇) {
      一倂.一倁(this.一倍.m_94155_());
      this.一倍.m_94144_(一倆.一倀("ntxJD4NjoOARSiayc6vOSyvoo45QYahaGuBhPw=="));
    } else {
      this.一倈 = this.一倊.m_94155_();
      String str = this.一倌.m_94155_();
      this.一倌.m_94144_(一倆.一倀("iD6wpsg4fLBFmjgJlKWk2afMdUZl6zZrKyu/sw=="));
      if (this.一倆) {
        this.一倉 = this.一個.m_94155_();
        一倂.一倀(this.一倈, str, this.一倉, this.一倍.m_94155_());
        this.一倍.m_94144_(一倆.一倀("DgbGITICbnA9d9eSfII48WKsYoZzWpeN3iXrvQ=="));
      } else {
        一倂.一倀(this.一倈, str);
      } 
    } 
  }
  
  public void m_86600_() {
    if (br.com.farmdmz.client.update.一倀.一倁()) {
      br.com.farmdmz.client.update.一倀.一倀(this.一倅);
      return;
    } 
    if (this.一倇 != 一倂.一倅())
      m_232761_(); 
    if (this.一倎 != null)
      this.一倎.f_93623_ = !一倂.一倄(); 
  }
  
  public void m_88315_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    if (this.f_96541_ != null && this.f_96541_.f_91073_ == null && this.一倅 != null)
      this.一倅.m_88315_(paramGuiGraphics, paramInt1, paramInt2, paramFloat); 
    一倀(paramGuiGraphics, paramFloat);
    paramGuiGraphics.m_280168_().m_85836_();
    paramGuiGraphics.m_280168_().m_252880_(this.一倐, this.一們, 500.0F);
    paramGuiGraphics.m_280168_().m_85841_(this.一倏, this.一倏, 1.0F);
    一個.一倀(paramGuiGraphics, 0, 0, 520, this.一倒, 9, -1064675789);
    一個.一倀(paramGuiGraphics, 2, 2, 516, this.一倒 - 4, 8, -316007917);
    一個.一倀(paramGuiGraphics, 一倂, 736, 736, 8, 8, 504, this.一倒 - 16, 0.38F);
    paramGuiGraphics.m_280509_(8, 8, 512, 66, 1614356245);
    paramGuiGraphics.m_280509_(8, 66, 512, 67, 1222220388);
    一倅.一倀(paramGuiGraphics, 23, 18, 33);
    if (this.一倇) {
      一倀(paramGuiGraphics, 一倆.一倀("aHT9eoetTyqRzSkiN3uGV6UFXivpKgrT307SZpE7whCu"), 24, 87, -728112, true);
      一倀(paramGuiGraphics, 一倂.一倁(), 24, 122, -728112, true);
      一倀(paramGuiGraphics, "gsj7v/7oxtREo6a228grrjEfinLfe+iAx1UvcmcD", 24, 148, -2375512, false);
      一倀(paramGuiGraphics, "bOTY8KAn6+mVrelD/OqcQ5nv6QRORx1dJsu6fm9oLGhFju6JuKG6YQ==", 24, 178, -2375512, false);
      一倀(paramGuiGraphics, 一倂.一倈() ? 一倆.一倀("Ab25U1EZ7V0nyHogAkwHaA5JU/jjigF95lz6mJEvMsGk1w6fLzvgDgwASQ==") : 一倆.一倀("wKsuBILMGrZFmozJlZ1B6+XYJfvf9ZP/yC/8Ib2aa9OfDTpHpXEMIHyfRCBris1WCfoNLvQSdSuueAAV"), 24, 202, 一倂.一倈() ? -10167646 : -1720462, true);
      一倀(paramGuiGraphics, 一倆.一倀("DqzHXK+9fGOAyan8A8FLu5Q+6uSNME564UXKBPmGYj1Sw9anhaByrO3TxnkT"), 24, 224, -728112, false);
    } else {
      一倀(paramGuiGraphics, 一倆.一倀("Yr7KCCpjYFUIMqkUrommForP3ow4KZMxwCE/Fr/1jzU9I01f0gV9xJM="), 24, 124, -2375512, false);
      if (this.一倆)
        一倀(paramGuiGraphics, 一倆.一倀("UxiPMFQvLBbnFdTNow8aNgpOl3KS7d4FiWjq8q+mI+PFqXYMpsTlEqz6CeTzbnN2jXWaK3oLA4P+jy0O"), 24, 184, -2375512, false); 
      一倀(paramGuiGraphics, this.一倆 ? 一倆.一倀("X/4Q1SyanZuzerKQBICGeUmZ9mIMaW7kr+lmbpjs28h6NDZU5SzZSxC1wb1NFRRUYA+bC3Uq6mAf") : 一倆.一倀("B0hh3i+AW4qJvyHAkgwVJW+E4I+UuzuHqmHe11QTAHxu"), 24, this.一倆 ? 244 : 184, -2375512, false);
      if (this.一倆)
        一倀(paramGuiGraphics, 一倆.一倀("MjWZdN38SmtzwWa8DcC6LJyz32pXqoXXPXJINkgCWTZQ31wHkpa8UsGBNgvMFE3YuRAuxXFh"), 24, 304, -2375512, false); 
    } 
    char c = this.一倇 ? 'Ÿ' : (this.一倆 ? 'Ƥ' : 'Ũ');
    int i = 一倂.一倈() ? -6364226 : -2375512;
    List<FormattedCharSequence> list = this.f_96547_.m_92923_((FormattedText)一倀(一倂.一倃(), false), 472);
    int j;
    for (j = 0; j < Math.min(3, list.size()); j++)
      paramGuiGraphics.m_280649_(this.f_96547_, list.get(j), 24, c + j * 12, i, false); 
    j = (int)一倀(paramInt1);
    int k = (int)一倁(paramInt2);
    for (GuiEventListener guiEventListener : m_6702_()) {
      if (guiEventListener instanceof EditBox) {
        EditBox editBox = (EditBox)guiEventListener;
        int m = editBox.m_93696_() ? -420822893 : 921087096;
        一個.一倀(paramGuiGraphics, editBox.m_252754_() - 1, editBox.m_252907_() - 1, editBox.m_5711_() + 2, editBox.m_93694_() + 2, 4, m);
      } 
      if (guiEventListener instanceof Renderable) {
        Renderable renderable = (Renderable)guiEventListener;
        renderable.m_88315_(paramGuiGraphics, j, k, paramFloat);
      } 
    } 
    paramGuiGraphics.m_280168_().m_85849_();
    paramGuiGraphics.m_280262_();
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, float paramFloat) {
    if (this.f_96541_ == null || this.一倖)
      return; 
    try {
      paramGuiGraphics.m_280262_();
      RenderTarget renderTarget = this.f_96541_.m_91385_();
      if (this.一倓 == null)
        this.一倓 = new PostChain(this.f_96541_.m_91097_(), this.f_96541_.m_91098_(), renderTarget, 一倁); 
      if (this.一倔 != renderTarget.f_83915_ || this.一倕 != renderTarget.f_83916_) {
        this.一倔 = renderTarget.f_83915_;
        this.一倕 = renderTarget.f_83916_;
        this.一倓.m_110025_(this.一倔, this.一倕);
      } 
      this.一倓.m_110023_(paramFloat);
      renderTarget.m_83947_(true);
      RenderSystem.clear(256, Minecraft.f_91002_);
    } catch (Exception exception) {
      this.一倖 = true;
      if (this.一倓 != null) {
        this.一倓.close();
        this.一倓 = null;
      } 
      this.f_96541_.m_91385_().m_83947_(true);
    } 
  }
  
  private static Component 一倀(String paramString, boolean paramBoolean) {
    return (Component)Component.m_237113_(paramString).m_130938_(paramStyle -> paramStyle.m_131150_(paramBoolean ? 一倄 : 一倃));
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    paramGuiGraphics.m_280614_(this.f_96547_, 一倀(paramString, paramBoolean), paramInt1, paramInt2, paramInt3, false);
  }
  
  private double 一倀(double paramDouble) {
    return (paramDouble - this.一倐) / this.一倏;
  }
  
  private double 一倁(double paramDouble) {
    return (paramDouble - this.一們) / this.一倏;
  }
  
  public boolean m_6375_(double paramDouble1, double paramDouble2, int paramInt) {
    return super.m_6375_(一倀(paramDouble1), 一倁(paramDouble2), paramInt);
  }
  
  public boolean m_6348_(double paramDouble1, double paramDouble2, int paramInt) {
    return super.m_6348_(一倀(paramDouble1), 一倁(paramDouble2), paramInt);
  }
  
  public boolean m_7979_(double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4) {
    return super.m_7979_(一倀(paramDouble1), 一倁(paramDouble2), paramInt, paramDouble3 / this.一倏, paramDouble4 / this.一倏);
  }
  
  public boolean m_7933_(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 257 || paramInt1 == 335) {
      一倄();
      return true;
    } 
    return super.m_7933_(paramInt1, paramInt2, paramInt3);
  }
  
  public void m_7379_() {
    if (this.f_96541_ != null)
      this.f_96541_.m_91152_(this.一倅); 
  }
  
  public void 一倁() {
    Screen screen = this.一倅;
    if (screen instanceof br.com.farmdmz.client.一倃) {
      br.com.farmdmz.client.一倃 一倃1 = (br.com.farmdmz.client.一倃)screen;
      一倃1.一倂();
    } else {
      screen = this.一倅;
      if (screen instanceof 一倈) {
        一倈 一倈 = (一倈)screen;
        一倈.一倁();
      } else {
        screen = this.一倅;
        if (screen instanceof 一倊) {
          一倊 一倊 = (一倊)screen;
          this.f_96541_.m_91152_(一倊.一倀().一倀());
        } else {
          screen = this.一倅;
          if (screen instanceof br.com.farmdmz.client.一倀) {
            br.com.farmdmz.client.一倀 一倀 = (br.com.farmdmz.client.一倀)screen;
            this.f_96541_.m_91152_(一倀.一倀());
          } else {
            m_7379_();
          } 
        } 
      } 
    } 
  }
  
  public void m_7861_() {
    if (this.一倌 != null)
      this.一倌.m_94144_(一倆.一倀("yhm9B8wqjWm/nDR09WDmwseG20PLOdFq8nXpzA==")); 
    if (this.一倍 != null)
      this.一倍.m_94144_(一倆.一倀("yxwF4NiM3+7o5sU2cVX62yVoarJDhI+2gWzhiQ==")); 
    if (this.一倓 != null) {
      this.一倓.close();
      this.一倓 = null;
    } 
    this.一倔 = this.一倕 = 0;
  }
  
  public boolean m_7043_() {
    return false;
  }
  
  private static final class 一倀 extends Button {
    private final boolean 一倀;
    
    一倀(int param1Int1, int param1Int2, int param1Int3, int param1Int4, String param1String, boolean param1Boolean, Button.OnPress param1OnPress) {
      super(param1Int1, param1Int2, param1Int3, param1Int4, 一倃.一倀(param1String, true), param1OnPress, f_252438_);
      this.一倀 = param1Boolean;
    }
    
    protected void m_87963_(GuiGraphics param1GuiGraphics, int param1Int1, int param1Int2, float param1Float) {
      int i = (this.f_93623_ && (this.一倀 || m_198029_())) ? -420822893 : 921087096;
      一個.一倀(param1GuiGraphics, m_252754_(), m_252907_(), m_5711_(), m_93694_(), 5, i);
      int j = this.一倀 ? -171801775 : -446415577;
      if (m_198029_())
        j = this.一倀 ? -2647194 : -260355027; 
      if (!this.f_93623_)
        j = -2007811541; 
      一個.一倀(param1GuiGraphics, m_252754_() + 1, m_252907_() + 1, m_5711_() - 2, m_93694_() - 2, 4, j);
      Font font = (Minecraft.m_91087_()).f_91062_;
      int k = this.f_93623_ ? (this.一倀 ? -13887729 : -728112) : -1864646488;
      param1GuiGraphics.m_280614_(font, m_6035_(), m_252754_() + (m_5711_() - font.m_92852_((FormattedText)m_6035_())) / 2, m_252907_() + (m_93694_() - 9) / 2, k, false);
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\auth\一倃.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */