package com.tenjava.entries._22vortex22.t3.events;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import com.tenjava.entries._22vortex22.t3.TenJava;

public class EntityForcePush implements Listener
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
	 * You have the force, young one.
	 * @param event
	 */
	
	@EventHandler
	public void onWandHit(EntityDamageByEntityEvent event)
	{
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
						  p.sendMessage(ChatColor.GOLD + "You used the force on the " + e.getType().toString().toLowerCase() + ".");
						}
					  else if(!(types.contains(e.getType())))
						{
						 p.sendMessage(ChatColor.RED + "You can't use the force on a " + e.getType().toString().toLowerCase() + ".");
						}
				  }
				
			}
		 }
		
	}
		
}
