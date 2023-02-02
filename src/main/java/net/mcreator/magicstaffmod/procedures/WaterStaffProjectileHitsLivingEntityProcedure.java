package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.entity.Entity;

public class WaterStaffProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
	}
}
