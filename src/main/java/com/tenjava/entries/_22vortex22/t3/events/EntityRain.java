package com.tenjava.entries._22vortex22.t3.events;

import java.util.Arrays;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class EntityRain
{
	public TenJava plugin;
	public EntityRain(TenJava instance)
	{	
		plugin = instance;
	}
	
	/**
	 * 
	 * The class the causes creature storms.
	 */
	
	public final EntityType[] ET = 
	{
		EntityType.BAT,
		EntityType.BLAZE,
		EntityType.CAVE_SPIDER,
		EntityType.CHICKEN,
		EntityType.CREEPER,
		EntityType.COW,
		EntityType.ENDERMAN,
		EntityType.HORSE,
		EntityType.GHAST,
		EntityType.GIANT,
		EntityType.IRON_GOLEM,
		EntityType.MAGMA_CUBE,
		EntityType.SQUID,
		EntityType.MUSHROOM_COW,
		EntityType.OCELOT,
		EntityType.PIG,
		EntityType.WITCH,
		EntityType.PIG_ZOMBIE,
		EntityType.SHEEP,
		EntityType.WOLF,
		EntityType.ZOMBIE,
		EntityType.SNOWMAN,
		EntityType.SILVERFISH
	};
	
	@EventHandler
	public void onWand(PlayerInteractEntityEvent event)
	{
		Entity e = event.getRightClicked();
		if(event.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.BOLD + "" + ChatColor.GOLD + "Magic Wand"))
		{
			if(Arrays.asList(ET).contains(e.getType()))
			{
				event.setCancelled(true);
				e.remove();
				Location loc = e.getLocation().add(0, 100, 0);
				for (int i = 0; i < 50; i++)
				{	
				loc.getWorld().spawnEntity(loc, e.getType());
				}
			}
		}	
	}
	
	
	
	
	
	
}
