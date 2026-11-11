package br.com.farmdmz.client.auth;

final class 一倇 {
  private static final byte[] 一倀 = new byte[] { 
      88, -71, -1, 31, -94, -113, -2, 106, -21, 126, 
      40, 55, 32, 68, -85, 7, -52, -59, 121, 50, 
      -61, -26, -91, 107, -49, -115, 38, -53, 8, 21, 
      84, -23 };
  
  private static final byte[] 一倁 = new byte[] { 
      97, -96, 11, 116, 117, -64, 8, -8, 113, 11, 
      -6, -88, -126, -122, -124, -65, -27, -121, -125, 81, 
      -104, 79, -110, -90, -111, -9, -73, 22, 113, 10, 
      -107, 22 };
  
  static byte[] 一倀() {
    byte[] arrayOfByte = new byte[一倀.length];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = (byte)(一倀[b] ^ 一倁[b]); 
    return arrayOfByte;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\auth\一倇.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */