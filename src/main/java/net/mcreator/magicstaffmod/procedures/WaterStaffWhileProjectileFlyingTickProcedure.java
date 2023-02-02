package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.magicstaffmod.init.MaModParticleTypes;

public class WaterStaffWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (MaModParticleTypes.WATER_SPLASH.get()), x, y, z, 0, 1, 0);
	}
}
