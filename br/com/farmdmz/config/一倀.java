package br.com.farmdmz.config;

import br.com.farmdmz.client.auth.一倆;

public final class 一倀 {
  public String message = 一倆.一倀("XrGO3cJVjE1B4i1Tszm1NNbzwAY+KP3h6BLHJw==");
  
  public int intervalSeconds = 60;
  
  public 一倀 一倀() {
    一倀 一倀1 = new 一倀();
    一倀1.message = this.message;
    一倀1.intervalSeconds = this.intervalSeconds;
    return 一倀1;
  }
  
  public void 一倁() {
    if (this.message == null || this.message.length() > 254)
      throw new IllegalArgumentException(一倆.一倀("C07ORbyn1JkMvNmKjDnoBlB4I0WCrJ/z6NGgDqpyPNEtUJWQzAmHZJwbuNpxFLyKnS5Q1uiwsp3MmkJxJ9uTxq0ryus=")); 
    if (this.message.codePoints().anyMatch(paramInt -> (Character.isISOControl(paramInt) || paramInt == 167 || (paramInt >= 55296 && paramInt <= 57343) || Character.getType(paramInt) == 13 || Character.getType(paramInt) == 14)))
      throw new IllegalArgumentException(一倆.一倀("Ukk/h5zkzi6dPQGz0vUV1AcD4gwQuFn3qEtb44f5edlc9DgPUY0qAxRo8pvkuZeDKxdPJJd1kJ6oW9Jcnjp9FZ8Rbqcj9JBTXwCPuhVu3l6EGp/GIWd3vJMqGPzM")); 
    this.message = this.message.strip();
    if (this.intervalSeconds < 5 || this.intervalSeconds > 86400)
      throw new IllegalArgumentException(一倆.一倀("xfCGlvdG8ZXC/NxTCWo9BtLTbogxoODa7OvcYXXnlrtjPqBi+jL8QBwPv2qLJg2vR3pwUJzoeKPPwpPQzmnvW6Cx7A==")); 
  }
  
  public void 一倂() {
    一倁();
    if (this.message.isBlank())
      throw new IllegalArgumentException(一倆.一倀("l+bgVGBh5FMp6qAczQhzCMyCvoOrN3M3ihDLYWF0mhnVNCIFgUIBp+J7Lo0QS0lkhw5mZxXzRoQ0dMMRfXTEIGtwctWq/sA8r10M1SgliA==")); 
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\config\一倀.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */