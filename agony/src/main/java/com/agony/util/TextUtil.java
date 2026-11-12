package com.agony.util;

import java.text.Normalizer;
import java.util.Locale;

public final class TextUtil {
    private TextUtil() {}

    /** Remove códigos de cor (§x), acentos e caixa, para comparar mensagens do servidor com segurança. */
    public static String normalize(String s) {
        if (s == null) return "";
        String t = s.replaceAll("\u00a7.", "");
        t = Normalizer.normalize(t, Normalizer.Form.NFD).replaceAll("\\p{M}+", "");
        return t.toLowerCase(Locale.ROOT).trim();
    }

    public static String formatTime(long millis) {
        long s = Math.max(0, millis) / 1000;
        long h = s / 3600, m = (s % 3600) / 60, sec = s % 60;
        return h > 0 ? String.format("%d:%02d:%02d", h, m, sec) : String.format("%02d:%02d", m, sec);
    }
}
