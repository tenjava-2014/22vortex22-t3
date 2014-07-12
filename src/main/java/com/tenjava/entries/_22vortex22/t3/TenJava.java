package com.tenjava.entries._22vortex22.t3;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin implements Listener 
{
	private static TenJava plugin;
	
	@Override
	public void onEnable()
	{
		plugin = this;
		
		registerCommands();
		registerEvents();
		
		
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	private void registerCommands()
	{
		
	}
	
	private void registerEvents()
	{
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		
	}
	
	public static TenJava getPlugin()
	{
		return plugin;
	}

}
