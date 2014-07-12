package com.tenjava.entries._22vortex22.t3.commands;

import org.bukkit.entity.Bat;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


import com.tenjava.entries._22vortex22.t3.TenJava;

/**
 * 
 * Another easter egg.
 */

public class Alexmack implements Listener
{
	public TenJava plugin;
	public Alexmack(TenJava instance)
	{	
		plugin = instance;
	}
	
	@EventHandler
	public void PlayerPreDogeCommandEvent(PlayerCommandPreprocessEvent e)
	{
		if(e.getMessage().equalsIgnoreCase("/alexmack"))
		{
			e.setCancelled(true);
			Player p = e.getPlayer();
			Creeper creeper = p.getWorld().spawn(p.getLocation(), Creeper.class);
			Bat bat = p.getWorld().spawn(p.getLocation(), Bat.class);
			bat.setPassenger(creeper);
			bat.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 3));
			
		}
	}
}
