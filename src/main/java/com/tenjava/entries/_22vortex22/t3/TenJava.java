package com.tenjava.entries._22vortex22.t3;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

<<<<<<< HEAD
import com.tenjava.entries._22vortex22.t3.commands.Alexmack;
=======
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
import com.tenjava.entries._22vortex22.t3.commands.Doge;
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
<<<<<<< HEAD
			
=======
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
		
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
<<<<<<< HEAD
		pm.registerEvents(new Alexmack(this), this);
=======
>>>>>>> 2cba030c3a5283c7d99c7720645c290fb48168fc
	}
	
	public static TenJava getPlugin()
	{
		return plugin;
	}

}
