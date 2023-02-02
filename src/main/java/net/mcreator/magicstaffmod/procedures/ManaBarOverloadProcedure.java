package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magicstaffmod.network.MaModVariables;

public class ManaBarOverloadProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaModVariables.PlayerVariables())).mana > 200) {
			return true;
		}
		return false;
	}
}
