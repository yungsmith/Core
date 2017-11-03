package me.smith.core;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.smith.core.commands.ComClear;
import me.smith.core.commands.ComClearChat;
import me.smith.core.commands.ComCore;
import me.smith.core.commands.ComFeed;
import me.smith.core.commands.ComHeal;
import me.smith.core.commands.ComInfo;
import me.smith.core.commands.ComList;
import me.smith.core.commands.ComPing;
import me.smith.core.commands.ComScreenshare;
import me.smith.core.commands.ComStaffChat;
import me.smith.core.commands.ComTP;
import me.smith.core.commands.ComVanish;
import me.smith.core.listeners.ChatEvent;
import me.smith.core.listeners.PlayerMove;

public class Core extends JavaPlugin{
	private static Core instance;
	private String prefix = ChatColor.translateAlternateColorCodes('&', "&6Core &e» ");
	private String noperm = ChatColor.translateAlternateColorCodes('&', "&fYou're missing permissions");
	private String invalidargs = ChatColor.translateAlternateColorCodes('&', "&fInvalid args.");
	private String pnotfound = ChatColor.translateAlternateColorCodes('&', "&fPlayer not found");
	public ArrayList<Player> vanished = new ArrayList<>();
	public ArrayList<Player> staffchat = new ArrayList<>();
	public ArrayList<Player> frozen = new ArrayList<>();
	 
	public void onEnable() {
		instance = this;
		
		registerListeners();
		registerCMDs();
	}
	
	public void onDisable() {
		instance = null;
	}
	
	private void registerCMDs(){
		getCommand("vanish").setExecutor(new ComVanish());
		getCommand("info").setExecutor(new ComInfo());
		getCommand("list").setExecutor(new ComList());
		getCommand("tp").setExecutor(new ComTP());
		getCommand("feed").setExecutor(new ComFeed());
		getCommand("heal").setExecutor(new ComHeal());
		getCommand("core").setExecutor(new ComCore());
		getCommand("sc").setExecutor(new ComStaffChat());
		getCommand("cc").setExecutor(new ComClearChat());
		getCommand("ci").setExecutor(new ComClear());
		getCommand("ping").setExecutor(new ComPing());
		getCommand("ss").setExecutor(new ComScreenshare());

	}
	
	private void registerListeners(){
		PluginManager plm = Bukkit.getPluginManager();
		
		plm.registerEvents(new ChatEvent(), this);
		plm.registerEvents(new PlayerMove(), this);
	}
	
	public static Core getInstance(){
		return instance;
	}
	
	public String getPrefix(){
		return prefix;
	}
	
	public String NoPerms(){
		return noperm;
	}
	
	public String invalidargs(){
		return invalidargs;
	}
	
	public String pnotfound(){
		return pnotfound;
	}
}
