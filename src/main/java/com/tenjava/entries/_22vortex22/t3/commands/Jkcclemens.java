package com.tenjava.entries._22vortex22.t3.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import com.tenjava.entries._22vortex22.t3.TenJava;

public class Jkcclemens implements Listener
{
	public TenJava plugin;
	public Jkcclemens(TenJava instance)
	{	
		plugin = instance;
	}
	
	/**
	 * Easter Eggs are OP.
	 */
	
	@EventHandler
	public void PlayerPreJkcclemensCommandEvent(PlayerCommandPreprocessEvent e)
	{	
		if(e.getMessage().equalsIgnoreCase("/jkcclemens"))
		{
			e.setCancelled(true);
			for(Player players : Bukkit.getOnlinePlayers())
            {
				players.chat(ChatColor.GOLD + "" + ChatColor.BOLD + "That is interesting.");
            }
		}
	}
	
	
	
	
	
	
	
	
}
