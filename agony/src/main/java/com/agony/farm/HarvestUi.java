package com.agony.farm;

import com.agony.AgonyMod;
import com.agony.config.AgonyConfig;
import com.agony.ui.AgonyScreen;
import com.agony.util.TextUtil;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Utilitários da tela de colheita do servidor (classe TelaColheita, título "COLHEITA").
 * A tela é desenhada à mão (não tem widgets); os botões ficam na lista "hits" e o servidor responde
 * com um aviso ("toast"): "Você colheu 30 trigo." e depois "Plantado no canteiro N. Pronto em 30:00."
 */
public final class HarvestUi {
    private HarvestUi() {}

    /** A tela atual pode ser a de colheita? (filtra pelo nome da classe configurado, padrão "TelaColheita") */
    public static boolean isCandidate(Screen s) {
        if (s == null || s instanceof AgonyScreen || s instanceof ChatScreen
                || s instanceof PauseScreen || s instanceof InventoryScreen) {
            return false;
        }
        String needle = AgonyConfig.HARVEST_SCREEN_CLASS_CONTAINS.get().trim().toLowerCase(Locale.ROOT);
        return needle.isEmpty() || s.getClass().getName().toLowerCase(Locale.ROOT).contains(needle);
    }

    /** Botão (widget) pelo texto. A tela de colheita não usa widgets, então normalmente retorna null. */
    public static AbstractWidget findButton(Screen s) {
        String needle = TextUtil.normalize(AgonyConfig.HARVEST_BUTTON_TEXT.get());
        for (GuiEventListener l : s.children()) {
            if (l instanceof AbstractWidget w && w.visible && w.active
                    && TextUtil.normalize(w.getMessage().getString()).contains(needle)) {
                return w;
            }
        }
        return null;
    }

    /** Plantação do canteiro aberto: estado e hora (epoch ms do servidor) em que fica pronta. */
    public record Plot(int state, long readyAtMs) { }

    /** Lê atual() da tela (campos estado e fimMs). null se a tela não expõe. */
    public static Plot readPlot(Screen s) {
        try {
            Object plot = callGetter(s, "atual");
            if (plot == null || plot instanceof String) return null;
            Field fe = findField(plot.getClass(), "estado");
            Field ff = findField(plot.getClass(), "fimMs");
            if (ff == null || ff.getType() != long.class) return null;
            int state = fe == null ? -1 : ((Number) fe.get(plot)).intValue();
            return new Plot(state, ff.getLong(plot));
        } catch (Exception e) {
            return null;
        }
    }

    /** Aviso do servidor mostrado na tela: mensagem e se foi sucesso. */
    public record Toast(String message, boolean ok) { }

    /** Lê o aviso (campos toastMsg/toastOk). null se a tela não expõe esses campos. */
    public static Toast readToast(Screen s) {
        try {
            Field msg = findField(s.getClass(), "toastMsg");
            if (msg == null) return null;
            Field ok = findField(s.getClass(), "toastOk");
            Object v = msg.get(s);
            boolean good = ok != null && ok.getType() == boolean.class && ok.getBoolean(s);
            return new Toast(v == null ? "" : v.toString(), good);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Centro (em unidades de GUI) do botão principal: entre as áreas clicáveis da lista "hits", a mais larga
     * e mais alta na tela (ignora fechar/ajuda, que são pequenos). null se a estrutura não for reconhecida.
     */
    public static double[] findMainButton(Screen s) {
        try {
            Field hf = findField(s.getClass(), "hits");
            if (hf == null || !(hf.get(s) instanceof List<?> hits)) return null;
            double[] best = null;
            int bestY = Integer.MAX_VALUE;
            for (Object hit : hits) {
                int[] r = rectOf(hit, 1);
                if (r == null || r[2] < s.width * 0.2) continue;
                if (r[1] < bestY) {
                    bestY = r[1];
                    best = new double[] {r[0] + r[2] / 2.0, r[1] + r[3] / 2.0};
                }
            }
            return best;
        } catch (Exception e) {
            return null;
        }
    }

    private static final String[][] RECT_NAMES = {
            {"x", "y", "w", "h"}, {"x", "y", "width", "height"}, {"x", "y", "largura", "altura"}};

    /** {x, y, largura, altura} lido por nome de campo (direto ou em um objeto aninhado). */
    private static int[] rectOf(Object o, int depth) throws IllegalAccessException {
        if (o == null) return null;
        for (String[] n : RECT_NAMES) {
            Field fx = findField(o.getClass(), n[0]);
            Field fy = findField(o.getClass(), n[1]);
            Field fw = findField(o.getClass(), n[2]);
            Field fh = findField(o.getClass(), n[3]);
            if (fx != null && fy != null && fw != null && fh != null && fx.getType() == int.class
                    && fy.getType() == int.class && fw.getType() == int.class && fh.getType() == int.class) {
                return new int[] {fx.getInt(o), fy.getInt(o), fw.getInt(o), fh.getInt(o)};
            }
        }
        if (depth > 0) {
            for (Field f : o.getClass().getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers()) || f.getType().isPrimitive() || f.getType() == String.class) continue;
                f.setAccessible(true);
                int[] r = rectOf(f.get(o), depth - 1);
                if (r != null) return r;
            }
        }
        return null;
    }

    private static Field findField(Class<?> type, String name) {
        for (Class<?> c = type; c != null && c != Object.class; c = c.getSuperclass()) {
            try {
                Field f = c.getDeclaredField(name);
                f.setAccessible(true);
                return f;
            } catch (NoSuchFieldException ignored) {
                // tenta a superclasse
            }
        }
        return null;
    }

    /** Clique esquerdo simulado pelos métodos da própria tela (coordenadas em unidades de GUI). */
    public static void click(Screen s, double x, double y) {
        s.mouseMoved(x, y);
        s.mouseClicked(x, y, 0);
        s.mouseReleased(x, y, 0);
    }

    // ---------------- Diagnóstico ----------------

    public static void dump(Screen s) {
        AgonyMod.LOGGER.info("[AGONY][diag] tela={} titulo='{}' tamanho={}x{}",
                s.getClass().getName(), s.getTitle().getString(), s.width, s.height);
        for (GuiEventListener l : s.children()) {
            if (l instanceof AbstractWidget w) {
                AgonyMod.LOGGER.info("[AGONY][diag]  - {} texto='{}' pos={},{} tam={}x{} ativo={}",
                        l.getClass().getName(), w.getMessage().getString(), w.getX(), w.getY(),
                        w.getWidth(), w.getHeight(), w.active);
            } else {
                AgonyMod.LOGGER.info("[AGONY][diag]  - {}", l.getClass().getName());
            }
        }
    }

    /** Campos, cada área clicável ("hits"), e alguns métodos de leitura (só os de uma lista fixa). */
    public static void dumpDeep(Screen s) {
        dump(s);
        for (Class<?> c = s.getClass(); c != null && c != Screen.class && c != Object.class; c = c.getSuperclass()) {
            for (Field f : c.getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                Object value;
                try {
                    f.setAccessible(true);
                    value = f.get(s);
                } catch (Exception e) {
                    AgonyMod.LOGGER.info("[AGONY][diag]  campo {}.{} = ?", c.getSimpleName(), f.getName());
                    continue;
                }
                AgonyMod.LOGGER.info("[AGONY][diag]  campo {}.{} : {} = {}", c.getSimpleName(), f.getName(),
                        f.getType().getSimpleName(), describe(value));
                if ("hits".equals(f.getName()) && value instanceof List<?> list) {
                    int i = 0;
                    for (Object hit : list) {
                        AgonyMod.LOGGER.info("[AGONY][diag]    hit[{}] = {}", i++, describeObject(hit, 1));
                    }
                }
            }
        }
        for (String name : new String[] {"motivoColheita", "dicaRodape", "revisao", "subtitulo", "valorContextual", "atual", "aba"}) {
            Object v = callGetter(s, name);
            AgonyMod.LOGGER.info("[AGONY][diag]  leitura {}() = {}", name, describeAny(v));
        }
    }

    private static Object callGetter(Object o, String name) {
        for (Class<?> c = o.getClass(); c != null && c != Object.class; c = c.getSuperclass()) {
            try {
                Method m = c.getDeclaredMethod(name);
                m.setAccessible(true);
                return m.invoke(o);
            } catch (NoSuchMethodException ignored) {
                // tenta a superclasse
            } catch (Exception e) {
                return "?erro " + e.getClass().getSimpleName();
            }
        }
        return "(metodo inexistente)";
    }

    private static boolean isSimple(Object v) {
        return v == null || v instanceof CharSequence || v instanceof Number || v instanceof Boolean
                || v instanceof Enum<?> || v instanceof Component;
    }

    private static String describeAny(Object v) {
        return isSimple(v) ? describe(v) : describeObject(v, 1);
    }

    private static String describeObject(Object o, int depth) {
        if (o == null) return "null";
        StringBuilder sb = new StringBuilder(o.getClass().getSimpleName()).append('{');
        for (Class<?> c = o.getClass(); c != null && c != Object.class; c = c.getSuperclass()) {
            for (Field f : c.getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                try {
                    f.setAccessible(true);
                    Object v = f.get(o);
                    boolean flat = isSimple(v) || depth <= 0;
                    sb.append(f.getName()).append('=').append(flat ? describe(v) : describeObject(v, depth - 1)).append(' ');
                } catch (Exception e) {
                    sb.append(f.getName()).append("=? ");
                }
            }
        }
        return sb.append('}').toString();
    }

    private static String describe(Object o) {
        if (o == null) return "null";
        String text;
        if (o instanceof Component c) text = "Component:'" + c.getString() + "'";
        else if (o instanceof CharSequence || o instanceof Number || o instanceof Boolean || o instanceof Enum<?>) text = String.valueOf(o);
        else if (o instanceof Collection<?> col) text = "colecao(" + col.size() + ") de " + (col.isEmpty() ? "?" : col.iterator().next().getClass().getName());
        else if (o instanceof Map<?, ?> m) text = "mapa(" + m.size() + ")";
        else text = o.getClass().getName();
        return text.length() > 200 ? text.substring(0, 200) + "..." : text;
    }
}
