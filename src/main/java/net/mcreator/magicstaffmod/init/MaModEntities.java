
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.magicstaffmod.entity.WaterStaffEntity;
import net.mcreator.magicstaffmod.entity.WaterBookEntity;
import net.mcreator.magicstaffmod.entity.TrueGungnirEntity;
import net.mcreator.magicstaffmod.entity.StoneStaffEntity;
import net.mcreator.magicstaffmod.entity.SoulStaffEntity;
import net.mcreator.magicstaffmod.entity.SoulBookEntity;
import net.mcreator.magicstaffmod.entity.ObsidianStaffEntity;
import net.mcreator.magicstaffmod.entity.MurasamaShotEntity;
import net.mcreator.magicstaffmod.entity.IceStaffEntity;
import net.mcreator.magicstaffmod.entity.IceBookEntity;
import net.mcreator.magicstaffmod.entity.HolyBowUpEntity;
import net.mcreator.magicstaffmod.entity.HolyBowEntity;
import net.mcreator.magicstaffmod.entity.FireStaffEntity;
import net.mcreator.magicstaffmod.entity.FireBookEntity;
import net.mcreator.magicstaffmod.MaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MaMod.MODID);
	public static final RegistryObject<EntityType<StoneStaffEntity>> STONE_STAFF = register("projectile_stone_staff",
			EntityType.Builder.<StoneStaffEntity>of(StoneStaffEntity::new, MobCategory.MISC).setCustomClientFactory(StoneStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireStaffEntity>> FIRE_STAFF = register("projectile_fire_staff",
			EntityType.Builder.<FireStaffEntity>of(FireStaffEntity::new, MobCategory.MISC).setCustomClientFactory(FireStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireBookEntity>> FIRE_BOOK = register("projectile_fire_book",
			EntityType.Builder.<FireBookEntity>of(FireBookEntity::new, MobCategory.MISC).setCustomClientFactory(FireBookEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterStaffEntity>> WATER_STAFF = register("projectile_water_staff",
			EntityType.Builder.<WaterStaffEntity>of(WaterStaffEntity::new, MobCategory.MISC).setCustomClientFactory(WaterStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterBookEntity>> WATER_BOOK = register("projectile_water_book",
			EntityType.Builder.<WaterBookEntity>of(WaterBookEntity::new, MobCategory.MISC).setCustomClientFactory(WaterBookEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceStaffEntity>> ICE_STAFF = register("projectile_ice_staff",
			EntityType.Builder.<IceStaffEntity>of(IceStaffEntity::new, MobCategory.MISC).setCustomClientFactory(IceStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBookEntity>> ICE_BOOK = register("projectile_ice_book",
			EntityType.Builder.<IceBookEntity>of(IceBookEntity::new, MobCategory.MISC).setCustomClientFactory(IceBookEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ObsidianStaffEntity>> OBSIDIAN_STAFF = register("projectile_obsidian_staff",
			EntityType.Builder.<ObsidianStaffEntity>of(ObsidianStaffEntity::new, MobCategory.MISC).setCustomClientFactory(ObsidianStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoulStaffEntity>> SOUL_STAFF = register("projectile_soul_staff",
			EntityType.Builder.<SoulStaffEntity>of(SoulStaffEntity::new, MobCategory.MISC).setCustomClientFactory(SoulStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoulBookEntity>> SOUL_BOOK = register("projectile_soul_book",
			EntityType.Builder.<SoulBookEntity>of(SoulBookEntity::new, MobCategory.MISC).setCustomClientFactory(SoulBookEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HolyBowEntity>> HOLY_BOW = register("projectile_holy_bow",
			EntityType.Builder.<HolyBowEntity>of(HolyBowEntity::new, MobCategory.MISC).setCustomClientFactory(HolyBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HolyBowUpEntity>> HOLY_BOW_UP = register("projectile_holy_bow_up",
			EntityType.Builder.<HolyBowUpEntity>of(HolyBowUpEntity::new, MobCategory.MISC).setCustomClientFactory(HolyBowUpEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TrueGungnirEntity>> TRUE_GUNGNIR = register("projectile_true_gungnir",
			EntityType.Builder.<TrueGungnirEntity>of(TrueGungnirEntity::new, MobCategory.MISC).setCustomClientFactory(TrueGungnirEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MurasamaShotEntity>> MURASAMA_SHOT = register("projectile_murasama_shot",
			EntityType.Builder.<MurasamaShotEntity>of(MurasamaShotEntity::new, MobCategory.MISC).setCustomClientFactory(MurasamaShotEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
