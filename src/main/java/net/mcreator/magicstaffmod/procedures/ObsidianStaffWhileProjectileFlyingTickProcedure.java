package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.magicstaffmod.init.MaModParticleTypes;

public class ObsidianStaffWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (MaModParticleTypes.OBSIDIAN_SPLASH.get()), x, y, z, 0, 1, 0);
	}
}
