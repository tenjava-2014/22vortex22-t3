package com.tenjava.entries.p22vortex22.t3.Events;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerRespawnEvent;


import com.tenjava.entries.p22vortex22.t3.TenJava;

public class RespawnEvents
{
	public TenJava plugin;
	public RespawnEvents(TenJava instance)
	{	
		plugin = instance;
	}
	
	final Effect[] RespawnEffects = new Effect[]
			{
			Effect.SMOKE,
			Effect.MOBSPAWNER_FLAMES,
			Effect.POTION_BREAK,
			
			
			
			};
	
	/**
	 * 
	 * onRespawn currently plays a random effect when a player respawns.
	 */
	public void onRespawn(PlayerRespawnEvent e)
	{
		Player p = e.getPlayer();
		Location loc = p.getLocation();
		
		
	}
	
	
	
	
	
}
