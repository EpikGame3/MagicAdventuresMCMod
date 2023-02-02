
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.magicstaffmod.procedures.ObsidianBookRightclickedProcedure;
import net.mcreator.magicstaffmod.procedures.ObsidianBookItemInHandTickProcedure;
import net.mcreator.magicstaffmod.init.MaModTabs;

public class ObsidianBookItem extends Item {
	public ObsidianBookItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_WEAPONS).durability(2900).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ObsidianBookRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			ObsidianBookItemInHandTickProcedure.execute(entity);
	}
}
