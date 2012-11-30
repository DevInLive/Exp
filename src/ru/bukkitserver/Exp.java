package ru.bukkitserver;


import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;



public class Exp extends JavaPlugin {
	
	public static final Logger l = Logger.getLogger("Minecraft");

	public void onEnable()
	{
		l.info("[] Exp plugin Enabled!");
		loadCommands();
		
	}
	
	public void onDisable()
	{
		l.info("[] Exp plugin Disabled!");
	}
	
	public void loadCommands(){
		getCommand("exp").setExecutor(new ExpCommand());
	}
}

