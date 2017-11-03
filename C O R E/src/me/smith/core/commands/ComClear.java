package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;
import net.md_5.bungee.api.ChatColor;

public class ComClear implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("ci")){
			Player staff = (Player) sender;
			if (!staff.hasPermission("core.clear")){
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
			target.getInventory().clear();
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have cleared &6&l" + target.getName() + "'s &finventory!"));
			target.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYour inventory has been cleared."));
		}
		
		return false;
	}

}
