package com.tenjava.entries._22vortex22.t3.commands;

<<<<<<< HEAD
import org.bukkit.entity.Bat;
import org.bukkit.entity.Creeper;
=======
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
<<<<<<< HEAD
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
=======
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc

import com.tenjava.entries._22vortex22.t3.TenJava;

/**
 * 
 * Another easter egg.
 */

public class Alexmack implements Listener
{
	public TenJava plugin;
	public Alexmack(TenJava instance)
	{	
		plugin = instance;
	}
	
	@EventHandler
	public void PlayerPreDogeCommandEvent(PlayerCommandPreprocessEvent e)
	{
		if(e.getMessage().equals("/alexmack"))
		{
<<<<<<< HEAD
			e.setCancelled(true);
			Player p = e.getPlayer();
			Creeper creeper = p.getWorld().spawn(p.getLocation(), Creeper.class);
			Bat bat = p.getWorld().spawn(p.getLocation(), Bat.class);
			bat.setPassenger(creeper);
			bat.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 3));
=======
			Player p = e.getPlayer();
			Location loc = p.getLocation();
			World world = loc.getWorld();
			
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
		}
	}
}
