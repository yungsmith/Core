package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;

public class ComClearChat implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("cc")){
			Player p = (Player) sender;
			if (!p.hasPermission("core.clearchat")){
				p.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().NoPerms());
				return true;
			}
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(" ");
			Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fThe chat has been cleared by &6&l" + p.getName()));

		}
		
		return false;
	}

}
