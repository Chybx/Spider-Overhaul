package dev.chybx.spideroverhaul.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class SpiderOverhaulConfigScreen {

    public static Screen create(Screen parent) {
        SpiderOverhaulConfig config = SpiderOverhaulConfig.getInstance();

        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.translatable("config.spider-overhaul.title"))
                .setSavingRunnable(SpiderOverhaulConfig::save);

        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        ConfigCategory general = builder.getOrCreateCategory(Text.translatable("config.spider-overhaul.category.general"));

        general.addEntry(entryBuilder.startBooleanToggle(
                        Text.translatable("config.spider-overhaul.replace_vanilla_spiders"),
                        config.replaceVanillaSpiders)
                .setDefaultValue(false)
                .setSaveConsumer(value -> config.replaceVanillaSpiders = value)
                .setTooltip(Text.translatable("config.spider-overhaul.replace_vanilla_spiders.tooltip"))
                .build());

        general.addEntry(entryBuilder.startBooleanToggle(
                        Text.translatable("config.spider-overhaul.use_vanilla_models"),
                        config.useVanillaModels)
                .setDefaultValue(false)
                .setSaveConsumer(value -> config.useVanillaModels = value)
                .setTooltip(Text.translatable("config.spider-overhaul.use_vanilla_models.tooltip"))
                .build());

        general.addEntry(entryBuilder.startBooleanToggle(
                        Text.translatable("config.spider-overhaul.hide_spider_legs"),
                        config.hideSpiderLegs)
                .setDefaultValue(false)
                .setSaveConsumer(value -> config.hideSpiderLegs = value)
                .setTooltip(Text.translatable("config.spider-overhaul.hide_spider_legs.tooltip"))
                .build());

        ConfigCategory spawning = builder.getOrCreateCategory(Text.translatable("config.spider-overhaul.category.spawning"));

        spawning.addEntry(entryBuilder.startDoubleField(
                        Text.translatable("config.spider-overhaul.spawn_weight_multiplier"),
                        config.spawnWeightMultiplier)
                .setDefaultValue(1.0)
                .setMin(0.0)
                .setSaveConsumer(value -> config.spawnWeightMultiplier = value)
                .setTooltip(Text.translatable("config.spider-overhaul.spawn_weight_multiplier.tooltip"))
                .build());

        ConfigCategory attributes = builder.getOrCreateCategory(Text.translatable("config.spider-overhaul.category.attributes"));

        attributes.addEntry(entryBuilder.startDoubleField(
                        Text.translatable("config.spider-overhaul.health_multiplier"),
                        config.healthMultiplier)
                .setDefaultValue(1.0)
                .setMin(0.0)
                .setSaveConsumer(value -> config.healthMultiplier = value)
                .setTooltip(Text.translatable("config.spider-overhaul.health_multiplier.tooltip"))
                .build());

        attributes.addEntry(entryBuilder.startDoubleField(
                        Text.translatable("config.spider-overhaul.damage_multiplier"),
                        config.damageMultiplier)
                .setDefaultValue(1.0)
                .setMin(0.0)
                .setSaveConsumer(value -> config.damageMultiplier = value)
                .setTooltip(Text.translatable("config.spider-overhaul.damage_multiplier.tooltip"))
                .build());

        attributes.addEntry(entryBuilder.startDoubleField(
                        Text.translatable("config.spider-overhaul.speed_multiplier"),
                        config.speedMultiplier)
                .setDefaultValue(1.0)
                .setMin(0.0)
                .setSaveConsumer(value -> config.speedMultiplier = value)
                .setTooltip(Text.translatable("config.spider-overhaul.speed_multiplier.tooltip"))
                .build());

        return builder.build();
    }
}
