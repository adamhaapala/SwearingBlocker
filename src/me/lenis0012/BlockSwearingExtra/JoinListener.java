package me.lenis0012.BlockSwearingExtra;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener{
	public BlockSwearingExtra plugin;
	public FileConfiguration config;
	public JoinListener(BlockSwearingExtra plugin){
		this.plugin = plugin;
		config = plugin.getCustomConfig();
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent join){
		Player p = join.getPlayer();
		if(!config.contains("warnings." + p.getName())){
			config.addDefault("warnings." + p.getName(), 0);
			config.options().copyDefaults(true);
			plugin.saveCustomConfig();
			p.sendMessage("[SwearingBlocker] " + ChatColor.RED + "Be carefull with swearing!");
		}
		if(plugin.getCustomConfig().getInt("warnings." + p.getName()) >= 1)
		{
			p.sendMessage("[SwearingBlocker] " + ChatColor.RED + "you have " + plugin.getCustomConfig().getInt("warnings." + p.getName()) + " warnings");
		}
	}
}
