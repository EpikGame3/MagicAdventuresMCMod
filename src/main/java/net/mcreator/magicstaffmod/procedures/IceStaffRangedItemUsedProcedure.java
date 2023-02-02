package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magicstaffmod.network.MaModVariables;

public class IceStaffRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaModVariables.PlayerVariables())).mana >= 5) {
			{
				double _setval = (entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MaModVariables.PlayerVariables())).mana - 5;
				entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
