package me.smith.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.smith.core.Core;

public class ComVanish implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args){
		if (cmd.getName().equalsIgnoreCase("vanish")){
		Player staff = (Player) sender;
		if (!staff.hasPermission("core.vasnish")){
			staff.sendMessage(Core.getInstance().NoPerms());
			return true;
		}
		if (Core.getInstance().vanished.contains(staff)){
			Core.getInstance().vanished.remove(staff);
			staff.sendMessage(Core.getInstance().getPrefix() + "§fYou are no longer §c§lVANISHED");
			for (Player online : Bukkit.getOnlinePlayers()){ 
				online.showPlayer(staff);
			}
			return true;
		}
		for (Player online : Bukkit.getOnlinePlayers()){ 
			online.hidePlayer(staff);
		}
		staff.sendMessage(Core.getInstance().getPrefix() + "§fYou are now §c§lVANISHED");
		Core.getInstance().vanished.add(staff);
	}
		return false;
	}
}
