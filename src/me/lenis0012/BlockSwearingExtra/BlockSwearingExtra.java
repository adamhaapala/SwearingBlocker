package me.lenis0012.BlockSwearingExtra;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockSwearingExtra extends JavaPlugin {
	Logger log = Logger.getLogger("message");
	@Override
	public void onEnable(){
	final FileConfiguration config = this.getConfig();
	if (config != null){
		config.options().header("config not 100% done yet!");
		config.addDefault("settings.use-message", true);
		config.addDefault("settings.use-lightning", true);
		config.options().copyDefaults(true);
		saveConfig();
		}
	if(config.getBoolean("settings.use-message") == true){
		getServer().getPluginManager().registerEvents(new ServerChatPlayerListener(), this);
	}
	if(config.getBoolean("settings.use-lightning") == true){
		getServer().getPluginManager().registerEvents(new LightningListener(), this);
		}
	log.info("[SwearingBlocker] swearing is now blocked");
	}
	@Override
	public void onDisable(){
		saveConfig();
		log.info("[SwearingBlocker] SwearingBlocker v0.3 has been disabled");
		log.info("[SwearingBlocker] swearing is no longer blocked");
	}
}
