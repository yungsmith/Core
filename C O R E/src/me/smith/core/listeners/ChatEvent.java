package me.smith.core.listeners;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.smith.core.Core;
import net.md_5.bungee.api.ChatColor;

public class ChatEvent implements Listener{
	
	private String getTime()
	  {
	    Date d = new Date();
	    DateFormat df = new SimpleDateFormat("HH:mm:ss");
	    df.setTimeZone(TimeZone.getTimeZone("UTC"));
	    
	    return df.format(d);
	  }
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e){
		String msg = e.getMessage();
		Player p = e.getPlayer();
		
		if (msg.contains("fuck")){
			e.setCancelled(true);
			p.sendMessage(Core.getInstance().getPrefix() + ChatColor.WHITE + "Please do " + ChatColor.RED + "NOT" + ChatColor.WHITE + " swear.");
			}
		if (Core.getInstance().staffchat.contains(p)){
			e.setCancelled(true);
			for (Player online : Bukkit.getOnlinePlayers()){
				if (online.hasPermission("staffchat.see")){
					online.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&l[SC] [" + getTime() + "] [FFA] &e" + p.getName() + ": &f" +  e.getMessage()));
				}
			}
		}
		e.setFormat(org.bukkit.ChatColor.translateAlternateColorCodes('&', "&4&l[" + getTime() + "&4&l] &9" + p.getName() + ": &f" + msg));
	}
}
