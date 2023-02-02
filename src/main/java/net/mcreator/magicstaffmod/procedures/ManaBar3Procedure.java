package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magicstaffmod.network.MaModVariables;

public class ManaBar3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaModVariables.PlayerVariables())).mana >= 75) {
			return true;
		}
		return false;
	}
}
