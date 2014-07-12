package com.tenjava.entries._22vortex22.t3;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import com.tenjava.entries._22vortex22.t3.commands.Alexmack;
import com.tenjava.entries._22vortex22.t3.commands.Doge;
import com.tenjava.entries._22vortex22.t3.events.CraterCreator;
import com.tenjava.entries._22vortex22.t3.events.DeathEvents;
import com.tenjava.entries._22vortex22.t3.events.RespawnEvents;

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
		pm.registerEvents(new RespawnEvents(this), this);
		pm.registerEvents(new Doge(this), this);
		pm.registerEvents(new DeathEvents(this), this);
		pm.registerEvents(new Alexmack(this), this);
		pm.registerEvents(new CraterCreator(this), this);

	}
	
	public static TenJava getPlugin()
	{
		return plugin;
	}

}
