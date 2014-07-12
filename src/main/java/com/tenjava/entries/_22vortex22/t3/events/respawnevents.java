package com.tenjava.entries._22vortex22.t3.events;

import java.util.Random;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class RespawnEvents implements Listener
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
	 * Effects on respawn. Bad ass.
	 * @param e
	 */
	 
	@EventHandler
	public void onRespawn(final PlayerRespawnEvent e)
	{
	final Player p = e.getPlayer();
			new BukkitRunnable()
			{
			  public void run()
			  {
				  World world = p.getWorld();
				  Random random = new Random();
				  Effect effect = RespawnEffects[random.nextInt(RespawnEffects.length)];
				  Location loc = p.getLocation();
				   for (int i = 0; i < 20; i++)
				   {	 
				   world.playEffect(loc, effect, 1);	
				   }
			  }

			}.runTaskLater(plugin, 10);
			
	}
		
}
