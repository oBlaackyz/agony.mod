package com.agony.config;

import net.minecraftforge.common.ForgeConfigSpec;

/** Configurações individuais. Arquivo: config/agony-client.toml (persistente entre sessões). */
public final class AgonyConfig {
    public static final ForgeConfigSpec SPEC;

    // --- Auto Trigo: teleporte ---
    public static final ForgeConfigSpec.DoubleValue FARM_COMMAND_WAIT_SECONDS;
    public static final ForgeConfigSpec.DoubleValue TELEPORT_TIMEOUT_SECONDS;
    public static final ForgeConfigSpec.IntValue MAX_TELEPORT_RETRIES;
    public static final ForgeConfigSpec.ConfigValue<String> FARM_LOCATION_NAME;
    public static final ForgeConfigSpec.DoubleValue FARM_RADIUS_BLOCKS;
    public static final ForgeConfigSpec.DoubleValue RECOVER_STILL_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FARM_BACKOFF_SECONDS;
    // --- Auto Trigo: tela de colheita ---
    public static final ForgeConfigSpec.DoubleValue CANTEIRO_OPEN_TIMEOUT_SECONDS;
    public static final ForgeConfigSpec.DoubleValue GUI_SETTLE_SECONDS;
    public static final ForgeConfigSpec.DoubleValue AFTER_CLICK_DELAY_SECONDS;
    public static final ForgeConfigSpec.IntValue MAX_CLICK_ATTEMPTS;
    public static final ForgeConfigSpec.BooleanValue CLOSE_SCREEN_AFTER_HARVEST;
    public static final ForgeConfigSpec.ConfigValue<String> HARVEST_BUTTON_TEXT;
    public static final ForgeConfigSpec.ConfigValue<String> HARVEST_SCREEN_CLASS_CONTAINS;
    public static final ForgeConfigSpec.DoubleValue FALLBACK_BUTTON_X;
    public static final ForgeConfigSpec.DoubleValue FALLBACK_BUTTON_Y;
    public static final ForgeConfigSpec.DoubleValue READY_WAIT_MAX_SECONDS;
    // --- Auto Trigo: crescimento ---
    public static final ForgeConfigSpec.IntValue GROWTH_MINUTES;
    // --- Auto Peixe ---
    public static final ForgeConfigSpec.DoubleValue FISH_COMMAND_WAIT_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FISH_START_RETRY_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FISH_START_TIMEOUT_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FISH_ATTRACT_INTERVAL_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FISH_ATTRACT_TIMEOUT_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FISH_ARC_COOLDOWN_SECONDS;
    public static final ForgeConfigSpec.IntValue FISH_CONFIRM_CLICKS;
    public static final ForgeConfigSpec.DoubleValue FISH_CONFIRM_INTERVAL_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FISH_AFTER_CATCH_WAIT_SECONDS;
    public static final ForgeConfigSpec.DoubleValue FISH_STUCK_SECONDS;
    // --- Geral ---
    public static final ForgeConfigSpec.DoubleValue COMMAND_MIN_GAP_SECONDS;
    public static final ForgeConfigSpec.BooleanValue RESUME_ON_JOIN;
    public static final ForgeConfigSpec.BooleanValue DISABLE_PAUSE_ON_LOST_FOCUS;
    public static final ForgeConfigSpec.BooleanValue DIAGNOSTICS;

    static {
        ForgeConfigSpec.Builder b = new ForgeConfigSpec.Builder();

        b.push("trigo_teleporte");
        FARM_COMMAND_WAIT_SECONDS = b.comment("Espera mínima após /ilhafarm (segundos)")
                .defineInRange("farmCommandWaitSeconds", 3.0, 0.5, 60.0);
        TELEPORT_TIMEOUT_SECONDS = b.comment("Tempo máximo esperando a mensagem de chegada antes de reenviar")
                .defineInRange("teleportTimeoutSeconds", 15.0, 3.0, 120.0);
        MAX_TELEPORT_RETRIES = b.comment("Reenvios de /ilhafarm (cancelamento ou falta de confirmação) antes de parar")
                .defineInRange("maxTeleportRetries", 5, 0, 20);
        FARM_LOCATION_NAME = b.comment("Nome do local na mensagem \"Teleportado para o local 'X'\"")
                .define("farmLocationName", "ilhafarm");
        FARM_RADIUS_BLOCKS = b.comment("Distância (blocos) do local salvo da fazenda em que você é considerado 'na fazenda' (não teleporta)")
                .defineInRange("farmRadiusBlocks", 60.0, 8.0, 1000.0);
        RECOVER_STILL_SECONDS = b.comment("Só envia /ilhafarm depois de você ficar parado por este tempo (evita cancelar o teleporte)")
                .defineInRange("recoverStillSeconds", 1.5, 0.2, 30.0);
        FARM_BACKOFF_SECONDS = b.comment("Depois de várias falhas de teleporte, espera este tempo e tenta de novo (não desliga)")
                .defineInRange("farmBackoffSeconds", 120.0, 10.0, 3600.0);
        b.pop();

        b.push("trigo_colheita");
        CANTEIRO_OPEN_TIMEOUT_SECONDS = b.comment("Tempo máximo esperando a tela do canteiro abrir após /canteiro N")
                .defineInRange("canteiroOpenTimeoutSeconds", 8.0, 2.0, 60.0);
        GUI_SETTLE_SECONDS = b.comment("Espera após a tela abrir, antes de clicar (carregamento)")
                .defineInRange("guiSettleSeconds", 1.0, 0.2, 30.0);
        AFTER_CLICK_DELAY_SECONDS = b.comment("Espera após o clique antes de fechar/avançar")
                .defineInRange("afterClickDelaySeconds", 1.5, 0.2, 30.0);
        MAX_CLICK_ATTEMPTS = b.comment("Cliques no máximo por canteiro (só repete se o botão ainda aparecer)")
                .defineInRange("maxClickAttempts", 3, 1, 5);
        CLOSE_SCREEN_AFTER_HARVEST = b.comment("Fechar a tela do canteiro depois de colher")
                .define("closeScreenAfterHarvest", true);
        HARVEST_BUTTON_TEXT = b.comment("Texto do botão de colher (sem acento, minúsculo)")
                .define("harvestButtonText", "colher");
        HARVEST_SCREEN_CLASS_CONTAINS = b.comment("Opcional: parte do nome da classe da tela de colheita (veja o log de diagnóstico)")
                .define("harvestScreenClassContains", "TelaColheita");
        FALLBACK_BUTTON_X = b.comment("Posição X do botão (fração da tela) se ele não for encontrado como widget")
                .defineInRange("fallbackButtonX", 0.394, 0.0, 1.0);
        FALLBACK_BUTTON_Y = b.comment("Posição Y do botão (fração da tela) se ele não for encontrado como widget")
                .defineInRange("fallbackButtonY", 0.736, 0.0, 1.0);
        READY_WAIT_MAX_SECONDS = b.comment("Se o servidor diz que o canteiro ainda não está pronto, espera até este tempo antes de clicar")
                .defineInRange("readyWaitMaxSeconds", 180.0, 0.0, 3600.0);
        b.pop();

        b.push("trigo_crescimento");
        GROWTH_MINUTES = b.comment("Tempo de crescimento em minutos REAIS, contado após o canteiro 4")
                .defineInRange("growthMinutes", 30, 1, 600);
        b.pop();

        b.push("peixe");
        FISH_COMMAND_WAIT_SECONDS = b.comment("Espera mínima após /home peixe (segundos)")
                .defineInRange("fishCommandWaitSeconds", 3.0, 0.5, 60.0);
        FISH_START_RETRY_SECONDS = b.comment("Intervalo entre tentativas de lançar a vara")
                .defineInRange("startRetrySeconds", 0.5, 0.1, 30.0);
        FISH_START_TIMEOUT_SECONDS = b.comment("Tempo tentando lançar a vara antes de voltar ao ponto de pesca")
                .defineInRange("startTimeoutSeconds", 12.0, 2.0, 600.0);
        FISH_ATTRACT_INTERVAL_SECONDS = b.comment("Intervalo entre cliques de atrair o peixe")
                .defineInRange("attractIntervalSeconds", 0.22, 0.05, 5.0);
        FISH_ATTRACT_TIMEOUT_SECONDS = b.comment("Sem mordida por este tempo: reinicia a pesca")
                .defineInRange("attractTimeoutSeconds", 60.0, 5.0, 3600.0);
        FISH_ARC_COOLDOWN_SECONDS = b.comment("Intervalo mínimo entre cliques do arco")
                .defineInRange("arcCooldownSeconds", 0.3, 0.05, 5.0);
        FISH_CONFIRM_CLICKS = b.comment("Cliques para confirmar a captura")
                .defineInRange("confirmClicks", 1, 1, 10);
        FISH_CONFIRM_INTERVAL_SECONDS = b.comment("Intervalo entre cliques de confirmação")
                .defineInRange("confirmIntervalSeconds", 0.35, 0.05, 5.0);
        FISH_AFTER_CATCH_WAIT_SECONDS = b.comment("Espera após a captura antes de lançar a próxima vara")
                .defineInRange("afterCatchWaitSeconds", 1.0, 0.1, 60.0);
        FISH_STUCK_SECONDS = b.comment("Mesma fase do minigame por este tempo: para a automação")
                .defineInRange("stuckSeconds", 90.0, 10.0, 600.0);
        b.pop();

        b.push("geral");
        COMMAND_MIN_GAP_SECONDS = b.comment("Intervalo mínimo entre quaisquer dois comandos enviados")
                .defineInRange("commandMinGapSeconds", 1.5, 0.5, 30.0);
        RESUME_ON_JOIN = b.comment("Retomar o Auto Trigo sozinho ao entrar no mundo se ele estava ligado ao fechar o jogo")
                .define("resumeOnJoin", false);
        DISABLE_PAUSE_ON_LOST_FOCUS = b.comment("Desativa 'pausar ao perder o foco' enquanto houver automação ligada")
                .define("disablePauseOnLostFocus", true);
        DIAGNOSTICS = b.comment("Registra no log a estrutura da tela de colheita (ajuda a ajustar o clique)")
                .define("diagnostics", true);
        b.pop();

        SPEC = b.build();
    }

    private AgonyConfig() {}
}
