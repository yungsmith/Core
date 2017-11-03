package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class ComList implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("list")){
			Player p = (Player) sender;
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m-----------------------------------"));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eThere are currently &6&l" + Bukkit.getOnlinePlayers().length + " &eplayers online."));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m-----------------------------------"));
		}
		
		return false;
	}

}
