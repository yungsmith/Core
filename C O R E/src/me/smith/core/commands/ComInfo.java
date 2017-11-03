package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;
import net.md_5.bungee.api.ChatColor;

public class ComInfo implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("info")){
			Player staff = (Player) sender;
			if (!staff.hasPermission("core.info")){
				staff.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().NoPerms());
				return true;
			}
			if (args.length == 0){
				staff.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().invalidargs());
				return true;
			}
			Player target = Bukkit.getPlayer(args[0]);
			if (target == null){
				staff.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().pnotfound());
				return true;
			}
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m-----------------------------------"));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fViewing info for &6&l" + target.getName()));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fIP: &6&l " + target.getAddress()));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fUUID: &6&l " + target.getUniqueId()));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fDisguised: &6&lFALSE"));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fVanished: &6&lFALSE"));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&m-----------------------------------"));

		}
		
		return false;
	}

}
