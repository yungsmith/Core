package me.smith.core.utils;

import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PlayerUtils {
	
	public static int getPing(Player player) {
		return (((CraftPlayer) player).getHandle().ping > 20 ? ((CraftPlayer) player).getHandle().ping - 20 : ((CraftPlayer) player).getHandle().ping);
	}

}
