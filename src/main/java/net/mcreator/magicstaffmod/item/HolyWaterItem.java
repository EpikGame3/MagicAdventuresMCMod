
package net.mcreator.magicstaffmod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.magicstaffmod.init.MaModTabs;

public class HolyWaterItem extends Item {
	public HolyWaterItem() {
		super(new Item.Properties().tab(MaModTabs.TAB_MAGIC_RESOURSES).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
