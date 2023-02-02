
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.magicstaffmod.MaMod;

public class MaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MaMod.MODID);
	public static final RegistryObject<SimpleParticleType> WATER_SPLASH = REGISTRY.register("water_splash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> FIRE_SPLASH = REGISTRY.register("fire_splash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> OBSIDIAN_SPLASH = REGISTRY.register("obsidian_splash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SKULK_SPLASH = REGISTRY.register("skulk_splash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> ICE_SPLASH = REGISTRY.register("ice_splash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SOUL_SPLASH = REGISTRY.register("soul_splash", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> STONE_SPLASH = REGISTRY.register("stone_splash", () -> new SimpleParticleType(true));
}
