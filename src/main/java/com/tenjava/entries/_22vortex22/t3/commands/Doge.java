package com.tenjava.entries._22vortex22.t3.commands;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.tenjava.entries._22vortex22.t3.TenJava;

/**
 * 
 * This is mainly an easter egg.
 * Not part of the actually plugin idea.
 *
 */

public class Doge implements Listener
{
	public TenJava plugin;
	public Doge(TenJava instance)
	{	
		plugin = instance;
	}
	
	public Random random = new Random();
	
	final ChatColor[] colors = new ChatColor[]
			{
			ChatColor.RED,
			ChatColor.GREEN,
			ChatColor.BLUE,
			ChatColor.LIGHT_PURPLE,
			ChatColor.YELLOW,
			ChatColor.AQUA,
			ChatColor.DARK_AQUA,
			ChatColor.DARK_BLUE,
			ChatColor.DARK_GREEN,
			ChatColor.DARK_PURPLE,
			ChatColor.DARK_RED
			};
	
	public static final String[] RANDOM_MESSAGES = new String[]
			{
				"wow such doge",
				"wow very secret",
				"much rofl very funny",
				"wow such hilarious",
				"doge such epik",
				"420 much blaze",
			};
	
	@EventHandler
	public void PlayerPreDogeCommandEvent(PlayerCommandPreprocessEvent e)
	{
		
		if(e.getMessage().equals("/doge"))
		{
			e.setCancelled(true);
			Player p = e.getPlayer();
			String m = "";
			String string = RANDOM_MESSAGES[(new Random()).nextInt(RANDOM_MESSAGES.length)];
			
			for(char c : string.toCharArray())
			{
			  m += colors[random.nextInt(colors.length)] + "" + c;
			}
			p.chat(m);
		}
	}
	
}
