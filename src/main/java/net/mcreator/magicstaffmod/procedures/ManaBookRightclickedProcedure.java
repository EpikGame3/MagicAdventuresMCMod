package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.mcreator.magicstaffmod.network.MaModVariables;

public class ManaBookRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(5, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			double _setval = (entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MaModVariables.PlayerVariables())).mana + 30;
			entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.mana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
