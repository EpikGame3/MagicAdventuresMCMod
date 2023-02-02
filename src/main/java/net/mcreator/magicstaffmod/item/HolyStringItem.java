
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.magicstaffmod.init.MaModTabs;

public class HolyStringItem extends Item {
	public HolyStringItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_RESOURSES).stacksTo(64).rarity(Rarity.COMMON));
	}
}
