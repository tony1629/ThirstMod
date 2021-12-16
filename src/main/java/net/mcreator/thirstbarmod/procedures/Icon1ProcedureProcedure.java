package net.mcreator.thirstbarmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.thirstbarmod.ThirstBarModMod;

import java.util.Map;
import java.util.HashMap;

public class Icon1ProcedureProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ThirstBarModMod.LOGGER.warn("Failed to load dependency entity for procedure Icon1Procedure!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getDouble("ThirstBarTimer")) == 0)) {
			return (false);
		}
		if (((entity.getPersistentData().getDouble("ThirstBarTimer")) == 0)) {
			entity.getPersistentData().putDouble("ThirstBarTimer", 40);
		} else {
			entity.getPersistentData().putDouble("ThirstBarTimer", ((entity.getPersistentData().getDouble("ThirstBarTimer")) - 1));
		}
		return (true);
	}
}
