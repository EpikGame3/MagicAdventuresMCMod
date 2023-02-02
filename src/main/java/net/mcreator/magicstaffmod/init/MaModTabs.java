
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MaModTabs {
	public static CreativeModeTab TAB_MAGIC_WEAPONS;
	public static CreativeModeTab TAB_MAGIC_RESOURSES;
	public static CreativeModeTab TAB_MAGIC_MELEE_WEAPONS;
	public static CreativeModeTab TAB_MAGIC_ARMOR;

	public static void load() {
		TAB_MAGIC_WEAPONS = new CreativeModeTab("tabmagic_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MaModItems.ICE_STAFF.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MAGIC_RESOURSES = new CreativeModeTab("tabmagic_resourses") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MaModItems.MANA_CRYSTAL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MAGIC_MELEE_WEAPONS = new CreativeModeTab("tabmagic_melee_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MaModItems.HOLY_HOLY_CASTING_HAMMER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MAGIC_ARMOR = new CreativeModeTab("tabmagic_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MaModItems.MANA_NECKLACE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
