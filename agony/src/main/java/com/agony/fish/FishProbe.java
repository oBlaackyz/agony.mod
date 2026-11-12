package com.agony.fish;

import com.agony.AgonyMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.components.BossHealthOverlay;
import net.minecraft.network.chat.Component;
import net.minecraft.world.BossEvent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * SONDA de pesca (diagnóstico, não automatiza nada).
 * Registra no log, só quando o texto muda: action bar, título, subtítulo, barras de boss, classe da tela
 * aberta e mensagens do chat. Caracteres fora do ASCII aparecem como \\uXXXX, o que revela se os
 * ícones (peixes, botões) são glifos de fonte do servidor. Se forem, contar peixes é exato e confiável;
 * se a interface for só desenho, será preciso reconhecimento visual.
 */
public final class FishProbe {
    private boolean enabled;
    private int tickCounter;
    private String last = "";

    public boolean isEnabled() { return enabled; }

    public void toggle() {
        enabled = !enabled;
        last = "";
        AgonyMod.LOGGER.info("[AGONY][sonda] {}", enabled ? "LIGADA" : "desligada");
    }

    public void onChat(String raw) {
        if (!enabled || raw == null) return;
        String norm = com.agony.util.TextUtil.normalize(raw);
        if (norm.startsWith("agony") || norm.startsWith("[agony]")) return; // mensagens do próprio mod
        AgonyMod.LOGGER.info("[AGONY][sonda] chat/actionbar: {}", escape(raw));
    }

    public void tick(Minecraft mc) {
        if (!enabled || mc.gui == null || ++tickCounter % 4 != 0) return;
        StringBuilder sb = new StringBuilder();
        sb.append("textos(actionbar/titulo/subtitulo)=").append(readComponents(mc.gui));
        sb.append(" | boss=").append(bossNames(mc));
        sb.append(" | tela=").append(mc.screen == null ? "nenhuma" : mc.screen.getClass().getName());
        String now = sb.toString();
        if (!now.equals(last)) {
            last = now;
            AgonyMod.LOGGER.info("[AGONY][sonda] {}", now);
        }
    }

    /**
     * Lê TODOS os campos do tipo Component de Gui (action bar, título e subtítulo). Em runtime os nomes são
     * SRG (f_xxxxx_), então buscamos por tipo, na ordem de declaração: c0=action bar, c1=título, c2=subtítulo.
     */
    private static String readComponents(Gui gui) {
        List<String> out = new ArrayList<>();
        int i = 0;
        for (Field f : Gui.class.getDeclaredFields()) {
            if (Modifier.isStatic(f.getModifiers()) || !Component.class.isAssignableFrom(f.getType())) continue;
            try {
                f.setAccessible(true);
                Object v = f.get(gui);
                out.add("c" + i + "=" + escape(v instanceof Component c ? c.getString() : ""));
            } catch (Exception e) {
                out.add("c" + i + "=?erro");
            }
            i++;
        }
        return out.toString();
    }

    /** Nomes das barras de boss (campo Map do BossHealthOverlay, achado por tipo). */
    private static String bossNames(Minecraft mc) {
        List<String> names = new ArrayList<>();
        try {
            BossHealthOverlay overlay = mc.gui.getBossOverlay();
            for (Field f : BossHealthOverlay.class.getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers()) || !Map.class.isAssignableFrom(f.getType())) continue;
                f.setAccessible(true);
                if (f.get(overlay) instanceof Map<?, ?> m) {
                    for (Object o : m.values()) {
                        if (o instanceof BossEvent be) names.add(escape(be.getName().getString()));
                    }
                }
            }
        } catch (Exception e) {
            return "?erro";
        }
        return names.toString();
    }

    /** ASCII imprimível fica como está; o resto vira \\uXXXX. */
    private static String escape(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 32 && c <= 126) sb.append(c);
            else sb.append(String.format("\\u%04X", (int) c));
        }
        return sb.toString();
    }
}
