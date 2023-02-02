
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.magicstaffmod.block.entity.RuneWorldBeaconBlockEntity;
import net.mcreator.magicstaffmod.MaMod;

public class MaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> RUNE_WORLD_BEACON = register("rune_world_beacon", MaModBlocks.RUNE_WORLD_BEACON,
			RuneWorldBeaconBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
