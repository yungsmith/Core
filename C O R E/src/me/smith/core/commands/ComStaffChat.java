package me.smith.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;

public class ComStaffChat implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("sc")){
			Player p = (Player) sender;
			if (!p.hasPermission("core.staffchat")){
				p.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().NoPerms());
				return true;
			}
			if (Core.getInstance().staffchat.contains(p)){
				Core.getInstance().staffchat.remove(p);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have &C&lDISABLED &fstaffchat."));
				return true;
			}
			Core.getInstance().staffchat.add(p);
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have &a&lENABLED &fstaffchat."));
		}
		
		
		return false;
		
	}

}
