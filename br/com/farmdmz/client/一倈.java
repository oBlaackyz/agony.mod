package br.com.farmdmz.client;

import br.com.autofishdmz.client.ClientController;
import br.com.autofishdmz.core.BotConfig;
import br.com.farmdmz.client.auth.一倆;
import com.google.gson.Gson;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.resources.ResourceLocation;

public final class 一倈 extends Screen {
  private static final Gson 一倀 = new Gson();
  
  private static final int 一倁 = 553648127;
  
  private static final int 一倂 = 1222220388;
  
  private static final int 一倃 = -728112;
  
  private static final int 一倄 = -2375512;
  
  private static final int 一倅 = -11561732;
  
  private static final ResourceLocation 一倆 = new ResourceLocation(一倆.一倀("m4tuJDrcTvFoSt3jo1E2NO7KsiyHH7KPDS7wTTJH2JCQoCk="), 一倆.一倀("+rFDNz/Xq9k2hUmBXyG3A1zW+OyopN8FioqOqBlD34c4rUJQiVoJu56ha6MdUzHjrgnsOge4m/w="));
  
  private static final ResourceLocation 一倇 = 一個.一倀(一倆.一倀("vVhmNrE7imYC3RYk1x98KODqW7NVFjun0J4jz3BCxYUlTiTaY4rVeFyq"));
  
  private static final ResourceLocation[] 一倈 = new ResourceLocation[] { 一個.一倀(一倆.一倀("evt5J0U/HMDDLS0CqGEYRSIM16HHsu+PVCceIuUmpq02bl2E0nbyF9JdENxwew==")), 一個.一倀(一倆.一倀("RMs3Mxq1bvwiboOhRrmFSRXSDmuEd8bZoyrtSD5QE4Q5VUM+UpBfC+d5irK2")), 一個.一倀(一倆.一倀("5Kn2J+BSQN1+8lXie28lbcFvPNbYnE5kwsc3s9Bnf7Q+QYD9EfuT9FZvZTyXhdJlhlE=")), 一個.一倀(一倆.一倀("FTIDkVef/uOuKqP6NYdHdPRyvXVKzlWZA4Vk+OeqWmdGtMRGcWXMNvsDlQc=")) };
  
  private final Screen 一倉;
  
  private br.com.farmdmz.config.一倂 一倊;
  
  private BotConfig 一個;
  
  private final Map<String, String> 一倌 = new LinkedHashMap<>();
  
  private final Map<String, String> 一倍 = new LinkedHashMap<>();
  
  private final List<一倁> 一倎 = new ArrayList<>();
  
  private final List<一倃> 一倏 = new ArrayList<>();
  
  private final List<一倄> 一倐 = new ArrayList<>();
  
  private final List<一倀> 一們 = new ArrayList<>();
  
  private List<一倒.一倀> 一倒 = List.of();
  
  private int 一倓;
  
  private int 一倔;
  
  private int 一倕;
  
  private int 一倖;
  
  private int 一倗;
  
  private int 一倘;
  
  private int 一候;
  
  private int 一倚;
  
  private int 一倛;
  
  private int 一倜;
  
  private int 一倝;
  
  private int 一倞;
  
  private int 一借;
  
  private int 丁倀;
  
  private int 丁倁;
  
  private String 丁倂 = 一倆.一倀("+SsF4irCwL8yNl5apxgCgni44hWT+se+O0pC+g==");
  
  private boolean 丁倃;
  
  private 一倂 丁倄;
  
  private EditBox 丁倅;
  
  private PostChain 丁倆;
  
  private int 丁倇;
  
  private int 丁倈;
  
  private boolean 丁倉;
  
  private float 丁倊;
  
  private int 丁個;
  
  private int 丁倌;
  
  public 一倈(Screen paramScreen) {
    this(paramScreen, 0);
  }
  
  public 一倈(Screen paramScreen, int paramInt) {
    super((Component)Component.m_237113_(一倆.一倀("29klJYwEABe+f77IfCfCbBPddk0ByBtbas+No5/0Sqfjg9MGcbMTVNNqkxpCKwlHZg==")));
    this.一倉 = paramScreen;
    this.一倓 = Math.max(0, Math.min(3, paramInt));
    this.一倊 = 一倇.一倀().一倀();
    一倂();
    this.一個 = 一倀(ClientController.get().config());
    一倃();
  }
  
  private void 一倂() {
    this.一倌.put(一倆.一倀("Cey68j11aoJKxi9FXNabtHkej7pS8ge7fUzUKSYOIuNS/00="), this.一倊.teleportCommand);
    this.一倌.put(一倆.一倀("vqtGHyeP3mb4tnAUqMOCq6c6x3/TOp7AIjWaFbLqHN0k7gim8mwFdg=="), this.一倊.plotCommand);
    this.一倌.put(一倆.一倀("f6m1zfIhSzi1FKNs65lyHul46suLZEOppamBdRA8mlX2bUhV"), Integer.toString(this.一倊.cooldownMinutes));
    this.一倌.put(一倆.一倀("vKNTOWbED1w1ub9msgIh56tk+5q+J/jYDAicT4pm0s0GTg=="), Integer.toString(this.一倊.actionDelayTicks));
    this.一倌.put(一倆.一倀("E2QHhL97k5nD4A6/9V06mrcFPWs4JK1VEzHO6Yv8wpw="), Integer.toString(this.一倊.openTimeoutTicks));
    this.一倌.put(一倆.一倀("yCoyFsxzrM1NRKpPe/vXxL8YU6w6lsj3KU/dtgnUAIzwVU2G"), Integer.toString(this.一倊.teleportWaitTicks));
    this.一倌.put(一倆.一倀("DrNC2b34NZKnER6vECQocldfxAORcliIJ3OGaOmfSks/mOw="), Integer.toString(this.一倊.retryLimit));
    this.一倌.put(一倆.一倀("lJP42twk6Iv9FTGNqfJh81bfT8hyVTPNnhfgM5g6rRxoSmbmZhWo0A5HxA=="), this.一倊.timeRoomFishingCommand);
    this.一倌.put(一倆.一倀("9bYgbZIDRN3RDBCKPoGjyPhoF5e8CQ0N5kTX4VtX/Q2K6grd3p+v"), this.一倊.orbCommand);
  }
  
  private static BotConfig 一倀(BotConfig paramBotConfig) {
    return (BotConfig)一倀.fromJson(一倀.toJson(paramBotConfig), BotConfig.class);
  }
  
  private void 一倃() {
    this.一倍.put(一倆.一倀("x/neE+Q3Tl82XopdbHHUil5uMFriUo+wqhxh0RBtdrA/1gN7W1W3yKRFly8="), Double.toString(this.一個.attract_interval));
    this.一倍.put(一倆.一倀("ZptDXpKFG5cOaDqGJZRp4qHPFUoByKp2m0SVeb0VtnWg6ULrMjciIJ6WJeBp0+0="), Double.toString(this.一個.cast_retry_interval));
    this.一倍.put(一倆.一倀("8tu7Jf9CZJsOk6/VtJinx6eDZg3uM4WH0/dxZfuIkd5N27liykDWMw=="), Double.toString(this.一個.cast_timeout));
    this.一倍.put(一倆.一倀("vil1Q+IXx1T9LfwtE6Bb1848mhNFwCs+Snd+vCuk8jZ4DxS5FCA8zeVr9A=="), Double.toString(this.一個.attract_timeout));
    this.一倍.put(一倆.一倀("Q4sMbxI3qPe9Vj1JSXjOAVCHB6J8WERzQ8yV551GcUbcEWsTEJVb96E="), Double.toString(this.一個.confirm_delay));
    this.一倍.put(一倆.一倀("IzFkGZfMS0LCVcjHENGe5y1iBndoj9EbsK7dQgKFzDwV6Xt24RA4MCbV"), Integer.toString(this.一個.confirm_clicks));
    this.一倍.put(一倆.一倀("mYdyz+GkYViq3agzHPV6+clOqUlKlKJQd8kXPtnx0V0KYIZWQpO3qpaiEwBH8c5SFQ=="), Double.toString(this.一個.circle_trigger_radius));
    this.一倍.put(一倆.一倀("XTdnftArsrqDwm2Oz9wLbxRij7jYZrvETLhzj15KrFdPsnoKRuB2XlgM"), Double.toString(this.一個.circle_latency));
    this.一倍.put(一倆.一倀("z7drU6lHGYXU1iXJEREFovviqgZO0GiGWJUlZ5zhymJKURTOo98QL/urP/U="), Double.toString(this.一個.after_catch_wait));
    this.一倍.put(一倆.一倀("XGM73DaaNISEcEB9DvYXpSyysGcAw9YkjldQLeGtLQpUlh8ozVYZMQ=="), Double.toString(this.一個.manual_scale));
  }
  
  protected void m_7856_() {
    this.一倎.clear();
    this.一倏.clear();
    this.一倐.clear();
    this.一們.clear();
    this.丁倅 = null;
    double d = (this.f_96541_ == null) ? 1.0D : this.f_96541_.m_91268_().m_85449_();
    this.丁倊 = (float)Math.min(1.0D / d, Math.min(this.f_96543_ / 1000.0D, this.f_96544_ / 623.0D));
    this.丁倊 = Math.max(0.1F, this.丁倊);
    this.丁個 = Math.round((this.f_96543_ - 1000.0F * this.丁倊) / 2.0F);
    this.丁倌 = Math.round((this.f_96544_ - 623.0F * this.丁倊) / 2.0F);
    this.一倖 = 5;
    this.一倗 = 8;
    this.一倘 = 986;
    this.一候 = 606;
    this.一倚 = 211;
    this.一倛 = 228;
    this.一倜 = 750;
    this.一倝 = 198;
    this.一倞 = 551;
    String[] arrayOfString = { 一倆.一倀("Cga4eZ3kd4u+YfH6H9g1cAYn95Ad6xPLh1Dc3wX8tD8w"), 一倆.一倀("mnFBxM/pIJJdEhNNKYAVyeqppMoKH/2y+/Spwc5d9hDL"), 一倆.一倀("mCX2fNZbqNpigqZ3XK7RJVRaLHsWFNo4Q21tfGijfAEKzW/Q6D1yKK8="), 一倆.一倀("HZ+Pz3x638sGlNqy3hQW/YpYN31oXS255ym9oJh8FA==") };
    int[] arrayOfInt = { 0, 2, 1, 3 };
    for (byte b = 0; b < arrayOfString.length; b++) {
      int i = arrayOfInt[b];
      一倂 一倂4 = 一倀(5, 93 + b * 32, 211, 30, arrayOfString[b], paramButton -> 一倃(paramInt));
      一倂4.一倁 = true;
      一倂4.一倅 = b;
      一倂4.一倆 = (() -> (this.一倓 == paramInt));
    } 
    一倂 一倂1 = 一倀(241, 124, 34, 34, 一倆.一倀("Kp2VfHVbZVmV0cG40mD8S8ajqF6yf7Duv7kXng=="), paramButton -> m_7379_());
    一倂1.一倃 = true;
    一倂 一倂2 = 一倀(941, 23, 34, 34, 一倆.一倀("Zs65B8FYXtUb4DKYZSrgDP3p/w5XZDDGXVFWdQ=="), paramButton -> m_7379_());
    一倂2.一倄 = true;
    char c = 'Ʌ';
    this.丁倄 = 一倀(794, c, 180, 26, 一倆.一倀("fycf0FDfyyNYPKWkbbffyL+FwHW+zUecF7Fw8FsmEVSq"), paramButton -> {
          if (this.一倓 == 3) {
            一倒();
            return;
          } 
          if (this.一倓 == 2) {
            一倕();
          } else if (this.一倓 == 1) {
            一倓();
          } else if (一倇.一倁()) {
            一倇.一們();
            一倀(一倆.一倀("agykp2FvtAUZhIjunyCvqcBFgh5lumh/qHacXowpV/AUe7/SdWAJZ1u5"), false);
          } else if (一倏()) {
            一倇.一們();
            if (一倇.一倁())
              一倁(); 
          } 
        });
    this.丁倄.一倀 = true;
    this.丁倄.m_257544_(Tooltip.m_257550_(一倍.一倀((this.一倓 == 3) ? 一倆.一倀("cTfyhYfAEZIbIiLgtfKcq6OtO41kVFbyWz/dbLyIT/1KT5FJf1NnZv6Iug7TTBQKTphjtq/hNdv2e99diT1HLDv8xVEPBTFtKq/NNE44d98pVKSdViOMOsNIB0D0GBLk3ec1OZe2GfJJj3+evz8jKdKrqYME6aBM81bd7Mh7NCcbaM4l1jiT+7poiut3tcLIORCr46cs9I37aMHw4CA=") : ((this.一倓 == 2) ? 一倆.一倀("FhfdE2ePUOi91DVBXfyeefH2dy1nZs6FoDcNqgxYXd/uahHOnGoUZry1rs0XEF4HT9g8nIQXnLqzVdiWXkQZ5ZPsPAm+Mg2gYssvAi6688GRLgAo5PzxQA/aXNpNKVZclHdsXNgEaJYxPyF6uXGreUz/TEJXyoX+8OGc4hBmWy1YpVontUs/4mXlQVOu") : ((this.一倓 == 1) ? 一倆.一倀("RyR0weeNfgSbHgstONegSinSgyNEIuIzcqTXyo1BFqavyAZO0/QyMP/ZQJGP7rAqQCrfM7sHdaNmnXuT+bud/BwLKLqRkymr7B53Amw8jTkvwKeBkI6vU0fyUwNjZ7/MPJxd6TErL9n+1tRTMYB0AAeNCpQinJnCjF1ybqWXGkcEAgAxpaOD7gM=") : 一倆.一倀("Kt3u0raXRzapweLm+tp76XN/kCr41DLi3Y6g6Q2iMGuoZV66gnfVMBvw+g1PxAr9pT1pbYYeDVE/KEx0ZXgDjJmzVlII26bp2+dMJoadJ7eR7jCfEXPkgGC5uxPW3ur0"))))));
    一倂 一倂3 = 一倀(605, c, 180, 26, 一倆.一倀("Eeg2R6d0Oqt769BSd1NXQDf20KpCIi2BrLyUrAq2fSUkDg=="), paramButton -> {
          if (this.一倓 == 3) {
            一們();
          } else if (this.一倓 == 2) {
            一倔();
          } else if (this.一倓 == 1) {
            一倐();
          } else {
            一倏();
          } 
        });
    if (this.一倓 == 0) {
      一倅();
    } else if (this.一倓 == 1) {
      一個();
    } else if (this.一倓 == 2) {
      一倊();
    } else {
      一倄();
    } 
    一倍();
  }
  
  private void 一倄() {
    this.一倒 = (this.f_96541_ == null || this.f_96541_.f_91074_ == null) ? List.<一倒.一倀>of() : 一倒.一倄();
    byte b = 12;
    int i = this.一倜 - b * 2;
    一倀(一倆.一倀("6xY2YNahcJPYjFa+i2PMZ/I/JSreL+j/7Rf/88hlun5US7u+caYTP/w="), 0, 0, this.一倜, 250, 5);
    一倀(b, 39, i, 一倆.一倀("c2IDBdHPK1W90qoS+Nj6YyxvQq9nKIgMk1Et1ktS96gFUfjnZ4/1UalYn17SDMba"), () -> this.一倊.orbBackground, paramBoolean -> this.一倊.orbBackground = paramBoolean.booleanValue(), 一倆.一倀("znqmn2PoIbm5HfS4Yl0L78Ttve5/NUWyohBG1RQicxhJA1Q7fsNUMCnCeYT0limeR8A6oFV28WtDcWU34d/+8vt/vXddOA1k5/+pUlAJUAmnot/OVjBSH3N0TCiksODHQiyLr5/M1WpBpwy2lK++oXsKg7QhTZRiNMLRHA=="));
    一倀(一倆.一倀("zcmZKgJTzUNWF67dR2pDx2IYu4l7z54SJUxBSL90ZWhUSWGns5htCgKCubqXxHS2lnqtL5Sa3BD4yo2K"), b, 75, -2375512, i);
    一倁(b, 97, 27, 23, 一倆.一倀("zOkWW+aBQw9Q/mewqd5PUMSSjvt1CXGoWS0ljZY="), paramButton -> 一倂(-1)).m_257544_(Tooltip.m_257550_(一倍.一倀(一倆.一倀("CNI17Owx33S23R1dVt2zw8960L6JOW93fYCKf4vynaUOvNQ5bWs6kNwBFMgXReEs8r4E2GHS+yyrxwmTnEbgUWU="))));
    一倁(this.一倜 - b - 27, 97, 27, 23, 一倆.一倀("5758jVueS9aujoX/trYnk8zK+Zt/E/ICc60eyoM="), paramButton -> 一倂(1)).m_257544_(Tooltip.m_257550_(一倍.一倀(一倆.一倀("zRfX7CPHHgp7+i41ztoGKUUU1Lz64wTlJj3FFe2ave0AI/a331Lj7gL5Cq3BXd7GVI0K0vDG7hkBHIVC5VAr4EQ="))));
    String str1 = this.一倊.orbFormKey.isBlank() ? 一倆.一倀("KYg4F6bK9/XH7vJf8vWi8UOBjIFgZ5MbTfGEm/X2vbCafg74tuJf6iKvJPpwDUXo+A6hPiFpKMwK") : this.一倊.orbFormLabel;
    一倒.一倀 一倀 = this.一倒.stream().filter(param一倀 -> param一倀.一倀().equals(this.一倊.orbFormKey)).findFirst().orElse(null);
    String str2 = (一倀 == null || 一倀.一倂()) ? str1 : "Gh2xPY8cN5+MAgfqGMTPi5n5s7d4YRXRn7OzA+QMYBil+JM=";
    一倁(b + 36, 97, i - 72, 23, str1, paramButton -> 一倂(1)).m_257544_(Tooltip.m_257550_(一倍.一倀(str2)));
    if (this.一倒.isEmpty()) {
      一倀(一倆.一倀("etsRd54wa9aimhbo96W+AYcsdRZG+Wk+17AXr/EiZtuN/YYaMt2ATMXRzcS+4FFQfqdLAi7ZgrGU3C0lVbAX0l0="), b, 139, -2375512, i);
    } else {
      一倀("HcfzPE/B8ZEt48xDLdFWKv/x6hg3Urs+SPUhFzcGUMwqdKwgoEv6ujgtr3r44aIA8EEk", b, 139, -2375512, i);
      if (一倀 != null && !一倀.一倂()) {
        一倀(一倀.一倃(), b, 157, -2649183, i);
      } else if (!this.一倊.orbFormKey.isBlank() && 一倀 == null) {
        一倀(一倆.一倀("AiMwdAAWLQdYG8aYE2C1QOispxFwr9KiD+JvXV/yj59cpiqDW/MuyH7onNDc4X3LKgO8GpwrDfYugOQqB5OSckpVzguIHUI="), b, 157, -2649183, i);
      } 
    } 
    一倀(一倆.一倀("YPd5zPcQQafD7E990IYzv8wComppqJ7C4zzExtRPkfkUHay36QSy"), 一倆.一倀("K8DJVLSZTpXoxMwK6+GgCAlUPcweMy4Y8TjweECt7QqnUnLqfC90X7TIQjXkpCetu9pKBg=="), b, 176, i, 一倆.一倀("1vF7vr4irLQBlD7hfwjqnMLDw6C+kmN5bqF46GwXwfwsD2Z5AOirUqjUWy/LoJBsTEtCO1MW8AjOAgAgwI/BLisMAAdm72eb+Gfnvu4FSR0ZiJNjtAdUep9AS40w0sGOb1Xp"));
    一倀(一倆.一倀("xU3CWFJwghEPBS3uKzOz5W8GvqP0S9V/HNiuFqO172P7JzXPGtKQASzigJUr5mI="), b, 221, -2375512, i);
    一倀(一倆.一倀("DIUFUvFsYa2eEW5y5SOg92wiWqhXnmR+kF7XzLawVlqPwdLhXp43IA=="), 0, 262, this.一倜, 184, 5);
    一倀(一倆.一倀("80ZGHhgzwZFU49PON+YJCQuGWn+QednnBAXMrq/LqeIQvL88Ie5QWd7uhuKQx8OVP/UIDLRcwuwSGYOAyxxJGYB4juGPMWw="), b, 299, -728112, i);
    一倀(一倆.一倀("XTj9vdn1WQrO1EAFMI0mZiFbOlfejRayJYjQDzWWtG9ukefb0l3qKlTockq6e7aRKUOd8LPJ8I7QreNIf33FUFK2Smk="), b, 323, -11561732, i);
    一倀(一倆.一倀("cl4Z4nE3GBaZXG+290gOX8O3fDem9/bWL68YDObu3q4MM0z31ahniXfDBVcGj2Wmrtgw63wc0P+VpyFfgIY1V8Fc4edgJWA="), b, 347, -728112, i);
    一倀(一倆.一倀("B8qnAIh7IEnR9dOWZ0RLz46yd4+7K4vbUR7ayNYNZiDxejdhNmF74a2wHY3NYuBThISH+yq7wGmr4BQq/wHKwDWis6U="), b, 371, -728112, i);
    一倀(一倆.一倀("0WehNJ9GtHbLd2tnfe95wnmtFafVmRSR473rsMkpm+jnI6/DOEbUNL55SUkOse5ALZeQlsFD9l2VyYyFBg=="), b, 405, -2375512, i);
    this.一倕 = 458;
  }
  
  private void 一倅() {
    一倆();
    int i = this.一倕 + 18;
    一倀(i, this::一倈);
    i = this.一倕 + 18;
    一倀(i, this::一倉);
  }
  
  private void 一倀(int paramInt, Runnable paramRunnable) {
    int i = this.一倏.size();
    int j = this.一倎.size();
    int k = this.一倐.size();
    int m = this.一們.size();
    paramRunnable.run();
    int n = this.一倕;
    int i1;
    for (i1 = i; i1 < this.一倏.size(); i1++) {
      一倃 一倃 = this.一倏.get(i1);
      this.一倏.set(i1, new 一倃(一倃.一倀(), 一倃.一倁(), 一倃.一倂() + paramInt, 一倃.一倃(), 一倃.一倄(), 一倃.一倅()));
    } 
    for (i1 = j; i1 < this.一倎.size(); i1++) {
      一倁 一倁 = this.一倎.get(i1);
      this.一倎.set(i1, new 一倁(一倁.一倀(), 一倁.一倁(), 一倁.一倂() + paramInt, 一倁.一倃(), 一倁.一倄(), 一倁.一倅()));
    } 
    for (i1 = k; i1 < this.一倐.size(); i1++) {
      一倄 一倄 = this.一倐.get(i1);
      this.一倐.set(i1, new 一倄(一倄.一倀(), 一倄.一倁(), 一倄.一倂() + paramInt, 一倄.一倃()));
    } 
    for (i1 = m; i1 < this.一們.size(); i1++) {
      一倀 一倀 = this.一們.get(i1);
      this.一們.set(i1, new 一倀(一倀.一倀(), 一倀.一倁() + paramInt));
    } 
    this.一倕 = paramInt + n;
  }
  
  private void 一倆() {
    一倀(一倆.一倀("PylCX2e0SZApCS3gElfIa/CppDsxxGUc8KYYYw8OU4vI"), 0, 0, this.一倜, 203, 0);
    一倀(18, 38, this.一倜 - 36, 一倆.一倀("Aay2bfFaXi50vh+XXZkmZ5lsoHBnGW9o9Kglf7NryTO1vHyap+WULKONcvKsw30Zhw=="), () -> this.一倊.autoTeleport, paramBoolean -> this.一倊.autoTeleport = paramBoolean.booleanValue(), "WcGuBbOtykvBXSJcYxUPczrNQczkJ4p8Z+stRUyG9XFBMysV5ajNMrldcnHM03oSLdsq8enyaNgV/3+UrboJLHwFqLJ28ZJzYT1ZzCm0r010KNc=");
    一倀(18, 67, this.一倜 - 36, 一倆.一倀("BkeKZMzvD/T1/9hZeAjDfXE5VxZfYzJisGpPlh0+NE/tQaEFWQQyTZuILGQc+2LKQ7M="), () -> this.一倊.replant, paramBoolean -> this.一倊.replant = paramBoolean.booleanValue(), 一倆.一倀("sFJdOYciFywCBqBLA0wEUEsSDYRf/l5jZEVlkiec0bBDtk19jrWmQq4GmJuiHt/PUcXGbtvAK0UyX1bOXYpQmxVblKwOP9Aths2qg6Dnq29IPVbEYFbYaqb3Y7l4oC+3F3tC9hcpMw=="));
    一倀(18, 96, this.一倜 - 36, 一倆.一倀("4VbM47GW1rJdpCTIQPdyHAes+87ZxdH36l44ZapTerZ9w7DVDNnfxopINrrfCjqCvCk2lq6s"), () -> this.一倊.background, paramBoolean -> this.一倊.background = paramBoolean.booleanValue(), 一倆.一倀("sn7bwfjqU4M441dvLvIZp8RQlxYxy6ns2pO5s78TpnQL1OSOANaUvGZMGKEAUK0sSHQiQNmPkm8oP0oO/zGEuu5MywBKperP1AI+cSrve44nzZbA6Bj9ePOzG+1EDxsdAuoI15e2Jmd6ePU9hipgAM+SsyVxXhsMN8hnJg=="));
    一倁(18, 153, 168, 25, 一倆.一倀("pWGwXGhCE8Xh4typbH/Sm20sNWZ58NJntmAHA+WCPRPSTvQej530"), paramButton -> {
          一倇.一倀(一倆.一倀("vU++9M0fosP2E0tSIj2BHmzyYArYCucnKmEGJfkSumWiojYqXZIWVXfuY7sE0gHuATg="));
          一倀(一倆.一倀("7dJmbEaV8azWoTWDWJrYpg0FWOnECNjla+mBiXEQYgD4w9R95uX8FJ4="), false);
        }).m_257544_(Tooltip.m_257550_(一倍.一倀(一倆.一倀("8mkCnxfQrBhqJczqxKXje9yKm3VmMBELg0UzT0fCuXr0dSjSzgUOfBfTP98GWC1qT4Q19XcuM601PdQvqrlHnaP/chOHnOR1oKQiWzHHWj/eIro="))));
    一倀(一倆.一倀("zKVmUFvd3vx7e1HFo/w/gwQji7p2WxSwN3Fs7O+CokWZ8DTRwA=="), 0, 215, this.一倜, 200, 1);
    for (byte b = 0; b < 4; b++)
      this.一倐.add(new 一倄(b, this.一倛 + 18, 255 + b * 30, this.一倜 - 36)); 
    this.一借 = this.一倛 + 18;
    this.丁倀 = 389;
    this.丁倁 = this.一倜 - 36;
    一倀(一倆.一倀("JoasJhdwHEKHQLsBZTy9e7CY5BUU4GZtJShns7kSmA44w0sGFKFQO6YpCMLyGtho2ciOSHB6iS8vwTV0C1K4YZaCZgk8EuauxiNu9OZRRh9uLPU2gH6o1Q1gFL1A+Ys="), 18, 431, -2375512, this.一倜 - 36);
    this.一倕 = 455;
  }
  
  private void 一倇() {
    br.com.farmdmz.config.一倂 一倂1 = new br.com.farmdmz.config.一倂();
    this.一倊.autoTeleport = 一倂1.autoTeleport;
    this.一倊.replant = 一倂1.replant;
    this.一倊.background = 一倂1.background;
    this.一倊.showHud = 一倂1.showHud;
    this.一倊.teleportCommand = 一倂1.teleportCommand;
    this.一倊.plotCommand = 一倂1.plotCommand;
    this.一倊.cooldownMinutes = 一倂1.cooldownMinutes;
    this.一倊.actionDelayTicks = 一倂1.actionDelayTicks;
    this.一倊.openTimeoutTicks = 一倂1.openTimeoutTicks;
    this.一倊.teleportWaitTicks = 一倂1.teleportWaitTicks;
    this.一倊.visitTimeoutTicks = 一倂1.visitTimeoutTicks;
    this.一倊.pollSeconds = 一倂1.pollSeconds;
    this.一倊.retryLimit = 一倂1.retryLimit;
    this.一倊.plots = 一倂1.plots.stream().map(br.com.farmdmz.config.一倂.一倀::一倀).toList();
    一倂();
  }
  
  private void 一倈() {
    boolean bool = (this.一倜 >= 360) ? true : false;
    int i = bool ? ((this.一倜 - 12) / 2) : this.一倜;
    一倀(一倆.一倀("5R0/SB06OYR8+5Bg7kMFFzzDCbkBYQJ1G0cAvm4xkJyYKAqHN8cGnLpzANpw7A=="), 0, 0, -2375512, this.一倜);
    一倀(一倆.一倀("9a2BAd7o0LuqoU53zkGjXT829zdyp7LHl3WOZc3yEndIv8kl6QEkrjs="), 0, 16, -11561732, this.一倜);
    int j;
    for (j = 0; j < 4; j++) {
      br.com.farmdmz.config.一倂.一倀 一倀 = this.一倊.plots.get(j);
      byte b = (bool && j % 2 == 1) ? (i + 12) : 0;
      int k = 44 + (bool ? (j / 2) : j) * 94;
      一倀(一倆.一倀("ei4SvzVa+0386NSfFW07AVL6qCejO9QeeNvTJQ=="), b, k, i, 82, 1);
      一倀(b + 29, k + 2, i - 41, "6/q9PkL7Me7JOGm4OnKg05Rb7VbBA7p6lbVUN6dyg013JHRk+2c=", () -> param一倀.enabled, paramBoolean -> param一倀.enabled = paramBoolean.booleanValue(), 一倆.一倀("3WtmwmWwAjEPGOir5XBl1oHGnlYZQwC8oVa2+kxayZNnPsniS3jwLXwfZvuRXCml5FUWdSfwhle4CdrBUKtuvR+hEA8U81FZhg3iWz8XpJUNHAQg9yXKBa7KZqnqa3KJBjMeDL2jYeKsVna+WiJgjXgjg5RtPypfLEM="));
      一倀(一倀(j), b + 12, k + 45, -728112, i - 24);
      一倀(一倆.一倀("6+wtirGvPF4p6O8R63YJkHbQpVrZmQGbeZO2SMVtFc2jsK//GpEZLiwXsg5Pm5Lykww="), b + 12, k + 62, -2375512, i - 24);
    } 
    j = 44 + (bool ? 2 : 4) * 94;
    一倀(一倆.一倀("lkm/90N/kPawlq0dhrMIlB+1n85RANCVmKOLuv18UuEgA4qPVQw7ymQOhLpp/vyGnOyQri1j9/A="), 0, j + 4, -2375512, this.一倜);
    一倀(一倆.一倀("1v3MbL6SQNlgX/pM+wAYB+4XCOyVXvLiqYjF8YCBJRPU2BIr2dgBwEpVkW955f6a/zNpLD5T+QjXEcQ="), 0, j + 21, -2375512, this.一倜);
    this.一倕 = j + 43;
  }
  
  private String 一倀(int paramInt) {
    String str;
    for (str = ((String)this.一倌.getOrDefault(一倆.一倀("XRU0/zDSPPlHBoE9bgoj+j+vLHSp5FPON3TLVOjrJYWZeocSjqez4A=="), this.一倊.plotCommand)).trim(); str.startsWith(一倆.一倀("TxdNVGg4QQJ77sdlu1VKRAEOUCSNEpbQwFKPUZ4=")); str = str.substring(1));
    return "wlu0trels1Qh7W1pNyln3M2GqsZDEFSTuFhi0oB+Cw==";
  }
  
  private void 一倉() {
    boolean bool = (this.一倜 >= 360) ? true : false;
    byte b1 = 12;
    int i = this.一倜 - b1 * 2;
    int j = bool ? ((i - 12) / 2) : i;
    int k = 149 + (bool ? 3 : 5) * 45 + 3;
    一倀(一倆.一倀("a6LVkGAx+eVikJWluQjIyuOj4k7rBxgvm74x1yzoHyWx5g+E3imnc6uz8hE="), 0, 0, this.一倜, k + 68, 2);
    一倀(一倆.一倀("rdf4ynvlXG8z/yLLgTZkQ4Tg0gBH2mwFHNBX7VnhVaORwFw="), 一倆.一倀("UTfc5Q1TyFUFwyAfQKEbT2ahYqpgnIjNB1VtgXWAMitp+Slz5z3EZRdhbA=="), b1, 40, i, 一倆.一倀("44fT8676+wKHy7RhdqZM7A9OeWSORnrIBIUCewPGOckwfKwN4ofJpbHjAEATTZSVLlMRCDkUCtyBiYpB56AGL052jL3s0Qx8"));
    一倀(一倆.一倀("JD2RSPy+ShhxyCC+Bop2wNY4trZVWd3DOKa5iNRPse6H1c6vwBHqLg=="), 一倆.一倀("kWcEczTgH2BzDhg/12yUSLW3vm+gYBqPHvY0Mh+AgorIZ3FOcbNvLoOXGqsGEnZRDA=="), b1, 83, i, 一倆.一倀("OM0YFswuKAlI79KWiYHMIDWVpOJDnT2MD/aE/SrtlSp3O4wrM94dmz1m+TG+kc8xuta+jyBQk2cZ+svldipxuchBw4y8N0zFVDYJf9ClomQE7mvmXT/7R/iEvgwOVwJ9jqdNfYYRCnqy3flLL8ujKFI7RnooOERS4urTaRFS"));
    一倀(一倆.一倀("QpwYu8ic2G+5kDSxfU/RdLiXPeG74AV34xJwhl+0nz9ryh6J26IwnNiq7x9ultUZ1/4rISRNNBxBGZw="), b1, 126, -2375512, i);
    String[][] arrayOfString = { { 一倆.一倀("o4bZlSKjdFaMa0Pe2gZZW9eR4ZrzmIHvjMTizL9/pYVk/Q=="), 一倆.一倀("srzI96IHGSqlve0pPyv1wlPYNSgd9zWRI+KcE4kV/vph9vLUY6KTypuJkXONWBT0wK0Q2ULKA2NO"), 一倆.一倀("B/vIZ1rCQf3LNpvynHvKFkk/wyqKy5WzWafUzcEsx461A1gF4usEB0k8pIj4sjvNzkWFrjWvsig/v0o=") }, { 一倆.一倀("2P8nw5HM2JGqsiuPAMUhxUn+soJ+HthODUU4t9SDexo="), 一倆.一倀("z2MT59bqb/BnmEvnFUiSrl7Sd9GoFLEpkI8EusX9ZHON9luVdeCLLFkA0cYt6AkmCwY="), 一倆.一倀("vLFpkKjiTtmPec5m4LoQmRoF1ybLd5VGO/K/M/po/t0MCQjk3MH9kfC5x660vTYlIkqHx2G2XcEsAlgAIQ==") }, { 一倆.一倀("ass97pNI8vIEl2vIu84r+rnP73GpFDrDVdhEwcIS4g6DNbwx"), 一倆.一倀("V6WMRayjSsiuN2lYgWHMj8CgjcbSR4fvKHNQWe5hV2xwvjaSKvwIzegHGr19bkpQF9xBZGhO7Q=="), 一倆.一倀("20ByhW3lgLLOzgIEPU7spw/0HsHOQzMAFNd75JU6Y1aclXlPbczR7XVbgnclwKsjkSJOc2mJ4OPVw7fjzOEyCYMwRQ==") }, { 一倆.一倀("TfjQTJphvLRJHwAdx51rbDxx7yT3Pua6DBZg9fQwqUwJjfg="), 一倆.一倀("bw0FBmTjebkbXp93Rth/cCeFwu1JI7yXFsTd9wzMuiO07+YnA4nso00ltPE="), 一倆.一倀("VTjTpXUozPJO6O4m90sFqgeqbW0WrSScqNTvnuQfcgvmd8EX1mS8L48Gj4K2tiajsVMX6JOaaCJniPuyaagsxs2stw==") }, { 一倆.一倀("KtTC1r0KAm1UXylydMhlWjnd07PywlaDtZ6ObqCDH361eGc9"), 一倆.一倀("YP2AXsv6jCYmqgqT4pQp4kVPu71egde18lMEXAyBx3WeOn46J7omJkgx2BQQK3L1jlQ="), 一倆.一倀("W5qWRentRkXi7lifrpaIcsHICe91QicajkGDq2gjP7J0HifmRAc5FypeRGOc4ebwpCc9xP4RTpXAJT97SbjgBDWrJuoq7MpO/5uSNIjyXS5UHOXALUhoBqO1XeDCacAg1SfHr+SVN1wkgHhoPTkN4kPZYHDg6LP23G61jU6US5h1l79wh9ifQ+j9qrb+p65xv0UzTm+9qAo48v/WaXIt/FgKqT3WuFG2XhaGdiVThLe8UZbZKHNAIxzQvL1cW3l+VUDTb8QWRwDcjSnKkRBYaw==") } };
    for (byte b2 = 0; b2 < arrayOfString.length; b2++) {
      int m = b1 + ((bool && b2 % 2 == 1) ? (j + 12) : 0);
      int n = 149 + (bool ? (b2 / 2) : b2) * 45;
      一倀(arrayOfString[b2][0], arrayOfString[b2][1], m, n, j, arrayOfString[b2][2]);
    } 
    一倁(b1, k, i, 23, 一倆.一倀("/WF0Lbx5sVlyLF3XDte1bcrE3kmlFab+JBl4RcJozkyuu9aU4IoaK8CedLQLcEQNr6Z3HoTZIA=="), paramButton -> {
          一倇();
          一倀(一倆.一倀("cpkPBZApC2Y4XxphTL9lQj+iJj3e5SXH4feNfdzxUKGMHMisceYXghzIs0hEPXGuvnxqVBCkdmxiC+TIrYaJIPzVuwCpZhqtOYm32Bo="), false);
          一倌();
        });
    一倀(一倆.一倀("zODeSH9Okda2PqZd0NpD0obpKeqHvZzaOQiWnpuCQwq6hyRP4sM+Jg35AhxxE+J/"), b1, k + 38, -2375512, i);
    一倀(一倆.一倀("bXMusux1XUlvQoRA28FwTUmN0dB7tjbs4CL3r5c7HyMHtYovWbg+RGw6ipfPHKnM"), b1, k + 53, -2375512, i);
    this.一倕 = k + 80;
  }
  
  private void 一倊() {
    boolean bool = (this.一倜 >= 360) ? true : false;
    byte b1 = 12;
    int i = this.一倜 - b1 * 2;
    int j = bool ? ((i - 12) / 2) : i;
    一倀(一倆.一倀("wV/j7sb4lvoPdbjfxPTiaDQPCBPuYj7kMcYpe6sNi1oDb7hV/oF+wlRDT2YF"), 0, 0, this.一倜, 130, 3);
    一倁(b1, 82, 168, 25, 一倆.一倀("3rEYPA9C6qPkEylOoI55Hnh31N6iDBhXCo5VbwvO1XJvqd2igSYF"), paramButton -> {
          一倇.一倎();
          一倀(一倆.一倀("6fMEE3z9bMIawJh/IQSBsmf14gLfB0d7rIfDxtEJ87deSpdJ0hCghqg="), false);
        }).m_257544_(Tooltip.m_257550_(一倍.一倀(一倆.一倀("H741yNMxYdh2OfDrVHOXXNj/gWz3uxzV3AfHHLbOYRB5r0kdcouGNb1zGsc0WVbd6W6wwXP4RVp1b4pB5VLAAJ4Y+UN5zVNN0kJXukgjnHG093Cz+FJT8YvzQQ=="))));
    一倀(一倆.一倀("idc3oxZe39DXjoZRF9aI8I8CGumQ9hGurbtAF9NDzOmzjOYYE50IYntgMsePQhpk"), b1, 48, -2375512, i);
    一倀(一倁.一倇(), b1, 113, -2375512, i);
    char c = '¶';
    byte b2 = bool ? 5 : 10;
    int k = c + b2 * 44 + 9;
    一倀(一倆.一倀("T5rn1MYI2FZV/SIKHojPKX4mYA6KWJsbj9++sW54dG34IRvt7YGGII2To9s="), 0, 142, this.一倜, k - 142, 2);
    String[][] arrayOfString = { { 一倆.一倀("Y3u2FmbtQXDkzfplFAoPoYIXCvU8Y1VG7V3uwiJEY6+Ri+6Y/poS5YD4E0c="), 一倆.一倀("xbXQLwUTY08Qo2UdyiC9bCRuFBAbvcBZf3w0xAwkAanVFDJESqpJFBEV0FKoTpQT2hjONquP"), 一倆.一倀("sFusWNpRgP91v2OUgRfefcPw2BPaMpifNv1xZsRAeYxAUV9gBYAIHvbZFtyxuH2gGyG21BZu6zqM9qrCczUaslt9f6Yig30I6Mz6yxZT1ElL") }, { 一倆.一倀("/+GRIHZWpiNGarNFG/ybLMrUmGMufJJeGe9KKASrSxB9EBDh7U2qPfIigdh3LaE="), 一倆.一倀("jo9C08XaR5VOexmDd4dZbhmGW+MquuCWkUPpV/AMRkELxm6vzDs0d5A59FRKqHLPiuplaqoJ"), 一倆.一倀("dwj0MwFBVGPHsD1cs48x+9BEqCs2pGuXyK4JY9gJDY3XnWzCb3SKgEnErvfEQFK21wACeka3KRw1hcDnnrPNMnMWrrlX69LXLa9Egx25Q+11JA==") }, { 一倆.一倀("yFQD/3DHYPkhe0MBBisMiC53+WjFoutAKwgWKiwob1ZUkqbmy9MGSQ=="), 一倆.一倀("lZtc1IyZUifL4U9Aa2gPh1PJZV3nL3A1R0Apka+kr8DaclqbI4eS1uvwctZpU2lrQM5I"), 一倆.一倀("amr37or6yhCx/ULLAdiXh4EbYR6Fus+Srz72fuSaVo0GsJkW/UVHfO2m9ThFPdMdPWNWlwnwhNAdfGZJwigUp5JaMzoHbfhfJ36Yo1ZiKmuHku4=") }, { 一倆.一倀("P6AS9mDP+HnRleseGh0LXSJfhvz9JZLW7Qj0kjmrs4kF32BQ8U5zsFBtQw=="), 一倆.一倀("qbziatI84iZWNpHw0wMxmIHgmsbkEmef5/Y9u+D8/pwluDbWirm88IXbvkbYJNVhkN7d"), 一倆.一倀("21HltnwpFpAeBKlMjH8kBzWWgjwdEdU409PxejjAHGIHYI17YHpFXJIJlbWUiJ+kcj/2DvtQESvInyRBt4ALSVKmWzSqQP7WEMtn") }, { 一倆.一倀("J/EdDphrC0wjZ/ZGhS5Z040kyMqaW67ImL9GHa2ivouSHW5VEC7v4l0="), 一倆.一倀("EKIUoR5GxqyCNCG26IGEa6t5pXA4v6e/VfH+d9oz6v/AuWOhvujZATVNE6CHjbv6bzw3wQg="), 一倆.一倀("PJB6KRsM28QME3mC0UzoaevMJfE7CKFoMZOuFX3nO832GXm82TqTi3hVxmFEYXFRPnfl+kzt20DiS0tGStW5i85tWTLmfEufUA==") }, { 一倆.一倀("oNDJFn9/Ahe4l/GFkypgd6/wmGbx9BX388+GF2u1oHtffe12U2zjK8Kr"), 一倆.一倀("QyCWY+2+puN8borZRVEnuMsqhjP6njI15HIktzA7nuYuc0PhWsiZTdTGRUlFVNeoJqCdOA=="), 一倆.一倀("F0zYJ5h+Q1FyHJWkT66Wp0m8w4igtB3ea2DGMDgH9kb33iNI9lTdkWuvCP86nOkaOmSHxsTsPqWMEg==") }, { 一倆.一倀("8ySEZJtEgYuVcVkn3nQxyCJpC/V+z6F9XR2d4n8zLNHiX6mpi0QgZa37vmVi7rZ8vg=="), 一倆.一倀("Txjv7YaHopMvx8FbPAyKNINSQ/TrFejnSxRLUyOGyMGuZRx7boRgWKk4QfJ/bo/ZdA=="), 一倆.一倀("dlmOzsHXob3evTjrb3GrFC6d96lgdjILBx211z0+QoyxB1s8HJgnE9Sm/sr1osDXZYSPJS+1XhjNVuJwT62GvGzexoVB0GaBKr16w5sZ3g==") }, { 一倆.一倀("une57IO+HC1xnFpdDYsTBZNci1+ALN1+zvJphdKK/35JOJB7VrWdiMJ8"), 一倆.一倀("tyJ6fABvmddmtR1Iiiwhl7t6Nx1AWJ7nspYiRyv2GHSfcjgevlsrxgq9E0urYAZHiYFPGsD4/AUW"), 一倆.一倀("y7WUH0jvRfAEHi9FuXzGGAJaucd+jl3OJaHMzE2uw13blUo9aPZxKAgwES9J4IPrjpoME6pFRfMZwFSpsDP8D5aQCwV35kJv/7nl7ZA9") }, { 一倆.一倀("OzhWlHpPUuCUmVraCQDk0MkDCXzSJZk5G2vLgDBija4o9L5S+PNlvgEyNq0="), 一倆.一倀("GgGc7hR6Sz4oXpwt/fbb5Yoji4tjCSKtm37bK1+prOBHqhHGR/uOeqg1ieXGh7h+/Z5/"), 一倆.一倀("shE52m3xHutX1855Raif8MA9fcBaPAa5y/uUKS4vaovlvIuO2kM9Ebkz6ZwvAzigadFQbpGADslkkgzufBAQSGU1iTW3Sg==") }, { 一倆.一倀("KxogBotb6VLhSNN3Lp9lDCyookkTrQlxrUPW6OgLj7ORUmByEnsTfg=="), 一倆.一倀("iBLsD8qdb+Ka/eBiIHQNrC01Oj4wgLbYB6lSu+h/of3ZDZFJRfBQx94="), 一倆.一倀("hxzH8Sxui8WXt78UQ3Gs3vMj4fWKw2Y5HB9WQ53FnqSe68VQKFuXdwT8dsPM2IS/MELDyqT/FVyOuRJpCnqLuC3Q7qEvVHGx0+cmOg7LqQh+gje9uhhu") } };
    int m;
    for (m = 0; m < arrayOfString.length; m++) {
      int i4 = b1 + ((bool && m % 2 == 1) ? (j + 12) : 0);
      int i5 = c + (bool ? (m / 2) : m) * 44;
      EditBox editBox = 一倀(arrayOfString[m][0], arrayOfString[m][1], i4, i5, j, arrayOfString[m][2], this.一倍);
      if (arrayOfString[m][0].equals(一倆.一倀("IMBxqYgtBU9QRfA393TGZFS24cd2rbYXRAvE80Cfo8bakbovoUfP2g=="))) {
        this.丁倅 = editBox;
        this.丁倅.m_94186_(!this.一個.auto_scale);
      } 
    } 
    m = k + 12;
    int n = m + 37;
    byte b3 = bool ? 3 : 5;
    int i1 = n + b3 * 29 + 3;
    int i2 = i1 + 58;
    一倀(一倆.一倀("DRJCTP/RnIkoQu1sziymOLSSo0rE+pYUNW3Zgjfnrbk1rNzzoZi9YYbTHADX"), 0, m, this.一倜, i2 - m, 3);
    int i3 = bool ? j : i;
    一倀(0, 一倆.一倀("qgdyUmaFebhE8dzWQVRl4/YO+ipaatzM6RuhM4o9o9X+SlQQS9vRC2Vukub4"), () -> this.一個.background_mode, paramBoolean -> this.一個.background_mode = paramBoolean.booleanValue(), 一倆.一倀("L0+arIBzRXAQ6b/uBemUct/l1HWM2E6+0qePE2A4Rx4ZzyxVdZDOtNpeTk01B/sROltW9pqVUoGSAhvv/VV7pPVlVrH7DZHPqPRKNhPaAzAMOeo0oCaGXCC4bdNtY6FykpyTpaVWDhgO7NjCd4jsuyarnk4kpaLVR4oqSuHu5LIKKvxxQsMBPLgttxpYJsqk"), b1, n, i3, bool);
    一倀(1, 一倆.一倀("OLEBTZz5w47ZzLpGIi4DdteMsXNGVuYYOEUl37DkfWxBe5yFWLpV/ARf4Q=="), () -> this.一個.allow_shift_reset, paramBoolean -> this.一個.allow_shift_reset = paramBoolean.booleanValue(), 一倆.一倀("Sptxv/3VXxgGc4USXzMNJmcCjF5gjNHNAm+X6db5zUlE0Bn+WqGH3NcwSg5vTKW5odHoaO5J5qjEnGinxY+wyjgRlPCb6ViUCko+2KsPdsWlnvGPPjwba98tiaQjeFg6/EggLuG9t73/diNdjA0BDlPwWY4HYJs8CIq2"), b1, n, i3, bool);
    一倀(2, 一倆.一倀("/FJug0stGT78JttsEGFpkUAE4eYkdstoNInLh9oBZ58FkD1gORUAb/mxf0WtOg=="), () -> this.一個.auto_scale, paramBoolean -> {
          this.一個.auto_scale = paramBoolean.booleanValue();
          if (this.丁倅 != null)
            this.丁倅.m_94186_(!paramBoolean.booleanValue()); 
        }一倆.一倀("uw43A1G2cRyos+sdIaL5mDTiGgM7muZASJc8m0ZSEbApVBmtppQEN/m2vdFykefnyNaougOAjn5ymVuP20AjSxjLahAzOmTMnts="), b1, n, i3, bool);
    一倀(3, 一倆.一倀("OG0XfcjK4H6K5JToWVUsmHgsgi9qcDOX0FoOJBDhWn/1zky/fchiBQ=="), () -> this.一個.debug_record, paramBoolean -> this.一個.debug_record = paramBoolean.booleanValue(), 一倆.一倀("YeyOEUnxzfhHYJIX9OyxGf+sP8w/1dl37WO2sFL58DB/pljtxJVAv5vw4W3ZzUU99/9SyegE1FHSGRi1lnflPjBgpLVaqPA="), b1, n, i3, bool);
    一倀(4, 一倆.一倀("MrWhM+X6JMpDaQoQSFGzBYGiYiwJZaAudNB33s5E3uAiobZ4YnZvz6lX"), () -> this.一個.show_hud, paramBoolean -> this.一個.show_hud = paramBoolean.booleanValue(), 一倆.一倀("rPPTxerv8aezTagE0m6MqaqCcQZsYh0u0UTysPCxAZ47MbTaTNxicKgCm34/sPwVVwErk19lwb0QKUULQ7LTbTAabI9+VjwrxcBOKvmoZkMD"), b1, n, i3, bool);
    一倁(b1, i1, i, 23, 一倆.一倀("LVm/BPT/tapUWWG7rrqPCGsMPFVviRzjqNAtL43I53bqyijljURPfQrb3h94jhpkKU/lra0/Kw=="), paramButton -> {
          this.一個 = new BotConfig();
          一倃();
          一倀(一倆.一倀("Kt+anMbcHQzjLyqbx2OgL+HIWy0atPw0y+m2pOLZWn6am5Us/ABckQozEtHG1w3ukCa6RVlF2+jnGgJNYeNFdK+0Y9+B5037undqEzQ="), false);
          一倌();
        });
    一倀(一倆.一倀("OeQI8qK3/UB+ZMjP0Q1I1h864u9jLOPRBvyp10mGOOW9gfErfLkxCslDf7RiZckyIPg0LA=="), b1, i1 + 36, -2375512, i);
    this.一倕 = i2 + 12;
  }
  
  private void 一個() {
    this.一倒 = (this.f_96541_ == null || this.f_96541_.f_91074_ == null) ? List.<一倒.一倀>of() : 一倒.一倄();
    byte b = 12;
    int i = this.一倜 - b * 2;
    一倀((this.一倜 < 220) ? 一倆.一倀("0O+wYuKFu0Q2scR+5t0eMimlrRap89QA5IyPAySAvcI2oRG+ZMOBVlTy") : 一倆.一倀("5yCxeUlKBQ7bjrmG2KHPkhnV2R07gIwLkze1xr2kvfG5dYgBE7ACZWK/QSQbq5TO5aw6"), 0, 0, this.一倜, 250, 4);
    一倀(b, 39, i, 一倆.一倀("odWZIcWzOxdLFygkXq0vbI18KCTp2QWUnpXHHk746f6/WtapBxGzwawprvL6ZaQo8Q=="), () -> this.一倊.timeRoomBackground, paramBoolean -> this.一倊.timeRoomBackground = paramBoolean.booleanValue(), 一倆.一倀("RIZ/KqGtUL7cI70blk1hbsF9pOJLhTPjwWkhiKaOfC7YiRpS+eKwW1IVdD1tPy3YkdL8j+OHupawmCFE7grjKGrkY1SiKoRSfYmfmzzMb7jcBtyfwO2ZaxoeHFNDO9R+lLm0w0kJxOT7WUDTWFdyKNoe4yko+0WzKOXPpj9ot7Rpp+4DwktX"));
    一倀((this.一倜 < 220) ? 一倆.一倀("E/09pE8Z1N2AoL2pB8oRTz2kXk1g4eYX3EYkcHJYoV6jcf5Hwud3IOWw3w==") : 一倆.一倀("OQiZBAIoBKzNixlKy7nvgSF/jWs+UFHpz5ldktGcQuPyzedfKlBl0kBVDTb1Yhlmp6qCP1x4Vc0="), b, 75, -2375512, i);
    一倁(b, 97, 27, 23, 一倆.一倀("l9PVZOCACmb+qc7tw2TPpUa7606/zCuUXLVS1RU="), paramButton -> 一倁(-1)).m_257544_(Tooltip.m_257550_(一倍.一倀(一倆.一倀("qW6KXLH+yojS19cJ0JtCxoI51JDAd2D7IzJgeuE9SlGueGwo3kIlE/GdjQwUt/C5fQej4VzHBKbHhHh66LuqaMk="))));
    一倁(this.一倜 - b - 27, 97, 27, 23, 一倆.一倀("E2lJKAf0g7B9yS7hz/Jjtl9DiuRJUZlTp02MAEg="), paramButton -> 一倁(1)).m_257544_(Tooltip.m_257550_(一倍.一倀(一倆.一倀("+MQOsRN0Fe0W4plUO7VOZ5U+VnIkNxFy/FkIpA3+QOYd2MiyHa10WfYla6oDjLaxmwMGOQZZActdDIJfT8mztLY="))));
    String str1 = this.一倊.timeRoomFormKey.isBlank() ? 一倆.一倀("AKY+jP5rDsB6fIbbIQmZDvGctwquKqpFUraFgoFhHkecRm3M4hEV1ao4HJshcmbA8KbWuy5OX840") : this.一倊.timeRoomFormLabel;
    一倒.一倀 一倀 = this.一倒.stream().filter(param一倀 -> param一倀.一倀().equals(this.一倊.timeRoomFormKey)).findFirst().orElse(null);
    String str2 = (一倀 == null || 一倀.一倂()) ? str1 : "fKhQDTJX6i2zrcc3lytA/13VQ1UzTbPUUG0mWjTgHVC8Zzw=";
    一倁(b + 36, 97, i - 72, 23, str1, paramButton -> 一倁(1)).m_257544_(Tooltip.m_257550_(一倍.一倀(str2)));
    if (this.一倒.isEmpty()) {
      一倀(一倆.一倀("jW7ytv/YASW8CgBUm/dQsjohXT9/f2wdV8yY6lLrxneOutzjWdRtcxzlIM+0wnlk2Uf94ZKnZ7r8w//Pn4hfv+s="), b, 139, -2375512, i);
    } else {
      一倀("CPnzAesm2E4F18TegCbq0JbHR5PQp04mIbZUhd/zxqJfKortpT7MjGZUoKX4lA0ievGR", b, 139, -2375512, i);
      if (一倀 != null && !一倀.一倂()) {
        一倀(一倀.一倃(), b, 157, -2649183, i);
      } else if (!this.一倊.timeRoomFormKey.isBlank() && 一倀 == null) {
        一倀(一倆.一倀("N2X/3y+IZJ+kHjE/FZeLda7fiLJngzUEHPY7tEHwd4M0LXU6kZFzikXg30e1ubgZffdM1KdMMLJW2UqXIQj91Edvd22XIfM="), b, 157, -2649183, i);
      } 
    } 
    一倀(一倆.一倀("lUljrURYU9U7iMB4DLF2ud0QIZdlt0yQggXHwYeAJf3SM6QLvuaLuAFqUg=="), 一倆.一倀("bqhzMlfSQxPLO6UiYa3AjZiAeuUPo9Tjo75AIzhzvKZ61Adq+TC5n+e2dSU="), b, 176, i, 一倆.一倀("jxDZBXpBStl/c9PyCGYZTJgYO2qVuubwLUxMvJqsg45P1FSU61nhV7DS86c0JqnmP0gJluFMLHjeBmURp0GcpHpM7EVtL7B8OHnPkQ2FuOkn+MVLIODshub/BKCNXJvmGU4pc0h3mOkLjEVsor5YqYmeQKn0Vvvl3qd95Bc2OiUBF74OKpGJe/U/ZA=="));
    一倀(一倆.一倀("5q+Ez4pXAWOEHC8YQtZKkL3SScB7V15rcM0w2ZYEFCaQAZ8zzYW73WCSOedR6jhJ6j7f/cg7oidTBA=="), b, 221, -2375512, i);
    一倀(一倆.一倀("Sn0xbFg+4WQP+2WxJS0zpxI/QoXFQen5ADoKoaqSdTSk59aXoxIgRKgXmDqWQ5iwJuLh4nWUNsQ="), 0, 262, this.一倜, 184, 0);
    一倀(一倆.一倀("pon5eVwY8s008KWGcedk7DcZFoo/Rj1U9GT+kyw9lML/8KRYCgAko7XCowMyT7Z1dysFAJpWg9I26W/umCvv0A=="), b, 299, -728112, i);
    一倀(一倆.一倀("BCmZuoqYFhIXdRWwtU1f4w+eJp/f7RwBNMyJRN6u2WiK9oyNCVhLSeZs9IznlXN72KAg1C7xEXa9xQ=="), b, 323, -11561732, i);
    一倀(一倆.一倀("r03TUObgwHc02Ni4gV+0PVDEm6wS0nzJaKOdkWmUmrh8Bqi8DO3F+/Hkeu1Q61H9+w9423GPs0pMM5o="), b, 347, -728112, i);
    一倀(一倆.一倀("SEjrIfDFObxYUdGVviLfaPupsOH00CBu7vI7zWKUIVxtkjc3u3YUN4r5DvmBq665LWgPixtkKbotXGhq+vbOlQ=="), b, 371, -728112, i);
    一倀(一倆.一倀("2637kikOVJpT4+RRVYb41rMl/GimMRRfx8TMdO0voR0cyoxTWaZKDTx5BlPD0NcGN35Z7WRMPv5o"), b, 405, -2375512, i);
    this.一倕 = 458;
  }
  
  private void 一倁(int paramInt) {
    if (this.一倒.isEmpty()) {
      一倀(一倆.一倀("gxy270rtG9N2pj8L98k/EG7KqoVRPN1ItL8/WOiumgDkblwZ9WZyJznh6ZNk0Lj0+XI36uwDCdUIoh1J/t2o1EbEEHgtRmyOPtQbKJhI8A=="), true);
      return;
    } 
    byte b = -1;
    byte b1;
    for (b1 = 0; b1 < this.一倒.size(); b1++) {
      if (((一倒.一倀)this.一倒.get(b1)).一倀().equals(this.一倊.timeRoomFormKey)) {
        b = b1;
        break;
      } 
    } 
    b1 = (b < 0) ? ((paramInt < 0) ? (this.一倒.size() - 1) : 0) : Math.floorMod(b + paramInt, this.一倒.size());
    一倒.一倀 一倀 = this.一倒.get(b1);
    this.一倊.timeRoomFormKey = 一倀.一倀();
    this.一倊.timeRoomFormLabel = 一倀.一倁();
    一倀(一倀.一倂() ? "/JaOhfKCCjqk+AMPZ0jiV5YB1dpWSFXB4EEgFtFxr19M4skTB0kr5Tv2MJreuMXMRNuXz+XCIL+w1Gw=" : "405K4zS1uB0RUUbzrlhIcXopbYZrNrezu7RrRDJFbkFbV4Sc/b9bByxspT1SneEAqxc/U/0wr04=", !一倀.一倂());
    一倌();
  }
  
  private void 一倂(int paramInt) {
    if (this.一倒.isEmpty()) {
      一倀(一倆.一倀("TA0lRCvWp+r4b5EgFiksMCxnnQdZrYvmuhRwWwdRJOpfUhzlqm1+TRZwrHvKipX+8ObhFJT2mqGx1xnlYOCXgzRyRxaRlqe+Zzu8zRu6VA=="), true);
      return;
    } 
    byte b = -1;
    byte b1;
    for (b1 = 0; b1 < this.一倒.size(); b1++) {
      if (((一倒.一倀)this.一倒.get(b1)).一倀().equals(this.一倊.orbFormKey)) {
        b = b1;
        break;
      } 
    } 
    b1 = (b < 0) ? ((paramInt < 0) ? (this.一倒.size() - 1) : 0) : Math.floorMod(b + paramInt, this.一倒.size());
    一倒.一倀 一倀 = this.一倒.get(b1);
    this.一倊.orbFormKey = 一倀.一倀();
    this.一倊.orbFormLabel = 一倀.一倁();
    一倀(一倀.一倂() ? "Jj9xfQQhNfoozJz3EBjVCzYNCW/8U7Oh9q2b5YerMGIqmKasX61+vpMk/7zk3XXo1zgSabuL" : "v7FDcWoZCq5Xjnk8V5kOAiXOAZ1CxLTgA26XySQ0mnFs8DpkzdYMST8NnQxVkaSqzwReR6ez/B8=", !一倀.一倂());
    一倌();
  }
  
  private void 一倀(int paramInt1, String paramString1, BooleanSupplier paramBooleanSupplier, Consumer<Boolean> paramConsumer, String paramString2, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    int i = paramInt2 + ((paramBoolean && paramInt1 % 2 == 1) ? (paramInt4 + 12) : 0);
    int j = paramInt3 + (paramBoolean ? (paramInt1 / 2) : paramInt1) * 29;
    一倀(i, j, paramInt4, paramString1, paramBooleanSupplier, paramConsumer, paramString2);
  }
  
  private void 一倀(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.一倏.add(new 一倃(paramString, this.一倛 + paramInt1, paramInt2, paramInt3, paramInt4, paramInt5));
  }
  
  private 一倂 一倀(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, Button.OnPress paramOnPress) {
    return (一倂)m_142416_((GuiEventListener)new 一倂(paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramOnPress));
  }
  
  private 一倂 一倁(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, Button.OnPress paramOnPress) {
    一倂 一倂1 = 一倀(this.一倛 + paramInt1, this.一倝 + paramInt2, paramInt3, paramInt4, paramString, paramOnPress);
    this.一們.add(new 一倀((AbstractWidget)一倂1, paramInt2));
    return 一倂1;
  }
  
  private void 一倀(int paramInt1, int paramInt2, int paramInt3, String paramString1, BooleanSupplier paramBooleanSupplier, Consumer<Boolean> paramConsumer, String paramString2) {
    一倂 一倂1 = 一倁(paramInt1, paramInt2, paramInt3, 24, paramString1, paramButton -> paramConsumer.accept(Boolean.valueOf(!paramBooleanSupplier.getAsBoolean())));
    一倂1.一倇 = paramBooleanSupplier;
    一倂1.一倂 = true;
    一倂1.m_257544_(Tooltip.m_257550_(一倍.一倀(paramString2)));
  }
  
  private EditBox 一倀(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3) {
    return 一倀(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, this.一倌);
  }
  
  private EditBox 一倀(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, Map<String, String> paramMap) {
    this.一倎.add(new 一倁(paramString2, this.一倛 + paramInt1, paramInt2, -728112, paramInt3, 一個.一倎));
    EditBox editBox = new EditBox(this.f_96547_, this.一倛 + paramInt1, this.一倝 + paramInt2 + 20, paramInt3, 20, 一倍.一倀(paramString2));
    editBox.m_94199_((paramString1.equals(一倆.一倀("udZw+8gYX88oO+UCSGwOQ1SfLTyvcnQDIV02+USyAVwGBeo=")) || paramString1.equals(一倆.一倀("Ovqj9CyaNcrw7y+TonG7f3S1zg38HdNgVWkgvOECB8k/srFgAAy6cQ==")) || paramString1.equals(一倆.一倀("RcNDiNXV21TuqK+MTJ/gwzqT9X4rGU6KPdn4qcvA/O754IwhvAPSEXU+EQ==")) || paramString1.equals(一倆.一倀("ZirlTYRQBZ0hvjndqi0a4vooqFUF5ZH5Es6n3+TTaIFdAI1CjvAy"))) ? 128 : 24);
    editBox.m_94144_(paramMap.getOrDefault(paramString1, 一倆.一倀("J3SkC3RdKzozXlbrVmJzFeU6gOFZZufvrzh0Hw==")));
    editBox.m_94151_(paramString2 -> paramMap.put(paramString1, paramString2));
    editBox.m_94202_(-728112);
    editBox.m_94182_(false);
    editBox.m_257544_(Tooltip.m_257550_(一倍.一倀(paramString3)));
    m_142416_((GuiEventListener)editBox);
    this.一們.add(new 一倀((AbstractWidget)editBox, paramInt2 + 20));
    return editBox;
  }
  
  private void 一倀(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.一倎.add(new 一倁(paramString, this.一倛 + paramInt1, paramInt2, paramInt3, paramInt4, 一個.一倐));
  }
  
  private void 一倃(int paramInt) {
    this.一倓 = paramInt;
    this.一倔 = 0;
    this.丁倂 = 一倆.一倀("3tEoJ077XPes8Q6FY3+U3t25qsaVEXBe4TwGgg==");
    一倌();
  }
  
  private void 一倌() {
    m_169413_();
    m_7856_();
  }
  
  private void 一倍() {
    this.一倔 = Math.max(0, Math.min(this.一倔, Math.max(0, this.一倕 - this.一倞 - this.一倝)));
    for (一倀 一倀 : this.一們) {
      AbstractWidget abstractWidget = 一倀.一倀();
      abstractWidget.m_253211_(this.一倝 + 一倀.一倁() - this.一倔);
      abstractWidget.f_93624_ = (abstractWidget.m_252907_() >= this.一倝 && abstractWidget.m_252907_() + abstractWidget.m_93694_() <= this.一倞);
      if (!abstractWidget.f_93624_ && m_7222_() == abstractWidget)
        m_7522_(null); 
    } 
  }
  
  private double 一倀(double paramDouble) {
    return (paramDouble - this.丁個) / this.丁倊;
  }
  
  private double 一倁(double paramDouble) {
    return (paramDouble - this.丁倌) / this.丁倊;
  }
  
  public boolean m_6375_(double paramDouble1, double paramDouble2, int paramInt) {
    return super.m_6375_(一倀(paramDouble1), 一倁(paramDouble2), paramInt);
  }
  
  public boolean m_6348_(double paramDouble1, double paramDouble2, int paramInt) {
    return super.m_6348_(一倀(paramDouble1), 一倁(paramDouble2), paramInt);
  }
  
  public boolean m_7979_(double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4) {
    return super.m_7979_(一倀(paramDouble1), 一倁(paramDouble2), paramInt, paramDouble3 / this.丁倊, paramDouble4 / this.丁倊);
  }
  
  public boolean m_6050_(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    double d1 = 一倀(paramDouble1);
    double d2 = 一倁(paramDouble2);
    if (d1 >= this.一倛 && d1 <= (this.一倛 + this.一倜) && d2 >= this.一倝 && d2 <= this.一倞) {
      this.一倔 -= (int)Math.round(paramDouble4 * 24.0D);
      一倍();
      return true;
    } 
    return super.m_6050_(d1, d2, paramDouble3, paramDouble4);
  }
  
  public boolean m_7933_(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 268) {
      一倁();
      return true;
    } 
    if (paramInt1 == 260 || paramInt1 == 256) {
      m_7379_();
      return true;
    } 
    return super.m_7933_(paramInt1, paramInt2, paramInt3);
  }
  
  private br.com.farmdmz.config.一倂 一倎() {
    br.com.farmdmz.config.一倂 一倂1 = 一倇.一倀().一倀();
    一倂1.autoTeleport = this.一倊.autoTeleport;
    一倂1.replant = this.一倊.replant;
    一倂1.background = this.一倊.background;
    一倂1.showHud = this.一倊.showHud;
    一倂1.plots = this.一倊.plots.stream().map(br.com.farmdmz.config.一倂.一倀::一倀).toList();
    一倂1.teleportCommand = this.一倌.get(一倆.一倀("kwDV5ELeyrEAAk4SH6hTlurJL6RAYboG6EPjBWNoGhSinJo="));
    一倂1.plotCommand = this.一倌.get(一倆.一倀("ZL1uhgchgLSz5+zahCjRCqxEP3cEZojoBMu7veVaXb26ETk8LAvRgw=="));
    一倂1.cooldownMinutes = 一倀(一倆.一倀("AmuKtBsVoWUHsKb3tC3P5Bo+mFnnleUSXVAhlEod26OqnFzm"));
    一倂1.actionDelayTicks = 一倀(一倆.一倀("nEeUJYjhSqsuu2Yy6pfkNniexrpRQtiKwRUJxXAhPbHxqA=="));
    一倂1.openTimeoutTicks = 一倀(一倆.一倀("Q+XSI9nNvoeFx9tXOVKUx89vGuBi07+F0dqBF+XqQNY="));
    一倂1.teleportWaitTicks = 一倀(一倆.一倀("4na39jekeq3JZRJfaXX8v90ZYMJSmv0KlagcMOyoia6MN7VL"));
    一倂1.retryLimit = 一倀(一倆.一倀("cPTkHpeEGnwRgtNtvqql/ibBPJgxAQTg5QcG1anDU22wn00="));
    一倂1.一倁();
    return 一倂1;
  }
  
  private int 一倀(String paramString) {
    try {
      return Integer.parseInt(((String)this.一倌.get(paramString)).trim());
    } catch (Exception exception) {
      throw new IllegalArgumentException(一倆.一倀("3Cn6vf5HD2GusNhV1Np2iD1AQpdpDEI2OK/9ZlHJzIwjtSWm+neN+cdoQsN/shNGM/FemVMuQYcwPRr4f5pE4DW6Yg=="));
    } 
  }
  
  private boolean 一倏() {
    try {
      br.com.farmdmz.config.一倂 一倂1 = 一倎();
      一倇.一倀(一倂1);
      this.一倌.put(一倆.一倀("taVxNf+KHiIaEn1jWKtFabTrXv2cKOs/LlJU6j8niPdDK2c="), 一倂1.teleportCommand);
      this.一倌.put(一倆.一倀("41z8Mz0Z+IqvgMyOXlPbBxXxdWTHuDk73k/WOsdL4Mj/CYC1cjS9qQ=="), 一倂1.plotCommand);
      一倀(一倆.一倀("o+PgHOYRsU0wIYHiIylcbRsWOe+L7X/KCnsYcesOuU6Izzt9UCsS40CHkGvip5fCcsouAA=="), false);
      return true;
    } catch (Exception exception) {
      一倀((exception.getMessage() == null) ? 一倆.一倀("qAcV11IjpYNCzlrLMEXQOrDrLcnAJttCsb2Ksk4A9xPN2UfM0fE579eaqpyHBZFh11wPHKex4m4vbuniUlr4wgWy8rb7Dx5LlczybO4/") : exception.getMessage(), true);
      return false;
    } 
  }
  
  private boolean 一倐() {
    try {
      br.com.farmdmz.config.一倂 一倂1 = 一倇.一倀().一倀();
      一倂1.timeRoomBackground = this.一倊.timeRoomBackground;
      一倂1.timeRoomFormKey = this.一倊.timeRoomFormKey;
      一倂1.timeRoomFormLabel = this.一倊.timeRoomFormLabel;
      一倂1.timeRoomFishingCommand = this.一倌.get(一倆.一倀("03EnWHC+l4aoxaiHZKJl3+aBvNsEXXAMcTvaCLSDl6e9w6IeXrt7nmEbGw=="));
      一倇.一倁(一倂1);
      this.一倊.timeRoomBackground = 一倂1.timeRoomBackground;
      this.一倊.timeRoomFormKey = 一倂1.timeRoomFormKey;
      this.一倊.timeRoomFormLabel = 一倂1.timeRoomFormLabel;
      this.一倊.timeRoomFishingCommand = 一倂1.timeRoomFishingCommand;
      this.一倌.put(一倆.一倀("rycHMqVDq/c5x6HFLkC78WSbd5RvuOxX263DcSuvV5kiuZPN2tFa9ltw7A=="), 一倂1.timeRoomFishingCommand);
      一倀(一倆.一倀("oOUaBKG8+dp8lxeiYmTZH5tUSsX05KHb+wP3nOWC0Azpijpx7Ee6IHPV7QvecbDh/QS9W9HIlnHEZYmb"), false);
      return true;
    } catch (Exception exception) {
      一倀((exception.getMessage() == null) ? 一倆.一倀("ltVvGluQkMq4aqxIbiC4kPw4es59qtktwBqWAcfzD+KDplOe74yH9DFy9AZK7gkvh7WpyYweMwzWWJ5CsQBJ6Xn7hDxEJ5Yy5Lj8NRE=") : exception.getMessage(), true);
      return false;
    } 
  }
  
  private boolean 一們() {
    try {
      br.com.farmdmz.config.一倂 一倂1 = 一倇.一倀().一倀();
      一倂1.orbBackground = this.一倊.orbBackground;
      一倂1.orbFormKey = this.一倊.orbFormKey;
      一倂1.orbFormLabel = this.一倊.orbFormLabel;
      一倂1.orbCommand = this.一倌.get(一倆.一倀("qubk0CFfZKGrm9KaBnhyrFK5U8MrjdMPDZ7LtHPetMfv4Gvb5ljc"));
      一倂1.一倁();
      一倇.一倂(一倂1);
      this.一倊.orbBackground = 一倂1.orbBackground;
      this.一倊.orbFormKey = 一倂1.orbFormKey;
      this.一倊.orbFormLabel = 一倂1.orbFormLabel;
      this.一倊.orbCommand = 一倂1.orbCommand;
      this.一倌.put(一倆.一倀("D1eKuz4n4KNy1m5sKR9BX1r62B1I8TQu+DuDpTTjrQrUqbY7jhtO"), 一倂1.orbCommand);
      一倀(一倆.一倀("OgTUgPf9Y7MKqw0Eee39VF9dpbXtbB1xeSfF9m2M9Jv0gvcqOq4YIy8y59ImyYcaK/g="), false);
      return true;
    } catch (Exception exception) {
      一倀((exception.getMessage() == null) ? 一倆.一倀("sV0Ht+LOmYF81KeDExCStj98Jfc9AwrZqN2mkRqLfT5kr+7ZRwKuJ65MgShEBRQksPs6M7RNeB80kJ1RdYaso8I/o4V51n0I3paCaw==") : exception.getMessage(), true);
      return false;
    } 
  }
  
  private void 一倒() {
    if (一倇.一倇()) {
      try {
        一倇.一倒();
        一倀(一倆.一倀("6qVV9ZjlnFw5izOW64gZrHL4YpJwQ2Rnf3x4Euo+Zorg9nb8MQEnqw=="), false);
        一倌();
      } catch (Exception exception) {
        一倀((exception.getMessage() == null) ? 一倆.一倀("tiYRKhZvqu+6JdJMQY5ErRDnNl3nmFf2BERfT+o0prLpMnycWCDFqESu7yQVpx+hbB09ZpMq59An/j/I") : exception.getMessage(), true);
      } 
      return;
    } 
    if (this.f_96541_ == null || this.f_96541_.f_91074_ == null || this.f_96541_.f_91073_ == null) {
      一倀(一倆.一倀("m4zkctg8nYN+yRXreaHF4kEicrUkhI9qTvOYbt6OsiRgNyD8EUNVQE5u4sDIYs6qarpVFzvnhod6hd0DNMw="), true);
      return;
    } 
    if (this.一倊.orbFormKey.isBlank()) {
      一倀(一倆.一倀("DZp1R2eUM5eznoisEasp5oN7JL6uFu8N0lFjx7WvHv6AAv5GyXNqsJW+2vT2Tht8oIps3wIXzuMDFYDlumN96rWw7x6T"), true);
      return;
    } 
    一倒.一倀 一倀 = this.一倒.stream().filter(param一倀 -> param一倀.一倀().equals(this.一倊.orbFormKey)).findFirst().orElse(null);
    if (一倀 == null) {
      一倀(一倆.一倀("WgQDrBbUtQ6FgPi3OI9vZCA8ARFS5hkzwbY1TPg1/4grL0d38aL0xLD4nHjPHgSUxHSaoXGYMjDdmXYxG4GApLY="), true);
      return;
    } 
    if (!一倀.一倂()) {
      一倀(一倀.一倃(), true);
      return;
    } 
    if (!一們())
      return; 
    try {
      if (一倇.一倒()) {
        一倀(一倆.一倀("XJSy9eINeYYVOSBapOE7QJa1xcoTLP/c3aHPhAzu6R0kW9Pw3fSPDXU="), false);
        一倁();
      } else {
        一倀(一倆.一倀("sD8YjTiT82Nnq99fsq4u4sF2jsUelEAPVfP8ih1yuzxFml3q4T71tp9Repvh/+av09fm0exmfkdrm0rQ3w=="), true);
      } 
    } catch (Exception exception) {
      一倀((exception.getMessage() == null) ? 一倆.一倀("84F47pUWFAApIrUkG9tEeXgGIabVekulml6Tb15mqLCW+T96x6dKaYOwjyeyUpRDNU9ph7QJ6DZOG2pYuQ==") : exception.getMessage(), true);
    } 
  }
  
  private void 一倓() {
    if (一倇.一倅()) {
      try {
        一倇.一倓();
        一倀(一倆.一倀("ufrJrMQqWhbzQWGtECj8kbUrL5/fm8t0eIIRvtbE3malkAW7Qh3bPl38uJUSy/Fvbd8gPhMHhoPPefGd07+2UDBEsbB4HLJ81Bo="), false);
        一倌();
      } catch (Exception exception) {
        一倀((exception.getMessage() == null) ? 一倆.一倀("SoIxb02kspFmTtpPuvaMFDIwMIt5qqmeqH7l58GMVWueTayPQVW1OPzUi1/3lF4NiQFKmBL7PnsH2mVZkQ==") : exception.getMessage(), true);
      } 
      return;
    } 
    if (this.f_96541_ == null || this.f_96541_.f_91074_ == null || this.f_96541_.f_91073_ == null) {
      一倀(一倆.一倀("emNLLQV4ok9ri64ZSHmHP7xlbEKhxW+u2XDmKDARosk91Wgqk4y3KMRJYKY4fACdrpdm+eBJrpae5YUIFINRsd+tGHOyVuMA"), true);
      return;
    } 
    if (this.一倊.timeRoomFormKey.isBlank()) {
      一倀(一倆.一倀("VYIAQqQXOKSQKGeIxSMNpvoeGmnvAMlty8ONdQyx8iYpMWwZDLi22FPQ65MTka6kD8WVXvmXsDHjt82TDqcUj/rUfbXFAActHeQjTDSe0Q=="), true);
      return;
    } 
    一倒.一倀 一倀 = this.一倒.stream().filter(param一倀 -> param一倀.一倀().equals(this.一倊.timeRoomFormKey)).findFirst().orElse(null);
    if (一倀 == null) {
      一倀(一倆.一倀("nwA/cI6toEWn1AbfxGpWyyu7SXhRy5K72wUjFFGrbB71jbmETDMtkipr/vtWOwliAh18y48WiMipPadRqqot6gs="), true);
      return;
    } 
    if (!一倀.一倂()) {
      一倀(一倀.一倃(), true);
      return;
    } 
    if (!一倐())
      return; 
    try {
      if (一倇.一倓()) {
        一倀(一倆.一倀("m4QVYO/vJinL5BfZD4qKdDlS7Yq0UbUDD5FmJPkbeaAXHqKlHHoGfgfffWzfOwY0JffG"), false);
        一倁();
      } else {
        一倀(一倇.一個(), true);
      } 
    } catch (Exception exception) {
      一倀((exception.getMessage() == null) ? 一倆.一倀("li+JTB4XLbpJ0Pr49oPbl/7sniFK3AAxqqhBNtbk2cGRTzCs8g/wUWlbxI4LmHHpu4eb4g8p6nPDgitPo7Q=") : exception.getMessage(), true);
    } 
  }
  
  private double 一倀(String paramString1, String paramString2, double paramDouble1, double paramDouble2) {
    double d;
    try {
      d = Double.parseDouble(((String)this.一倍.get(paramString1)).trim().replace(',', '.'));
    } catch (Exception exception) {
      throw new IllegalArgumentException("+XgRC8nWUF9lPhYdlOHIiMFMQQV4P/1ayR8ON2/Xj3pIWFfTfp/jb7eIg01iyeGAFl68HNpsU7ql");
    } 
    if (!Double.isFinite(d) || d < paramDouble1 || d > paramDouble2)
      throw new IllegalArgumentException("OUec3O6KOL3gLgcBbuzYlV5vMv0T6mUm5cN2TErUzMBEkJQiXDaNa7bnd5/WxNf2Gp7nvNDZ8Qs="); 
    return d;
  }
  
  private int 一倀(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    int i;
    try {
      i = Integer.parseInt(((String)this.一倍.get(paramString1)).trim());
    } catch (Exception exception) {
      throw new IllegalArgumentException("K9N1Ce6EvFMfNGE/pE9U7wHCkZ6fjNi3LHrvbW2p0mz2T0mZtpVC+/IDVd8flOPRigaiRRQps9Xv");
    } 
    if (i < paramInt1 || i > paramInt2)
      throw new IllegalArgumentException("3V86Sm0yf8oqWESzSoK+QlK0SovL6DD5VSugepe1dcCj0okkAXdhsX/kMXFIs2g3FocCmime9oA="); 
    return i;
  }
  
  private boolean 一倔() {
    try {
      BotConfig botConfig = 一倀(this.一個);
      botConfig.attract_interval = 一倀(一倆.一倀("GGL1z7O0lxeQ48FXSNgiuN1z0Zk8DSIkY/LWPI/IhVpAMCrqegr9+YrjVek="), 一倆.一倀("BtSsw5oJFl6KQDzSsfNDKh42mlO09tdSziPAiOR3fcbcHCeHRSOIic0DSqFpyHuXpLY="), 0.02D, 30.0D);
      botConfig.cast_retry_interval = 一倀(一倆.一倀("nwl/H43ekefZtsrk5h93oM/eBqCUbxd+nfrv+MGjK+P/lc9WrK68ebMbM1dkIVM="), 一倆.一倀("HMP7Y9lEwuYLfuyvqTgarrsl2Ulh/2A7FwrPkFnp2t+F9cLh3KcsbJDYo+vrk3l5UlU="), 0.01D, 30.0D);
      botConfig.cast_timeout = 一倀(一倆.一倀("HR/ZlqF4qnqCDudKbTt4bDRclOzITFTnEHAv66EOvu25E2Sixr4eQw=="), 一倆.一倀("UklQF7/7HerSd0hTCFGz5BwUoGuppe2lpGGIfRHKRsYr/nPPSp0BXdLInFKXpIc="), 1.0D, 600.0D);
      botConfig.attract_timeout = 一倀(一倆.一倀("/xgWMwoUsMGnQCuIM7Dp/HwHk9oON1eywjC8vnAXOaA/DF98bH/dikrFPQ=="), 一倆.一倀("/27xSa7izduBfbVOZxaP0IbHcJ1Hr8B02UH+FObMxSF1icJkDxiS6P9yVhVBPuY="), 1.0D, 3600.0D);
      botConfig.confirm_delay = 一倀(一倆.一倀("JXOmgOpIcgqVZuVGTqwongHz1uqruW2AQ0jU5N1d+5RuY/5q65kzT1k="), 一倆.一倀("8pFYUI20qYCUUD5MHXTpqaiJOZrQHn5L820RdNlm+C7fOChatIUchMu0VKGh/onezQ=="), 0.0D, 60.0D);
      botConfig.confirm_clicks = 一倀(一倆.一倀("hKkiXHcKUCy09r+F4mna2W5Oqcewa4HU42+4oMnPBX6/0iGLZKsID3kM"), 一倆.一倀("Kr6NHz6oqP3JTL5fVQNHp0uAlMhO9B53sBp0ppmblfnLqUsI7LVkpmZWCj8tllHHbSnpLg=="), 1, 20);
      botConfig.circle_trigger_radius = 一倀(一倆.一倀("Zh68YJfNjNNZ60OjGfcQDTzCH+eG8bgyHbOYEDxA9IyXHecQNuwL6oxW26VlUUXItw=="), 一倆.一倀("NllkdudIylUhNxjwP9XyLWmWbMCAcUCiRBr0ZJcFElaxHUNwba6priJdZgY="), 60.0D, 310.0D);
      botConfig.circle_latency = 一倀(一倆.一倀("PffIryQhP93ISGf8MsECV66ju2oHR+1qkYBQ+NCqJoI4CybF6g8ziLam"), 一倆.一倀("GH6woPsAHy3fR5IUS4HRkZ8X/fbdiqfZP3KmtqKhuFcahJVkbtbHTSbqLWLpLw3gfoKD6nI="), 0.0D, 0.5D);
      botConfig.after_catch_wait = 一倀(一倆.一倀("BnZid1ttphahvrTqNgFtJXRD9JfPpJuoLeUKsS4ISqzsvIy4WwFPiMnVWkA="), 一倆.一倀("rdAsPSrEHpked3aicS1S7Xoxh7kEHniV7mgZxBEDUQ5wbgsI5xKB0jxyv5QdMPU="), 0.1D, 60.0D);
      botConfig.manual_scale = 一倀(一倆.一倀("2PLNh9h7bMj+mL0md75m7TBL93tULZDFbXH5szh7GbalpMB5k1vMOQ=="), 一倆.一倀("6XVfqX1erJ2INlHb6B6fL5PVArFX27M5fj2PKh6H6/rimgYnSolNbB4="), 0.1D, 8.0D);
      botConfig.validate();
      ClientController.get().saveConfig(botConfig);
      this.一個 = 一倀(botConfig);
      一倀(一倆.一倀("a3f1/lIS8dq6Ra8o4qUNQLeiovWPYpJEGdosfCo4jZk9z1FQ8SpMJ+I+2KhosfYIKXj407NzH2RSig=="), false);
      return true;
    } catch (Exception exception) {
      一倀((exception.getMessage() == null) ? 一倆.一倀("uDCnBcTvNmx2OcXKAIBEvP20JyEExta9spLo/EMsED9uAE33DqVR1+Cz1gfjgENQ1n1TCStymWpRsK50ICNrksSvxaYjVXeedOb0pkEB") : exception.getMessage(), true);
      return false;
    } 
  }
  
  private void 一倕() {
    if (一倇.一倌()) {
      一倇.一倍();
      一倀(一倆.一倀("/IpXU8Q/cJzo2EsiZabVs3dEYBPkZ5b2U2RP1mOsBCQZo8NAStrvEbJM"), false);
    } else if (this.f_96541_ == null || this.f_96541_.f_91074_ == null || this.f_96541_.f_91073_ == null) {
      一倀(一倆.一倀("nSBvkaMotJv0tT5ev59QfRizqJZ3jWRpfbCppqxSvhRHl6m5tLulMZnzuDHI7QkU7gCzu14eEcMxygoRpla41IlDGA=="), true);
    } else if (一倔()) {
      if (一倇.一倍()) {
        一倁();
      } else {
        一倀(一倆.一倀("qUOslr16dReEvW9TshCgtNkk00DI44pItyC76N/rofpkys3ejW1R/7ALw3+gL6OaprRiQVyyYqqZCOch1s2Q"), true);
      } 
    } 
  }
  
  private static String 一倖() {
    return !一倇.一倌() ? 一倆.一倀("s5PIV6B/XO6zG5yb7Ir/d5aLQ5dDzvneXtyULihIUIYydTxheFYr+j8=") : ((一倇.一倁() && !一倇.一倃()) ? 一倆.一倀("4EUsMEblMylxmAhI2nJk9SgCAJ+M6KrpraKpMqG/tUNy047wM/KR5HzYlRQ9WWx6jg==") : (ClientController.get().running() ? (一倇.一倃() ? 一倆.一倀("ABXfPDp6MPdbTotDl7JbKY+ywaeZ8g+G1a7czn553gFvAAkN9mr1PA6AtZo+nJ7BomWP") : 一倆.一倀("1GknnPgUBl2E0qJdJHDl2+XYcd/+pcGQOY9H6DvuD94aVd/A5lJH")) : (一倇.一倃() ? 一倆.一倀("uSSmuWhyvgE/4o1Sy/5wlhdNoTn9/UUDYZU2NSkZkLJqthl2VVKsnL//6F9zbFM0pjE35iQlYQ==") : 一倆.一倀("nSKdwbFHrNvhoCJWHF5t4BYnQjalm0PxsW5W7ZNL/ioqdXTS2qGjm6aIaA=="))));
  }
  
  private void 一倀(String paramString, boolean paramBoolean) {
    this.丁倂 = paramString;
    this.丁倃 = paramBoolean;
  }
  
  public void m_88315_(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, float paramFloat) {
    if (this.f_96541_ != null && this.f_96541_.f_91073_ == null && this.一倉 != null) {
      Screen screen2 = this.一倉;
      一倊 一倊 = (一倊)screen2;
      Screen screen1 = (screen2 instanceof 一倊) ? 一倊.一倀() : this.一倉;
      if (screen1 instanceof 一倀) {
        一倀 一倀 = (一倀)screen1;
        screen1 = 一倀.一倀();
      } 
      if (screen1 != null)
        screen1.m_88315_(paramGuiGraphics, paramInt1, paramInt2, paramFloat); 
    } 
    一倀(paramGuiGraphics, paramFloat);
    paramGuiGraphics.m_280168_().m_85836_();
    paramGuiGraphics.m_280168_().m_252880_(this.丁個, this.丁倌, 300.0F);
    paramGuiGraphics.m_280168_().m_85841_(this.丁倊, this.丁倊, 1.0F);
    一倀(paramGuiGraphics);
    String[] arrayOfString = { 一倆.一倀("C5DoyMJssJZxErSeO30kI02+IUQVFnI1OtbPeDKyFCN8"), 一倆.一倀("AQgmgMwyXZx2K4+5qK3N2O8KE4DNyHUg8EnWyFmRPmm7q5L189ZfxHw="), 一倆.一倀("6QWxVILOeySKLgjOlMzUEKZtdgpNn0aDfPpV6hHGOqhd"), 一倆.一倀("NIZnJ/NcX7UFbY1OuXFl1zBkMIjY9L6eJQjZvQ0tOg==") };
    一個.一倀(paramGuiGraphics, 一個.一倁(arrayOfString[this.一倓]), 288, 129, -1, 一個.一倍);
    String str1 = (this.一倓 == 3) ? (一倇.一倇() ? 一倇.一倉() : 一倆.一倀("HXPNtfIRNuUkd9pPvaZZ5LNqcEkuw3I4bjKZ2eI4QZhRBBpFBrl0")) : ((this.一倓 == 2) ? 一倖() : ((this.一倓 == 1) ? (一倇.一倅() ? (一倇.一倆() ? 一倆.一倀("6Z2KLsVykWMnEVNw4E/xKDejKf1xmzP6EHzlmEv8++5B6uE9lwh9jk/+") : 一倆.一倀("SsPsUvU3h1dTIF8O9VbxPap6sSBYC75gVH59PN4xnsx7p/lrfIGP")) : 一倆.一倀("01wN2RKrHN2zkJ2wA1wbsW8gYPaI65z7ZJHlTWH0NdGaWyi/pnDbzA==")) : (一倇.一倃() ? "G7Hse76I+bEoPu+PqJbPf2qptBacywWwvNCWdAVm3S4w+QX+otg=" : (一倇.一倁() ? 一倆.一倀("k1XuzgrQhOJ+WiO2Cgwb1ZL80p9GILYbWishtiM9xXQ5ePa1Ub9I") : 一倆.一倀("KL/j19n+xMqbVNwnEytuNJ/gPWt8CFeUHI2KCGcsS7gSUnacoQXr7C4=")))));
    int i = (this.一倓 == 3) ? (一倇.一倇() ? -11561732 : -2375512) : ((this.一倓 == 2) ? (一倇.一倌() ? -11561732 : -2375512) : ((this.一倓 == 1) ? (一倇.一倅() ? -11561732 : -2375512) : (一倇.一倁() ? -11561732 : -2375512)));
    一個.一倀(paramGuiGraphics, str1, 290, 174, i, 一個.一倐);
    paramGuiGraphics.m_280588_(Math.round(this.丁個 + this.一倛 * this.丁倊), Math.round(this.丁倌 + this.一倝 * this.丁倊), Math.round(this.丁個 + (this.一倛 + this.一倜) * this.丁倊), Math.round(this.丁倌 + this.一倞 * this.丁倊));
    for (一倃 一倃 : this.一倏)
      一倀(paramGuiGraphics, 一倃); 
    for (一倀 一倀 : this.一們) {
      AbstractWidget abstractWidget = 一倀.一倀();
      if (abstractWidget instanceof EditBox) {
        EditBox editBox = (EditBox)abstractWidget;
        if (editBox.f_93624_) {
          一個.一倀(paramGuiGraphics, editBox.m_252754_(), editBox.m_252907_(), editBox.m_5711_(), editBox.m_93694_(), 4, 921087096);
          一個.一倀(paramGuiGraphics, editBox.m_252754_() + 1, editBox.m_252907_() + 1, editBox.m_5711_() - 2, editBox.m_93694_() - 2, 3, -919790830);
        } 
      } 
    } 
    for (一倁 一倁 : this.一倎)
      一個.一倀(paramGuiGraphics, 一倀(一倁.一倀(), 一倁.一倄(), 一倁.一倅()), 一倁.一倁(), this.一倝 + 一倁.一倂() - this.一倔, 一倁.一倃(), 一倁.一倅()); 
    List<String> list = 一倇.一倕();
    for (一倄 一倄 : this.一倐) {
      String str = (list.size() > 一倄.一倀() + 1) ? list.get(一倄.一倀() + 1) : "xfhqndN+XRTQhescbryV5Mc0DH837kXeq5p52hV8+tS8ndFwohPZLWG0MWco88M99eisQ/eYUYY=";
      int m = str.contains(一倆.一倀("xFEGnaw1fzoywchG33dslYOO+sMrveiSy+d9n3e4Xd4pL6ytjbIjvOzfX1AXSA==")) ? -11561732 : (str.contains(一倆.一倀("zgnE81ZIe7ZBb+mkVd63YUZ26JthByjQtnkNlI+kSAbI0lUjWEA=")) ? -2375512 : -728112);
      一倍.一倀(paramGuiGraphics, 一倍.一倀(str, 一倄.一倃()), 一倄.一倁(), this.一倝 + 一倄.一倂() - this.一倔, m);
    } 
    if (this.一倓 == 0 && !list.isEmpty())
      一倍.一倀(paramGuiGraphics, 一倍.一倀(list.get(0), this.丁倁), this.一借, this.一倝 + this.丁倀 - this.一倔, -2375512); 
    if (this.一倓 == 2) {
      ClientController clientController = ClientController.get();
      String str3 = "cMXUp4csEUuKxNNg0qqVX9MXNSyO8RGxPmzWPeDx5btIssFJMA==";
      String str4 = "R3s0Cx2Z+7XZyXqecP2px/DCfM96/iHaHeqnDuwmrnOdlVfaWNicQAuPWtDscVMGL9AK";
      一倍.一倀(paramGuiGraphics, 一倍.一倀(str3, this.一倜 - 24), this.一倛 + 12, this.一倝 + 41 - this.一倔, -728112);
      一倍.一倀(paramGuiGraphics, 一倍.一倀(str4, this.一倜 - 24), this.一倛 + 12, this.一倝 + 61 - this.一倔, -2375512);
    } 
    if (this.一倓 == 1) {
      String str = "51666IpYA4v2+j7ufVAySw0BXyFinOPLx0ZIrxJ1YSHgQILcTA==";
      一倍.一倀(paramGuiGraphics, 一倍.一倀(str, this.一倜 - 24), this.一倛 + 12, this.一倝 + 433 - this.一倔, -2375512);
    } 
    paramGuiGraphics.m_280618_();
    if (this.一倕 > this.一倞 - this.一倝) {
      int m = this.一倞 - this.一倝;
      int n = Math.max(14, m * m / this.一倕);
      int i1 = this.一倝 + (m - n) * this.一倔 / Math.max(1, this.一倕 - m);
      paramGuiGraphics.m_280509_(968, this.一倝, 974, this.一倞, -1672664292);
      paramGuiGraphics.m_280509_(969, i1, 973, i1 + n, -857891740);
    } 
    this.丁倄.m_93666_(一倍.一倀((this.一倓 == 3) ? (一倇.一倇() ? 一倆.一倀("F1eEnGb2frw2V+nLioD/WUv/9+JHdoQHzfm0SM7KnzOjOA==") : 一倆.一倀("TSuleUiSUuR/hlbmkjtUAdiIV3IKl7dfQ1Nm3aPlyVDaDNA=")) : ((this.一倓 == 2) ? (一倇.一倌() ? 一倆.一倀("/Zo4XaN8Rpkp8vKj06db3yqhdcfMuQBAuv0vhHaKduHsxA==") : 一倆.一倀("7ntIg7QlL7OuThiCai85KsB0NGxhtYBWBBalhcTBQH6xV4I=")) : ((this.一倓 == 1) ? (一倇.一倅() ? 一倆.一倀("URqiyuF3X8oN1BIyWUC2K6lxQe+5wYMEZB3Pze/m49D09A==") : 一倆.一倀("TbMXqUGu89UZAL33tyISTPCVOcTElhchdCCnMWU5Ef1GJgU=")) : (一倇.一倁() ? 一倆.一倀("CECWqXRu8nVrWx32g93jatCxHzi2Mlk5bzXlFYkly+ChmQ==") : 一倆.一倀("t1IGMJ4rllqiNEn+nlFJzmbssPp3NepY3HAXkjOzkR0LAlk="))))));
    int j = (int)Math.round(一倀(paramInt1));
    int k = (int)Math.round(一倁(paramInt2));
    for (Renderable renderable : this.f_169369_)
      renderable.m_88315_(paramGuiGraphics, j, k, paramFloat); 
    String str2 = this.丁倂.isEmpty() ? ((this.一倓 == 3) ? str1 : ((this.一倓 == 2) ? 一倖() : ((this.一倓 == 1) ? 一倇.一個() : 一倇.一倐()))) : this.丁倂;
    一個.一倀(paramGuiGraphics, 一倍.一倀(str2, 560), this.一倛 + 4, 588, this.丁倃 ? -2649183 : -2375512, 一個.一倐);
    if (this.一倓 == 0 && j >= this.一倛 && k >= this.一倝 && k <= this.一倞 && m_96638_()) {
      List list1 = list.stream().map(一倍::一倀).toList();
      if (!list1.isEmpty())
        paramGuiGraphics.m_280666_(this.f_96547_, list1, j, k); 
    } 
    paramGuiGraphics.m_280168_().m_85849_();
    paramGuiGraphics.m_280262_();
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, float paramFloat) {
    if (this.f_96541_ == null || this.丁倉)
      return; 
    try {
      paramGuiGraphics.m_280262_();
      RenderTarget renderTarget = this.f_96541_.m_91385_();
      if (this.丁倆 == null)
        this.丁倆 = new PostChain(this.f_96541_.m_91097_(), this.f_96541_.m_91098_(), renderTarget, 一倆); 
      if (this.丁倇 != renderTarget.f_83915_ || this.丁倈 != renderTarget.f_83916_) {
        this.丁倇 = renderTarget.f_83915_;
        this.丁倈 = renderTarget.f_83916_;
        this.丁倆.m_110025_(this.丁倇, this.丁倈);
      } 
      this.丁倆.m_110023_(paramFloat);
      renderTarget.m_83947_(true);
      RenderSystem.clear(256, Minecraft.f_91002_);
    } catch (Exception exception) {
      this.丁倉 = true;
      if (this.丁倆 != null) {
        this.丁倆.close();
        this.丁倆 = null;
      } 
      this.f_96541_.m_91385_().m_83947_(true);
      System.err.println("7mTLVpos9hxUCztkPP+J+ukSQKvdfs40QB4UB9taBBiQ7BvqbIBzVHQKTv7v7lfPwZsbSB9/78wNTcDmNtokDHScqUAfxfW16yT0Dki2kU0=");
    } 
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics) {
    一個.一倀(paramGuiGraphics, 0, 4, 997, 615, 9, 1882202648);
    一個.一倀(paramGuiGraphics, 2, 5, 992, 612, 8, 1346316058);
    一個.一倀(paramGuiGraphics, 5, 8, 986, 606, 6, -1306126061);
    一個.一倁(paramGuiGraphics);
    paramGuiGraphics.m_280509_(5, 8, 991, 74, 1614356245);
    paramGuiGraphics.m_280509_(5, 74, 991, 75, 1222220388);
    paramGuiGraphics.m_280509_(216, 75, 217, 612, 1222220388);
    一個.一倀(paramGuiGraphics, 5, 93, 211, 388, 8, 1614356245);
    一個.一倀(paramGuiGraphics, 5, 522, 211, 89, 8, 1614356245);
    一個.一倀(paramGuiGraphics, 5, 556, 211, 55, 8, 1614356245);
    一倅.一倀(paramGuiGraphics, 24, 23, 33);
    一個.一倀(paramGuiGraphics, 229, 112, 752, 439, 9, 1614356245);
    paramGuiGraphics.m_280509_(229, 162, 981, 163, 1222220388);
    paramGuiGraphics.m_280509_(229, 197, 981, 198, 1222220388);
    paramGuiGraphics.m_280509_(5, 550, 216, 551, 1222220388);
  }
  
  private static String 一倗() {
    long l = (Math.max(0L, 一倇.一倏()) + 999L) / 1000L;
    return String.format(Locale.ROOT, 一倆.一倀("PsG46uQ4WLUeLURzAcEltZVHHFezWRjElUauQfVdOt4E4ZVMqw=="), new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) });
  }
  
  private void 一倀(GuiGraphics paramGuiGraphics, 一倃 param一倃) {
    int i = this.一倝 + param一倃.一倂() - this.一倔;
    一個.一倀(paramGuiGraphics, param一倃.一倁(), i, param一倃.一倃(), param一倃.一倄(), 9, 921087096);
    一個.一倀(paramGuiGraphics, param一倃.一倁() + 1, i + 1, param一倃.一倃() - 2, param一倃.一倄() - 2, 8, -2142819555);
    paramGuiGraphics.m_280509_(param一倃.一倁() + 1, i + 29, param一倃.一倁() + param一倃.一倃() - 1, i + 30, 1222220388);
    if (!param一倃.一倀().isEmpty())
      一個.一倀(paramGuiGraphics, 一個.一倁(param一倃.一倀().toUpperCase(Locale.ROOT)), param一倃.一倁() + 14, i + 8, -728112, 一個.一倊); 
  }
  
  private static void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 == 0) {
      paramGuiGraphics.m_280509_(paramInt2 + 4, paramInt3, paramInt2 + 7, paramInt3 + 3, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 4, paramInt2 + 5, paramInt3 + 7, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 6, paramInt3 + 4, paramInt2 + 10, paramInt3 + 7, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 4, paramInt3 + 7, paramInt2 + 7, paramInt3 + 10, paramInt4);
    } else if (paramInt1 == 1) {
      paramGuiGraphics.m_280509_(paramInt2, paramInt3 + 1, paramInt2 + 4, paramInt3 + 5, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 6, paramInt3 + 1, paramInt2 + 10, paramInt3 + 5, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2, paramInt3 + 7, paramInt2 + 4, paramInt3 + 11, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 6, paramInt3 + 7, paramInt2 + 10, paramInt3 + 11, paramInt4);
    } else if (paramInt1 == 2) {
      paramGuiGraphics.m_280509_(paramInt2 + 3, paramInt3, paramInt2 + 7, paramInt3 + 11, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2, paramInt3 + 3, paramInt2 + 10, paramInt3 + 8, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 2, paramInt3 + 1, paramInt2 + 8, paramInt3 + 10, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 4, paramInt3 + 4, paramInt2 + 6, paramInt3 + 7, 553648127);
    } else if (paramInt1 == 3) {
      paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 1, paramInt2 + 3, paramInt3 + 3, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 3, paramInt3 + 3, paramInt2 + 5, paramInt3 + 6, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 5, paramInt3 + 6, paramInt2 + 7, paramInt3 + 9, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 5, paramInt3 + 9, paramInt2 + 10, paramInt3 + 11, paramInt4);
    } else if (paramInt1 == 4) {
      paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3, paramInt2 + 10, paramInt3 + 2, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 9, paramInt2 + 10, paramInt3 + 11, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 3, paramInt3 + 2, paramInt2 + 5, paramInt3 + 4, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 6, paramInt3 + 2, paramInt2 + 8, paramInt3 + 4, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 5, paramInt3 + 4, paramInt2 + 6, paramInt3 + 7, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 3, paramInt3 + 7, paramInt2 + 5, paramInt3 + 9, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 6, paramInt3 + 7, paramInt2 + 8, paramInt3 + 9, paramInt4);
    } else {
      paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 1, paramInt2 + 9, paramInt3 + 2, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 1, paramInt2 + 2, paramInt3 + 10, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 8, paramInt3 + 1, paramInt2 + 9, paramInt3 + 10, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 1, paramInt3 + 9, paramInt2 + 9, paramInt3 + 10, paramInt4);
      paramGuiGraphics.m_280509_(paramInt2 + 4, paramInt3 + 4, paramInt2 + 6, paramInt3 + 6, paramInt4);
    } 
  }
  
  private static void 一倀(GuiGraphics paramGuiGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    ResourceLocation resourceLocation = 一倈[paramInt1];
    一個.一倀(paramGuiGraphics, resourceLocation, paramInt2, paramInt3, paramInt4, paramInt4, (paramInt1 == 3) ? 52 : 28, (paramInt1 == 3) ? 52 : 28, paramBoolean ? -1 : -1493172225);
  }
  
  public boolean m_7043_() {
    return false;
  }
  
  public void m_7861_() {
    if (this.丁倆 != null) {
      this.丁倆.close();
      this.丁倆 = null;
    } 
    this.丁倇 = this.丁倈 = 0;
  }
  
  public void m_7379_() {
    if (this.f_96541_ != null)
      this.f_96541_.m_91152_(this.一倉); 
  }
  
  public void 一倀() {
    if (this.f_96541_ == null)
      return; 
    Screen screen = this.一倉;
    if (screen instanceof 一倊) {
      一倊 一倊 = (一倊)screen;
      this.f_96541_.m_91152_(一倊.一倀());
    } else {
      this.f_96541_.m_91152_((this.一倉 instanceof 一倀) ? this.一倉 : new 一倀(this.一倉));
    } 
  }
  
  public void 一倁() {
    if (this.f_96541_ == null)
      return; 
    Screen screen2 = this.一倉;
    一倊 一倊 = (一倊)screen2;
    Screen screen1 = (screen2 instanceof 一倊) ? 一倊.一倀() : this.一倉;
    一倀 一倀 = (一倀)screen1;
    this.f_96541_.m_91152_((screen1 instanceof 一倀) ? 一倀.一倀() : screen1);
  }
  
  private static String 一倀(String paramString, int paramInt, ResourceLocation paramResourceLocation) {
    return (Minecraft.m_91087_()).f_91062_.m_92854_((FormattedText)一個.一倀(paramString, paramResourceLocation), Math.max(0, paramInt)).getString();
  }
  
  private static final class 一倂 extends Button {
    boolean 一倀;
    
    boolean 一倁;
    
    boolean 一倂;
    
    boolean 一倃;
    
    boolean 一倄;
    
    int 一倅;
    
    BooleanSupplier 一倆 = () -> false;
    
    BooleanSupplier 一倇;
    
    一倂(int param1Int1, int param1Int2, int param1Int3, int param1Int4, String param1String, Button.OnPress param1OnPress) {
      super(param1Int1, param1Int2, param1Int3, param1Int4, 一倍.一倀(param1String), param1OnPress, f_252438_);
    }
    
    protected void m_87963_(GuiGraphics param1GuiGraphics, int param1Int1, int param1Int2, float param1Float) {
      boolean bool1 = (this.一倆.getAsBoolean() || (this.一倇 != null && this.一倇.getAsBoolean())) ? true : false;
      int i = m_252754_();
      int j = m_252907_();
      int k = m_5711_();
      int m = m_93694_();
      if (this.一倄) {
        一個.一倀(param1GuiGraphics, i, j, k, m, 7, -420822893);
        一個.一倀(param1GuiGraphics, i + 2, j + 2, k - 4, m - 4, 5, m_198029_() ? -2647194 : -171801775);
        一個.一倀(param1GuiGraphics, 一倈.一倇, i + 9, j + 8, 17, 17, 17, 17, -13887729);
        return;
      } 
      if (this.一倃) {
        一個.一倀(param1GuiGraphics, i, j, k, m, 17, -420822893);
        一個.一倀(param1GuiGraphics, i + 2, j + 2, k - 4, m - 4, 15, m_198029_() ? -2647194 : -171801775);
        param1GuiGraphics.m_280509_(i + 11, j + 16, i + 23, j + 18, -13887729);
        param1GuiGraphics.m_280509_(i + 10, j + 14, i + 13, j + 20, -13887729);
        return;
      } 
      if (this.一倁) {
        if (bool1 || m_198029_()) {
          一個.一倀(param1GuiGraphics, i, j, k, m, 7, 921087096);
          一個.一倀(param1GuiGraphics, i + 1, j + 1, k - 2, m - 2, 6, -1735240141);
        } 
        一倈.一倀(param1GuiGraphics, this.一倅, i + 7, j + 6, 18, (bool1 || m_198029_()));
        一個.一倀(param1GuiGraphics, 一個.一倁(m_6035_().getString()), i + 29, j + 7, -536870913, 一個.一倊);
        switch (this.一倅) {
          case 0:
          
          case 1:
          
          case 2:
          
          case 3:
          
          default:
            break;
        } 
        boolean bool = false;
        一個.一倀(param1GuiGraphics, i + k - 19, j + 11, 7, 7, 3, bool ? -14035334 : -1344396974);
        param1GuiGraphics.m_280509_(i, j + m - 1, i + k, j + m, 1222220388);
        return;
      } 
      if (this.一倇 != null) {
        if (m_198029_())
          一個.一倀(param1GuiGraphics, i, j, k, m, 4, 921087096); 
        一個.一倀(param1GuiGraphics, i + 5, j + 2, 60, 20, 4, -1672664292);
        一個.一倀(param1GuiGraphics, i + (bool1 ? 27 : 6), j + 3, 37, 18, 3, bool1 ? -14112921 : -5624751);
        一個.一倁(param1GuiGraphics, bool1 ? 一倆.一倀("6TEYYl6hOwrJFTBU3TOrvdLFgW+368fpGnoEZNrs") : 一倆.一倀("D6Nn3xXvPbxlrwi0d0SnlxObidoDNWwQaEkBkZ/q5Q=="), i + (bool1 ? 45 : 24), j + 5, -1, 一個.一倉);
        一個.一倀(param1GuiGraphics, 一倈.一倀(m_6035_().getString(), k - 78, 一個.一倆), i + 75, j + 3, this.f_93623_ ? -728112 : -1864646488, 一個.一倆);
        return;
      } 
      int n = (this.f_93623_ && !this.一倀) ? -420822893 : 921087096;
      一個.一倀(param1GuiGraphics, i, j, k, m, 5, n);
      一個.一倀(param1GuiGraphics, i + 2, j + 2, k - 4, m - 4, 3, !this.f_93623_ ? -2007811541 : (this.一倀 ? -11561732 : (m_198029_() ? -2647194 : -171801775)));
      String str = m_6035_().getString().toUpperCase(Locale.ROOT);
      boolean bool2 = !this.f_93623_ ? true : (this.一倀 ? true : true);
      一個.一倁(param1GuiGraphics, 一倈.一倀(一個.一倁(str), k - 12, 一個.一倏), i + k / 2, j + (m - 13) / 2, bool2, 一個.一倏);
    }
  }
  
  private static final class 一倃 extends Record {
    private final String 一倀;
    
    private final int 一倁;
    
    private final int 一倂;
    
    private final int 一倃;
    
    private final int 一倄;
    
    private final int 一倅;
    
    private 一倃(String param1String, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      this.一倀 = param1String;
      this.一倁 = param1Int1;
      this.一倂 = param1Int2;
      this.一倃 = param1Int3;
      this.一倄 = param1Int4;
      this.一倅 = param1Int5;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倈$一倃;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倈$一倃;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倈$一倃;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public String 一倀() {
      return this.一倀;
    }
    
    public int 一倁() {
      return this.一倁;
    }
    
    public int 一倂() {
      return this.一倂;
    }
    
    public int 一倃() {
      return this.一倃;
    }
    
    public int 一倄() {
      return this.一倄;
    }
    
    public int 一倅() {
      return this.一倅;
    }
  }
  
  private static final class 一倁 extends Record {
    private final String 一倀;
    
    private final int 一倁;
    
    private final int 一倂;
    
    private final int 一倃;
    
    private final int 一倄;
    
    private final ResourceLocation 一倅;
    
    private 一倁(String param1String, int param1Int1, int param1Int2, int param1Int3, int param1Int4, ResourceLocation param1ResourceLocation) {
      this.一倀 = param1String;
      this.一倁 = param1Int1;
      this.一倂 = param1Int2;
      this.一倃 = param1Int3;
      this.一倄 = param1Int4;
      this.一倅 = param1ResourceLocation;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倈$一倁;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倈$一倁;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倈$一倁;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public String 一倀() {
      return this.一倀;
    }
    
    public int 一倁() {
      return this.一倁;
    }
    
    public int 一倂() {
      return this.一倂;
    }
    
    public int 一倃() {
      return this.一倃;
    }
    
    public int 一倄() {
      return this.一倄;
    }
    
    public ResourceLocation 一倅() {
      return this.一倅;
    }
  }
  
  private static final class 一倄 extends Record {
    private final int 一倀;
    
    private final int 一倁;
    
    private final int 一倂;
    
    private final int 一倃;
    
    private 一倄(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.一倀 = param1Int1;
      this.一倁 = param1Int2;
      this.一倂 = param1Int3;
      this.一倃 = param1Int4;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倈$一倄;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倈$一倄;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倈$一倄;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public int 一倀() {
      return this.一倀;
    }
    
    public int 一倁() {
      return this.一倁;
    }
    
    public int 一倂() {
      return this.一倂;
    }
    
    public int 一倃() {
      return this.一倃;
    }
  }
  
  private static final class 一倀 extends Record {
    private final AbstractWidget 一倀;
    
    private final int 一倁;
    
    private 一倀(AbstractWidget param1AbstractWidget, int param1Int) {
      this.一倀 = param1AbstractWidget;
      this.一倁 = param1Int;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/client/一倈$一倀;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/client/一倈$一倀;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/client/一倈$一倀;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public AbstractWidget 一倀() {
      return this.一倀;
    }
    
    public int 一倁() {
      return this.一倁;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倈.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */