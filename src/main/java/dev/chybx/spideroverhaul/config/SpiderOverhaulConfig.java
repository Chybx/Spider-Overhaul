package dev.chybx.spideroverhaul.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.chybx.spideroverhaul.Spideroverhaul;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SpiderOverhaulConfig {
    private static final Logger LOGGER = Spideroverhaul.LOGGER;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve("SpiderOverhaul.json");

    public double spawnWeightMultiplier = 1.0;

    public boolean replaceVanillaSpiders = true;

    public boolean useVanillaModels = true;

    public double healthMultiplier = 1.0;
    public double damageMultiplier = 1.0;
    public double speedMultiplier = 1.0;

    private static SpiderOverhaulConfig instance = new SpiderOverhaulConfig();

    public static SpiderOverhaulConfig getInstance() {
        return instance;
    }

    public static void load() {
        if (Files.exists(CONFIG_PATH)) {
            try {
                String json = Files.readString(CONFIG_PATH);
                instance = GSON.fromJson(json, SpiderOverhaulConfig.class);
                LOGGER.info("Loaded config from {}", CONFIG_PATH);
            } catch (IOException e) {
                LOGGER.error("Failed to load config from {}: {}", CONFIG_PATH, e.getMessage());
            }
        } else {
            LOGGER.info("No config found at {}, creating default", CONFIG_PATH);
            save();
        }
    }

    public static void save() {
        try {
            Files.createDirectories(CONFIG_PATH.getParent());
            String json = GSON.toJson(instance);
            Files.writeString(CONFIG_PATH, json);
            LOGGER.info("Saved config to {}", CONFIG_PATH);
        } catch (IOException e) {
            LOGGER.error("Failed to save config to {}: {}", CONFIG_PATH, e.getMessage());
        }
    }

    public static int scaleWeight(int baseWeight) {
        return (int) (baseWeight * instance.spawnWeightMultiplier);
    }

    public static double scaleHealth(double baseHealth) {
        return baseHealth * instance.healthMultiplier;
    }

    public static double scaleDamage(double baseDamage) {
        return baseDamage * instance.damageMultiplier;
    }

    public static double scaleSpeed(double baseSpeed) {
        return baseSpeed * instance.speedMultiplier;
    }
}
