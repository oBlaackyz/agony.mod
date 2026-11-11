package br.com.farmdmz.core;

public final class 一倅 {
  private boolean 一倀;
  
  private boolean 一倁;
  
  private boolean 一倂;
  
  private boolean 一倃;
  
  private boolean 一倄;
  
  private boolean 一倅;
  
  public void 一倀(一倀 param一倀) {
    this.一倁 = (this.一倅 || param一倀.running());
    this.一倀 = true;
    this.一倅 = false;
    this.一倂 = this.一倃 = false;
    this.一倄 = false;
    if (param一倀.running())
      param一倀.stop(); 
  }
  
  public void 一倀(一倀 param一倀, boolean paramBoolean1, boolean paramBoolean2) {
    if (!this.一倀)
      return; 
    if (this.一倂 && !this.一倁 && param一倀.running())
      param一倀.stop(); 
    this.一倀 = false;
    this.一倅 = (this.一倁 && !param一倀.running());
    this.一倁 = false;
    this.一倂 = this.一倃 = false;
    this.一倄 = false;
    一倃(param一倀, false, paramBoolean1, paramBoolean2);
  }
  
  public void 一倀(一倀 param一倀, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (!this.一倀)
      return; 
    this.一倂 = true;
    一倃(param一倀, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void 一倁(一倀 param一倀) {
    this.一倂 = this.一倃 = false;
    if (this.一倀 && !this.一倁 && param一倀.running())
      param一倀.stop(); 
    if (this.一倀 && !this.一倁)
      this.一倄 = false; 
  }
  
  public boolean 一倁(一倀 param一倀, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (!this.一倀) {
      if (this.一倅) {
        this.一倅 = false;
        return false;
      } 
      if (param一倀.running()) {
        param一倀.stop();
      } else if (paramBoolean2 && paramBoolean3) {
        param一倀.start();
      } else {
        this.一倅 = paramBoolean2;
      } 
      return (this.一倅 || param一倀.running());
    } 
    if (一倀() && !this.一倁) {
      this.一倃 = true;
      this.一倄 = false;
      if (param一倀.running())
        param一倀.stop(); 
      return false;
    } 
    this.一倁 = !this.一倁;
    if (!this.一倁) {
      this.一倅 = false;
      this.一倄 = false;
      if (this.一倂)
        this.一倃 = true; 
      if (param一倀.running())
        param一倀.stop(); 
    } 
    一倃(param一倀, paramBoolean1, paramBoolean2, paramBoolean3);
    return this.一倁;
  }
  
  public void 一倂(一倀 param一倀, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (!this.一倀) {
      this.一倅 = false;
      return;
    } 
    if (this.一倂) {
      if (param一倀.running()) {
        this.一倁 = true;
      } else {
        this.一倁 = false;
        this.一倃 = true;
      } 
    } else {
      this.一倁 = !this.一倁;
    } 
    if (!this.一倁) {
      this.一倄 = false;
      if (param一倀.running())
        param一倀.stop(); 
    } 
    一倃(param一倀, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void 一倂(一倀 param一倀) {
    this.一倁 = false;
    this.一倅 = false;
    if (this.一倂)
      this.一倃 = true; 
    this.一倄 = false;
    if (param一倀.running())
      param一倀.stop(); 
  }
  
  public boolean 一倃(一倀 param一倀) {
    return this.一倀 ? ((this.一倁 || 一倀())) : ((this.一倅 || param一倀.running()));
  }
  
  public void 一倃(一倀 param一倀, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (!this.一倀) {
      if (this.一倅)
        if (!paramBoolean2) {
          this.一倅 = false;
        } else if (paramBoolean3) {
          if (!param一倀.running())
            param一倀.start(); 
          this.一倅 = false;
        }  
      return;
    } 
    if (!paramBoolean1 || !paramBoolean2 || !paramBoolean3) {
      if (param一倀.running()) {
        if (!this.一倄)
          this.一倁 = true; 
        param一倀.stop();
      } 
      this.一倄 = false;
      return;
    } 
    if (param一倀.running()) {
      this.一倄 = true;
    } else if (this.一倄) {
      this.一倁 = false;
      if (this.一倂)
        this.一倃 = true; 
      this.一倄 = false;
    } else if (this.一倁 || 一倀()) {
      param一倀.start();
      this.一倄 = param一倀.running();
    } 
  }
  
  private boolean 一倀() {
    return (this.一倂 && !this.一倃);
  }
  
  public static interface 一倀 {
    boolean running();
    
    void start();
    
    void stop();
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倅.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */