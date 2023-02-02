
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.magicstaffmod.procedures.StoneBookRightclickedProcedure;
import net.mcreator.magicstaffmod.procedures.StoneBookItemInHandTickProcedure;
import net.mcreator.magicstaffmod.init.MaModTabs;

public class StoneBookItem extends Item {
	public StoneBookItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_WEAPONS).durability(2900).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		StoneBookRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			StoneBookItemInHandTickProcedure.execute(entity);
	}
}
