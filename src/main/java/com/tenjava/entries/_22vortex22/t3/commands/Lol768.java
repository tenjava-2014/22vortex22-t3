package com.tenjava.entries._22vortex22.t3.commands;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class Lol768
{
	public TenJava plugin;
	public Lol768(TenJava instance)
	{	
		plugin = instance;
	}
	
	/**
	 * I'm really bad at java doc'ing but this is a easter egg. Good job you found it.
	 * @param e
	 */
	
	@EventHandler
	public void PlayerPreLol768CommandEvent(PlayerCommandPreprocessEvent e)
	{	
		if(e.getMessage().equalsIgnoreCase("/lol768"))
		{
			e.setCancelled(true);
			Player p = e.getPlayer();
			p.chat("I'm being abused by IDucks. Halp?");
		}
	}
	
	
	
	
}
