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
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ThirstBarModMod.LOGGER.warn("Failed to load dependency x for procedure EmptyBarOverlayDisplayOverlayIngame!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ThirstBarModMod.LOGGER.warn("Failed to load dependency y for procedure EmptyBarOverlayDisplayOverlayIngame!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ThirstBarModMod.LOGGER.warn("Failed to load dependency z for procedure EmptyBarOverlayDisplayOverlayIngame!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ThirstBarModMod.LOGGER.warn("Failed to load dependency world for procedure EmptyBarOverlayDisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.WATER)
				|| (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) > 2))) {
			return (false);
		}
		return (true);
	}
}
