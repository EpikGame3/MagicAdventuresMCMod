package net.mcreator.magicstaffmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.magicstaffmod.network.MaModVariables;

public class StoneStaffEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaModVariables.PlayerVariables())).mana >= 10) {
			{
				double _setval = (entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MaModVariables.PlayerVariables())).mana - 10;
				entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 1, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0, (false), (false)));
		}
	}
}
