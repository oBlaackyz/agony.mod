package com.agony.ui;

import com.agony.config.AgonyConfig;
import com.agony.core.AgonyHub;
import com.agony.farm.AutoFarm;
import com.agony.fish.AutoFish;
import com.agony.util.TextUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraftforge.common.ForgeConfigSpec;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

/**
 * Painel Agony (tema vermelho escuro, moderno e minimalista). Fechar o painel NÃO interrompe nenhuma
 * automação: a lógica vive no AgonyHub/ClientEvents, a tela só exibe estado e envia comandos.
 */
public final class AgonyScreen extends Screen {
    private static final int PW = 340, PH = 292;

    // Paleta: preto avermelhado + vermelho
    private static final int BG = 0xC4060102, PANEL = 0xF20F0507, CARD = 0xFF190A0D, CARD_BORDER = 0xFF3A1217;
    private static final int RED = 0xFFDC2626, RED_LIGHT = 0xFFF87171, RED_DARK = 0xFF7F1D1D;
    private static final int TEXT = 0xFFFEE2E2, MUTED = 0xFF9C7B7E, GRAY = 0xFF5C4A4D;
    private static final int GREEN = 0xFF4ADE80, YELLOW = 0xFFFBBF24;
    private static final int BTN = 0xFFB91C1C, BTN_HOVER = 0xFFEF4444, BTN_STOP = 0xFF2B1014, BTN_OFF = 0xFF241114;

    private record Hit(int x, int y, int w, int h, Runnable action) {}

    private final List<Hit> hits = new ArrayList<>();
    private float scale = 1f, ox, oy;
    private double mx, my; // mouse em coordenadas do painel

    public AgonyScreen() {
        super(Component.literal("Agony"));
    }

    @Override
    public boolean isPauseScreen() { return false; }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == GLFW.GLFW_KEY_INSERT) { onClose(); return true; }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            double lx = (mouseX - ox) / scale, ly = (mouseY - oy) / scale;
            for (Hit h : hits) {
                if (lx >= h.x() && lx < h.x() + h.w() && ly >= h.y() && ly < h.y() + h.h()) {
                    h.action().run();
                    return true;
                }
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float partialTick) {
        g.fill(0, 0, width, height, BG);
        scale = Math.min(1.0f, Math.min(width / (PW + 16f), height / (PH + 16f)));
        ox = (width - PW * scale) / 2f;
        oy = (height - PH * scale) / 2f;
        mx = (mouseX - ox) / scale;
        my = (mouseY - oy) / scale;
        hits.clear();

        PoseStack pose = g.pose();
        pose.pushPose();
        pose.translate(ox, oy, 0f);
        pose.scale(scale, scale, 1f);
        drawPanel(g);
        pose.popPose();
    }

    private void drawPanel(GuiGraphics g) {
        AgonyHub hub = AgonyHub.get();
        AutoFarm farm = hub.farm;
        AutoFish fish = hub.fish;
        Minecraft mc = Minecraft.getInstance();

        // ---- Moldura e cabeçalho ----
        round(g, 0, 0, PW, PH, PANEL, RED_DARK);
        g.fillGradient(2, 2, PW - 2, 48, 0xFF3B0A0F, 0xFF0F0507);
        g.fill(2, 2, PW - 2, 4, RED);
        g.fill(2, 48, PW - 2, 49, RED_DARK);
        text(g, "Agony", PW / 2f + 1f, 13, 3f, RED_DARK, true); // sombra
        text(g, "Agony", PW / 2f, 12, 3f, TEXT, true);
        text(g, "automação de trigo e pesca", PW / 2f, 38, 0.75f, MUTED, true);

        // ---- Card Auto Trigo ----
        int cx = 16, cy = 58, cw = PW - 32, ch = 98;
        boolean run = farm.isRunning();
        card(g, cx, cy, cw, ch, run);
        text(g, "AUTO TRIGO", cx + 12, cy + 9, 1f, TEXT, false);
        pill(g, cx + 20 + this.font.width("AUTO TRIGO"), cy + 8, run ? (farm.isPaused() ? "PAUSADO" : "ATIVO") : "PARADO",
                run ? (farm.isPaused() ? YELLOW : GREEN) : GRAY);
        int bx = cx + cw - 10 - 66;
        button(g, bx, cy + 6, 66, 16, run ? "PARAR" : "INICIAR", run ? BTN_STOP : BTN, true, () -> farm.toggle(mc));
        if (run) {
            button(g, bx - 60, cy + 6, 54, 16, farm.isPaused() ? "RETOMAR" : "PAUSAR", BTN_STOP, true,
                    () -> farm.setPaused(!farm.isPaused()));
        }
        text(g, farm.statusText(), cx + 12, cy + 28, 0.85f, MUTED, false);

        String label, time;
        double frac = 0;
        if (farm.hasCountdown()) {
            long rem = farm.growthRemainingMillis();
            long total = AgonyConfig.GROWTH_MINUTES.get() * 60_000L;
            time = TextUtil.formatTime(rem);
            frac = total > 0 ? 1.0 - (double) rem / total : 1.0;
            if (rem <= 0) label = "PRONTO PARA COLHER";
            else label = run ? "CRESCIMENTO \u00b7 PRÓXIMO CICLO EM" : "CONTAGEM SALVA (AUTOMAÇÃO PARADA)";
        } else {
            label = "SEM CONTAGEM ATIVA";
            time = "--:--";
        }
        text(g, label, cx + 12, cy + 43, 0.7f, MUTED, false);
        text(g, time, cx + 12, cy + 54, 2.4f, TEXT, false);
        button(g, cx + cw - 10 - 44, cy + 56, 44, 14, "ZERAR", BTN_STOP, farm.hasCountdown(), farm::resetCountdown);
        button(g, cx + cw - 10 - 44 - 4 - 78, cy + 56, 78, 14, farm.hasFarmAnchor() ? "LOCAL: OK" : "MARCAR LOCAL",
                BTN_STOP, true, () -> farm.markFarmHere(mc));
        bar(g, cx + 12, cy + ch - 14, cw - 24, 5, frac);

        // ---- Card Auto Peixe ----
        int fy = 164, fh = 50;
        boolean frun = fish.isRunning();
        card(g, cx, fy, cw, fh, frun);
        text(g, "AUTO PEIXE", cx + 12, fy + 9, 1f, TEXT, false);
        pill(g, cx + 20 + this.font.width("AUTO PEIXE"), fy + 8, frun ? (fish.isPaused() ? "PAUSADO" : "ATIVO") : "PARADO",
                frun ? (fish.isPaused() ? YELLOW : GREEN) : GRAY);
        button(g, bx, fy + 6, 66, 16, frun ? "PARAR" : "INICIAR", frun ? BTN_STOP : BTN, true, () -> fish.toggle(mc));
        if (frun) {
            button(g, bx - 60, fy + 6, 54, 16, fish.isPaused() ? "RETOMAR" : "PAUSAR", BTN_STOP, true,
                    () -> fish.setPaused(!fish.isPaused()));
        }
        text(g, fish.statusText(), cx + 12, fy + 28, 0.85f, MUTED, false);
        button(g, cx + cw - 10 - 44, fy + 34, 44, 12, hub.fishProbe.isEnabled() ? "SONDA ON" : "SONDA",
                hub.fishProbe.isEnabled() ? 0xFF047857 : BTN_OFF, true, hub.fishProbe::toggle);

        // ---- Configurações ----
        text(g, "CONFIGURAÇÕES", cx, 224, 0.85f, RED_LIGHT, false);
        g.fill(cx, 234, cx + cw, 235, RED_DARK);
        int c1 = cx, c2 = cx + 160;
        stepper(g, c1, 242, "Espera /ilhafarm", AgonyConfig.FARM_COMMAND_WAIT_SECONDS.get() + "s",
                () -> adjustDouble(AgonyConfig.FARM_COMMAND_WAIT_SECONDS, -0.5, 0.5, 30.0),
                () -> adjustDouble(AgonyConfig.FARM_COMMAND_WAIT_SECONDS, 0.5, 0.5, 30.0));
        stepper(g, c2, 242, "Crescimento", AgonyConfig.GROWTH_MINUTES.get() + " min",
                () -> adjustInt(AgonyConfig.GROWTH_MINUTES, -1, 1, 120),
                () -> adjustInt(AgonyConfig.GROWTH_MINUTES, 1, 1, 120));
        stepper(g, c1, 260, "Limite teleporte", AgonyConfig.TELEPORT_TIMEOUT_SECONDS.get() + "s",
                () -> adjustDouble(AgonyConfig.TELEPORT_TIMEOUT_SECONDS, -1.0, 3.0, 60.0),
                () -> adjustDouble(AgonyConfig.TELEPORT_TIMEOUT_SECONDS, 1.0, 3.0, 60.0));
        text(g, "Retomar ao entrar", c2, 264, 0.85f, MUTED, false);
        boolean resume = AgonyConfig.RESUME_ON_JOIN.get();
        button(g, c2 + 150 - 40, 260, 40, 14, resume ? "LIGADO" : "NÃO", resume ? BTN : BTN_OFF, true, () -> {
            AgonyConfig.RESUME_ON_JOIN.set(!AgonyConfig.RESUME_ON_JOIN.get());
            saveConfig();
        });

        text(g, "INSERT ou ESC fecha o painel \u00b7 as automações continuam", PW / 2f, PH - 11, 0.7f, GRAY, true);
    }

    // ---------- Helpers de desenho ----------

    /** Retângulo com cantos levemente cortados (aparência arredondada) e borda de 1 px. */
    private void round(GuiGraphics g, int x, int y, int w, int h, int fill, int border) {
        g.fill(x + 1, y, x + w - 1, y + h, border);
        g.fill(x, y + 1, x + w, y + h - 1, border);
        g.fill(x + 2, y + 1, x + w - 2, y + h - 1, fill);
        g.fill(x + 1, y + 2, x + w - 1, y + h - 2, fill);
    }

    private void card(GuiGraphics g, int x, int y, int w, int h, boolean active) {
        round(g, x, y, w, h, CARD, CARD_BORDER);
        g.fill(x + 1, y + 4, x + 3, y + h - 4, active ? RED : GRAY);
    }

    private void pill(GuiGraphics g, int x, int y, String label, int color) {
        int w = (int) (this.font.width(label) * 0.75f) + 10;
        round(g, x, y, w, 11, 0xFF120709, color);
        text(g, label, x + 5, y + 2.2f, 0.75f, color, false);
    }

    private void bar(GuiGraphics g, int x, int y, int w, int h, double frac) {
        g.fill(x, y, x + w, y + h, 0xFF2A1014);
        int fw = (int) Math.round(w * Math.max(0.0, Math.min(1.0, frac)));
        if (fw > 0) g.fillGradient(x, y, x + fw, y + h, RED_LIGHT, RED);
    }

    private void text(GuiGraphics g, String s, float x, float y, float sc, int color, boolean centered) {
        PoseStack p = g.pose();
        p.pushPose();
        p.translate(x, y, 0f);
        p.scale(sc, sc, 1f);
        int dx = centered ? -this.font.width(s) / 2 : 0;
        g.drawString(this.font, s, dx, 0, color, false);
        p.popPose();
    }

    private void button(GuiGraphics g, int x, int y, int w, int h, String label, int color, boolean enabled, Runnable action) {
        boolean hover = enabled && mx >= x && mx < x + w && my >= y && my < y + h;
        int fill = !enabled ? BTN_OFF : (hover ? BTN_HOVER : color);
        round(g, x, y, w, h, fill, enabled ? RED : GRAY);
        int tw = this.font.width(label);
        g.drawString(this.font, label, x + (w - tw) / 2, y + (h - 8) / 2 + 1, enabled ? TEXT : GRAY, false);
        if (enabled) hits.add(new Hit(x, y, w, h, action));
    }

    private void stepper(GuiGraphics g, int x, int y, String label, String value, Runnable dec, Runnable inc) {
        text(g, label, x, y + 4, 0.85f, MUTED, false);
        int plusX = x + 150 - 14, valW = 40, minusX = plusX - valW - 14;
        button(g, minusX, y, 14, 14, "-", BTN_STOP, true, dec);
        text(g, value, minusX + 14 + valW / 2f, y + 3, 0.85f, TEXT, true);
        button(g, plusX, y, 14, 14, "+", BTN_STOP, true, inc);
    }

    private static void adjustDouble(ForgeConfigSpec.DoubleValue v, double delta, double min, double max) {
        double n = Math.round((v.get() + delta) * 10.0) / 10.0;
        v.set(Math.max(min, Math.min(max, n)));
        saveConfig();
    }

    private static void adjustInt(ForgeConfigSpec.IntValue v, int delta, int min, int max) {
        v.set(Math.max(min, Math.min(max, v.get() + delta)));
        saveConfig();
    }

    private static void saveConfig() {
        try {
            AgonyConfig.SPEC.save();
        } catch (Exception ignored) { }
    }
}
