
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.magicstaffmod.world.features.ores.WaterOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.StoneOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.StoneManaOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.StoneIceOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneRedstoneOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneLapisLazuliOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneIronOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneHollowOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneGoldOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneEmeraldOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneDiamondOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.RuneCopperOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.ObsidianOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.FireOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.EnderiteOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.DeepslateManaOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.DeepslateIceOreFeature;
import net.mcreator.magicstaffmod.world.features.ores.ActiveSoulSandFeature;
import net.mcreator.magicstaffmod.world.features.RuneWorldBeaconMonumentFeature;
import net.mcreator.magicstaffmod.world.features.FlyingIslandRuneFeature;
import net.mcreator.magicstaffmod.world.features.FlyingIslandManaFeature;
import net.mcreator.magicstaffmod.world.features.FlyingIslandFireFeature;
import net.mcreator.magicstaffmod.world.features.FlyingIslandFeature;
import net.mcreator.magicstaffmod.world.features.FlyingIslandCorruptFeature;
import net.mcreator.magicstaffmod.MaMod;

@Mod.EventBusSubscriber
public class MaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MaMod.MODID);
	public static final RegistryObject<Feature<?>> STONE_MANA_ORE = REGISTRY.register("stone_mana_ore", StoneManaOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_MANA_ORE = REGISTRY.register("deepslate_mana_ore", DeepslateManaOreFeature::feature);
	public static final RegistryObject<Feature<?>> WATER_ORE = REGISTRY.register("water_ore", WaterOreFeature::feature);
	public static final RegistryObject<Feature<?>> FIRE_ORE = REGISTRY.register("fire_ore", FireOreFeature::feature);
	public static final RegistryObject<Feature<?>> STONE_ORE = REGISTRY.register("stone_ore", StoneOreFeature::feature);
	public static final RegistryObject<Feature<?>> OBSIDIAN_ORE = REGISTRY.register("obsidian_ore", ObsidianOreFeature::feature);
	public static final RegistryObject<Feature<?>> STONE_ICE_ORE = REGISTRY.register("stone_ice_ore", StoneIceOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_ICE_ORE = REGISTRY.register("deepslate_ice_ore", DeepslateIceOreFeature::feature);
	public static final RegistryObject<Feature<?>> ACTIVE_SOUL_SAND = REGISTRY.register("active_soul_sand", ActiveSoulSandFeature::feature);
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = REGISTRY.register("enderite_ore", EnderiteOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_LAPIS_LAZULI_ORE = REGISTRY.register("rune_lapis_lazuli_ore",
			RuneLapisLazuliOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_REDSTONE_ORE = REGISTRY.register("rune_redstone_ore", RuneRedstoneOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_IRON_ORE = REGISTRY.register("rune_iron_ore", RuneIronOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_GOLD_ORE = REGISTRY.register("rune_gold_ore", RuneGoldOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_DIAMOND_ORE = REGISTRY.register("rune_diamond_ore", RuneDiamondOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_EMERALD_ORE = REGISTRY.register("rune_emerald_ore", RuneEmeraldOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_COPPER_ORE = REGISTRY.register("rune_copper_ore", RuneCopperOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_HOLLOW_ORE = REGISTRY.register("rune_hollow_ore", RuneHollowOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUNE_WORLD_BEACON_MONUMENT = REGISTRY.register("rune_world_beacon_monument",
			RuneWorldBeaconMonumentFeature::feature);
	public static final RegistryObject<Feature<?>> FLYING_ISLAND = REGISTRY.register("flying_island", FlyingIslandFeature::feature);
	public static final RegistryObject<Feature<?>> FLYING_ISLAND_MANA = REGISTRY.register("flying_island_mana", FlyingIslandManaFeature::feature);
	public static final RegistryObject<Feature<?>> FLYING_ISLAND_FIRE = REGISTRY.register("flying_island_fire", FlyingIslandFireFeature::feature);
	public static final RegistryObject<Feature<?>> FLYING_ISLAND_RUNE = REGISTRY.register("flying_island_rune", FlyingIslandRuneFeature::feature);
	public static final RegistryObject<Feature<?>> FLYING_ISLAND_CORRUPT = REGISTRY.register("flying_island_corrupt",
			FlyingIslandCorruptFeature::feature);
}
