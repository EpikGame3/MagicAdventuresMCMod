
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.magicstaffmod.MaMod;

public class MaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MaMod.MODID);
	public static final RegistryObject<SoundEvent> MAXWELL_BREAK = REGISTRY.register("maxwell_break",
			() -> new SoundEvent(new ResourceLocation("ma", "maxwell_break")));
	public static final RegistryObject<SoundEvent> MAXWELL_PLACED = REGISTRY.register("maxwell_placed",
			() -> new SoundEvent(new ResourceLocation("ma", "maxwell_placed")));
	public static final RegistryObject<SoundEvent> THE_ONLY_THING_I_KNOW_FOR_REAL = REGISTRY.register("the_only_thing_i_know_for_real",
			() -> new SoundEvent(new ResourceLocation("ma", "the_only_thing_i_know_for_real")));
}
