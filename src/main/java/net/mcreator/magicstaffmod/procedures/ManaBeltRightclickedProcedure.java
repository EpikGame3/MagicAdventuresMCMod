package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.magicstaffmod.network.MaModVariables;

public class ManaBeltRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).shrink(1);
		{
			double _setval = (entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MaModVariables.PlayerVariables())).mana + 150;
			entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.mana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
