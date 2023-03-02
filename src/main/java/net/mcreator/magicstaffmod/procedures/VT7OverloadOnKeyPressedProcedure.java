package net.mcreator.magicstaffmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.magicstaffmod.network.MaModVariables;
import net.mcreator.magicstaffmod.MaMod;

public class VT7OverloadOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaModVariables.PlayerVariables())).mana >= 100
				&& (entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MaModVariables.PlayerVariables())).vt7Overload != true) {
			{
				boolean _setval = true;
				entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.vt7Overload = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MaModVariables.PlayerVariables())).mana - 100;
				entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")),
							SoundSource.VOICE, 1, 1, false);
				}
			}
			MaMod.queueServerWork(70, () -> {
				if ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MaModVariables.PlayerVariables())).vt7Overload == true) {
					{
						boolean _setval = false;
						entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.vt7Overload = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			});
		}
	}
}
