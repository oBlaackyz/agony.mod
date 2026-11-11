package br.com.farmdmz.client;

import br.com.farmdmz.client.auth.一倂;
import br.com.farmdmz.client.auth.一倄;
import br.com.farmdmz.client.auth.一倆;
import br.com.farmdmz.config.一倀;
import br.com.farmdmz.config.一倁;
import br.com.farmdmz.core.一倀;
import br.com.farmdmz.core.一倁;
import java.io.IOException;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.Connection;

public final class 一倂 {
  private static final Minecraft 一倀 = Minecraft.m_91087_();
  
  private static final 一倀 一倁 = new 一倀();
  
  private static final 一倁 一倂 = new 一倁();
  
  private static 一倀 一倃 = 一倁.一倀();
  
  private static boolean 一倄;
  
  private static boolean 一倅;
  
  private static Connection 一倆;
  
  private static String 一倇 = 一倆.一倀("Ivp1vK2qz7UeMeED+TluJdBnglLUslpOQpyTxFh0tIgw7Bs5tTGtf6+PJayCZVzy");
  
  private static int 一倈;
  
  public static 一倀 一倀() {
    return 一倃.一倀();
  }
  
  public static boolean 一倁() {
    return 一倄;
  }
  
  public static String 一倂() {
    return 一倇;
  }
  
  public static long 一倃() {
    return 一倁.一倂(Util.m_137550_());
  }
  
  public static boolean 一倄() {
    return (一倂.一倀(一倄.一倀.WHEAT) || 一倂.一倀(一倄.一倀.FISHING) || 一倂.一倀(一倄.一倀.TIME_ROOM) || 一倂.一倀(一倄.一倀.ORB));
  }
  
  public static void 一倀(一倀 param一倀) throws IOException {
    一倀 一倀1 = param一倀.一倀();
    一倀1.一倁();
    一倁.一倀(一倀1);
    一倃 = 一倀1;
    if (一倄) {
      if (一倀1.message.isBlank()) {
        一倀(一倆.一倀("yldA5Xr+bAuIwIkyTsc/pPosfE5Xklk4rvo9TXoP+b5d5zFSmqTPBItDTbV7yyvTmiiXy1YZg9yaJEQjBWKzWd7UCQ15tA=="));
      } else {
        一倁.一倀(Util.m_137550_(), 一倀1.intervalSeconds * 1000L);
        一倇 = 一倆.一倀("Q2+BZvZPFbsvC7HCQvHht+DMfjw4SZdR9UHeRoeLAxnGidG0SAB+rv6/yScKeJlBYMVEw5kCuXBjWkuhCi2/own2kRqm9MmnbPNmgH0=");
      } 
    } else {
      一倇 = 一倆.一倀("gyOrLXKT8y93FugUH6yEjpmHAFDKEJbQD7Ad9I0n20er7ZPKaPICNKOKnhCTvgsRb5gvEZjO9fsDow==");
    } 
  }
  
  public static boolean 一倅() {
    if (一倄) {
      一倀(一倆.一倀("4x/P8jhzaq/RxB0lRDlZawNakCodijDYyMOedOBxRHGflxF8kgBSuh8CQFBaDT4TyJ2dpDRz8MfrK9Yq/XY="));
      return false;
    } 
    if (!一倄()) {
      一倇 = 一倆.一倀("M12/N5Xr7V7ajWuoB+aOHvGKFDnsXkqkgkM9rxaqvCdNQPMsragkq2f0+5tJQxP6MV/4LDq9SxI9pNKpfQ==");
      一倂.一倀(一倀.f_91080_, 一倄.一倀.WHEAT);
      return false;
    } 
    if (一倀.m_91403_() == null || 一倀.f_91074_ == null || 一倀.f_91073_ == null || 一倀.f_91072_ == null) {
      一倇 = 一倆.一倀("D6CdTipTZcx/GqG/Vx9rnZHWkGgt7wW7EVCnZokpgyOWIJ7bKERkjagMLIP/sSYZXn13D35m0SyrNbyQP730LaMj7T4=");
      return false;
    } 
    一倃.一倂();
    一倆 = 一倀.m_91403_().m_104910_();
    一倂.一倀(一倆, 一倂.一倁(), 一倂.一倂());
    一倄 = true;
    一倈 = 0;
    一倁.一倀(Util.m_137550_(), 一倃.intervalSeconds * 1000L);
    一倇 = 一倆.一倀("/jd/YDg3AuCQImIHEaretQdLTCEwyGeyx3FgtpfuXEPHrpnUxKCy9PnS7rAPAb4b7oqJG8WoJ9pKfbCmSd4MOF2PBfzDj/B4smZpu7F7bKk4DQ==");
    return true;
  }
  
  public static void 一倆() {
    if (!一倄)
      return; 
    if (!一倄()) {
      一倀(一倆.一倀("Bib9BJphYl74/1VGN9ULjO6uNH3srkoM8NNp18ZRp5qdimGNlWi6JNGcw6IdGkUkw8SmhKrtN46p7Zb5XrYlqGfd"));
      return;
    } 
    ClientPacketListener clientPacketListener = 一倀.m_91403_();
    一倁.一倀 一倀1 = 一倂.一倀((clientPacketListener == null) ? null : clientPacketListener.m_104910_(), (一倆 != null && 一倆.m_129536_()), (一倀.f_91074_ != null && 一倀.f_91073_ != null && 一倀.f_91072_ != null && 一倀.f_91074_.m_6084_()), 一倂.一倁(), 一倂.一倂());
    if (一倀1 == 一倁.一倀.DISCONNECTED) {
      一倀(一倆.一倀("aZfEhCNFGbkV81CT9OszPfT0t4w1FzaYwpAOO6p0U1SeMFzw4pewJF1M9XzzsdhZ2m5Ib/CJO6EVjnURpLMJQoU9"));
      return;
    } 
    if (一倀1 == 一倁.一倀.SESSION_CHANGED) {
      一倀(一倆.一倀("6IM+jJk7w9MSf27p02FMHaQWLysHLYQgJA/3DpLIc7asHMU+rVAgYQenwhHpv4k0UOdV8F6LEdRv9sWeZM2wkQQ1d5xUxmbD"));
      return;
    } 
    long l = Util.m_137550_();
    if (一倀1 == 一倁.一倀.WAITING_FOR_WORLD) {
      一倁.一倀(l);
      一倅 = true;
      一倇 = 一倆.一倀("xkjSqd05yFuPdChz0RM4kGUUcrx+J9SYB8ISo7bR0jpbvZL2WV4czf2XN0N/UKK9oR6zREZk1QOlQFc4H4CNGJwdikaSTw==");
      return;
    } 
    if (一倅) {
      一倅 = false;
      一倁.一倀(l);
      一倇 = 一倆.一倀("45VDT2eNajRd396+qiPoaKLZlOxvZ4XYkLEelBL0u3CztF17fBO9rofx4Q+0gXmwbyU4wC4tEV58Knl8wjrH5JoK/cNdhVR9BdFIqCRAaGcW9g==");
    } 
    if (!一倁.一倁(l))
      return; 
    try {
      clientPacketListener.m_246623_("jzY1t7bErBQcfLqWQymj/Q33FG55w3EYl7/Taiofpw==");
      一倈++;
      一倇 = "egdgZHUQd3rcMAHspgbLxBeCCnTbOw7L+R0aUgKEVi4B0UhcERLXRmAh1swP9IJ4f6vODE4djCxnMw7B";
    } catch (RuntimeException runtimeException) {
      一倀(一倆.一倀("S7GcfcXpPzIsalWauywBMEdG6bsygRx7R12Q2MscOERQ1spuzDzUeyu7FDVxw++KB55ABtsTdIUvuELS8j4BeAku5sl9sKAJ4JdiBmjSAyE4HpYwz3w="));
    } 
  }
  
  public static void 一倇() {
    一倀(一倆.一倀("mBHv879SmE6snQaId4Z3D6qYs6iKq3mh8XtqkDE4m821XgbziaqmRZhEDQBeJ57b"));
  }
  
  public static void 一倈() {
    一倀(一倆.一倀("I9pLdtHFulm3CkJ5FpV/IK2N/LkLmknDI82qd2B2AcJize00JQHdfGp2W3ixX9hlgYfYm+qpHYvF9eMQCY91OYr6"));
  }
  
  private static void 一倀(String paramString) {
    一倄 = false;
    一倅 = false;
    一倁.一倀();
    一倂.一倀();
    一倆 = null;
    一倇 = paramString;
  }
}


/* Location:              C:\Users\oblaa\OneDrive\Desktop\steel-client-1.20.2-1.5.23.jar!\br\com\farmdmz\client\一倂.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */