
package net.mcreator.magicstaffmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.magicstaffmod.init.MaModItems;

import java.util.List;
import java.util.Collections;

public class DeepslateManaOreBlock extends Block {
	public DeepslateManaOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE).strength(3f, 30f).lightLevel(s -> 3));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MaModItems.BROCKEN_MANA_CRYSTAL.get(), 2));
	}
}
