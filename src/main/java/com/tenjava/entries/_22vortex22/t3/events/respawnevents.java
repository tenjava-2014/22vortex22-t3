package com.tenjava.entries._22vortex22.t3.events;

import java.util.Random;
import com.tenjava.entries.22vortex22.t3.Ultis;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

import com.tenjava.entries.p22vortex22.t3.TenJava;

public class respawnevents
{
	public TenJava plugin;
	public respawnevents(TenJava instance)
	{	
		plugin = instance;
	}
	
	
	
	Object obj = Effect[Random.nextInt(Effect.length)];
	
	/**
	 * 
	 * onRespawn currently plays a random visual effect 5 times when a player respawns.
	 */
	public void onRespawn(PlayerRespawnEvent e)
	{
		Player p = e.getPlayer();
		Location loc = p.getLocation();
		World world = p.getWorld();
		for (int i = 0; i < 5; i++)
		{
		world.playEffect(loc, obj, );	
		}	
		
	}
	
	
	
	
	
}
