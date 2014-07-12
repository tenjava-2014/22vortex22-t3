package com.tenjava.entries._22vortex22.t3.commands;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class Wand implements CommandExecutor
{
	public TenJava plugin;
	public Wand(TenJava instance)
	{	
		plugin = instance;
	}
	
	/**
	 * Gives the player a magic wand.
	 */

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args)
	{
		Player p = (Player) s;
		if (label.equalsIgnoreCase("wand") && s instanceof Player)
		{
			//Meta and details of the wand.
			ItemStack Wand = new ItemStack(Material.STICK);
			ItemMeta wmeta = Wand.getItemMeta();
			wmeta.setDisplayName(ChatColor.GOLD + "Magic Wand");
			ArrayList<String> WandLore = new ArrayList<String>();
			WandLore.add(ChatColor.RED + "Use this to use special abilities,");
			WandLore.add(ChatColor.RED + "If you change its name or alter");
			WandLore.add(ChatColor.RED + "the wand it will lose its power.");
			 wmeta.setLore(WandLore);
			Wand.setItemMeta(wmeta);
			p.getInventory().addItem(Wand);
			return true;
		}
		return false;
	}
}
