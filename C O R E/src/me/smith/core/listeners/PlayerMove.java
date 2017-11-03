package me.smith.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import me.smith.core.Core;

public class PlayerMove implements Listener{
	
	@EventHandler
	public void onMove(PlayerMoveEvent e){
		Player target = e.getPlayer();
		if (Core.getInstance().frozen.contains(target)){
			e.setTo(e.getFrom());
			target.sendMessage(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have been frozen. You have 3 minutes to join &6&lts.hi.eu"));
			target.sendMessage(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&c&lREMINDER: &fLogging out will result in a permanent ban."));
		}
	}

}
