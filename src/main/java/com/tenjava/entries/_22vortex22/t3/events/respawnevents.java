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
	 * 
	 * onRespawn currently plays a random visual effect a configarable amount of times when a player respawns.
	 */
	@EventHandler
	public void onRespawn(final PlayerRespawnEvent e)
	{
<<<<<<< HEAD
=======
		//if(plugin.getConfig().getBoolean("options.respawnevents"))
		//{
		Random random = new Random();
		final Effect effect = RespawnEffects[random.nextInt(RespawnEffects.length)];
		Player p = e.getPlayer();
		final Location loc = p.getLocation();
		final World world = p.getWorld();
		p.sendMessage("Respawn listener is working");
		if(p.hasPermission("VortexEvents.Respawn"))
		{
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
			new BukkitRunnable()
			{
			  public void run()
			  {
<<<<<<< HEAD
				  Player p = e.getPlayer();
				  World world = p.getWorld();
				  Random random = new Random();
				  Effect effect = RespawnEffects[random.nextInt(RespawnEffects.length)];
				  Location loc = p.getLocation();
				   for (int i = 0; i < 20; i++)
=======
				  
				  //plugin.getConfig().getInt("options.respawneffectquantity")
				   for (int i = 0; i < 5; i++)
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
				   {	 
				   world.playEffect(loc, effect, 1);	
				   }
			  }
<<<<<<< HEAD
			}.runTaskLater(plugin, 10);
		
	}
=======
			}.runTaskLater(plugin, 5);
		}
		//}
	}
	
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
}
