package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.entity.Entity;

public class FireLogEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(3);
	}
}
