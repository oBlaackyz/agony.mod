package br.com.farmdmz.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class 一倃 {
  private 一倅 一倀;
  
  private 一倇 一倁 = 一倇.INIT;
  
  private boolean 一倂;
  
  private int 一倃 = -1;
  
  private int 一倄;
  
  private int 一倅;
  
  private int 一倆;
  
  private long 一倇;
  
  private long 一倈;
  
  private long 一倉;
  
  private long 一倊;
  
  private long 一個 = -1L;
  
  private long 一倌;
  
  private long 一倍;
  
  private long 一倎;
  
  private long 一倏;
  
  private long 一倐;
  
  private boolean 一們;
  
  private 一倇 一倒 = 一倇.MENU;
  
  private int 一倓;
  
  private int 一倔;
  
  private 一倄 一倕 = 一倄.UNKNOWN;
  
  private double 一倖;
  
  private String 一倗 = br.com.farmdmz.client.auth.一倆.一倀("YB2rR/FHmbRK0weIxQbX3gs8IU9+y5V2pm62lcI+LhXKNg==");
  
  private final Map<Integer, Long> 一倘 = new HashMap<>();
  
  private final Set<Integer> 一候 = new HashSet<>();
  
  public void 一倀(一倅 param一倅, long paramLong) {
    if (param一倅 == null)
      throw new IllegalArgumentException(br.com.farmdmz.client.auth.一倆.一倀("C9HcT0l+I4afQ6nbp6ss5cLzqTEoQG+soqFx0rVmd2NIEttC")); 
    this.一倀 = param一倅;
    this.一倂 = true;
    this.一倁 = 一倇.INIT;
    this.一倃 = -1;
    this.一倄 = this.一倅 = this.一倆 = 0;
    this.一倇 = this.一倈 = this.一倉 = this.一倊 = this.一倌 = paramLong;
    this.一倍 = 0L;
    this.一倎 = 0L;
    this.一倏 = 0L;
    this.一倐 = 0L;
    this.一們 = false;
    this.一倒 = 一倇.MENU;
    this.一倓 = 0;
    this.一倔 = 0;
    this.一倕 = 一倄.UNKNOWN;
    this.一個 = -1L;
    this.一倖 = Double.POSITIVE_INFINITY;
    this.一倘.clear();
    this.一候.clear();
    this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("M/jN/ziAarZAW9fZ7HFVaYAy5euojAVykNGtkI+GZ+ov9Vjt02DTTxpd");
  }
  
  public void 一倀(String paramString) {
    this.一倂 = false;
    this.一倃 = -1;
    this.一個 = -1L;
    this.一倏 = 0L;
    this.一倐 = 0L;
    this.一們 = false;
    this.一倗 = (paramString == null || paramString.isBlank()) ? br.com.farmdmz.client.auth.一倆.一倀("mX//7Dgd5pWXyp+IJwK+NH/J5ijNWw9ajbnzfI7+YgGdBg==") : paramString;
  }
  
  public boolean 一倀() {
    return this.一倂;
  }
  
  public String 一倁() {
    return this.一倗;
  }
  
  public int 一倂() {
    return this.一倃;
  }
  
  public int 一倃() {
    return this.一倆;
  }
  
  public long 一倄() {
    return this.一倍;
  }
  
  public boolean 一倅() {
    return (this.一倂 && this.一倁 == 一倇.COOLDOWN);
  }
  
  public boolean 一倆() {
    return (this.一倂 && (this.一倁 == 一倇.MENU || this.一倁 == 一倇.COLLECTING || this.一倁 == 一倇.PLANTING));
  }
  
  public long 一倇() {
    return this.一倏;
  }
  
  public long 一倀(long paramLong) {
    return 一倅() ? Math.max(0L, this.一倏 - paramLong) : 0L;
  }
  
  public void 一倁(long paramLong) {
    if (!this.一倂 || !this.一倀.一倈() || this.一倁 == 一倇.COOLDOWN)
      return; 
    if (this.一個 < 0L)
      this.一個 = paramLong; 
    if (this.一倃 < 0 || this.一倁 == 一倇.LEAVING || this.一倁 == 一倇.SELECT || this.一倁 == 一倇.INIT || this.一倁 == 一倇.TELEPORTING)
      return; 
    if (this.一倁 != 一倇.RECOVERING && (this.一倁 != 一倇.OPENING || !this.一們)) {
      一倇 一倇1 = (this.一倁 == 一倇.COLLECTING || this.一倁 == 一倇.PLANTING) ? this.一倁 : 一倇.MENU;
      一倀(一倇1, this.一倅, paramLong, Math.max(500L, this.一倀.一倂()));
    } 
    this.一倗 = "udsqjYHCu3f8HyofJgXE7BgXuPdzLeelnGkz64DGrEu7fal0WFW/o8SNLngOvzbmcbvJAe4j4LyongpDZIf8Pca/01Umt972smaUADcIGAkkGeKhl2Dm";
  }
  
  public 一倁 一倀(一倆 param一倆) {
    if (param一倆 == null)
      throw new IllegalArgumentException(br.com.farmdmz.client.auth.一倆.一倀("Vt04YYFqumbQ5YsHpiSA/i/eBVXsT3Ttt0evd8pWG6NQc10I")); 
    if (!this.一倂)
      return 一倀(一倀.STOP); 
    if (!param一倆.一倂())
      return 一倁(br.com.farmdmz.client.auth.一倆.一倀("O4R+M0qLabIvDlThkaD1sLUedJ0TODVzziYjNsPZ5lIj5yUJcTlFC73Y2vvsBmwWn719VX2nQXpWp3Kbg1pdKeIoUXk6RurO")); 
    if (!param一倆.一倁() && this.一倁 != 一倇.TELEPORTING)
      return 一倁(br.com.farmdmz.client.auth.一倆.一倀("WcNF/DPgEO0SBG3x2jaCnAacWSZeHB7qeQ22+4WHC/qGEdAxkqhHIA8B9r2oV/i9o1tdI0bVNjkBxA==")); 
    一倅(param一倆);
    if (this.一倁 == 一倇.COOLDOWN) {
      this.一倏 = 一倆(param一倆);
      if (param一倆.一倀() < this.一倏)
        return 一倂(param一倆.一倀()); 
      if (param一倆.一倃() || param一倆.一倆() == 一倂.OTHER) {
        this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("SpdHA+WqkfDffWI6GKQ+pxzUg0rWJ5lne3TT6IbGs9rOZAEFsW/prD17umjiNtE2x//+vrD4Y2yc53Ces19PVvn5Roe82X+5NFA=");
        return 一倀(一倀.WAIT);
      } 
      this.一候.clear();
      this.一倄 = 0;
      this.一倏 = 0L;
      this.一倐 = 0L;
      this.一個 = -1L;
      this.一倈 = param一倆.一倀();
      this.一倁 = 一倇.SELECT;
    } 
    if (param一倆.一倃()) {
      if (this.一個 < 0L)
        this.一個 = param一倆.一倀(); 
      this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("NmbnFumJdjDZI0QmRyJMKKbnWp+u3pPpXvAZfxoM3h/9H0Cpc7yDKLCkqNcUSJIST0YV28tn7Z96M3vF3sOz6A==");
      return 一倀(一倀.WAIT);
    } 
    if (this.一個 >= 0L) {
      long l = Math.max(0L, param一倆.一倀() - this.一個);
      this.一倇 += l;
      this.一倈 += l;
      this.一倉 += l;
      this.一倊 += l;
      this.一倌 += l;
      if (this.一倎 > 0L)
        this.一倎 += l; 
      this.一個 = -1L;
    } 
    if (param一倆.一倆() == 一倂.OTHER)
      return 一倁(br.com.farmdmz.client.auth.一倆.一倀("kcYULT/7jeyMfHAlaaG2QqFauo1R3LYOkqBlW2XrCYLtPNdpgfyOKY2q00ERFWBmvFMCdEHihrk+4cazEQM=")); 
    for (byte b = 0; b < 10; b++) {
      一倃 一倃1;
      long l;
      一倄 一倄1;
      switch (null.一倀[this.一倁.ordinal()]) {
        case 1:
          if (this.一倀.一倀()) {
            this.一倁 = 一倇.TELEPORTING;
            this.一倇 = param一倆.一倀() + this.一倀.一倃();
            this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("tQ6M9/RCpZXQQJVcMZ/sNYxTX/9xdv6fT1Bh2MEasWueplNaGe07afqtBdOpCigfWdWgX5jzqorFUQxOm/HnTEo=");
            return 一倀(一倀.TELEPORT);
          } 
          this.一倁 = 一倇.SELECT;
          break;
        case 2:
          this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("WOjiNkQ5D8JVkjZ7RMHhhb3tH9eLxmrbLGpbtawsYbLa2g0JGGXN6IQ4VIWDXHFavrHJ8ryPvvRUIBrgDj43pbE=");
          if (param一倆.一倀() < this.一倇)
            return 一倀(一倀.WAIT); 
          if (!param一倆.一倁())
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("E7O/fQ84NztDpS1/cWo+j/N8eY2DBrMHcVMwDdpUMh6kAvpiDv9v6F8IbK/4fcCmtH51om2YTwygONTqku0RoZZnU+Z0E3STJ7g6EYX9Qg==")); 
          this.一倁 = 一倇.SELECT;
          break;
        case 3:
          this.一倃 = -1;
          if (this.一倀.一倈() && param一倆.一倀() < this.一倈) {
            this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("5uu0jpELtomc6fm144FyKg2CKu3wERZtYepTuejnzsR8rupWgIAyRbxvnr2c3jx2+DNnynrk0WQAFVes7hogt897DQ==");
            return 一倀(一倀.WAIT);
          } 
          if (!this.一倀.一倈() && param一倆.一倀() < this.一倌) {
            this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("x2ky1P3pKwwwK2ZM8ECSDKs5Txc3XEJhoPUDAJEaeWXryJpJmpskCOVWXWNFAB67ia/xRf7Jw4rf4ouMrLNonA==");
            return 一倀(一倀.WAIT);
          } 
          一倃1 = 一倁(param一倆);
          if (一倃1 == null) {
            if (this.一倀.一倈()) {
              if (param一倆.一個().stream().noneMatch(一倃::一倁))
                return 一倁(br.com.farmdmz.client.auth.一倆.一倀("bq7a+qwA92hlePAUWYwSp7xZsWht69zwFBViKLKeaxZkydSz2D0I7vurDW8/cbIna1wK")); 
              this.一倁 = 一倇.COOLDOWN;
              this.一倐 = param一倆.一倀() + this.一倀.一倉();
              this.一倏 = 一倆(param一倆);
              return 一倂(param一倆.一倀());
            } 
            this.一倌 = param一倆.一倀() + this.一倀.一倆();
            this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("ZBBr4jX/HYZRMBplMumFBtk/JBfSGhdQA2V2a26rhXlwwNmfILh8lTap5kOk3JipTLaE8S2SUJ4Ah6Qsr7NXSA==");
            return 一倀(一倀.WAIT);
          } 
          this.一倃 = 一倃1.一倀();
          this.一倉 = this.一倊 = param一倆.一倀();
          this.一倖 = Double.POSITIVE_INFINITY;
          this.一倅 = 0;
          this.一倎 = 0L;
          this.一們 = false;
          this.一倒 = 一倇.MENU;
          this.一倓 = 0;
          this.一倔 = 0;
          if (this.一倀.一倈()) {
            this.一倁 = 一倇.OPENING;
            this.一倇 = param一倆.一倀();
            this.一倗 = "mzaM2xHJjHDC83IGDUT1WwrMlV6f1WVasvTURcZZR0yGtp+wnUVO/s+2SubLJL1847gHK6OnDCYX6w==";
            break;
          } 
          this.一倁 = 一倇.MOVING;
          this.一倗 = "VBKo1UKaBmrPZAJjDyl2LTQIcCmt7ABAtBFU2xysriGqNMxml03GeofC1rxcsQ==";
          return 一倀(一倀.MOVE);
        case 4:
          this.一倗 = "T/gwgPF3jowExM/Yu0T2bK/mER+bw1S6UAXTF8ykjzUQyiLfVA83wPk5r9EHkg==";
          if (param一倆.一倀() - this.一倉 >= this.一倀.一倄())
            return 一倁("U1EQD267kjwQHlBtWXHqbwRGlcgIdT92yuxQc/kbtArMEbB/zHpeLPAj/IfNwm2YnuXdUn9AbAvq2VSQ4YEoMZ6YElYE/Biv"); 
          if (param一倆.一倆() == 一倂.FARM) {
            if (param一倆.一倇() < 0) {
              this.一倁 = 一倇.OPENING;
              this.一倇 = param一倆.一倀() + this.一倀.一倅();
              return 一倇(param一倆);
            } 
            if (param一倆.一倇() == this.一倃 && param一倆.一倄()) {
              this.一倁 = 一倇.MENU;
              this.一倇 = param一倆.一倀() + this.一倀.一倅();
              break;
            } 
            return 一倀(一倀.CLOSE);
          } 
          if (param一倆.一倄()) {
            this.一倁 = 一倇.OPENING;
            this.一倇 = param一倆.一倀();
            break;
          } 
          if (Double.isFinite(param一倆.一倅()) && param一倆.一倅() + 0.1D < this.一倖) {
            this.一倖 = param一倆.一倅();
            this.一倊 = param一倆.一倀();
          } 
          l = Math.min(8000L, this.一倀.一倄());
          return (param一倆.一倀() - this.一倊 >= l) ? 一倁(br.com.farmdmz.client.auth.一倆.一倀("Uc34RAU0fqH3/qKZFm5SoCCiNcr1f05sniSM+zfI7i5R1r6tef7qjhEKZyMkvyIWLamCagOdyUE5S/x9Bb+0wMj+gJg=")) : 一倀(一倀.MOVE);
        case 5:
          this.一倗 = "yrFwH3zkK51JMscaiFmRP5+Gm8U1bJ4+XxdJiJfUS+EcIWOcHiOyxE7uQXYo8g==";
          if (param一倆.一倆() == 一倂.FARM) {
            if (param一倆.一倇() < 0)
              return 一倇(param一倆); 
            this.一倎 = 0L;
            if (param一倆.一倇() != this.一倃)
              return (this.一倀.一倈() && this.一倅 == 0) ? 一倀(一倀.CLOSE) : 一倁(br.com.farmdmz.client.auth.一倆.一倀("15pW9RTrisbItZUMd+yIT5v3Wyw4NByKFBV+lYygVybMkuLutt0seLqlM0va28yhpXs5g+i/pwhIf5wWdFT1F9w3krxvswYQ5nEHbOYXIGTnkHifZg==")); 
            this.一倁 = this.一們 ? this.一倒 : 一倇.MENU;
            this.一倅 = this.一們 ? this.一倓 : this.一倅;
            this.一們 = false;
            this.一倒 = 一倇.MENU;
            this.一倓 = 0;
            this.一倇 = param一倆.一倀() + this.一倀.一倅();
            this.一倈 = Math.max(this.一倈, param一倆.一倀() + this.一倀.一倂());
            break;
          } 
          this.一倎 = 0L;
          if (param一倆.一倀() < this.一倇 || param一倆.一倀() < this.一倈)
            return 一倀(一倀.WAIT); 
          if (this.一倅 > this.一倀.一倇())
            return 一倀(param一倆, "3BgtNr3XKrOzCqrPtS142YYHKCs6XQCs8OCoDJ5ASpRrKbAVNKQ9uhi4dtAYFCjWbzcsoBwqCYzR7FYoqt1wuZI="); 
          this.一倅++;
          this.一倇 = param一倆.一倀() + this.一倀.一倅();
          this.一倈 = param一倆.一倀() + this.一倀.一倂();
          return 一倀(一倀.OPEN);
        case 6:
          if (param一倆.一倆() != 一倂.FARM)
            return (this.一倀.一倈() && param一倆.一倆() == 一倂.CLOSED) ? 一倀(param一倆, 一倇.MENU, br.com.farmdmz.client.auth.一倆.一倀("uohtTtAnJ3Q+MEnA8iFESikthA5wNEFqcXGHfjgxUatZlEhQD6DiCcihKr0v77wG5TWznYhewaFGj2/3BqAduUOeRzYMky/Fphsx8ZQ=")) : 一倁(br.com.farmdmz.client.auth.一倆.一倀("AIiL56+n3UazqCYWV8AEoZulj3/MNueUndMCJsPrGne5H/ItJqRJ7sTOZj0q4vW6HVmVWr5S7r4=")); 
          if (param一倆.一倇() < 0)
            return 一倇(param一倆); 
          if (this.一倎 > 0L) {
            this.一倇 = param一倆.一倀() + this.一倀.一倅();
            this.一倎 = 0L;
          } 
          if (param一倆.一倇() != this.一倃)
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("P7U4FTEdmkfcWqcECtsjaDHrHFUNfHP9HERWoWgMeIO0x/iEfcWdjIoJWqan/N9MyfstXdlPRvkij1cbdkiMsDNfsIEP")); 
          if (param一倆.一倀() < this.一倈)
            return 一倀(一倀.WAIT); 
          一倄1 = param一倆.一倈();
          if (一倄1 == 一倄.READY) {
            if (!param一倆.一倉())
              return 一倂(param一倆, br.com.farmdmz.client.auth.一倆.一倀("A0qwnBsewDnxeiymUPfaxFlCrLKDe1TenwL8DIJVUUGT7id4TJCw/8BUkaLECPzvXA8=")); 
            this.一倅 = 1;
            this.一倔 = 0;
            this.一倕 = 一倃(param一倆);
            this.一倁 = 一倇.COLLECTING;
            this.一倇 = param一倆.一倀() + this.一倀.一倅();
            this.一倈 = param一倆.一倀() + this.一倀.一倂();
            this.一倗 = "GDguzgnbFl+Mgknp1E/MPQ/WFZ90qrv762vodE0O6sj8Yd9FYO0A9issHyCiBlw=";
            return 一倀(一倀.COLLECT);
          } 
          if (一倄1 == 一倄.EMPTY && this.一倀.一倁()) {
            if (!param一倆.一倉())
              return 一倂(param一倆, br.com.farmdmz.client.auth.一倆.一倀("K+UuWmlXJEZda2mcOVb/HLRcz0rIprbNuE8N6DXWAOlFrfWBjqFG0vfg1AUrYioJXA==")); 
            this.一倅 = 1;
            this.一倔 = 0;
            this.一倕 = 一倃(param一倆);
            this.一倁 = 一倇.PLANTING;
            this.一倇 = param一倆.一倀() + this.一倀.一倅();
            this.一倈 = param一倆.一倀() + this.一倀.一倂();
            this.一倗 = "Lj7yY8k1rHB2N8NNeCIJyfZOGhoHk6zNNz2AiGmNoRZx4CVcgX4hhByBvPWCAVsT";
            return 一倀(一倀.PLANT);
          } 
          if (一倄1 == 一倄.UNKNOWN) {
            this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("RfTg132KuWLtDTNrAhaH3JaghbnShy7URU/dw7e1l3JX5QLRKklHlkFdhSXSpKw8flBCfd3+DsA=");
            return (param一倆.一倀() >= this.一倇) ? (this.一倀.一倈() ? 一倀(param一倆, 一倇.MENU, br.com.farmdmz.client.auth.一倆.一倀("4c27Dp4VT01jmas2sEDDQ29xg4KOsG9b2CbqbGe65XhABTDL+1WAe7LHi/J4B/Ltf6plYrL6LWYE17LXog==")) : 一倁(br.com.farmdmz.client.auth.一倆.一倀("70JraLM2dWsM3Cyc27ariZrLXCEqVf8nciC4481RtfKY62OM5BPjWL3vIYMLqoKKZ0bvJe6lpvkGfTHXIdEJvkMB5U0OTcQ="))) : 一倀(一倀.WAIT);
          } 
          return 一倄(param一倆);
        case 7:
          if (this.一倀.一倈() && param一倆.一倆() == 一倂.FARM && param一倆.一倇() >= 0 && param一倆.一倇() != this.一倃)
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("smz6O5hFut4igTj4sI15AqchTVaTpMcmiK6F/k60Itym35r8gGs5TSKDX9koJh/32/P9NozD/H+DF2ZcM6K9lx+mOAQY")); 
          一倄1 = 一倂(param一倆);
          if (一倄1 == 一倄.EMPTY || 一倄1 == 一倄.GROWING) {
            this.一倆++;
            this.一倔 = 0;
            if (一倄1 == 一倄.EMPTY && this.一倀.一倁()) {
              if (param一倆.一倆() != 一倂.FARM)
                return (this.一倀.一倈() && param一倆.一倆() == 一倂.CLOSED) ? 一倀(param一倆, 一倇.MENU, br.com.farmdmz.client.auth.一倆.一倀("XIgeSQR5t1hM8Hpog2zbG4rsgw8RMWNOAsjaiB3wYdeMCkK7iUTakqUaVqqVxVzOkNzrqwOQxDK17Q6sqNASYJV2lSCq8mA4W9KaVu1V6bF4vo+qIA==")) : 一倁(br.com.farmdmz.client.auth.一倆.一倀("T4AQUjCAHzK5XErkk5OlR+gSrP4QseJbnX1aELYBj71shUHatXOkIwQFcBwqAe1gXQh+NWlBPO22y21HZbvJ+5XbByjPJPX6I2uENqE=")); 
              this.一倁 = 一倇.MENU;
              this.一倇 = param一倆.一倀() + this.一倀.一倅();
              break;
            } 
            return 一倄(param一倆);
          } 
          if (param一倆.一倀() < this.一倇 || param一倆.一倀() < this.一倈) {
            this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("61iFVzp6gQn0JHgLhb9wv4tBpH8imnhMqmylqxhOxoSEhk9M41f46OWj+89DVSvRTEMb8xPU7h3sAKvL17Ds6g==");
            return 一倀(一倀.WAIT);
          } 
          if (param一倆.一倆() != 一倂.FARM)
            return (this.一倀.一倈() && param一倆.一倆() == 一倂.CLOSED) ? 一倀(param一倆, 一倇.COLLECTING, br.com.farmdmz.client.auth.一倆.一倀("RW3DF8xJDqwhoiwNcLvbeeHPrbKYJRm5iflLKzwBphs7mNW5RBq3Wsxs0PtN98Y02b2nTJtvpyOH+c+XRodEj0lEzwwzezg/S6b3R7TDlFoHZ+bmnenq")) : 一倁(br.com.farmdmz.client.auth.一倆.一倀("BkQPlVwGhZsNoCB0kGb42JrxlONJAieVPW00gFyVzQA54QHKgjUEryVMKXPCg3c5Htb88SIsOeuMZhz7rgoXGm34QYiOX3Df")); 
          if (this.一倀.一倈() && (param一倆.一倇() < 0 || 一倄1 == 一倄.UNKNOWN || (!param一倆.一倉() && param一倆.一倊().isBlank())))
            return 一倀(param一倆, 一倇.COLLECTING, br.com.farmdmz.client.auth.一倆.一倀("IN7K1XFEqFte/hmA6eQXhIGl0d/CQNaCquR9sVm+ZhQz8m9Kix8bhaTUSjx3XxJcIE1gq8Gazrx3HQVuoRR/+ObColnr5bZwLeCaNFEuhJQ=")); 
          if (param一倆.一倇() != this.一倃)
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("OUaGwl7tbsmZqSferfG2froXcU7JdrqJdz28FDpv0LJl7IfP97hR4PFBbpdgffCJ3QogziC5ebaUVNkcos4A/vfItac5iMOB")); 
          if (一倄1 != 一倄.READY)
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("ALk8JRRfUkdtLBeDOk0wWoAGuTXLzPaL+u7WPYEBtohZvX6xb+lLVbDWPre0jSmx1+2yntbQ3nkBz8Il9cRi4XvRx6Vua7+PryTYKgEy8vY=")); 
          if (this.一倅 > this.一倀.一倇())
            return 一倀(param一倆, br.com.farmdmz.client.auth.一倆.一倀("b1DH6KnyiEiqY1HJhX1KcQ+SgNi4XAkaLfL2zDWeRaOHxyKvxHvy4h1eRQCFmj9dJT/HceOP2zjy/QtcxRo=")); 
          if (!param一倆.一倉())
            return 一倁(一倁(param一倆, br.com.farmdmz.client.auth.一倆.一倀("kQ0FMSKjD9R8knDXBkTR/zF8DEwCIXsFNfeE7PvI/nIvQJzZGHXvdIXC8x27EmJhMPo="))); 
          this.一倅++;
          this.一倕 = 一倃(param一倆);
          this.一倇 = param一倆.一倀() + this.一倀.一倅();
          this.一倈 = param一倆.一倀() + this.一倀.一倂();
          return 一倀(一倀.COLLECT);
        case 8:
          if (this.一倀.一倈() && param一倆.一倆() == 一倂.FARM && param一倆.一倇() >= 0 && param一倆.一倇() != this.一倃)
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("ZcCMMKAmo/NXdLq0Bhk6yp3muuPQ1jyvnnheIDVZj6tGwhnMnUlU4YNz4JfEnPdk54y1kMcxa0aPCFhy6w0ARyAU4U4p")); 
          一倄1 = 一倂(param一倆);
          if (一倄1 == 一倄.GROWING)
            return 一倄(param一倆); 
          if (param一倆.一倀() < this.一倇 || param一倆.一倀() < this.一倈) {
            this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("CZ1mYwOoY5B5Sm6+yujwNNytJyxesRCVISBBXCgNOG8QfT/LEabgthY0jsADtMTBdF0N576XqCUkgUWNoI8J");
            return 一倀(一倀.WAIT);
          } 
          if (param一倆.一倆() != 一倂.FARM)
            return (this.一倀.一倈() && param一倆.一倆() == 一倂.CLOSED) ? 一倀(param一倆, 一倇.PLANTING, br.com.farmdmz.client.auth.一倆.一倀("Q6YD65BGzS76BUddguudygWFbZGhHZztQY9KpCtVUCb+YhiffpuUSW9mM7tzL1jjRQ2GoSProGkkRM3WYD4PTZvXEd2YTvddzQ1N9Dkw7sAtoBCYX+o=")) : 一倁(br.com.farmdmz.client.auth.一倆.一倀("mDSlQtFHCaNsJMtGMmCDjcqjeABYuVTJrrEhDpHVHAR7nCN9td7tjvAMWmjSrXEGEYN/31aHBBNa5vseT2rz87Y2/is1gJc=")); 
          if (this.一倀.一倈() && (param一倆.一倇() < 0 || 一倄1 == 一倄.UNKNOWN || (!param一倆.一倉() && param一倆.一倊().isBlank())))
            return 一倀(param一倆, 一倇.PLANTING, br.com.farmdmz.client.auth.一倆.一倀("wI/jhO5WAMSh1DZl3XEyqP6os03NYnn3Zb+SCzA3KkyMzZUm3ApowkpHacZgaBGhsdCN64pDtGLQqJbi58Kf16mthiIWksbhxXlTU9MP/g==")); 
          if (param一倆.一倇() != this.一倃)
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("Myw/e/1UMFr+pNpPcomOM1ilBnUs7SyQrwsJ8m13PXL1TgN3gXaE2MUfT2CSeMsrS903P18x1JyQo2O2O6BhWyPcNdM+I84=")); 
          if (一倄1 != 一倄.EMPTY)
            return 一倁(br.com.farmdmz.client.auth.一倆.一倀("ED/MCTPZPkv+zsdaWOlquQiZb+8qLAYLWuKz4IWohIRhdh+He8pms7YBdAn9dMNj4+baFXqLt39WtMSwx08/eT36Nuh2rrLu/GCvrsl3mg==")); 
          if (this.一倅 > this.一倀.一倇())
            return 一倀(param一倆, br.com.farmdmz.client.auth.一倆.一倀("oifEmroqS9/+bZRDh4nPqclKMqUrdgA8CYlql8FpkdMLNPcGZLie30tMCqnl4xl4oQ9oHaGSUZPtw5qFsg==")); 
          if (!param一倆.一倉())
            return 一倁(一倁(param一倆, br.com.farmdmz.client.auth.一倆.一倀("4NV1n7SvhgCcuf4bD72HLp8LeqGAqdjRRWChMVH11deG1Dz/wpc8nOkW1HTXUhXaVw=="))); 
          this.一倅++;
          this.一倕 = 一倃(param一倆);
          this.一倇 = param一倆.一倀() + this.一倀.一倅();
          this.一倈 = param一倆.一倀() + this.一倀.一倂();
          return 一倀(一倀.PLANT);
        case 9:
          if (param一倆.一倆() == 一倂.FARM)
            return (param一倆.一倀() >= this.一倇) ? 一倁(br.com.farmdmz.client.auth.一倆.一倀("k5nAKx+Xr0sT3sXM/97372102jrdIrs3IvqVTwm2sdSixtDDfqZk8FVUpsqOgMXLOobHWg/5+uY4U0yB+p5w15XTep/LQVFU")) : 一倀(一倀.CLOSE); 
          this.一倁 = 一倇.SELECT;
          this.一倌 = 0L;
          break;
        case 10:
          return 一倂(param一倆.一倀());
        case 11:
          this.一倗 = "AcrkIsAKSVKtUZtgYx3fRw9KZKGE+sNHmKEfR2nFE74cTBtC6hpFjqvWqoY8+RcXLPkPuDZqFP1QxSzsOuFfnw==";
          if (param一倆.一倀() < this.一倇 || param一倆.一倀() < this.一倈)
            return 一倀(一倀.WAIT); 
          this.一倁 = 一倇.OPENING;
          this.一倅 = 0;
          this.一倎 = 0L;
          this.一倇 = param一倆.一倀();
          break;
      } 
    } 
    return 一倁(br.com.farmdmz.client.auth.一倆.一倀("suIbES0GyMQNNAGHg2+4433hGSHFVpaZW9mjmYA5CvznKKWRsUBEA6LcjXeP4U9rZRPKVOSzpUuC8pkMvBYKoXdLI5snomHuqEOXPg=="));
  }
  
  private 一倃 一倁(一倆 param一倆) {
    List<一倃> list = param一倆.一個();
    for (byte b = 0; b < list.size(); b++) {
      int i = (this.一倄 + b) % list.size();
      一倃 一倃1 = list.get(i);
      if (this.一倀.一倈()) {
        if (一倃1.一倁() && !this.一候.contains(Integer.valueOf(一倃1.一倀())) && ((Long)this.一倘.getOrDefault(Integer.valueOf(一倃1.一倀()), Long.valueOf(0L))).longValue() <= param一倆.一倀()) {
          this.一倄 = (i + 1) % list.size();
          return 一倃1;
        } 
      } else if (一倃1.一倁() && ((Long)this.一倘.getOrDefault(Integer.valueOf(一倃1.一倀()), Long.valueOf(0L))).longValue() <= param一倆.一倀()) {
        boolean bool = (一倃1.一倂() == 一倄.READY || 一倃1.一倂() == 一倄.UNKNOWN || (一倃1.一倂() == 一倄.EMPTY && this.一倀.一倁()) || (一倃1.一倂() == 一倄.GROWING && 一倃1.一倃() > 0L && 一倃1.一倃() <= param一倆.一倀())) ? true : false;
        if (bool) {
          this.一倄 = (i + 1) % list.size();
          return 一倃1;
        } 
      } 
    } 
    return null;
  }
  
  private 一倄 一倂(一倆 param一倆) {
    if (param一倆.一倆() == 一倂.FARM && param一倆.一倇() == this.一倃)
      return param一倆.一倈(); 
    一倄 一倄1 = 一倃(param一倆);
    return (this.一倀.一倈() && (this.一倁 == 一倇.COLLECTING || this.一倁 == 一倇.PLANTING) && 一倄1 == this.一倕) ? 一倄.UNKNOWN : 一倄1;
  }
  
  private 一倄 一倃(一倆 param一倆) {
    return param一倆.一個().stream().filter(param一倃 -> (param一倃.一倀() == this.一倃)).findFirst().map(一倃::一倂).orElse(一倄.UNKNOWN);
  }
  
  private 一倁 一倀(一倆 param一倆, 一倇 param一倇, String paramString) {
    if (this.一倔++ > this.一倀.一倇())
      return 一倀(param一倆, br.com.farmdmz.client.auth.一倆.一倀("AUCjL2SuLokIxz3/DXzo0M32Dh3iDp/BLWawWSEHx31psk81XESWKYWLk+o/uGvdM+8Jk2G2IPjFLj2kAw==")); 
    int i = this.一們 ? this.一倓 : this.一倅;
    一倀(param一倇, i, param一倆.一倀(), Math.max(500L, this.一倀.一倂()));
    this.一倗 = "6HaQj6MfSBNw8o4ziwqCIjwhpwTSyPumASKD7aw3";
    return 一倀((param一倆.一倆() == 一倂.FARM) ? 一倀.CLOSE : 一倀.WAIT);
  }
  
  private void 一倀(一倇 param一倇, int paramInt, long paramLong1, long paramLong2) {
    this.一們 = true;
    this.一倒 = param一倇;
    this.一倓 = paramInt;
    this.一倁 = 一倇.RECOVERING;
    this.一倅 = 0;
    this.一倎 = 0L;
    this.一倇 = paramLong1 + paramLong2;
    this.一倈 = Math.max(this.一倈, this.一倇);
  }
  
  private 一倁 一倄(一倆 param一倆) {
    if (this.一倀.一倈()) {
      this.一候.add(Integer.valueOf(this.一倃));
      this.一倘.remove(Integer.valueOf(this.一倃));
      this.一倈 = param一倆.一倀() + this.一倀.一倂();
    } else {
      this.一倘.put(Integer.valueOf(this.一倃), Long.valueOf(param一倆.一倀() + this.一倀.一倆()));
    } 
    this.一倁 = 一倇.LEAVING;
    this.一倇 = param一倆.一倀() + this.一倀.一倅();
    this.一倗 = "PU2MySrtACEp+UX2vSgi+d4Wi6Dycvxx+lwGrfnGkEGdsfYKdNtFCS3usnMdKqMS";
    return 一倀((param一倆.一倆() == 一倂.FARM) ? 一倀.CLOSE : 一倀.WAIT);
  }
  
  private 一倁 一倀(一倆 param一倆, String paramString) {
    return this.一倀.一倈() ? 一倀(param一倆.一倀(), paramString) : 一倁(paramString);
  }
  
  public 一倁 一倀(long paramLong, String paramString) {
    if (!this.一倂 || this.一倃 < 0 || !this.一倀.一倈())
      return 一倁(paramString); 
    this.一倘.put(Integer.valueOf(this.一倃), Long.valueOf(paramLong + Math.max(5000L, this.一倀.一倆())));
    this.一個 = -1L;
    this.一倈 = paramLong + this.一倀.一倂();
    this.一倁 = 一倇.LEAVING;
    this.一倇 = paramLong + this.一倀.一倅();
    this.一倗 = "MM6D1N/YuKvoG1iH7fCOncNVp5KV+IgAueCk/3BhrdPITKjm8zdYA4X2SeaUZX/1";
    return 一倀(一倀.CLOSE);
  }
  
  private void 一倅(一倆 param一倆) {
    this.一倍 = param一倆.一個().stream().filter(一倃::一倁).filter(param一倃 -> (param一倃.一倂() == 一倄.GROWING && param一倃.一倃() > param一倆.一倀())).mapToLong(一倃::一倃).min().orElse(0L);
  }
  
  private long 一倆(一倆 param一倆) {
    long l = Long.MAX_VALUE;
    for (一倃 一倃1 : param一倆.一個()) {
      if (!一倃1.一倁())
        continue; 
      long l1 = ((Long)this.一倘.getOrDefault(Integer.valueOf(一倃1.一倀()), Long.valueOf(0L))).longValue();
      if (l1 > 0L) {
        l = Math.min(l, l1);
        continue;
      } 
      if (一倃1.一倂() == 一倄.LOCKED)
        continue; 
      if (一倃1.一倂() == 一倄.READY || (一倃1.一倂() == 一倄.EMPTY && this.一倀.一倁()))
        return param一倆.一倀(); 
      if (一倃1.一倂() == 一倄.GROWING && 一倃1.一倃() > 0L)
        l = Math.min(l, 一倃1.一倃()); 
    } 
    return (l == Long.MAX_VALUE) ? this.一倐 : l;
  }
  
  private String 一倁(一倆 param一倆, String paramString) {
    return param一倆.一倊().isBlank() ? paramString : param一倆.一倊();
  }
  
  private 一倁 一倂(一倆 param一倆, String paramString) {
    if (!param一倆.一倊().isBlank())
      return 一倁(param一倆.一倊()); 
    if (param一倆.一倀() >= this.一倇)
      return this.一倀.一倈() ? 一倀(param一倆, 一倇.MENU, br.com.farmdmz.client.auth.一倆.一倀("demJ7sds79rWb6vbabWnnQzOSZBvQUJm58eZcdBJMXL9Hi8jV+hr8NjEFbYGA9jtuNspghCk6iOL")) : 一倁(paramString); 
    this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("rzwLAVHGHCK6rSEGrZwXkLc46cXQjM518kWJyPDsDS6ZLYNq7RL50oO9pW8iZMzzR7YgRWh/l2dw");
    return 一倀(一倀.WAIT);
  }
  
  private 一倁 一倇(一倆 param一倆) {
    if (this.一倎 == 0L)
      this.一倎 = param一倆.一倀() + this.一倀.一倅(); 
    if (param一倆.一倀() >= this.一倎)
      return this.一倀.一倈() ? 一倀(param一倆, this.一們 ? this.一倒 : 一倇.MENU, br.com.farmdmz.client.auth.一倆.一倀("EZAXZlrkibsdHkUhOsXR7A0D861bjNkcPJ6Nz0EUMf+pAb3Mfr+OqZkzOxCjCBJCxweXOmVhscbbs/BbmVER1k8isaI7g+k=")) : 一倁(br.com.farmdmz.client.auth.一倆.一倀("y00QiadPaP3qrqLVOiR5EGwQD3lxwephR3v3u7abtwIBMnnTtusZZnEq++PZo7i6MIV3Yr0juFItb0FUN24hPPf9/azjzFLyuhIug4wP")); 
    this.一倗 = br.com.farmdmz.client.auth.一倆.一倀("F5ZHQI2BdJs6rDojlK6nTiqvVI2vPoIw2h01qQSSCRPjmwDk+/JBgL2ymXQilZknds3/w2sZjF87XZjGhHj84A==");
    return 一倀(一倀.WAIT);
  }
  
  private 一倁 一倁(String paramString) {
    一倀(paramString);
    return 一倀(一倀.STOP);
  }
  
  private 一倁 一倂(long paramLong) {
    long l = (Math.max(0L, this.一倏 - paramLong) + 999L) / 1000L;
    this.一倗 = String.format(Locale.ROOT, br.com.farmdmz.client.auth.一倆.一倀("rFQLpf6lY0h9EPkkBYtgRFBVI16y3PYnhX8i78xk2stjHiq1F3X+oeQA3xXNX/nndNS8nbvw4T1JTSq01ZG0SYTxgdT2"), new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) });
    return 一倀(一倀.WAIT);
  }
  
  private 一倁 一倀(一倀 param一倀) {
    return new 一倁(param一倀, this.一倃, this.一倗);
  }
  
  private enum 一倇 {
    INIT, TELEPORTING, SELECT, MOVING, OPENING, MENU, COLLECTING, PLANTING, LEAVING, COOLDOWN, RECOVERING;
  }
  
  public enum 一倄 {
    EMPTY, GROWING, READY, LOCKED, UNKNOWN;
  }
  
  public static final class 一倅 extends Record {
    private final boolean 一倀;
    
    private final boolean 一倁;
    
    private final long 一倂;
    
    private final long 一倃;
    
    private final long 一倄;
    
    private final long 一倅;
    
    private final long 一倆;
    
    private final int 一倇;
    
    private final boolean 一倈;
    
    private final long 一倉;
    
    public 一倅(boolean param1Boolean1, boolean param1Boolean2, long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5, int param1Int) {
      this(param1Boolean1, param1Boolean2, param1Long1, param1Long2, param1Long3, param1Long4, param1Long5, param1Int, false, 1800000L);
    }
    
    public 一倅(boolean param1Boolean1, boolean param1Boolean2, long param1Long1, long param1Long2, long param1Long3, long param1Long4, long param1Long5, int param1Int, boolean param1Boolean3, long param1Long6) {
      param1Long1 = Math.max(50L, param1Long1);
      param1Long2 = Math.max(0L, param1Long2);
      param1Long3 = Math.max(1000L, param1Long3);
      param1Long4 = Math.max(250L, param1Long4);
      param1Long5 = Math.max(1000L, param1Long5);
      param1Int = Math.max(0, Math.min(10, param1Int));
      param1Long6 = Math.max(1000L, param1Long6);
      this.一倀 = param1Boolean1;
      this.一倁 = param1Boolean2;
      this.一倂 = param1Long1;
      this.一倃 = param1Long2;
      this.一倄 = param1Long3;
      this.一倅 = param1Long4;
      this.一倆 = param1Long5;
      this.一倇 = param1Int;
      this.一倈 = param1Boolean3;
      this.一倉 = param1Long6;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倃$一倅;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倃$一倅;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倃$一倅;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public boolean 一倀() {
      return this.一倀;
    }
    
    public boolean 一倁() {
      return this.一倁;
    }
    
    public long 一倂() {
      return this.一倂;
    }
    
    public long 一倃() {
      return this.一倃;
    }
    
    public long 一倄() {
      return this.一倄;
    }
    
    public long 一倅() {
      return this.一倅;
    }
    
    public long 一倆() {
      return this.一倆;
    }
    
    public int 一倇() {
      return this.一倇;
    }
    
    public boolean 一倈() {
      return this.一倈;
    }
    
    public long 一倉() {
      return this.一倉;
    }
  }
  
  public enum 一倀 {
    TELEPORT, MOVE, OPEN, COLLECT, PLANT, CLOSE, WAIT, STOP;
  }
  
  public static final class 一倁 extends Record {
    private final 一倃.一倀 一倀;
    
    private final int 一倁;
    
    private final String 一倂;
    
    public 一倁(一倃.一倀 param1一倀, int param1Int, String param1String) {
      this.一倀 = param1一倀;
      this.一倁 = param1Int;
      this.一倂 = param1String;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倃$一倁;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倃$一倁;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倃$一倁;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public 一倃.一倀 一倀() {
      return this.一倀;
    }
    
    public int 一倁() {
      return this.一倁;
    }
    
    public String 一倂() {
      return this.一倂;
    }
  }
  
  public static final class 一倆 extends Record {
    private final long 一倀;
    
    private final boolean 一倁;
    
    private final boolean 一倂;
    
    private final boolean 一倃;
    
    private final boolean 一倄;
    
    private final double 一倅;
    
    private final 一倃.一倂 一倆;
    
    private final int 一倇;
    
    private final 一倃.一倄 一倈;
    
    private final boolean 一倉;
    
    private final String 一倊;
    
    private final List<一倃.一倃> 一個;
    
    public 一倆(long param1Long, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, boolean param1Boolean4, double param1Double, 一倃.一倂 param1一倂, int param1Int, 一倃.一倄 param1一倄, boolean param1Boolean5, String param1String, List<一倃.一倃> param1List) {
      if (param1一倂 == null)
        param1一倂 = 一倃.一倂.CLOSED; 
      if (param1一倄 == null)
        param1一倄 = 一倃.一倄.UNKNOWN; 
      if (param1String == null)
        param1String = br.com.farmdmz.client.auth.一倆.一倀("jrKru2c8nBA/f1R7ghKCmMmYgO5crPoPEyFsBQ=="); 
      param1List = (param1List == null) ? List.<一倃.一倃>of() : List.<一倃.一倃>copyOf(param1List);
      this.一倀 = param1Long;
      this.一倁 = param1Boolean1;
      this.一倂 = param1Boolean2;
      this.一倃 = param1Boolean3;
      this.一倄 = param1Boolean4;
      this.一倅 = param1Double;
      this.一倆 = param1一倂;
      this.一倇 = param1Int;
      this.一倈 = param1一倄;
      this.一倉 = param1Boolean5;
      this.一倊 = param1String;
      this.一個 = param1List;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倃$一倆;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倃$一倆;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倃$一倆;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public long 一倀() {
      return this.一倀;
    }
    
    public boolean 一倁() {
      return this.一倁;
    }
    
    public boolean 一倂() {
      return this.一倂;
    }
    
    public boolean 一倃() {
      return this.一倃;
    }
    
    public boolean 一倄() {
      return this.一倄;
    }
    
    public double 一倅() {
      return this.一倅;
    }
    
    public 一倃.一倂 一倆() {
      return this.一倆;
    }
    
    public int 一倇() {
      return this.一倇;
    }
    
    public 一倃.一倄 一倈() {
      return this.一倈;
    }
    
    public boolean 一倉() {
      return this.一倉;
    }
    
    public String 一倊() {
      return this.一倊;
    }
    
    public List<一倃.一倃> 一個() {
      return this.一個;
    }
  }
  
  public enum 一倂 {
    CLOSED, FARM, OTHER;
  }
  
  public static final class 一倃 extends Record {
    private final int 一倀;
    
    private final boolean 一倁;
    
    private final 一倃.一倄 一倂;
    
    private final long 一倃;
    
    public 一倃(int param1Int, boolean param1Boolean, 一倃.一倄 param1一倄, long param1Long) {
      if (param1一倄 == null)
        param1一倄 = 一倃.一倄.UNKNOWN; 
      this.一倀 = param1Int;
      this.一倁 = param1Boolean;
      this.一倂 = param1一倄;
      this.一倃 = param1Long;
    }
    
    public final String toString() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> toString : (Lbr/com/farmdmz/core/一倃$一倃;)Ljava/lang/String;
      //   6: areturn
    }
    
    public final int hashCode() {
      // Byte code:
      //   0: aload_0
      //   1: <illegal opcode> hashCode : (Lbr/com/farmdmz/core/一倃$一倃;)I
      //   6: ireturn
    }
    
    public final boolean equals(Object param1Object) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: <illegal opcode> equals : (Lbr/com/farmdmz/core/一倃$一倃;Ljava/lang/Object;)Z
      //   7: ireturn
    }
    
    public int 一倀() {
      return this.一倀;
    }
    
    public boolean 一倁() {
      return this.一倁;
    }
    
    public 一倃.一倄 一倂() {
      return this.一倂;
    }
    
    public long 一倃() {
      return this.一倃;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倃.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */