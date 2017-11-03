package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;

public class ComScreenshare implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("ss")){
			Player staff = (Player) sender;
			if (!staff.hasPermission("core.freeze")){
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
			if (Core.getInstance().frozen.contains(target)){
				Core.getInstance().frozen.remove(target);
				target.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have been unfrozen."));
				staff.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fSuccessfully unfroze &c&l" + target.getName()));
				return true;
			}
			Core.getInstance().frozen.add(target);
			staff.sendMessage(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fSuccessfully froze &c&l" + target.getName()));
			target.sendMessage(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYou have been frozen. You have 3 minutes to join &6&lts.hi.eu"));
			target.sendMessage(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&c&lREMINDER: &fLogging out will result in a permanent ban."));
		}
		
		return false;
	}
}
