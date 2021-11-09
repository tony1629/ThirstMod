package net.mcreator.thirstbarmod.procedures;

import net.mcreator.thirstbarmod.ThirstBarModMod;

import java.util.Map;

public class EmptyBarOverlayDisplayOverlayIngameProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ThirstBarModMod.LOGGER.warn("Failed to load dependency entity for procedure EmptyBarOverlayDisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isInWater())) {
			return (false);
		}
		return (true);
	}
}
