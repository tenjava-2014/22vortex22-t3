package com.tenjava.entries._22vortex22.t3.events;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class EntityRain implements Listener
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
		EntityType.SKELETON,
		EntityType.SPIDER,
		EntityType.SHEEP,
		EntityType.SLIME,
		EntityType.WOLF,
		EntityType.ZOMBIE,
		EntityType.SNOWMAN,
		EntityType.SILVERFISH
	};
	
	public final List<EntityType> types = Arrays.asList(ET);
	
	@EventHandler
	public void onWand(PlayerInteractEntityEvent event)
	{
		Entity e = event.getRightClicked();
		if(!(event.getPlayer().getItemInHand() == null) || (event.getPlayer().getItemInHand().hasItemMeta()))
		{		
		  if(ChatColor.stripColor(event.getPlayer().getItemInHand().getItemMeta().getDisplayName()).equalsIgnoreCase("Magic Wand"))
		  {
			if(types.contains(e.getType()))
			{
				event.getPlayer().sendMessage(ChatColor.GOLD + "You have summonded a storm of " + e.getType().toString().toLowerCase() + "s.");
				event.setCancelled(true);
				e.remove();
				Location loc = e.getLocation().add(0, 100, 0);
				double x;
				int y = loc.getBlockY();
				double z;
				for(double radius = 1; radius <= 20; radius++)
				{
				  for (double i = 0.0; i < 360.0; i += (360f / radius))
				  {
					   double angle = Math.toRadians(i);
		                x = loc.getX() + (Math.cos(angle) * radius);
		                z = loc.getZ() + (Math.sin(angle) * radius);
		                Location location = new Location(loc.getWorld(), x, y, z);
		                location.getWorld().spawnEntity(location, e.getType());
		                
		          }
				}
			}
			else event.getPlayer().sendMessage(ChatColor.RED + "You can't summon a storm of that entity.");
		  }
		}	
	}
	
	
	
	
	
	
}
