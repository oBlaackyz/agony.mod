package com.agony.fish;

/** Retrato do estado da pesca do servidor (lido do mod de pesca, em tempo real). */
public record FishSnapshot(boolean session, Phase phase, int rawPhase, int sessionId, int sequence,
                           int arcHits, boolean arcReady, boolean circleReady, boolean won,
                           boolean canConfirm, boolean bitePending) {

    public enum Phase { NONE, CAST, ATTRACT, ARC, CIRCLE, TRANSITION, RESULT, CLOSING }

    public static FishSnapshot none() {
        return new FishSnapshot(false, Phase.NONE, 0, -1, 0, 0, false, false, false, false, false);
    }

    /** Agrupa as fases numéricas do mod de pesca nas fases usadas pelo AGONY. */
    public static Phase phaseOf(int raw) {
        return switch (raw) {
            case 1, 2 -> Phase.CAST;
            case 3 -> Phase.ATTRACT;
            case 6, 7, 8 -> Phase.ARC;
            case 10 -> Phase.CIRCLE;
            case 13, 14 -> Phase.RESULT;
            case 16 -> Phase.CLOSING;
            default -> Phase.TRANSITION; // 4, 5, 9, 11, 12, 15 e qualquer fase desconhecida: só aguardar
        };
    }
}
