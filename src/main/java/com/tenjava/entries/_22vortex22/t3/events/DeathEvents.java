package com.tenjava.entries._22vortex22.t3.events;


import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class DeathEvents implements Listener
{
	public TenJava plugin;
	public DeathEvents(TenJava instance)
	{	
		plugin = instance;
	}
	
	
	@EventHandler
	public void onDeath(final PlayerDeathEvent e)
	{
<<<<<<< HEAD
			Player p = e.getEntity();
=======
		//if(plugin.getConfig().getBoolean("options.deathevents"))
		//{
		Player p = e.getEntity();
		 if(p.hasPermission("VortexEvents.Death"))
		 {
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
			final Location loc = p.getLocation();
			final World world = loc.getWorld();
			new BukkitRunnable()
			{
			  public void run()
			  {
<<<<<<< HEAD
				   for (int i = 0; i < 10; i++)
=======
				  //plugin.getConfig().getInt("options.deatheffectquantity")
				   for (int i = 0; i < 5; i++)
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
				   {	 
				   	world.strikeLightningEffect(loc);
				   }
			  }
			}.runTaskLater(plugin, 5);
			
<<<<<<< HEAD
=======
		 }
		//}
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
	}
	
	
}
