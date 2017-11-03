package me.smith.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerJoin implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		e.setJoinMessage(null);
		Player player = e.getPlayer();
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m----------------------------------------------------------"));
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eWelcome &c&l" + player.getName() + " &eto the &c&lCore Network!"));
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bTwitter: &atwitter.com/hi"));
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bWebsite: &awww.hello.com"));
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bStore: &astore.hello.com"));
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bDiscord: &adiscord.me/hello"));
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m----------------------------------------------------------"));
		
		if (player.getName().equalsIgnoreCase("yungSMITH")){
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");
			player.sendMessage(ChatColor.RED + "This server is using ur core :O");

		}
	}

}
