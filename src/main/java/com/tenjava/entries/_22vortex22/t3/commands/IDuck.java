package com.tenjava.entries._22vortex22.t3.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class IDuck implements Listener
{
	public TenJava plugin;
	public IDuck(TenJava instance)
	{	
		plugin = instance;
	}
	
	/**
	 * 
	 * Easter Egg again!
	 */
	
	@EventHandler
	public void PlayerPreDuckCommandEvent(PlayerCommandPreprocessEvent e)
	{	
		if(e.getMessage().equalsIgnoreCase("/iduck"))
		{
			e.setCancelled(true);
			Player p = e.getPlayer();
			Location loc = p.getLocation();
			World world = loc.getWorld();
			for (int i = 0; i < 5; i++)
			   {	 
				Chicken chicken = world.spawn(p.getLocation(), Chicken.class);
				chicken.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				chicken.setCustomName(ChatColor.GOLD + "IDuck");
			   }
		}
	}
	
	
	
	
	
	
	
	
	
	
}
