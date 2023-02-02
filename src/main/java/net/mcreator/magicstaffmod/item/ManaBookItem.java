
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.magicstaffmod.procedures.ManaBookRightclickedProcedure;
import net.mcreator.magicstaffmod.init.MaModTabs;

public class ManaBookItem extends Item {
	public ManaBookItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_RESOURSES).durability(2900).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ManaBookRightclickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
