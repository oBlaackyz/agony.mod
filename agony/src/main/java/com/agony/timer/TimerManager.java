package com.agony.timer;

/**
 * Temporizadores não bloqueantes. Nenhum usa Thread.sleep nem depende de ticks/frames:
 * o tick do cliente apenas CONSULTA o relógio.
 *
 *  - Delay: esperas curtas (segundos), relógio monotônico (System.nanoTime).
 *  - Countdown: contagem longa (30 min), relógio de parede do Windows (hora de término em epoch ms).
 *    É a fonte da verdade: minimizar o jogo não altera a duração, o valor pode ser salvo em arquivo
 *    e continua correto após reiniciar o Minecraft.
 */
public final class TimerManager {
    private TimerManager() {}

    public static final class Delay {
        private long deadlineNanos;
        private boolean running;

        public void start(long millis) {
            deadlineNanos = System.nanoTime() + millis * 1_000_000L;
            running = true;
        }

        public void cancel() { running = false; }
        public boolean isRunning() { return running; }
        public boolean isDone() { return running && System.nanoTime() - deadlineNanos >= 0; }

        public long remainingMillis() {
            if (!running) return 0;
            return Math.max(0, (deadlineNanos - System.nanoTime()) / 1_000_000L);
        }
    }

    public static final class Countdown {
        private long deadlineEpochMs; // 0 = sem contagem

        public void startFromNow(long durationMs) { deadlineEpochMs = System.currentTimeMillis() + durationMs; }
        public void restore(long epochMs) { deadlineEpochMs = epochMs; }
        public void clear() { deadlineEpochMs = 0; }
        public boolean isSet() { return deadlineEpochMs > 0; }
        public boolean isDone() { return isSet() && System.currentTimeMillis() >= deadlineEpochMs; }
        public long deadlineEpochMs() { return deadlineEpochMs; }

        public long remainingMillis() {
            if (!isSet()) return 0;
            return Math.max(0, deadlineEpochMs - System.currentTimeMillis());
        }
    }
}
