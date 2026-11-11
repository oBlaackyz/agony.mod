package br.com.farmdmz.client.auth;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.StringConcatException;
import java.lang.invoke.StringConcatFactory;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class 一倆 {
  private static final SecretKeySpec 一倀 = new SecretKeySpec(一倇.一倀(), "AES");
  
  private static final ConcurrentHashMap<String, String> 一倁 = new ConcurrentHashMap<>();
  
  public static String 一倀(String paramString) {
    try {
      return 一倁.computeIfAbsent(paramString, 一倆::一倁);
    } catch (RuntimeException runtimeException) {
      throw new IllegalStateException("Invalid protected string", runtimeException);
    } 
  }
  
  private static String 一倁(String paramString) {
    byte[] arrayOfByte = Base64.getDecoder().decode(paramString);
    if (arrayOfByte.length < 28)
      throw new IllegalArgumentException("Truncated protected string"); 
    try {
      Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
      cipher.init(2, 一倀, new GCMParameterSpec(128, Arrays.copyOfRange(arrayOfByte, 0, 12)));
      byte[] arrayOfByte1 = cipher.doFinal(arrayOfByte, 12, arrayOfByte.length - 12);
      return (new String(arrayOfByte1, StandardCharsets.UTF_8)).intern();
    } catch (GeneralSecurityException generalSecurityException) {
      throw new IllegalStateException("Invalid protected string", generalSecurityException);
    } 
  }
  
  public static CallSite 一倀(MethodHandles.Lookup paramLookup, String paramString1, MethodType paramMethodType, String paramString2, Object... paramVarArgs) throws StringConcatException {
    Object[] arrayOfObject = (Object[])paramVarArgs.clone();
    for (byte b = 0; b < arrayOfObject.length; b++) {
      Object object = arrayOfObject[b];
      if (object instanceof String) {
        String str = (String)object;
        arrayOfObject[b] = 一倀(str);
      } 
    } 
    return StringConcatFactory.makeConcatWithConstants(paramLookup, paramString1, paramMethodType, 一倀(paramString2), arrayOfObject);
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\auth\一倆.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */