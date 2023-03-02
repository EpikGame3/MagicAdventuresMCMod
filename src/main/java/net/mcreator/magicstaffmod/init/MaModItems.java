
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magicstaffmod.item.WaterStaffItem;
import net.mcreator.magicstaffmod.item.WaterIngotItem;
import net.mcreator.magicstaffmod.item.WaterEssentionItem;
import net.mcreator.magicstaffmod.item.WaterCrystalItem;
import net.mcreator.magicstaffmod.item.WaterBookItem;
import net.mcreator.magicstaffmod.item.VTE7Item;
import net.mcreator.magicstaffmod.item.UncompliteHolyBladeItem;
import net.mcreator.magicstaffmod.item.TrueGungnirItem;
import net.mcreator.magicstaffmod.item.TrueExcaliburItem;
import net.mcreator.magicstaffmod.item.StoneStaffItem;
import net.mcreator.magicstaffmod.item.StoneEssentionItem;
import net.mcreator.magicstaffmod.item.StoneCrystalItem;
import net.mcreator.magicstaffmod.item.StoneBookItem;
import net.mcreator.magicstaffmod.item.StoneBattleAxeItem;
import net.mcreator.magicstaffmod.item.StoneAxeBladeItem;
import net.mcreator.magicstaffmod.item.SoulStringItem;
import net.mcreator.magicstaffmod.item.SoulStaffItem;
import net.mcreator.magicstaffmod.item.SoulShardItem;
import net.mcreator.magicstaffmod.item.SoulEssentionItem;
import net.mcreator.magicstaffmod.item.SoulCrystalItem;
import net.mcreator.magicstaffmod.item.SoulBookItem;
import net.mcreator.magicstaffmod.item.RuneBeaconCoreItem;
import net.mcreator.magicstaffmod.item.RawHollowOreItem;
import net.mcreator.magicstaffmod.item.ObsidianedHevyHolyArmorItem;
import net.mcreator.magicstaffmod.item.ObsidianStaffItem;
import net.mcreator.magicstaffmod.item.ObsidianPlateItem;
import net.mcreator.magicstaffmod.item.ObsidianEssentionItem;
import net.mcreator.magicstaffmod.item.ObsidianCrystalItem;
import net.mcreator.magicstaffmod.item.ObsidianBookItem;
import net.mcreator.magicstaffmod.item.MurasamaShotItem;
import net.mcreator.magicstaffmod.item.MurasamaProjectileItem;
import net.mcreator.magicstaffmod.item.ManaNecklaceItem;
import net.mcreator.magicstaffmod.item.ManaCrystalItem;
import net.mcreator.magicstaffmod.item.ManaChocolateItem;
import net.mcreator.magicstaffmod.item.ManaChocolateChunkItem;
import net.mcreator.magicstaffmod.item.ManaBookItem;
import net.mcreator.magicstaffmod.item.ManaBeltItem;
import net.mcreator.magicstaffmod.item.MagicBookItem;
import net.mcreator.magicstaffmod.item.IceStaffItem;
import net.mcreator.magicstaffmod.item.IceKatanaItem;
import net.mcreator.magicstaffmod.item.IceEssentionItem;
import net.mcreator.magicstaffmod.item.IceCrystalItem;
import net.mcreator.magicstaffmod.item.IceBookItem;
import net.mcreator.magicstaffmod.item.IceBladeItem;
import net.mcreator.magicstaffmod.item.HolyWaterItem;
import net.mcreator.magicstaffmod.item.HolyStringItem;
import net.mcreator.magicstaffmod.item.HolyRodItem;
import net.mcreator.magicstaffmod.item.HolyPlateItem;
import net.mcreator.magicstaffmod.item.HolyPickaxeItem;
import net.mcreator.magicstaffmod.item.HolyNuggetItem;
import net.mcreator.magicstaffmod.item.HolyKatanaItem;
import net.mcreator.magicstaffmod.item.HolyIngotItem;
import net.mcreator.magicstaffmod.item.HolyHolyCastingHammerItem;
import net.mcreator.magicstaffmod.item.HolyHammerObsidianedItem;
import net.mcreator.magicstaffmod.item.HolyHammerItem;
import net.mcreator.magicstaffmod.item.HolyGardItem;
import net.mcreator.magicstaffmod.item.HolyCastItem;
import net.mcreator.magicstaffmod.item.HolyBowUpItem;
import net.mcreator.magicstaffmod.item.HolyBowItem;
import net.mcreator.magicstaffmod.item.HolyBladeItem;
import net.mcreator.magicstaffmod.item.HolyBattleAxeItem;
import net.mcreator.magicstaffmod.item.HolyAxeItem;
import net.mcreator.magicstaffmod.item.HolyAxeBladeItem;
import net.mcreator.magicstaffmod.item.HeavyHolyArmorItem;
import net.mcreator.magicstaffmod.item.GungnirItem;
import net.mcreator.magicstaffmod.item.FireStaffItem;
import net.mcreator.magicstaffmod.item.FireIngotItem;
import net.mcreator.magicstaffmod.item.FireGardItem;
import net.mcreator.magicstaffmod.item.FireEssentionItem;
import net.mcreator.magicstaffmod.item.FireCrystalItem;
import net.mcreator.magicstaffmod.item.FireBookItem;
import net.mcreator.magicstaffmod.item.ExcaliburItem;
import net.mcreator.magicstaffmod.item.EnderiteSwordItem;
import net.mcreator.magicstaffmod.item.EnderiteShovelItem;
import net.mcreator.magicstaffmod.item.EnderitePickaxeItem;
import net.mcreator.magicstaffmod.item.EnderiteHoeItem;
import net.mcreator.magicstaffmod.item.EnderiteCrystalItem;
import net.mcreator.magicstaffmod.item.EnderiteAxeItem;
import net.mcreator.magicstaffmod.item.EnderiteArmorItem;
import net.mcreator.magicstaffmod.item.ConcentratedManaCrystalItem;
import net.mcreator.magicstaffmod.item.BrockenManaCrystalItem;
import net.mcreator.magicstaffmod.MaMod;

public class MaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MaMod.MODID);
	public static final RegistryObject<Item> CONCENTRATED_MANA_CRYSTAL = REGISTRY.register("concentrated_mana_crystal",
			() -> new ConcentratedManaCrystalItem());
	public static final RegistryObject<Item> STONE_STAFF = REGISTRY.register("stone_staff", () -> new StoneStaffItem());
	public static final RegistryObject<Item> STONE_BOOK = REGISTRY.register("stone_book", () -> new StoneBookItem());
	public static final RegistryObject<Item> FIRE_STAFF = REGISTRY.register("fire_staff", () -> new FireStaffItem());
	public static final RegistryObject<Item> FIRE_BOOK = REGISTRY.register("fire_book", () -> new FireBookItem());
	public static final RegistryObject<Item> WATER_STAFF = REGISTRY.register("water_staff", () -> new WaterStaffItem());
	public static final RegistryObject<Item> WATER_BOOK = REGISTRY.register("water_book", () -> new WaterBookItem());
	public static final RegistryObject<Item> ICE_STAFF = REGISTRY.register("ice_staff", () -> new IceStaffItem());
	public static final RegistryObject<Item> ICE_BOOK = REGISTRY.register("ice_book", () -> new IceBookItem());
	public static final RegistryObject<Item> OBSIDIAN_STAFF = REGISTRY.register("obsidian_staff", () -> new ObsidianStaffItem());
	public static final RegistryObject<Item> OBSIDIAN_BOOK = REGISTRY.register("obsidian_book", () -> new ObsidianBookItem());
	public static final RegistryObject<Item> SOUL_STAFF = REGISTRY.register("soul_staff", () -> new SoulStaffItem());
	public static final RegistryObject<Item> SOUL_BOOK = REGISTRY.register("soul_book", () -> new SoulBookItem());
	public static final RegistryObject<Item> HOLY_BOW = REGISTRY.register("holy_bow", () -> new HolyBowItem());
	public static final RegistryObject<Item> HOLY_BOW_UP = REGISTRY.register("holy_bow_up", () -> new HolyBowUpItem());
	public static final RegistryObject<Item> STONE_MANA_ORE = block(MaModBlocks.STONE_MANA_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> DEEPSLATE_MANA_ORE = block(MaModBlocks.DEEPSLATE_MANA_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> BROCKEN_MANA_CRYSTAL = REGISTRY.register("brocken_mana_crystal", () -> new BrockenManaCrystalItem());
	public static final RegistryObject<Item> MANA_CRYSTAL = REGISTRY.register("mana_crystal", () -> new ManaCrystalItem());
	public static final RegistryObject<Item> MANA_BLOCK = block(MaModBlocks.MANA_BLOCK, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> MAGIC_BOOK = REGISTRY.register("magic_book", () -> new MagicBookItem());
	public static final RegistryObject<Item> MANA_BOOK = REGISTRY.register("mana_book", () -> new ManaBookItem());
	public static final RegistryObject<Item> WATER_ORE = block(MaModBlocks.WATER_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> WATER_ESSENTION = REGISTRY.register("water_essention", () -> new WaterEssentionItem());
	public static final RegistryObject<Item> WATER_CRYSTAL = REGISTRY.register("water_crystal", () -> new WaterCrystalItem());
	public static final RegistryObject<Item> WATER_INGOT = REGISTRY.register("water_ingot", () -> new WaterIngotItem());
	public static final RegistryObject<Item> FIRE_ORE = block(MaModBlocks.FIRE_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> FIRE_ESSENTION = REGISTRY.register("fire_essention", () -> new FireEssentionItem());
	public static final RegistryObject<Item> FIRE_CRYSTAL = REGISTRY.register("fire_crystal", () -> new FireCrystalItem());
	public static final RegistryObject<Item> FIRE_INGOT = REGISTRY.register("fire_ingot", () -> new FireIngotItem());
	public static final RegistryObject<Item> FIRE_GARD = REGISTRY.register("fire_gard", () -> new FireGardItem());
	public static final RegistryObject<Item> STONE_ORE = block(MaModBlocks.STONE_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> STONE_ESSENTION = REGISTRY.register("stone_essention", () -> new StoneEssentionItem());
	public static final RegistryObject<Item> STONE_CRYSTAL = REGISTRY.register("stone_crystal", () -> new StoneCrystalItem());
	public static final RegistryObject<Item> STONE_AXE_BLADE = REGISTRY.register("stone_axe_blade", () -> new StoneAxeBladeItem());
	public static final RegistryObject<Item> OBSIDIAN_ORE = block(MaModBlocks.OBSIDIAN_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> OBSIDIAN_ESSENTION = REGISTRY.register("obsidian_essention", () -> new ObsidianEssentionItem());
	public static final RegistryObject<Item> OBSIDIAN_CRYSTAL = REGISTRY.register("obsidian_crystal", () -> new ObsidianCrystalItem());
	public static final RegistryObject<Item> OBSIDIAN_PLATE = REGISTRY.register("obsidian_plate", () -> new ObsidianPlateItem());
	public static final RegistryObject<Item> STONE_ICE_ORE = block(MaModBlocks.STONE_ICE_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> DEEPSLATE_ICE_ORE = block(MaModBlocks.DEEPSLATE_ICE_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> ICE_ESSENTION = REGISTRY.register("ice_essention", () -> new IceEssentionItem());
	public static final RegistryObject<Item> ICE_CRYSTAL = REGISTRY.register("ice_crystal", () -> new IceCrystalItem());
	public static final RegistryObject<Item> ICE_BLADE = REGISTRY.register("ice_blade", () -> new IceBladeItem());
	public static final RegistryObject<Item> ACTIVE_SOUL_SAND = block(MaModBlocks.ACTIVE_SOUL_SAND, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> SOUL_ESSENTION = REGISTRY.register("soul_essention", () -> new SoulEssentionItem());
	public static final RegistryObject<Item> SOUL_SHARD = REGISTRY.register("soul_shard", () -> new SoulShardItem());
	public static final RegistryObject<Item> SOUL_CRYSTAL = REGISTRY.register("soul_crystal", () -> new SoulCrystalItem());
	public static final RegistryObject<Item> SOUL_STRING = REGISTRY.register("soul_string", () -> new SoulStringItem());
	public static final RegistryObject<Item> HOLY_WATER = REGISTRY.register("holy_water", () -> new HolyWaterItem());
	public static final RegistryObject<Item> HOLY_INGOT = REGISTRY.register("holy_ingot", () -> new HolyIngotItem());
	public static final RegistryObject<Item> HOLY_NUGGET = REGISTRY.register("holy_nugget", () -> new HolyNuggetItem());
	public static final RegistryObject<Item> HOLY_CAST = REGISTRY.register("holy_cast", () -> new HolyCastItem());
	public static final RegistryObject<Item> HOLY_ROD = REGISTRY.register("holy_rod", () -> new HolyRodItem());
	public static final RegistryObject<Item> HOLY_PLATE = REGISTRY.register("holy_plate", () -> new HolyPlateItem());
	public static final RegistryObject<Item> HOLY_STRING = REGISTRY.register("holy_string", () -> new HolyStringItem());
	public static final RegistryObject<Item> HOLY_BLADE = REGISTRY.register("holy_blade", () -> new HolyBladeItem());
	public static final RegistryObject<Item> HOLY_STEEL_BLOCK = block(MaModBlocks.HOLY_STEEL_BLOCK, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> HOLY_AXE_BLADE = REGISTRY.register("holy_axe_blade", () -> new HolyAxeBladeItem());
	public static final RegistryObject<Item> HOLY_GARD = REGISTRY.register("holy_gard", () -> new HolyGardItem());
	public static final RegistryObject<Item> UNCOMPLITE_HOLY_BLADE = REGISTRY.register("uncomplite_holy_blade", () -> new UncompliteHolyBladeItem());
	public static final RegistryObject<Item> ENDERITE_ORE = block(MaModBlocks.ENDERITE_ORE, MaModTabs.TAB_MAGIC_RESOURSES);
	public static final RegistryObject<Item> ENDERITE_CRYSTAL = REGISTRY.register("enderite_crystal", () -> new EnderiteCrystalItem());
	public static final RegistryObject<Item> HOLY_HAMMER = REGISTRY.register("holy_hammer", () -> new HolyHammerItem());
	public static final RegistryObject<Item> HOLY_HAMMER_OBSIDIANED = REGISTRY.register("holy_hammer_obsidianed",
			() -> new HolyHammerObsidianedItem());
	public static final RegistryObject<Item> EXCALIBUR = REGISTRY.register("excalibur", () -> new ExcaliburItem());
	public static final RegistryObject<Item> TRUE_EXCALIBUR = REGISTRY.register("true_excalibur", () -> new TrueExcaliburItem());
	public static final RegistryObject<Item> HOLY_KATANA = REGISTRY.register("holy_katana", () -> new HolyKatanaItem());
	public static final RegistryObject<Item> ICE_KATANA = REGISTRY.register("ice_katana", () -> new IceKatanaItem());
	public static final RegistryObject<Item> GUNGNIR = REGISTRY.register("gungnir", () -> new GungnirItem());
	public static final RegistryObject<Item> TRUE_GUNGNIR = REGISTRY.register("true_gungnir", () -> new TrueGungnirItem());
	public static final RegistryObject<Item> HOLY_BATTLE_AXE = REGISTRY.register("holy_battle_axe", () -> new HolyBattleAxeItem());
	public static final RegistryObject<Item> STONE_BATTLE_AXE = REGISTRY.register("stone_battle_axe", () -> new StoneBattleAxeItem());
	public static final RegistryObject<Item> HOLY_AXE = REGISTRY.register("holy_axe", () -> new HolyAxeItem());
	public static final RegistryObject<Item> HOLY_PICKAXE = REGISTRY.register("holy_pickaxe", () -> new HolyPickaxeItem());
	public static final RegistryObject<Item> HOLY_CASTING_HAMMER = REGISTRY.register("holy_casting_hammer", () -> new HolyHolyCastingHammerItem());
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> HEAVY_HOLY_ARMOR_HELMET = REGISTRY.register("heavy_holy_armor_helmet",
			() -> new HeavyHolyArmorItem.Helmet());
	public static final RegistryObject<Item> HEAVY_HOLY_ARMOR_CHESTPLATE = REGISTRY.register("heavy_holy_armor_chestplate",
			() -> new HeavyHolyArmorItem.Chestplate());
	public static final RegistryObject<Item> HEAVY_HOLY_ARMOR_LEGGINGS = REGISTRY.register("heavy_holy_armor_leggings",
			() -> new HeavyHolyArmorItem.Leggings());
	public static final RegistryObject<Item> HEAVY_HOLY_ARMOR_BOOTS = REGISTRY.register("heavy_holy_armor_boots",
			() -> new HeavyHolyArmorItem.Boots());
	public static final RegistryObject<Item> OBSIDIANED_HEVY_HOLY_ARMOR_HELMET = REGISTRY.register("obsidianed_hevy_holy_armor_helmet",
			() -> new ObsidianedHevyHolyArmorItem.Helmet());
	public static final RegistryObject<Item> OBSIDIANED_HEVY_HOLY_ARMOR_CHESTPLATE = REGISTRY.register("obsidianed_hevy_holy_armor_chestplate",
			() -> new ObsidianedHevyHolyArmorItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIANED_HEVY_HOLY_ARMOR_LEGGINGS = REGISTRY.register("obsidianed_hevy_holy_armor_leggings",
			() -> new ObsidianedHevyHolyArmorItem.Leggings());
	public static final RegistryObject<Item> OBSIDIANED_HEVY_HOLY_ARMOR_BOOTS = REGISTRY.register("obsidianed_hevy_holy_armor_boots",
			() -> new ObsidianedHevyHolyArmorItem.Boots());
	public static final RegistryObject<Item> MANA_NECKLACE = REGISTRY.register("mana_necklace", () -> new ManaNecklaceItem());
	public static final RegistryObject<Item> MANA_BELT = REGISTRY.register("mana_belt", () -> new ManaBeltItem());
	public static final RegistryObject<Item> ENDERITE_ARMOR_HELMET = REGISTRY.register("enderite_armor_helmet", () -> new EnderiteArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERITE_ARMOR_CHESTPLATE = REGISTRY.register("enderite_armor_chestplate",
			() -> new EnderiteArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERITE_ARMOR_LEGGINGS = REGISTRY.register("enderite_armor_leggings",
			() -> new EnderiteArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERITE_ARMOR_BOOTS = REGISTRY.register("enderite_armor_boots", () -> new EnderiteArmorItem.Boots());
	public static final RegistryObject<Item> MANA_CHOCOLATE = REGISTRY.register("mana_chocolate", () -> new ManaChocolateItem());
	public static final RegistryObject<Item> MANA_CHOCOLATE_CHUNK = REGISTRY.register("mana_chocolate_chunk", () -> new ManaChocolateChunkItem());
	public static final RegistryObject<Item> MANA_LOG = block(MaModBlocks.MANA_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MANA_WOOD = block(MaModBlocks.MANA_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MANA_PLANKS = block(MaModBlocks.MANA_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_LOG = block(MaModBlocks.FIRE_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_WOOD = block(MaModBlocks.FIRE_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_PLANKS = block(MaModBlocks.FIRE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_LOG = block(MaModBlocks.RUNE_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_WOOD = block(MaModBlocks.RUNE_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_PLANKS = block(MaModBlocks.RUNE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPT_LOG = block(MaModBlocks.CORRUPT_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPT_WOOD = block(MaModBlocks.CORRUPT_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPT_PLANKS = block(MaModBlocks.CORRUPT_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MANA_PLANKS_SLAB = block(MaModBlocks.MANA_PLANKS_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MANA_STAIRS = block(MaModBlocks.MANA_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_SLAB = block(MaModBlocks.FIRE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FIRE_STAIRS = block(MaModBlocks.FIRE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_SLAB = block(MaModBlocks.RUNE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_STAIRS = block(MaModBlocks.RUNE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPT_SLAB = block(MaModBlocks.CORRUPT_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPT_STAIRS = block(MaModBlocks.CORRUPT_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_STONE = block(MaModBlocks.RUNE_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_STONE_STAIRS = block(MaModBlocks.RUNE_STONE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_STONE_SLAB = block(MaModBlocks.RUNE_STONE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_COBBLESTONE = block(MaModBlocks.RUNE_COBBLESTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_COBBLE_STAIRS = block(MaModBlocks.RUNE_COBBLE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_COBBLE_SLAB = block(MaModBlocks.RUNE_COBBLE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_STONE_BRICK = block(MaModBlocks.RUNE_STONE_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_BRICK_STAIRS = block(MaModBlocks.RUNE_BRICK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_BRICK_SLAB = block(MaModBlocks.RUNE_BRICK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CUTTED_RUNE_STONE = block(MaModBlocks.CUTTED_RUNE_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_COBBLE_WALL = block(MaModBlocks.RUNE_COBBLE_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_BRICK_WALL = block(MaModBlocks.RUNE_BRICK_WALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_LAPIS_LAZULI_ORE = block(MaModBlocks.RUNE_LAPIS_LAZULI_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_REDSTONE_ORE = block(MaModBlocks.RUNE_REDSTONE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_IRON_ORE = block(MaModBlocks.RUNE_IRON_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_GOLD_ORE = block(MaModBlocks.RUNE_GOLD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_DIAMOND_ORE = block(MaModBlocks.RUNE_DIAMOND_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_EMERALD_ORE = block(MaModBlocks.RUNE_EMERALD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_COPPER_ORE = block(MaModBlocks.RUNE_COPPER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUNE_HOLLOW_ORE = block(MaModBlocks.RUNE_HOLLOW_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MANA_LEAVES = block(MaModBlocks.MANA_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FIRE_LEAVES = block(MaModBlocks.FIRE_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RUNE_LEAVES = block(MaModBlocks.RUNE_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CORRUPT_LEAVES = block(MaModBlocks.CORRUPT_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> INCOMPLETE_RUNE_WORLD_BEACON = block(MaModBlocks.INCOMPLETE_RUNE_WORLD_BEACON,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RUNE_WORLD_BEACON = block(MaModBlocks.RUNE_WORLD_BEACON, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MANA_DOOR = doubleBlock(MaModBlocks.MANA_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> RUNE_DOOR = doubleBlock(MaModBlocks.RUNE_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> FIRE_DOOR = doubleBlock(MaModBlocks.FIRE_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CORRUPT_DOOR = doubleBlock(MaModBlocks.CORRUPT_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MANA_TRAPDOOR = block(MaModBlocks.MANA_TRAPDOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> RUNE_TRAPDOOR = block(MaModBlocks.RUNE_TRAPDOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> FIRE_TRAPDOOR = block(MaModBlocks.FIRE_TRAPDOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CORRUPT_TRAPDOOR = block(MaModBlocks.CORRUPT_TRAPDOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MANA_FENCE_GATE = block(MaModBlocks.MANA_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> RUNE_FENCE_GATE = block(MaModBlocks.RUNE_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> FIRE_FENCE_GATE = block(MaModBlocks.FIRE_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CORRUPT_FENCE_GATE = block(MaModBlocks.CORRUPT_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> RUNE_BEACON_CORE = REGISTRY.register("rune_beacon_core", () -> new RuneBeaconCoreItem());
	public static final RegistryObject<Item> RAW_HOLLOW_ORE = REGISTRY.register("raw_hollow_ore", () -> new RawHollowOreItem());
	public static final RegistryObject<Item> VT_7 = REGISTRY.register("vt_7", () -> new VTE7Item());
	public static final RegistryObject<Item> MURASAMA_PROJECTILE = REGISTRY.register("murasama_projectile", () -> new MurasamaProjectileItem());
	public static final RegistryObject<Item> MURASAMA_SHOT = REGISTRY.register("murasama_shot", () -> new MurasamaShotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
