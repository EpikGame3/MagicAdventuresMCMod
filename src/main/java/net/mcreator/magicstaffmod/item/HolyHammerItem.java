
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.magicstaffmod.init.MaModTabs;

public class HolyHammerItem extends PickaxeItem {
	public HolyHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 3823;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.5f, new Item.Properties().tab(MaModTabs.TAB_MAGIC_MELEE_WEAPONS));
	}
}
