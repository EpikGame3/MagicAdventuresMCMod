
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

import net.mcreator.magicstaffmod.procedures.FireStaffRangedItemUsedProcedure;
import net.mcreator.magicstaffmod.procedures.FireStaffCanUseRangedItemProcedure;
import net.mcreator.magicstaffmod.init.MaModTabs;
import net.mcreator.magicstaffmod.entity.FireStaffEntity;

public class FireStaffItem extends Item {
	public FireStaffItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_WEAPONS).durability(3412));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
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
			if (FireStaffCanUseRangedItemProcedure.execute(entity)) {
				FireStaffEntity entityarrow = FireStaffEntity.shoot(world, entity, world.getRandom(), 1f, 5, 4);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				FireStaffRangedItemUsedProcedure.execute(entity);
			}
		}
	}
}
