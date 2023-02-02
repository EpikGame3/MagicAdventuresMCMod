
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.magicstaffmod.init.MaModTabs;
import net.mcreator.magicstaffmod.init.MaModItems;

public class EnderiteHoeItem extends HoeItem {
	public EnderiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3021;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MaModItems.ENDERITE_CRYSTAL.get()));
			}
		}, 0, -2.4f, new Item.Properties().tab(MaModTabs.TAB_MAGIC_MELEE_WEAPONS));
	}
}
