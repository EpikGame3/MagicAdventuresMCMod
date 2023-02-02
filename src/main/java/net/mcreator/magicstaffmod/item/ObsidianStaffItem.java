
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.magicstaffmod.procedures.SoulStaffRangedItemUsedProcedure;
import net.mcreator.magicstaffmod.procedures.ObsidianStaffEntitySwingsItemProcedure;
import net.mcreator.magicstaffmod.procedures.ObsidianStaffCanUseRangedItemProcedure;
import net.mcreator.magicstaffmod.init.MaModTabs;
import net.mcreator.magicstaffmod.entity.ObsidianStaffEntity;

public class ObsidianStaffItem extends Item {
	public ObsidianStaffItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_WEAPONS).durability(5412));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		ObsidianStaffEntitySwingsItemProcedure.execute(entity);
		return retval;
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (ObsidianStaffCanUseRangedItemProcedure.execute(entity)) {
				ObsidianStaffEntity entityarrow = ObsidianStaffEntity.shoot(world, entity, world.getRandom(), 1f, 10, 4);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				SoulStaffRangedItemUsedProcedure.execute(entity);
			}
		}
	}
}
