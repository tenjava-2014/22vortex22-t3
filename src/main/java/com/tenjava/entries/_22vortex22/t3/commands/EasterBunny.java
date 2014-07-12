package com.tenjava.entries._22vortex22.t3.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class EasterBunny implements Listener
{
	public TenJava plugin;
	public EasterBunny(TenJava instance)
	{	
		plugin = instance;
	}
	
	/**
	 * Easterbunny event :D
	 * @param e
	 */
	
	@EventHandler
	public void PlayerPreEasterBunnyCommandEvent(PlayerCommandPreprocessEvent e)
	{
		
		if((e.getMessage().equalsIgnoreCase("/eb")) || (e.getMessage().equalsIgnoreCase("/easterbunny")))
		{
			e.setCancelled(true);
			Player p = e.getPlayer();
			Skeleton skeleton = p.getWorld().spawn(p.getLocation(), Skeleton.class);
			Skeleton skele = p.getWorld().spawn(p.getLocation(), Skeleton.class);
			skele.setCustomName("Dinnerbone");
			skeleton.setCustomName(ChatColor.GOLD + "EasterBunny");
			skeleton.setPassenger(skele);
			skele.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 100));
			skeleton.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 100));
			p.sendMessage(ChatColor.GOLD + "You have spawned a Easter Bunny. He might not be friendly.");
		}
	}
	
	
	
	
}
