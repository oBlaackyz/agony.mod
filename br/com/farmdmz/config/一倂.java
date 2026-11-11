package br.com.farmdmz.config;

import br.com.farmdmz.client.auth.一倆;
import java.util.ArrayList;
import java.util.List;

public final class 一倂 {
  public boolean autoTeleport = true;
  
  public boolean replant = true;
  
  public boolean background = true;
  
  public boolean showHud = true;
  
  public boolean timeRoomBackground = true;
  
  public boolean orbBackground = true;
  
  public String timeRoomFormKey = 一倆.一倀("ZcNw+7DN3u5TC9+d/v2w0qJMF2DBAWnBIP7dHQ==");
  
  public String timeRoomFormLabel = 一倆.一倀("ZdCREvbK8b87/MqHIF0YXfdKJEkYayQGfiN/SYhJHMGSFxLnbYTvYkrFUafVwtnBK9g6p840lsK6");
  
  public String timeRoomFishingCommand = 一倆.一倀("qaGdVYZbH79LE8tZDxU2Wdjt2ZE0G6kp2W3Tyg==");
  
  public String orbCommand = 一倆.一倀("ezG+U9WEP5ouHW/P0E/iaNukmrShFAK2vwDJhZlNBmtpI4qH5Q==");
  
  public String orbFormKey = 一倆.一倀("9fvnO9lOCrOvuHOTDrKjY2mhyFThrxS2NmCENA==");
  
  public String orbFormLabel = 一倆.一倀("AJ9y5T+wzsKhinp01WlBTiIPJem+z4EVpfOaOft5EKXC/eUUpvstjylKB7KIjSXJIPZKTM52kCP2");
  
  public String teleportCommand = 一倆.一倀("LrGieRxEQ8O8Gvycee+JkIH5yP58lQlTJA2QE/A30X9rCgXI");
  
  public String plotCommand = 一倆.一倀("Z3VljssNE+VKeIvTVufvmVps4UwN+/aHhZ1pqVUTTncMDQN+");
  
  public int cooldownMinutes = 30;
  
  public int actionDelayTicks = 12;
  
  public int openTimeoutTicks = 100;
  
  public int teleportWaitTicks = 120;
  
  public int visitTimeoutTicks = 600;
  
  public int pollSeconds = 10;
  
  public int retryLimit = 2;
  
  public List<一倀> plots = new ArrayList<>(List.of(new 一倀(1, 41190.0D, 125.0D, -40996.0D), new 一倀(2, 41190.0D, 125.0D, -40981.0D), new 一倀(3, 41207.0D, 125.0D, -40981.0D), new 一倀(4, 41207.0D, 125.0D, -40997.0D)));
  
  public 一倂 一倀() {
    一倂 一倂1 = new 一倂();
    一倂1.autoTeleport = this.autoTeleport;
    一倂1.replant = this.replant;
    一倂1.background = this.background;
    一倂1.showHud = this.showHud;
    一倂1.timeRoomBackground = this.timeRoomBackground;
    一倂1.timeRoomFormKey = this.timeRoomFormKey;
    一倂1.timeRoomFormLabel = this.timeRoomFormLabel;
    一倂1.timeRoomFishingCommand = this.timeRoomFishingCommand;
    一倂1.orbBackground = this.orbBackground;
    一倂1.orbCommand = this.orbCommand;
    一倂1.orbFormKey = this.orbFormKey;
    一倂1.orbFormLabel = this.orbFormLabel;
    一倂1.teleportCommand = this.teleportCommand;
    一倂1.plotCommand = this.plotCommand;
    一倂1.cooldownMinutes = this.cooldownMinutes;
    一倂1.actionDelayTicks = this.actionDelayTicks;
    一倂1.openTimeoutTicks = this.openTimeoutTicks;
    一倂1.teleportWaitTicks = this.teleportWaitTicks;
    一倂1.visitTimeoutTicks = this.visitTimeoutTicks;
    一倂1.pollSeconds = this.pollSeconds;
    一倂1.retryLimit = this.retryLimit;
    一倂1.plots = (this.plots == null) ? null : new ArrayList<>();
    if (this.plots != null)
      for (一倀 一倀 : this.plots)
        一倂1.plots.add((一倀 == null) ? null : 一倀.一倀());  
    return 一倂1;
  }
  
  public void 一倁() {
    if (this.timeRoomFormKey == null || this.timeRoomFormKey.length() > 160 || this.timeRoomFormKey.indexOf('\n') >= 0 || this.timeRoomFormKey.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("czD3s+4GhHUt2u4wDaJeTcPwMzAW02pK7cy0GDf6Q2KBZkQd1UmLA9W0BemBjOnj2Xlrm4xSMWlhgXGtbrF4GuKlAn9e/LyV79yXa4pQ0cy/TScSe+QE")); 
    if (this.timeRoomFormLabel == null || this.timeRoomFormLabel.length() > 160 || this.timeRoomFormLabel.indexOf('\n') >= 0 || this.timeRoomFormLabel.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("kT+z8yZH0hOBi3o//AC45TN/ETECvlC8aOZF96SAhcxz7ZQiLdM8/VSSRwTAMwY/tvS8Eg7HcUQi8fYHFIc=")); 
    if (this.timeRoomFishingCommand == null)
      this.timeRoomFishingCommand = 一倆.一倀("vROmfmc79P1pxahmHb+KTP7F/H057STxz3mWSQ=="); 
    this.timeRoomFishingCommand = this.timeRoomFishingCommand.trim();
    while (this.timeRoomFishingCommand.startsWith(一倆.一倀("xJo7UVGCXsfSFNRMlQM1gTUjEGiBYQtkgR4tjas=")))
      this.timeRoomFishingCommand = this.timeRoomFishingCommand.substring(1); 
    if (this.timeRoomFishingCommand.length() > 128 || this.timeRoomFishingCommand.indexOf('\n') >= 0 || this.timeRoomFishingCommand.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("KwR9ErBoiJPVjR4RT1FnyGR8fUBaPYZa1Yp1iMilh1nDvHyp0rWv/5TDdL3D09/mMSDjwPS+88pQThMFOMpo5v2wdqj72tL+avj5AezpCoLk3DTl")); 
    if (this.orbFormKey == null || this.orbFormKey.length() > 160 || this.orbFormKey.indexOf('\n') >= 0 || this.orbFormKey.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("iIqVHcpgbO/utezuBMBekfXHJ9DvzjNEslIBlubq0/6nG5Zb3mK92y8+PVuEvNgdDpX87lmu6GmlAQ1ejqURK6kLrlx//5vOaMOV")); 
    if (this.orbFormLabel == null || this.orbFormLabel.length() > 160 || this.orbFormLabel.indexOf('\n') >= 0 || this.orbFormLabel.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("Bmu/uc50RCSXQ2SBgworaB8OG+G/y09/sP6DqBBoOBsITU5tNbfeVjzCMYwTKX6wzZCiyU4yd1nvNq3+Wrj1yH+jycy4")); 
    if (this.orbCommand == null)
      throw new IllegalArgumentException(一倆.一倀("TiSnM/1hYaoXNa68DdXwnCZ/ZxJQ7IwrUxboOO61OIEf6O2M8SKVPH3C4wvoOpRxpeySCOOWxoeD1+zma7dyPwdh")); 
    this.orbCommand = this.orbCommand.trim();
    while (this.orbCommand.startsWith(一倆.一倀("4tlLrfKQZpaNhTeX2C0IafjNSpiFpBI0oXVdSsM=")))
      this.orbCommand = this.orbCommand.substring(1); 
    if (this.orbCommand.isBlank() || this.orbCommand.length() > 128 || this.orbCommand.indexOf('\n') >= 0 || this.orbCommand.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("LRjcvG6dI2yzUgJZgQ8kyR056ibE8pDqmRh2jL7G6u8X/hdv3VKLO6xLY6XYf6FbtJ8dUJwOTS/vE3SA06NtMCLmgcmECJ3rDKBR8OSfvTBQtQ==")); 
    一倀(一倆.一倀("3EubDah79Zvw9gv8DnUQbHTmDdiBL7Mtl0iDPvPzi1huuaAgxmddhdwy9G4Ff8Le3w=="), this.actionDelayTicks, 2, 100);
    一倀(一倆.一倀("SkFLOk+bUeuN4W+d4Dj3oSUhuilIKhYpMQF3697aQ+RUM1qJezb9Uxxb"), this.openTimeoutTicks, 20, 600);
    一倀(一倆.一倀("5ny/TfjYvaMclpWEcpyQKQJJ8AOqNthT+R9PI99nQBOExYONXah9bRSA6xjnYFU="), this.teleportWaitTicks, 20, 600);
    一倀(一倆.一倀("FW+wlq0pdXVIBBBgvkeHAZcw3OIl6uccPDOwmhr3ZnLtv0wE+SAGnfgmKYruA+OtHTQ="), this.visitTimeoutTicks, 100, 3600);
    一倀(一倆.一倀("xGYHQuZqhnXmlBVUWxv3xKBsGJ/KmAbYlGIuJwch/UEyUb7aCr5c6ByklUxNpTe/WbY="), this.pollSeconds, 1, 3600);
    一倀(一倆.一倀("AA3rN5VYyDXu9FThwbA3oKMnplfB1v8fz3B3D+tMSeXL7EcutovWCjQEqUg="), this.retryLimit, 0, 5);
    一倀(一倆.一倀("Jg/yMrq77fH6nQunCkHTwK6w5kjF88Qs0kAIXdW/Tfol6qFAn6R2f/iys3ZO29Q="), this.cooldownMinutes, 1, 1440);
    if (this.teleportCommand == null)
      throw new IllegalArgumentException(一倆.一倀("zCeMvlgQHSbSyEA4w7VaMmjtcqz+AfWAQUzw7szd8Ihtsy2mq8nMEUhe7Lk0uxHdqkz0LjOh")); 
    this.teleportCommand = this.teleportCommand.trim();
    while (this.teleportCommand.startsWith(一倆.一倀("l8WXN7m0qAI4qUU5NGkj7Hm+SRCxEA919Mqwd6g=")))
      this.teleportCommand = this.teleportCommand.substring(1); 
    if (this.teleportCommand.isBlank() || this.teleportCommand.length() > 128 || this.teleportCommand.indexOf('\n') >= 0 || this.teleportCommand.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("WgDKjYAnPf+StVMzuey38O7Zx4LaSzcp5mBoWM9hZ7U2pbFnSBAR/00dCnFoZ3k8qxUvPXEREGJ+bqWVyh3Ioa5kFUUlY0TrOCHcZJv8hhcx0Mw=")); 
    if (this.plotCommand == null)
      throw new IllegalArgumentException(一倆.一倀("nH68Gol9D/W0DPhs7IdOVVAmsOcXwtkULRCVAcwEKr65us70a6Dx91Wj+ko5FRvKr2KN+4WskNPTxU9y")); 
    this.plotCommand = this.plotCommand.trim();
    while (this.plotCommand.startsWith(一倆.一倀("UpqYyUnhU/55MoMdX69GI6mNOB8KLBPhtsaquuQ=")))
      this.plotCommand = this.plotCommand.substring(1); 
    if (this.plotCommand.isBlank() || this.plotCommand.length() > 128 || this.plotCommand.indexOf('\n') >= 0 || this.plotCommand.indexOf('\r') >= 0)
      throw new IllegalArgumentException(一倆.一倀("JNg9WJdyLtvVjJ6dRquvP3iAFCRe3u/mTXvl06nLD93hRHf18OpZudZt6dCdep+WeP5bybp52nQaHPbqUbiBVwo/+masr36QWCZAu1CKhoW21/cJZEKR8Ng=")); 
    if (this.plots == null || this.plots.size() != 4)
      throw new IllegalArgumentException(一倆.一倀("iVxOgR0qivRLtXKXQGPESXMaw+OyhHiIxX9ys2OqZzrIahc8VV3OCzV9anRKZqUxex0+cUELzlzVxw==")); 
    for (byte b = 0; b < this.plots.size(); b++) {
      一倀 一倀 = this.plots.get(b);
      if (一倀 == null || 一倀.number != b + 1)
        throw new IllegalArgumentException(一倆.一倀("oGPMgdcbzHlmZDlZVKqFErprdVqp+PF6SwBW6IvO4nM4wVqJxIbRVIbg91+NmucmBx2FVLPcbylk8wTP3+S3IZFf")); 
      一倀(一倆.一倀("9qJZRGk1OFIBQ4z6NELjFYl9jLkKTacFojurfnk="), 一倀.x, -2.9999984E7D, 2.9999984E7D, 一倀.number);
      一倀(一倆.一倀("x660RmcQlWAfQu2FX7JMLrQ+dE/4RjTp+WBlUUI="), 一倀.y, -64.0D, 1024.0D, 一倀.number);
      一倀(一倆.一倀("juqlccFCu8OTAb7UPNU/JU1G79jo8kB5Qb9Vaz0="), 一倀.z, -2.9999984E7D, 2.9999984E7D, 一倀.number);
    } 
  }
  
  private static void 一倀(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < paramInt2 || paramInt1 > paramInt3)
      throw new IllegalArgumentException("72acBNdA2SbnbTbZMrE9NPN3iWpWK8VvLAwuF8pEWL8APw2O5dzRI1I="); 
  }
  
  private static void 一倀(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    if (!Double.isFinite(paramDouble1) || paramDouble1 < paramDouble2 || paramDouble1 > paramDouble3)
      throw new IllegalArgumentException("Ecs+jzdLxO31ynVKhXfKTAJrovefngpBOdqNQ0UNG72u+MBhoHpi6DtjC+nL3Zs/ZtuNaF2FqIpqq7Cjd0Cc"); 
  }
  
  public static final class 一倀 {
    public int number;
    
    public double x;
    
    public double y;
    
    public double z;
    
    public boolean enabled = true;
    
    public 一倀() {}
    
    public 一倀(int param1Int, double param1Double1, double param1Double2, double param1Double3) {
      this.number = param1Int;
      this.x = param1Double1;
      this.y = param1Double2;
      this.z = param1Double3;
    }
    
    public 一倀 一倀() {
      一倀 一倀1 = new 一倀(this.number, this.x, this.y, this.z);
      一倀1.enabled = this.enabled;
      return 一倀1;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\config\一倂.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */