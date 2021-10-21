
package net.mcreator.thirstbarmod.gui.overlay;

import net.mcreator.thirstbarmod.procedures.EmptyBarOverlayDisplayOverlayIngameProcedure;

@Mod.EventBusSubscriber
public class WaterIcon7Overlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (EmptyBarOverlayDisplayOverlayIngameProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				if (EmptyBarOverlayDisplayOverlayIngameProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("thirst_bar_mod:textures/watericon.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 27, posY + 72, 0, 0, 8, 8, 8, 8);
				}
			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
