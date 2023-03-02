package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magicstaffmod.network.MaModVariables;

public class VTE7MakeItemGlowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MaModVariables.PlayerVariables())).vt7Overload == true) {
			return true;
		}
		return false;
	}
}
