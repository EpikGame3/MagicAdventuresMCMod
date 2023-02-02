
package net.mcreator.magicstaffmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.magicstaffmod.init.MaModTabs;

public class ObsidianPlateItem extends Item {
	public ObsidianPlateItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_RESOURSES).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
