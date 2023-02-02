
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MaModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.POTION), new ItemStack(Items.EMERALD, 5),
					new ItemStack(MaModItems.HOLY_WATER.get()), 10, 5, 0.5f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.POTION), new ItemStack(MaModItems.MANA_CRYSTAL.get(), 2),
					new ItemStack(MaModItems.HOLY_WATER.get()), 15, 5, 0.5f));
		}
	}
}
