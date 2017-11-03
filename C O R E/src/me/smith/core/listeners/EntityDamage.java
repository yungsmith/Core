package me.smith.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import me.smith.core.Core;

public class EntityDamage implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageEvent e){
		Player target = (Player) e.getEntity();
		if (Core.getInstance().frozen.contains(target)){
			e.setCancelled(true);
		}
	}

}
