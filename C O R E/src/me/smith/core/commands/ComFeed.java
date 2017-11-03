package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;
import net.md_5.bungee.api.ChatColor;

public class ComFeed implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("feed")){
			Player staff = (Player) sender;
			if (!staff.hasPermission("core.feed")){
				staff.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().NoPerms());
				return true;
			}
			if (args.length == 0){
				staff.setFoodLevel(20);
				staff.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have been fed."));
				return true;
			}
			Player target = Bukkit.getPlayer(args[0]);
			if (target == null){
				staff.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().pnotfound());
				return true;
			}
			target.setFoodLevel(20);
			staff.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have successfully fed &6&l" + target.getName()));
			target.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have been fed."));
		}
		
		return false;
	}

}
