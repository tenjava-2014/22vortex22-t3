package com.tenjava.entries._22vortex22.t3.events;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityEvent;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class EntityForcePush
{
	public TenJava plugin;
	public EntityForcePush(TenJava instance)
	{	
		plugin = instance;
	}
	
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
	
	/**
	 * When you left click mobs they get flung back with effects.
	 * 
	 */
	
	@EventHandler
	public void onWandHit(EntityDamageByEntityEvent event)
	{
		Bukkit.getServer().broadcastMessage("test");
		Entity e = event.getEntity();
		if(event.getDamager().getType().equals(EntityType.PLAYER))
		 {
			final Player p = (Player) event.getDamager();
			if(!(p.getItemInHand() == null) || (p.getItemInHand().hasItemMeta()))
			{
				  if(ChatColor.stripColor(p.getItemInHand().getItemMeta().getDisplayName()).equalsIgnoreCase("Magic Wand"))
				  {
					  if(types.contains(e.getType()))
						{
						  e.setVelocity(event.getDamager().getLocation().getDirection().multiply(2.0).setY(1));
						  p.sendMessage(ChatColor.GOLD + "You used the force on the " + e.getType() + ".");
						}
					  else if(!(types.contains(e.getType())));
						{
						 p.sendMessage(ChatColor.RED + "You can't use the force on a " + e.getType() + ".");
						}
				  }
				
			}
		 }
		
	}
		
}
