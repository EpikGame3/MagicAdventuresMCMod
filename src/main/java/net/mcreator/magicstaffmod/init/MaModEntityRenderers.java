
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicstaffmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MaModEntities.STONE_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.FIRE_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.FIRE_BOOK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.WATER_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.WATER_BOOK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.ICE_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.ICE_BOOK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.OBSIDIAN_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.SOUL_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.SOUL_BOOK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.HOLY_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.HOLY_BOW_UP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.SKULK_BOOK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MaModEntities.TRUE_GUNGNIR.get(), ThrownItemRenderer::new);
	}
}
