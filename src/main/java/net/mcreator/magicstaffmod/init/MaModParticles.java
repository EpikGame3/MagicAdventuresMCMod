
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.magicstaffmod.client.particle.WaterSplashParticle;
import net.mcreator.magicstaffmod.client.particle.StoneSplashParticle;
import net.mcreator.magicstaffmod.client.particle.SoulSplashParticle;
import net.mcreator.magicstaffmod.client.particle.SkulkSplashParticle;
import net.mcreator.magicstaffmod.client.particle.ObsidianSplashParticle;
import net.mcreator.magicstaffmod.client.particle.IceSplashParticle;
import net.mcreator.magicstaffmod.client.particle.FireSplashParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(MaModParticleTypes.WATER_SPLASH.get(), WaterSplashParticle::provider);
		event.register(MaModParticleTypes.FIRE_SPLASH.get(), FireSplashParticle::provider);
		event.register(MaModParticleTypes.OBSIDIAN_SPLASH.get(), ObsidianSplashParticle::provider);
		event.register(MaModParticleTypes.SKULK_SPLASH.get(), SkulkSplashParticle::provider);
		event.register(MaModParticleTypes.ICE_SPLASH.get(), IceSplashParticle::provider);
		event.register(MaModParticleTypes.SOUL_SPLASH.get(), SoulSplashParticle::provider);
		event.register(MaModParticleTypes.STONE_SPLASH.get(), StoneSplashParticle::provider);
	}
}
