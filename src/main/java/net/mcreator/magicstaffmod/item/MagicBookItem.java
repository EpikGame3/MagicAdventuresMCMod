
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.magicstaffmod.init.MaModTabs;

public class MagicBookItem extends Item {
	public MagicBookItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_RESOURSES).stacksTo(1).rarity(Rarity.COMMON));
	}
}
