
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.magicstaffmod.init.MaModTabs;
import net.mcreator.magicstaffmod.init.MaModItems;

public class EnderiteSwordItem extends SwordItem {
	public EnderiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3021;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
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
		}, 3, -2f, new Item.Properties().tab(MaModTabs.TAB_MAGIC_MELEE_WEAPONS));
	}
}
