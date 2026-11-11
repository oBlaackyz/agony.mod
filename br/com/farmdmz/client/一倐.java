package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.config.一倂;
import br.com.farmdmz.core.一倇;
import com.mojang.blaze3d.platform.InputConstants;
import java.text.Normalizer;
import java.util.Locale;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.Input;
import net.minecraft.client.player.LocalPlayer;

final class 一倐 {
  private static final Minecraft 一倀 = Minecraft.m_91087_();
  
  private static final long 一倁 = 3500L;
  
  private static final long 一倂 = 2000L;
  
  private static final long 一倃 = 300L;
  
  private static final long 一倄 = 1500L;
  
  private static final long 一倅 = 650L;
  
  private static final long 一倆 = 2000L;
  
  private static final long 一倇 = 6000L;
  
  private static final double 一倈 = 2.2D;
  
  private 一倀 一倉 = 一倀.START;
  
  private long 一倊;
  
  private long 一個;
  
  private long 一倌;
  
  private long 一倍;
  
  private long 一倎;
  
  private long 一倏;
  
  private boolean 一倐;
  
  private boolean 一們;
  
  private boolean 一倒;
  
  private boolean 一倓;
  
  private LocalPlayer 一倔;
  
  private 一倀 一倕 = 一倀.ATTACK;
  
  private long 一倖;
  
  private double 一倗 = Double.POSITIVE_INFINITY;
  
  private int 一倘 = -1;
  
  private String 一候 = 一倆.一倀("4xJ+2EVLve8T4EvFKF1xcWtyue6fKoBlK1R9Ug==");
  
  void 一倀() {
    一倉.一倀(一倇.一倁.ORB);
    一倂();
    一倄();
    一倏.一倓();
    this.一倉 = 一倀.START;
    this.一倊 = this.一個 = this.一倌 = this.一倍 = this.一倎 = this.一倏 = 0L;
    this.一倖 = 0L;
    this.一倗 = Double.POSITIVE_INFINITY;
    this.一倓 = false;
    this.一倕 = 一倀.ATTACK;
    this.一倐 = false;
    this.一候 = 一倆.一倀("MkruWDCv8HfXeCExxhoT5aewQw3g50RQsiecvQ==");
    this.一倘 = -1;
    一倏.一倂();
  }
  
  void 一倀(String paramString) {
    if (this.一倉 != 一倀.ATTACK || paramString == null)
      return; 
    String str = Normalizer.normalize(paramString.replaceAll(一倆.一倀("GKFyBjrLuqCFXcExIdkOsSblyEnbR7p9L0WSrFpkZA=="), 一倆.一倀("k/1blr/gu5mbLI4EeiAH+qhMhxxlyHv4Q//BmA==")), Normalizer.Form.NFD).replaceAll(一倆.一倀("OqA2SrbB5M9yKZEqSuAGlcbeiLqkQcX4fVJy7+h9tMKU5A=="), 一倆.一倀("IGkYCbhv1A5o7TGHfmoiOJXN4FNV6QlL1K3EGg==")).toLowerCase(Locale.ROOT);
    if (str.contains(一倆.一倀("H652PA/M1BwE3obG7aI9aiRIYagAp9G9N2qMS3BXsowMcfpDyrwWbmHSWRI=")) && str.contains(一倆.一倀("xj8GLVwsd+lPFl5rp0SbnXKVhKDe+Ns7YOiLorjCwA==")))
      this.一倐 = true; 
  }
  
  String 一倀(一倂 param一倂, long paramLong) {
    if (一倀.f_91074_ == null || 一倀.f_91073_ == null || 一倀.m_91403_() == null) {
      一倀();
      return 一倆.一倀("UKX49v7Bo+Tdw+VJD3WEGa1ca2ctZnoyP/fWbezWHqFbrLe8a/phwy4x7D8BQOZRDdV/1xoO88LalgQ=");
    } 
    if (param一倂.orbFormKey == null || param一倂.orbFormKey.isBlank()) {
      一倄();
      return 一倆.一倀("1mXrAUMy2VRvHhkFXgYZ7JQSOMV4nA6Cr1sSK07lfbaHEAGrKYwMgS+k7X5pe2FxRP6ZYVve+UVLLrgVumEiyV3p");
    } 
    String str = 一倁(param一倂.orbCommand);
    if (str.isBlank()) {
      一倄();
      return 一倆.一倀("5FAvescLqL/6tsrj3rH9iyaR3X0iU19pWJymSQtaLBmD3jjcllfqJACcI61Kaap/Ha9LGBktGD7S6Q==");
    } 
    if (this.一倉 != 一倀.START && !str.equals(this.一候))
      一倀(); 
    if (!param一倂.orbBackground && !一倏.一們() && (一倀.f_91080_ != null || !一倀.m_91302_())) {
      一倂();
      一倄();
      return 一倆.一倀("a5EtYmF6I7GkCwjmLhVcdviNRBq97b8/tM7bNkKAfXJ49hBmqeFMuSDtRo/vCIY4iK6KA2Ryog==");
    } 
    if (this.一倉 == 一倀.START) {
      一倉.一倀(一倇.一倁.ORB, str, paramLong);
      this.一候 = str;
      this.一倊 = paramLong;
      this.一倉 = 一倀.WAIT_HOME;
      return "uddK1Iku9WClaJ/9RyBDANR73JybojdKKAyQbFFkTbJs2+hsm+13+tjfVbnLN4po";
    } 
    if (this.一倉 == 一倀.WAIT_HOME) {
      if (paramLong - this.一倊 < 3500L)
        return 一倆.一倀("sSLHsTK1VaQIUCFbvx0cxbC4hJ0eS8JgXC1PCdqBDEHqbfl0puZxqaUgFnO4fQGEdy4/TSchb0xInrcTVQ=="); 
      if (this.一倐 || 一倏.一倏()) {
        if (一倏.一倄())
          return 一倆.一倀("KAKU1i/f5+aYf2lKLh4I9PeG2ndXRMkRU1GGSSU188R3oJrrXToax1yXydJ9kVocvHS55VaXVE+40+fPt7Q7Jnj2w3iWIiXezSfJKQ=="); 
        一倏.一倂();
        this.一倐 = false;
        this.一倉 = 一倀.OPEN_EXCHANGE;
      } else {
        if (一倏.一倁() == null)
          return "Lk7dpSromQLY9YuTzdSyTrWjcKM880O4EUltXL1PDkklQS4usP+zI0kROBtYz4l9EbBuEI6uY/w="; 
        this.一倉 = 一倀.TRANSFORM;
      } 
    } 
    if (this.一倉 == 一倀.TRANSFORM) {
      一倂();
      if (!一倒.一倃(param一倂.orbFormKey)) {
        if (paramLong - this.一個 >= 2000L) {
          if (!一倒.一倁(param一倂.orbFormKey))
            return 一倆.一倀("OkmLoAatZXsbjsCNSc9Y4aR3NgsemrBh62RaEB6DePVd4Sq/VZurvunFP8UH9Qg1fWQUluQ4sqJBQzrixoYUStbI"); 
          this.一個 = paramLong;
        } 
        this.一們 = true;
        return !一倒.一倂(true) ? 一倆.一倀("nTSrwTTcEABky+9pshX18a7jLEUrl7C0rJpLHyIoZu/ETGDAj14lMD31s/KbLgRcTRTOTs+czDlcyHAxJ/nigHYowxE=") : 一倆.一倀("0SyWrCnjUmctXtgdzB8FdkcNCQufFp8lJ39eqk8r+n3fYrDEayBk/ntkCQvVPplyeKqc7BXdhbuOLSY=");
      } 
      一倄();
      this.一倕 = 一倀.ATTACK;
      this.一倉 = 一倀.APPROACH;
    } 
    if (this.一倉 == 一倀.APPROACH) {
      boolean bool = (this.一倕 == 一倀.OPEN_EXCHANGE) ? true : false;
      if (!bool && (this.一倐 || 一倏.一倏())) {
        一倂();
        if (一倏.一倄())
          return 一倆.一倀("Qw9UcD40V6T1spPcTmYGvveMjGl/RgUHw29QP50OT6MblREoOqAnyNh2uGzE9xE+DSC3f7+hKmqlI+D6Hldxyagxsm3zzkAJo0ZocQ=="); 
        一倏.一倂();
        一倃();
        this.一倐 = false;
        this.一倉 = 一倀.OPEN_EXCHANGE;
        return 一倆.一倀("4ZNdxKpipRggQPdn53yL9zpo7rqa/u0jIxzG3i5yG/Uc0N9NEcLhhL7wAEppRyxs0HDQ4QtgITNZNKG6g2OyiIFGrvQZ4Y5ruHjsMEVW");
      } 
      if (一倏.一倄()) {
        一倂();
        return 一倆.一倀("5Oan4qNY/ajeqzIGjomUyjXM0y74aeiqXtr65MB/nLP2G9g8H16ZjypeSxClQ8zoRdQCgqCVrA==");
      } 
      一倏.一倀 一倀1 = bool ? 一倏.一倀() : 一倏.一倁();
      if (一倀1 == null) {
        一倂();
        一倃();
        return bool ? 一倆.一倀("IDeNkiXXOSQQyKC+ZwebZblnJ0lstikx0WEIAYt3Lz9DLtgeWv8E8WKaYi50Jj47OuqqpdTLr7WHGw16XY0tMBI=") : 一倆.一倀("2G7QthJOEWgkS38Hf0VVmXZdTSNtdmRrbH4/oivPr/hMPWSFdmY60xUxQpNn5dNB0hAM1iJZ4cdbVKr3G3e3yw==");
      } 
      int i = bool ? Integer.MIN_VALUE : 一倏.一倃();
      if (i != this.一倘) {
        一倃();
        this.一倘 = i;
      } 
      if (一倁()) {
        一倂();
        return bool ? 一倆.一倀("H3wE9OgBbvKIoC0Cx3RQ2ZqkdEJQn/IOR+sl7MIyWC1Y1Qrls0IOgYmmXY7S4fcRUWHX9gf/e7NDXKD4Qq8uI2eHq30F/jO1FnKvGJgh") : 一倆.一倀("h2XXEL068dR8dV5TVgv4jsFhnfl2d8yuDwUt0gv8pNiqCt+qlxI8VOZsxYrx/ROV1ddShhouOY9br8K+m2hRdKV/B7Hdde3yMRb9+kgF");
      } 
      double d = 一倀(一倀1);
      if (d + 0.15D < this.一倗) {
        this.一倗 = d;
        this.一倖 = paramLong;
        this.一倓 = false;
      } 
      if (d <= 2.2D) {
        一倂();
        if (bool) {
          一倏.一倉();
        } else {
          一倏.一倆();
        } 
        if (bool ? 一倏.一倊() : 一倏.一倇()) {
          一倃();
          this.一倉 = this.一倕;
        } else {
          return bool ? 一倆.一倀("nVfSTDvoRnb4sk8RXChFZfAJqw1QdbhdHPejPZlTVTFCQFKOkl+Z/t1vwCGlm8UT2TqNs/6IxVupyLXa2puuVX2saCvcCLBPAPvn+CiUCg==") : 一倆.一倀("e/S+g51tLwnpYIX+RButZNAMoTpPUi0QukgJQmIXy6L7dool0WBIrV/XvBr1VE7V//kFM6KzlqG66P3w4P89oTu0LFdVa2KHjNFlMt8oyg==");
        } 
      } else {
        if (this.一倖 != 0L && paramLong - this.一倖 >= 6000L)
          this.一倓 = true; 
        if (this.一倓) {
          一倂();
          return bool ? 一倆.一倀("B/MqhSELF5iqjquyWXHNR+kKZDMjZT7YyEqxIlaIO0olrz5hhoeUIWebbv9c7s+9znLE/tFjsrUqSHiJR1HnEfci8oZKOMO6iznPyqU=") : 一倆.一倀("FpPiCWNEzs7/I2inTbVLDqUHfQj9TR46jXdphiG6tIqpUVmJrquGnyL3xDcudbPb/fKmcAx6srZMpIPdJae5U9EiWRre+I5IF+2OQH8=");
        } 
        一倀(一倀1.一倀() - 一倀.f_91074_.m_20185_(), 一倀1.一倂() - 一倀.f_91074_.m_20189_());
        this.一倒 = true;
        this.一倔 = 一倀.f_91074_;
        return String.format(Locale.ROOT, bool ? 一倆.一倀("iITMstwFQcPY8X2LfOwgJJ7P5A3A8IiTgJ6itS4XJT4OYxGv5k+juXTD3PlwnOAVm+7Tg2x6IADy5q41") : 一倆.一倀("updhzHczoK6Xg7vg/vUUVese53E6KkzpGXXMK+T7Aw2u4xi6kbI/ToBbw8AO/c2Zw6t4hL+j+R1LPbrb"), new Object[] { Double.valueOf(d) });
      } 
    } 
    if (this.一倉 == 一倀.ATTACK) {
      一倂();
      if (this.一倐 || 一倏.一倏()) {
        if (一倏.一倄())
          return 一倆.一倀("3jhA0jpBQ/un/JwXv1ieRO/BB/BMszwnr+2pBx1N8e0hbDG5KEG4ozFMSEtAojKZ/gx5l5hAZrc5+EcSAzWqBaUWml5O8nso4NJn4w=="); 
        一倏.一倂();
        一倃();
        this.一倐 = false;
        this.一倉 = 一倀.OPEN_EXCHANGE;
      } else {
        if (一倏.一倄())
          return 一倆.一倀("AZ1AxRalKhTLQ+39PFYYD+DuAOCNis5czdbBg4PQk/45pWX5vAj0amdIOks2vQ=="); 
        if (!一倒.一倃(param一倂.orbFormKey)) {
          this.一倉 = 一倀.TRANSFORM;
          return 一倆.一倀("mknrN+xK669rJdWkcA8edBXmJZD7CNwcNn3ZO0murY4MNmZ2T9L4ltIzRoqLQkRla0yIJZ8rA5eZ4af/iHY=");
        } 
        一倏.一倀 一倀1 = 一倏.一倁();
        if (一倀1 == null)
          return 一倆.一倀("YxHEbTxxQr0hwALgPqt+gmasC3ur+Xb20+QW7PGT+NSsLiiXv4jUtsmy2XQ00RaJ/AaVSCSFMf2FWOecUPmiVA=="); 
        if (一倀(一倀1) > 2.2D) {
          this.一倕 = 一倀.ATTACK;
          一倃();
          this.一倉 = 一倀.APPROACH;
          return 一倆.一倀("/cPJYQYs/OJU5mYXWFTdRD9VSJGcWk+tddxxBAMAFhidQ+B5YJgerC6iTTQJSSL5t+qoU3PSMa4uUzvK");
        } 
        一倏.一倆();
        if (!一倏.一倇())
          return 一倆.一倀("6FQbvV3CKhiYDd6inofQZjYzrbw0HXcEsHMhu/FNC8GpiOvLGyYRZ1mK02HA2wwzMdhdWvbVkmoBx5tg"); 
        if (paramLong - this.一倌 >= 300L) {
          if (!一倏.一倈())
            return 一倏.一個(); 
          this.一倌 = paramLong;
        } 
        return 一倆.一倀("anJhYXPo9KsCY+8iGAEANDqcf2Jm+HMFO2Hgs0ZZe6jl5UxSIiTrQ8NcmExWHC1eDct7b4HM4Eejz74ISdZwGa7x");
      } 
    } 
    if (this.一倉 == 一倀.OPEN_EXCHANGE) {
      一倂();
      if (一倏.一倐() <= 0)
        return 一倆.一倀("dg76gkprIikQ3DaTKvyfFpCeHZQAmVi4bXqfX+g/5LUO7yg5Y65Jxu2kcVwSPv/3IzWUAO+wFp2HKaFvpYHFrB0="); 
      if (一倏.一們()) {
        this.一倉 = 一倀.EXCHANGE;
      } else {
        一倏.一倀 一倀1 = 一倏.一倀();
        if (一倀1 == null)
          return 一倆.一倀("LucNHe2xVQ7U0E6XCDi/Ryiz7T3Xgsi6fQcluOu+NE2QqcHC37d7QvsTQNyKVWvNiUAe3sRzb4+5JBETzt4="); 
        if (一倀(一倀1) > 2.2D) {
          this.一倕 = 一倀.OPEN_EXCHANGE;
          一倃();
          this.一倉 = 一倀.APPROACH;
          return 一倆.一倀("P/J1WA9HxNrLlhjJRH2DQxRWpO4W//JoTvBrHpWhirPjnKep1FiiClx1ba59dZFT1QHgrR1HjMc=");
        } 
        一倏.一倉();
        if (!一倏.一倊())
          return 一倆.一倀("1ehWeiSVVsdXS5REnLUkMeqa//rEmI3Kd93gIbQgbGR/KEttmtNGwEEZ5IUYUVdmqTqa+Wk6Jvdi49w="); 
        if (paramLong - this.一倍 >= 1500L) {
          this.一倍 = paramLong;
          if (!一倏.一倎())
            return 一倏.一倍(); 
        } 
        return 一倆.一倀("0N/eORa3GJ3Fjk5XDuOUQ6ECv5QU3EIRuRjQ93nuKtiQ8/00aMX00RUvwJoHWOw8B/RS8H74QdJ1EpU=");
      } 
    } 
    if (this.一倉 == 一倀.EXCHANGE) {
      一倂();
      if (!一倏.一們()) {
        if (一倏.一倐() == 0)
          一倏.一倔(); 
        this.一倉 = 一倀.COLLECT;
        this.一倏 = paramLong;
        return 一倆.一倀("H+95ti76nbKnHinG7RlGWB8yXuK9higGAny+rk517ktzgVvPbMPosptEnVAHeJlxf7et3rX3YHXRnpN8o9/q");
      } 
      if (一倏.一倐() > 0) {
        if (paramLong - this.一倎 >= 650L) {
          this.一倎 = paramLong;
          if (!一倏.一倒())
            return 一倏.一倍(); 
        } 
        return 一倆.一倀("pZVnRHxAkuZGbq1MPIpy5qnzJON05zaB/Yx/0oj54paDhNVY7eTIJ0fMskVZSzbS/9S4yisL2y2ZGRJG4Q+2Y/ALWQhF");
      } 
      一倏.一倓();
      一倏.一倔();
      this.一倉 = 一倀.COLLECT;
      this.一倏 = paramLong;
      return 一倆.一倀("w3h4oP1nknSNABVEHrvmqoCUECX5E7S/icYkxyXbl1Q4MnhBY6rbgwSLbuGA0bTVzVL5b9XiSSvKpZ5W+6a6");
    } 
    if (this.一倉 == 一倀.COLLECT) {
      一倂();
      if (paramLong - this.一倏 < 2000L)
        return 一倆.一倀("HzXghIekCEkxfeiwNW6Kt+O/QEnFei5HTHtRPn0XsIsnhor77DUWrgTnxUjlHVJf+Dgs36FAZ0feygC51NBZ"); 
      this.一倉 = (一倏.一倐() > 0) ? 一倀.OPEN_EXCHANGE : 一倀.ATTACK;
      return (this.一倉 == 一倀.OPEN_EXCHANGE) ? 一倆.一倀("9mu3CWAF+8WVZ0IxSFSlEyneD6I9yyj2iJoaebVoyPmZTOtx2Ptp0M0hbtES0IcMuFwY+Q==") : 一倆.一倀("r4qlSBmXXqt8EMLO9ZdRxKA8GGAQEvpRBXyJm90fcviVIRupGwUVKs/FCwUNsNd/dHJLZ9x1H9wzC6khGx8dew==");
    } 
    return 一倆.一倀("pnAoPD9tE0QkwHgBqPUG/zzkobfSq7rSuRY1DxULSCrtoFwCp4o7F80C");
  }
  
  void 一倀(LocalPlayer paramLocalPlayer, Input paramInput) {
    if (!this.一倒 || this.一倔 != paramLocalPlayer)
      return; 
    if (一倁()) {
      一倂();
      return;
    } 
    paramInput.f_108568_ = true;
    paramInput.f_108569_ = paramInput.f_108570_ = paramInput.f_108571_ = false;
    paramInput.f_108567_ = 1.0F;
    paramInput.f_108566_ = 0.0F;
  }
  
  private static boolean 一倁() {
    return (一倀.f_91080_ != null || !一倀.m_91302_()) ? false : ((一倀(一倀.f_91066_.f_92085_) || 一倀(一倀.f_91066_.f_92087_) || 一倀(一倀.f_91066_.f_92086_) || 一倀(一倀.f_91066_.f_92088_) || 一倀(一倀.f_91066_.f_92089_) || 一倀(一倀.f_91066_.f_92090_)));
  }
  
  private static boolean 一倀(KeyMapping paramKeyMapping) {
    int i = paramKeyMapping.getKey().m_84873_();
    return (i >= 0 && InputConstants.m_84830_(一倀.m_91268_().m_85439_(), i));
  }
  
  private void 一倂() {
    this.一倒 = false;
    this.一倔 = null;
  }
  
  private void 一倃() {
    this.一倗 = Double.POSITIVE_INFINITY;
    this.一倖 = 0L;
    this.一倓 = false;
    this.一倘 = -1;
  }
  
  private static double 一倀(一倏.一倀 param一倀) {
    return Math.hypot(param一倀.一倀() - 一倀.f_91074_.m_20185_(), param一倀.一倂() - 一倀.f_91074_.m_20189_());
  }
  
  private static void 一倀(double paramDouble1, double paramDouble2) {
    if (Math.abs(paramDouble1) + Math.abs(paramDouble2) < 0.001D)
      return; 
    float f = (float)Math.toDegrees(Math.atan2(-paramDouble1, paramDouble2));
    一倀.f_91074_.m_146922_(f);
    一倀.f_91074_.m_5616_(f);
  }
  
  private void 一倄() {
    if (!this.一們)
      return; 
    一倒.一倂(false);
    this.一們 = false;
  }
  
  private static String 一倁(String paramString) {
    if (paramString == null)
      return 一倆.一倀("s1uTJ/WlrZ6F7yCYGwOIE4cfG9YKIiV9/oDSiQ=="); 
    String str;
    for (str = paramString.trim(); str.startsWith(一倆.一倀("q0EAnWf0E8l0JAqf/UIlaBeqfI7OtteL8LQrM1c=")); str = str.substring(1));
    return str;
  }
  
  private enum 一倀 {
    START, WAIT_HOME, TRANSFORM, APPROACH, ATTACK, OPEN_EXCHANGE, EXCHANGE, COLLECT;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倐.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */