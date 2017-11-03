package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;
import me.smith.core.utils.PlayerUtils;

public class ComPing implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		
		if (cmd.getName().equalsIgnoreCase("ping")){
			Player p = (Player) sender;
			if (args.length == 0){
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&fYour ping is &6&l" + PlayerUtils.getPing(p)));
				return true;
			}
			Player target = Bukkit.getPlayer(args[0]);
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', Core.getInstance().getPrefix() + "&c" + target.getName() + "'s &fping is &6&l" + PlayerUtils.getPing(target)));
		}
		
		
		return false;
	}

}
