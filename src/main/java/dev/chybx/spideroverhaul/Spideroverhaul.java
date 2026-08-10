package dev.chybx.spideroverhaul;

import dev.chybx.spideroverhaul.config.SpiderOverhaulConfig;
import dev.chybx.spideroverhaul.entity.jungle_spider.JungleSpiderParticles;
import dev.chybx.spideroverhaul.registry.ModBlocks;
import dev.chybx.spideroverhaul.registry.ModEffects;
import dev.chybx.spideroverhaul.registry.ModEntities;
import dev.chybx.spideroverhaul.registry.ModItemGroups;
import dev.chybx.spideroverhaul.registry.ModItems;
import dev.chybx.spideroverhaul.registry.ModParticles;
import dev.chybx.spideroverhaul.registry.ModPotions;
import dev.chybx.spideroverhaul.util.BambooGrowthHandler;
import dev.chybx.spideroverhaul.util.SpawnConditions;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spideroverhaul implements ModInitializer {
	public static final String MOD_ID = "spider-overhaul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Spider Overhaul Mod");

		SpiderOverhaulConfig.load();

		ModEffects.registerEffects();

		ModBlocks.registerBlocks();

		ModItems.registerItems();

		ModItemGroups.registerItemGroups();

		ModEntities.registerEntities();

		ModParticles.registerParticles();

		ModPotions.registerPotions();

		ModPotions.registerBrewingRecipes();

		SpawnConditions.registerSpawns();

		BiomeModifications.addFeature(
				BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
				GenerationStep.Feature.VEGETAL_DECORATION,
				RegistryKey.of(
						RegistryKeys.PLACED_FEATURE,
						Identifier.of(Spideroverhaul.MOD_ID, "spider_lily_pad")
				)
		);

		ServerTickEvents.END_WORLD_TICK.register(world -> {
			if (!world.isClient() && world instanceof ServerWorld serverWorld) {
				JungleSpiderParticles.tick(serverWorld);
				BambooGrowthHandler.tick(serverWorld);
			}
		});

		ServerWorldEvents.UNLOAD.register((server, world) -> {
			BambooGrowthHandler.removeWorld(world);
		});

		UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
			if (world.isClient()) return ActionResult.PASS;

			ItemStack stack = player.getStackInHand(hand);

			if (stack.getItem() == Items.GLASS_BOTTLE) {
				var pos = hitResult.getBlockPos();
				if (!JungleSpiderParticles.hasPuddleAt(pos)) return ActionResult.PASS;

				JungleSpiderParticles.removePuddleAt(pos);

				if (!player.isCreative()) {
					stack.decrement(1);
				}

				ItemStack bottle = new ItemStack(ModItems.BOTTLE_OF_SPIDER_POLLEN);
				if (!player.getInventory().insertStack(bottle)) {
					player.dropItem(bottle, false);
				}

				world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0f, 1.0f);

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.BOTTLE_OF_SPIDER_POLLEN) {
				BlockPos pos = hitResult.getBlockPos();
				BlockState state = world.getBlockState(pos);
				if (!state.isOf(Blocks.BAMBOO) && !state.isOf(Blocks.BAMBOO_SAPLING)) return ActionResult.PASS;

				if (!player.isCreative()) {
					stack.decrement(1);

					ItemStack emptyBottle = new ItemStack(Items.GLASS_BOTTLE);
					if (!player.getInventory().insertStack(emptyBottle)) {
						player.dropItem(emptyBottle, false);
					}
				}

				BambooGrowthHandler.startConversion((ServerWorld) world, pos);

				world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_EMPTY, SoundCategory.BLOCKS, 1.0f, 1.0f);

				return ActionResult.SUCCESS;
			}

			return ActionResult.PASS;
		});
	}
}