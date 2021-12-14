package net.mcreator.thirstbarmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.thirstbarmod.ThirstBarModModVariables;
import net.mcreator.thirstbarmod.ThirstBarModMod;

import java.util.Map;

public class Icon1ProcedureProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ThirstBarModMod.LOGGER.warn("Failed to load dependency entity for procedure Icon1Procedure!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.isInWater()) && (((entity.getCapability(ThirstBarModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ThirstBarModModVariables.PlayerVariables())).water_amount) > 0))) {
			return (false);
		}
		return (true);
	}
}
