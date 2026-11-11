package br.com.farmdmz.client.auth;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.EnumSet;

public final class 一倄 {
  private static final 一倄 一倀 = new 一倄(一倆.一倀("ABZnik2VysxHXKizZnK7fX3h9A/N/ojepy956cNVi+Cm4PZdgg=="), EnumSet.noneOf(一倀.class));
  
  private final String 一倁;
  
  private final EnumSet<一倀> 一倂;
  
  private 一倄(String paramString, EnumSet<一倀> paramEnumSet) {
    this.一倁 = paramString;
    this.一倂 = paramEnumSet.clone();
  }
  
  public static 一倄 一倀() {
    return 一倀;
  }
  
  public String 一倁() {
    return this.一倁;
  }
  
  public boolean 一倀(一倀 param一倀) {
    return (param一倀 != null && this.一倂.contains(param一倀));
  }
  
  public boolean 一倂() {
    return !this.一倂.isEmpty();
  }
  
  public static 一倄 一倀(JsonObject paramJsonObject) {
    EnumSet<一倀> enumSet1;
    String str3;
    if (paramJsonObject == null)
      return 一倀; 
    JsonElement jsonElement1 = paramJsonObject.get(一倆.一倀("p2jCJDSZ/UDON2sQpVVP2wozo4O21k5Ge3p/c6FvZhM="));
    if (jsonElement1 == null || !jsonElement1.isJsonObject())
      return 一倀; 
    JsonObject jsonObject = jsonElement1.getAsJsonObject();
    if (!一倆.一倀("6uI2Tz4rQ0zsnbMTDKi6thifAZJyqVG+5LbbKI2SnriifQ==").equals(一倀(jsonObject.get(一倆.一倀("d6GWp6fz5nLpsoxusJGEYaxxAMHwZVB8/n7eR+5Uo8Z4wQ==")))))
      return 一倀; 
    JsonElement jsonElement2 = paramJsonObject.get(一倆.一倀("m4gelyGNzrhsYF/n3p1SYGzx0N4QwoxXdA3CjhVay0l0Dg=="));
    boolean bool = (jsonElement2 != null && jsonElement2.isJsonPrimitive() && jsonElement2.getAsJsonPrimitive().isBoolean() && jsonElement2.getAsBoolean()) ? true : false;
    String str1 = 一倀(jsonObject.get(一倆.一倀("icS590Vi9uB6PmJZLzTwnVrGYKUItcQnTAybdskpDSA=")));
    if (一倆.一倀("d/Rphjcavaz0QaHvBsnOOxWn3atBYKnVRXTnw4vvl0nA").equals(str1))
      return new 一倄(一倆.一倀("omR6+WIdjnk5ZDHcL2A9iztQKeR2C3hlGZ7I23/07A=="), bool ? EnumSet.<一倀>allOf(一倀.class) : EnumSet.<一倀>noneOf(一倀.class)); 
    if (!一倆.一倀("sEjxOqaKqYf6Yno7VXH+yGmUb8ns4bmkGmbnIZKYVEE=").equals(str1))
      return 一倀; 
    String str2 = 一倀(paramJsonObject.get(一倆.一倀("xsR+nxzpvCWLdThKSyEg57TMK4ktxCh5j6sj64YP80U=")));
    if (一倆.一倀("GXu8gKoV5EjBnAhQKa1SqtBS6CO0hLYtyOoK4Ih/1OI=").equals(str2)) {
      str3 = 一倆.一倀("dlg/zCL2orN1SM/1fll9SIfKxqJSo7/6FnyEn31Okb0=");
      enumSet1 = EnumSet.of(一倀.WHEAT, 一倀.FISHING);
    } else if (一倆.一倀("Ft+kb2imtDwetTqbwkM9ogOjd705LhgwpBkVbq6i1g==").equals(str2) || 一倆.一倀("gPFvtItAf8w7hsgN387K1QxBRSX+L6oOWYt1Ah3aC2y+kNl9").equals(str2)) {
      str3 = 一倆.一倀("Xwx39+3kYoNqgm9hkmuE9fMpwJzDiE7jE8UHNY2xcQ==");
      enumSet1 = EnumSet.of(一倀.WHEAT, 一倀.FISHING, 一倀.TIME_ROOM, 一倀.ORB);
    } else {
      return 一倀;
    } 
    EnumSet<一倀> enumSet2 = EnumSet.noneOf(一倀.class);
    JsonElement jsonElement3 = paramJsonObject.get(一倆.一倀("jPDLIcRGPJJfGJU6nSfwUqdDYHuJmbtbRgso8yTSAoImQkRD"));
    if (!bool || jsonElement3 == null || !jsonElement3.isJsonArray())
      return new 一倄(str3, enumSet2); 
    for (JsonElement jsonElement : jsonElement3.getAsJsonArray()) {
      String str = 一倀(jsonElement);
      if (str == null)
        return new 一倄(str3, EnumSet.noneOf(一倀.class)); 
      for (一倀 一倀 : enumSet1) {
        if (一倀.一倀().equals(str))
          enumSet2.add(一倀); 
      } 
    } 
    return new 一倄(str3, enumSet2);
  }
  
  private static String 一倀(JsonElement paramJsonElement) {
    return (paramJsonElement != null && paramJsonElement.isJsonPrimitive() && paramJsonElement.getAsJsonPrimitive().isString()) ? paramJsonElement.getAsString() : null;
  }
  
  public enum 一倀 {
    WHEAT(一倆.一倀("ap+h0m3S3WfeNx7T2MhbNfRuQ1lE+eqSDmRLjtY0eqHX"), 一倆.一倀("R23Kw37Vsd5w+ux4tBKiALK12fcU6euBomib/qtfCAzt"), 一倆.一倀("QiuYrcQYB4llSfY00bNlDdPpNYAb6HE/cEuIuHj1Xzc=")),
    FISHING(一倆.一倀("foFeDWFGDAYnpeB/F4ywU9i2MXlMSzy0HrxKSwJI9c36Wjs="), 一倆.一倀("Thk7w2bGT9NsKVUHMYTEKwqk5xCVm3LX84hL+bvosvUf"), 一倆.一倀("XjG9Kf+kTEmRjQHq4QAifSsSQri3HhPns33fDK3AqWk=")),
    TIME_ROOM(一倆.一倀("5OIw/JIghCgih3+aknDDFbFKrNohoVnplh0n/VkGv8FTf3vjpQ=="), 一倆.一倀("VK7SD5HAOzOW3DRvTdnQGZR6WuZd/bDR4l9VI5kiIxOFyJgE2TAigy0="), 一倆.一倀("fcvmpKiWmZnSWuG9M+LRV9HOQjrIf00GPxU1JY50uQ==")),
    ORB(一倆.一倀("ICMa1GzPrs60JRRYHzpcDn+LmHsDdj/H+oMfpPsw8g=="), 一倆.一倀("yZhSWM8a1JV8rCT78w4Ar2zLZpNyrtzL9WMeazT0JA=="), 一倆.一倀("U100gtBSLuaOiBpfMS4QNKRci8hr3RV6QIU4ZZ9vHg=="));
    
    private final String id;
    
    private final String displayName;
    
    private final String minimumPlan;
    
    一倀(String param1String1, String param1String2, String param1String3) {
      this.id = param1String1;
      this.displayName = param1String2;
      this.minimumPlan = param1String3;
    }
    
    public String 一倀() {
      return this.id;
    }
    
    public String 一倁() {
      return this.displayName;
    }
    
    public String 一倂() {
      return this.minimumPlan;
    }
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\auth\一倄.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */