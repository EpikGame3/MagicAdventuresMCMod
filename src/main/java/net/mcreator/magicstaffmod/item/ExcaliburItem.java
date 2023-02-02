
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.magicstaffmod.procedures.ExcaliburLivingEntityIsHitWithToolProcedure;
import net.mcreator.magicstaffmod.init.MaModTabs;
import net.mcreator.magicstaffmod.init.MaModItems;

public class ExcaliburItem extends SwordItem {
	public ExcaliburItem() {
		super(new Tier() {
			public int getUses() {
				return 2411;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaModItems.HOLY_GARD.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(MaModTabs.TAB_MAGIC_MELEE_WEAPONS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ExcaliburLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
