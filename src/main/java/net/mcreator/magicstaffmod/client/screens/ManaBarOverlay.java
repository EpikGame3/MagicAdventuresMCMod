
package net.mcreator.magicstaffmod.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.magicstaffmod.procedures.ManaBarOverloadProcedure;
import net.mcreator.magicstaffmod.procedures.ManaBar8Procedure;
import net.mcreator.magicstaffmod.procedures.ManaBar7Procedure;
import net.mcreator.magicstaffmod.procedures.ManaBar6Procedure;
import net.mcreator.magicstaffmod.procedures.ManaBar5Procedure;
import net.mcreator.magicstaffmod.procedures.ManaBar4Procedure;
import net.mcreator.magicstaffmod.procedures.ManaBar3Procedure;
import net.mcreator.magicstaffmod.procedures.ManaBar2Procedure;
import net.mcreator.magicstaffmod.procedures.ManaBar1Procedure;
import net.mcreator.magicstaffmod.network.MaModVariables;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaBarOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level _world = null;
		double _x = 0;
		double _y = 0;
		double _z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			_world = entity.level;
			_x = entity.getX();
			_y = entity.getY();
			_z = entity.getZ();
		}
		Level world = _world;
		double x = _x;
		double y = _y;
		double z = _z;
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
				GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/manabar.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 64, posY + -37, 0, 0, 128, 128, 128, 128);

			if (ManaBar7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 149, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBar1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 66, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBar5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 122, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBar3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBar8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 165, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBar2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 82, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBar6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 138, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBar4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_frag_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 110, posY + 51, 0, 0, 16, 16, 16, 16);
			}
			if (ManaBarOverloadProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("ma:textures/screens/mana_bar_overload.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 183, posY + 53, 0, 0, 16, 16, 16, 16);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(),
					"" + ((entity.getCapability(MaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MaModVariables.PlayerVariables())).mana)
							+ "",
					posX + 70, posY + 44, -13408513);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
