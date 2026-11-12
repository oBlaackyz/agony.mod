package com.agony.core;

import com.agony.AgonyMod;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Estado persistente em config/agony-state.json: hora de término do crescimento (epoch ms)
 * e se o Auto Trigo estava ligado. Só é gravado quando muda (não a cada tick).
 */
public final class StateStore {
    public static final class Data {
        public long farmDeadlineEpochMs = 0;
        public boolean farmWasRunning = false;
        // Local conhecido da fazenda (aprendido ao chegar/abrir os canteiros, ou marcado no painel)
        public boolean farmAnchorSet = false;
        public double farmAnchorX = 0, farmAnchorY = 0, farmAnchorZ = 0;
        public String farmAnchorDim = "";
        public String farmAnchorServer = "";
    }

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private Data data = new Data();

    private static Path file() { return FMLPaths.CONFIGDIR.get().resolve("agony-state.json"); }

    public Data data() { return data; }

    public void load() {
        try {
            Path f = file();
            if (!Files.exists(f)) return;
            try (Reader r = Files.newBufferedReader(f, StandardCharsets.UTF_8)) {
                Data d = GSON.fromJson(r, Data.class);
                if (d != null) data = d;
            }
        } catch (Exception e) {
            AgonyMod.LOGGER.warn("[AGONY] não foi possível ler o estado salvo", e);
        }
    }

    public void save() {
        try {
            Path f = file();
            Path tmp = f.resolveSibling("agony-state.json.tmp");
            Files.writeString(tmp, GSON.toJson(data), StandardCharsets.UTF_8);
            try {
                Files.move(tmp, f, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            } catch (AtomicMoveNotSupportedException e) {
                Files.move(tmp, f, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (Exception e) {
            AgonyMod.LOGGER.warn("[AGONY] não foi possível salvar o estado", e);
        }
    }
}
