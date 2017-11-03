package me.smith.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComCore implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("core")){
			Player p = (Player) sender;
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aThe core was coded by yungSMITH at 1/10/17"));
		}
		
		
		return false;
	}

}
