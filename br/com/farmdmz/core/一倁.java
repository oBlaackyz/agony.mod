package br.com.farmdmz.core;

import br.com.farmdmz.client.auth.一倆;
import java.util.Objects;

public final class 一倁 {
  private Object 一倀;
  
  private String 一倁 = 一倆.一倀("SxRkPpq8YaUpF/hqrDiuaXaTofZEjrIGuDe7mw==");
  
  private String 一倂 = 一倆.一倀("RbQbHeWvNVQQ6ZHeoiLXXrhkGNWiWhGp+2oqbQ==");
  
  public void 一倀(Object paramObject, String paramString1, String paramString2) {
    this.一倀 = Objects.requireNonNull(paramObject);
    this.一倁 = Objects.<String>requireNonNull(paramString1);
    this.一倂 = Objects.<String>requireNonNull(paramString2);
  }
  
  public 一倀 一倀(Object paramObject, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2) {
    return (this.一倀 == null || !paramBoolean1) ? 一倀.DISCONNECTED : ((!this.一倁.equalsIgnoreCase(paramString1) || !this.一倂.equalsIgnoreCase(paramString2) || (paramObject != null && paramObject != this.一倀)) ? 一倀.SESSION_CHANGED : ((paramObject == null || !paramBoolean2) ? 一倀.WAITING_FOR_WORLD : 一倀.READY));
  }
  
  public void 一倀() {
    this.一倀 = null;
    this.一倁 = this.一倂 = 一倆.一倀("aanT4pDT4koYJBztQW5l+N3+BLgPvBeCtAavdw==");
  }
  
  public enum 一倀 {
    READY, WAITING_FOR_WORLD, DISCONNECTED, SESSION_CHANGED;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\core\一倁.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */