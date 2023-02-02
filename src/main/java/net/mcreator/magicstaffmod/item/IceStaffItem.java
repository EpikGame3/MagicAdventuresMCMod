
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

import net.mcreator.magicstaffmod.procedures.IceStaffRangedItemUsedProcedure;
import net.mcreator.magicstaffmod.procedures.IceStaffCanUseRangedItemProcedure;
import net.mcreator.magicstaffmod.init.MaModTabs;
import net.mcreator.magicstaffmod.entity.IceStaffEntity;

public class IceStaffItem extends Item {
	public IceStaffItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_WEAPONS).durability(100));
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
	public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
		Level world = entityLiving.level;
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (IceStaffCanUseRangedItemProcedure.execute(entity)) {
				IceStaffEntity entityarrow = IceStaffEntity.shoot(world, entity, world.getRandom(), 1f, 2, 3);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				IceStaffRangedItemUsedProcedure.execute(entity);
				entity.releaseUsingItem();
			}
		}
	}
}
