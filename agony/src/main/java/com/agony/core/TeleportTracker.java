package com.agony.core;

import com.agony.AgonyMod;
import com.agony.config.AgonyConfig;
import com.agony.util.TextUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Monitor GLOBAL das mensagens de teleporte do servidor (vale para qualquer comando de teleporte).
 *
 * Mensagens reconhecidas (comparadas sem acento/cor/caixa):
 *   "Teleportando para o local 'X' em 3s. Não se mexa."   -> teleporte iniciado
 *   "Teleportado para o local 'X'."                       -> teleporte concluído
 *   "Teleporte cancelado: você se mexeu."                 -> teleporte cancelado
 * (formato de início/conclusão inferido dos vídeos; todas as mensagens com "teleport" vão para o log)
 *
 * As automações NÃO reagem diretamente ao chat: guardam o número de sequência no momento do envio
 * e comparam depois. Assim cada automação decide a própria recuperação.
 */
public final class TeleportTracker {
    private static final Pattern STARTING = Pattern.compile("teleportando para .*?'([^']+)'");
    private static final Pattern ARRIVED = Pattern.compile("teleportado para .*?'([^']+)'");
    private static final String CANCELLED = "teleporte cancelado";
    private static final long OWN_WINDOW_MS = 15_000;
    private static final long FOREIGN_PENDING_MS = 8_000;

    private int arrivalSeq;
    private int cancelSeq;
    private String lastDestination = "";
    private boolean pending;
    private boolean pendingOwn;
    private long pendingSinceMs;
    private boolean atFarm;

    // Teleporte pedido por uma automação (para distinguir de um teleporte feito manualmente pelo jogador)
    private boolean ownExpected;
    private boolean ownKeepsFarmState;
    private long ownExpectedAtMs;

    public void onMessage(String raw) {
        String t = TextUtil.normalize(raw);
        if (t.startsWith("agony") || t.startsWith("[agony]")) return; // mensagens do próprio mod
        if (!t.contains("teleport")) return;
        long now = System.currentTimeMillis();
        AgonyMod.LOGGER.info("[AGONY] mensagem de teleporte: {}", raw);

        if (t.contains(CANCELLED)) {
            pending = false;
            pendingOwn = false;
            ownExpected = false;
            cancelSeq++;
            return;
        }
        Matcher m = ARRIVED.matcher(t);
        if (m.find()) {
            lastDestination = m.group(1);
            arrivalSeq++;
            boolean own = ownExpected && now - ownExpectedAtMs <= OWN_WINDOW_MS;
            if (!(own && ownKeepsFarmState)) {
                atFarm = TextUtil.normalize(lastDestination).contains(TextUtil.normalize(AgonyConfig.FARM_LOCATION_NAME.get()));
            }
            pending = false;
            pendingOwn = false;
            ownExpected = false;
            return;
        }
        m = STARTING.matcher(t);
        if (m.find()) {
            pending = true;
            pendingSinceMs = now;
            pendingOwn = ownExpected && now - ownExpectedAtMs <= OWN_WINDOW_MS;
        }
    }

    /**
     * Chamado por uma automação ao enviar um comando que pode teleportar.
     * @param keepsFarmState true para comandos que não devem alterar "estou na fazenda" (ex.: /canteiro N)
     */
    public void expectOwnTeleport(boolean keepsFarmState) {
        ownExpected = true;
        ownKeepsFarmState = keepsFarmState;
        ownExpectedAtMs = System.currentTimeMillis();
    }

    public int arrivalSeq() { return arrivalSeq; }
    public int cancelSeq() { return cancelSeq; }
    public String lastDestination() { return lastDestination; }
    public boolean atFarm() { return atFarm; }

    public boolean lastArrivalIsFarm() {
        return TextUtil.normalize(lastDestination).contains(TextUtil.normalize(AgonyConfig.FARM_LOCATION_NAME.get()));
    }

    /** true se o JOGADOR iniciou um teleporte por conta própria e ele ainda está em andamento. */
    public boolean isForeignPending() {
        return pending && !pendingOwn && System.currentTimeMillis() - pendingSinceMs < FOREIGN_PENDING_MS;
    }

    public void reset() {
        pending = false;
        pendingOwn = false;
        ownExpected = false;
        atFarm = false;
    }
}
