package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;
import net.md_5.bungee.api.ChatColor;

public class ComHeal implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("heal")){
			Player staff = (Player) sender;
			if (!staff.hasPermission("core.heal")){
				staff.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().NoPerms());
				return true;
			}
			if (args.length == 0){
				staff.setHealth(20);
				staff.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have been healed"));
				return true;
			}
			Player target = Bukkit.getPlayer(args[0]);
			if (target == null){
				staff.sendMessage(Core.getInstance().getPrefix() + Core.getInstance().pnotfound());
				return true;
			}
			target.setHealth(20);
			target.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have been &c&lHEALED"));
			staff.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "You have successfully healed &6&l" + target.getName()));
		}
		
		
		return false;
	}

}
