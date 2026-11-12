package com.agony.fish;

import net.minecraft.client.Minecraft;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Ponte com o mod de pesca do servidor (WarriorsExtra), por reflexão: lê a sessão de pesca e usa as
 * mesmas funções internas do jogo para clicar. Como lê o estado real, não precisa reconhecer imagem e
 * continua funcionando com o jogo minimizado. Se o mod do servidor mudar (classe, campo ou versão do
 * protocolo), a ponte se desliga sozinha e informa o motivo, em vez de agir às cegas.
 */
public final class WarriorsBridge {
    private static final String BASE = "com.nonopichy.yggdrasilremake.";
    private static final int PROTOCOL = 2;

    private final Access a;
    private final String unavailableReason;

    private WarriorsBridge(Access a, String reason) {
        this.a = a;
        this.unavailableReason = reason;
    }

    public static WarriorsBridge create() {
        try {
            return new WarriorsBridge(new Access(), "");
        } catch (ClassNotFoundException e) {
            return new WarriorsBridge(null, "mod de pesca do servidor (WarriorsExtra) não encontrado");
        } catch (ReflectiveOperationException | RuntimeException | LinkageError e) {
            return new WarriorsBridge(null, "versão de pesca incompatível (" + e.getClass().getSimpleName() + ")");
        }
    }

    public boolean available() { return a != null; }
    public String unavailableReason() { return unavailableReason; }

    /** Lê o estado atual. Deve ser chamado na thread do cliente. */
    public FishSnapshot sample() {
        requireClientThread();
        try {
            Object session = a.session.get(null);
            if (session == null) return FishSnapshot.none();
            Object ps = a.playerState.get(session);
            Object rules = a.rules.get(session);
            int raw = a.phase.getByte(ps);
            FishSnapshot.Phase phase = FishSnapshot.phaseOf(raw);
            boolean arcReady = phase == FishSnapshot.Phase.ARC && arcReady(session, rules);
            boolean circleReady = phase == FishSnapshot.Phase.CIRCLE && circleReady(session);
            boolean canConfirm = phase == FishSnapshot.Phase.RESULT && ((Double) a.phaseTime.invoke(ps)).doubleValue() > 1.6;
            return new FishSnapshot(true, phase, raw, (Integer) a.sessionId.invoke(rules), a.sequence.getInt(session),
                    a.hits.getInt(session), arcReady, circleReady, a.won.getBoolean(session), canConfirm,
                    a.biteAt.getLong(session) > 0L);
        } catch (ReflectiveOperationException e) {
            throw fail("ler a sessão de pesca", e);
        }
    }

    /** Um clique do jogo de pesca, só quando a fase atual aceita clique (nada de cliques perdidos). */
    public boolean click() {
        requireClientThread();
        try {
            Object session = a.session.get(null);
            if (session == null) return false;
            Object ps = a.playerState.get(session);
            int raw = a.phase.getByte(ps);
            switch (FishSnapshot.phaseOf(raw)) {
                case ARC -> { if (!arcReady(session, a.rules.get(session))) return false; }
                case CIRCLE -> { if (!circleReady(session)) return false; }
                case RESULT -> { if (((Double) a.phaseTime.invoke(ps)).doubleValue() <= 1.6) return false; }
                case ATTRACT -> { if (a.biteAt.getLong(session) > 0L) return false; }
                default -> { return false; }
            }
            a.click.invoke(null);
            return true;
        } catch (ReflectiveOperationException e) {
            throw fail("clicar na pesca", e);
        }
    }

    /** Inicia a pesca no ponto próximo (equivale ao botão direito). false se não há ponto livre ou é cedo demais. */
    public boolean start() {
        requireClientThread();
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null || !mc.player.isAlive()) return false;
        try {
            if (a.session.get(null) != null) return false;
            a.findPoint.invoke(null, mc);
            Object point = a.nearbyPoint.get(null);
            if (point == null || !(Boolean) a.pointUnlocked.invoke(point) || (Boolean) a.pointOccupied.invoke(null, point)) return false;
            long now = System.currentTimeMillis();
            if (now - a.lastStart.getLong(null) < 1000L) return false;
            String id = (String) a.pointId.invoke(point);
            Object packet = a.startPacket.newInstance((byte) 0, 0, id, (byte) 0, (byte) 0, PROTOCOL);
            a.lastStart.setLong(null, now);
            a.sendToServer.invoke(null, packet);
            return true;
        } catch (ReflectiveOperationException e) {
            throw fail("iniciar a pesca", e);
        }
    }

    /** Sai da pesca (só nas fases iniciais, antes do minigame). */
    public boolean cancel() {
        requireClientThread();
        try {
            Object session = a.session.get(null);
            if (session == null) return false;
            int raw = a.phase.getByte(a.playerState.get(session));
            if (raw < 1 || raw > 4) return false;
            a.changePhase.invoke(null, (byte) 16);
            return true;
        } catch (ReflectiveOperationException e) {
            throw fail("cancelar a pesca", e);
        }
    }

    private boolean arcReady(Object session, Object rules) throws ReflectiveOperationException {
        return !a.escaped.getBoolean(session)
                && a.hits.getInt(session) < (Byte) a.requiredHits.invoke(rules)
                && a.errors.getInt(session) <= (Byte) a.allowedErrors.invoke(rules)
                && (Long) a.clock.invoke(null) - a.lastClick.getLong(session) >= 220L
                && (Boolean) a.inZone.invoke(null, (Float) a.marker.invoke(null));
    }

    private boolean circleReady(Object session) throws ReflectiveOperationException {
        if (a.escaped.getBoolean(session) || a.grade.getByte(session) >= 0) return false;
        double progress = (Double) a.circleProgress.invoke(null);
        return Double.isFinite(progress) && Math.abs(1.0 - progress) <= 0.2;
    }

    private void requireClientThread() {
        if (!available()) throw new IllegalStateException(unavailableReason);
        if (!Minecraft.getInstance().isSameThread()) throw new IllegalStateException("pesca fora da thread do cliente");
    }

    private static IllegalStateException fail(String action, ReflectiveOperationException e) {
        Throwable cause = e instanceof InvocationTargetException ite && ite.getCause() != null ? ite.getCause() : e;
        return new IllegalStateException("Falha ao " + action + " no mod de pesca do servidor", cause);
    }

    /** Campos e métodos do mod do servidor. Qualquer diferença lança exceção e desliga a ponte. */
    private static final class Access {
        final Field session, nearbyPoint, lastStart, playerState, rules, phase, sequence, hits, errors, attracted,
                grade, escaped, won, lastClick, finishAt, biteAt;
        final Method click, marker, inZone, circleProgress, clock, phaseTime, sessionId, requiredHits, allowedErrors,
                findPoint, pointId, pointUnlocked, pointOccupied, sendToServer, changePhase;
        final Constructor<?> startPacket;

        Access() throws ReflectiveOperationException {
            ClassLoader cl = WarriorsBridge.class.getClassLoader();
            Class<?> client = Class.forName(BASE + "client.warriors.pesca.PescaClient", false, cl);
            Class<?> sessionType = Class.forName(BASE + "client.warriors.pesca.PescaClient$Sessao", false, cl);
            Class<?> playerType = Class.forName(BASE + "client.warriors.pesca.Pescador", false, cl);
            Class<?> rulesType = Class.forName(BASE + "common.warriors.net.PescaPacotes$SessaoS2C", false, cl);
            Class<?> pointType = Class.forName(BASE + "common.warriors.net.PescaPacotes$Ponto", false, cl);
            Class<?> packetType = Class.forName(BASE + "common.warriors.net.PescaPacotes$AcaoC2S", false, cl);
            Class<?> netType = Class.forName(BASE + "common.warriors.net.WarriorsNet", false, cl);
            Class<?> rulesConst = Class.forName(BASE + "common.warriors.net.PescaRegras", false, cl);

            Field version = field(rulesConst, "VERSAO", int.class, true);
            if (version.getInt(null) != PROTOCOL) throw new IllegalStateException("protocolo de pesca diferente de " + PROTOCOL);

            session = field(client, "sessao", sessionType, true);
            nearbyPoint = field(client, "pontoPerto", pointType, true);
            lastStart = field(client, "ultimoIniciar", long.class, true);
            playerState = field(sessionType, "ps", playerType, false);
            rules = field(sessionType, "regras", rulesType, false);
            phase = field(playerType, "fase", byte.class, false);
            sequence = field(sessionType, "seq", int.class, false);
            hits = field(sessionType, "acertos", int.class, false);
            errors = field(sessionType, "erros", int.class, false);
            attracted = field(sessionType, "atraidos", int.class, false);
            grade = field(sessionType, "nota", byte.class, false);
            escaped = field(sessionType, "escapou", boolean.class, false);
            won = field(sessionType, "ganhou", boolean.class, false);
            lastClick = field(sessionType, "ultimoClique", long.class, false);
            finishAt = field(sessionType, "fimEm", long.class, false);
            biteAt = field(sessionType, "mordidaEm", long.class, false);

            click = method(client, "clicar", boolean.class, true);
            marker = method(client, "marcador", float.class, true);
            inZone = method(client, "naZona", boolean.class, true, float.class);
            circleProgress = method(client, "progressoDaMira", double.class, true);
            clock = method(client, "relogio", long.class, true);
            phaseTime = method(playerType, "t", double.class, false);
            sessionId = method(rulesType, "sessao", int.class, false);
            requiredHits = method(rulesType, "acertos", byte.class, false);
            allowedErrors = method(rulesType, "erros", byte.class, false);
            findPoint = method(client, "procurarPonto", void.class, true, Minecraft.class);
            pointId = method(pointType, "id", String.class, false);
            pointUnlocked = method(pointType, "liberado", boolean.class, false);
            pointOccupied = method(client, "ocupado", boolean.class, true, pointType);
            sendToServer = method(netType, "sendToServer", void.class, true, Object.class);
            changePhase = method(client, "mudar", void.class, true, byte.class);
            startPacket = packetType.getDeclaredConstructor(byte.class, int.class, String.class, byte.class, byte.class, int.class);
            if (!startPacket.trySetAccessible()) throw new IllegalAccessException("construtor do pedido de pesca inacessível");
        }

        private static Field field(Class<?> owner, String name, Class<?> type, boolean isStatic) throws ReflectiveOperationException {
            Field f = owner.getDeclaredField(name);
            if (f.getType() != type || Modifier.isStatic(f.getModifiers()) != isStatic || !f.trySetAccessible()) {
                throw new NoSuchFieldException(owner.getSimpleName() + "." + name + " incompatível");
            }
            return f;
        }

        private static Method method(Class<?> owner, String name, Class<?> result, boolean isStatic, Class<?>... params) throws ReflectiveOperationException {
            Method m = owner.getDeclaredMethod(name, params);
            if (m.getReturnType() != result || Modifier.isStatic(m.getModifiers()) != isStatic || !m.trySetAccessible()) {
                throw new NoSuchMethodException(owner.getSimpleName() + "." + name + " incompatível");
            }
            return m;
        }
    }
}
