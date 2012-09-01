package me.lenis0012.BlockSwearingExtra;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockSwearingExtra extends JavaPlugin implements Listener{
	private FileConfiguration customConfig = null;
    private File customConfigFile = null;
    List<String> words = new ArrayList<String>();
	Logger log = Logger.getLogger("message");
	@Override
	public void onEnable(){
	if(!words.contains("fuck"))
	{
		words.add("fuck");
		words.add("gay");
		words.add("bitch");
		words.add("dick");
		words.add("asshole");
	}
	PluginManager pm = getServer().getPluginManager();
	pm.registerEvents(new JoinListener(this), this);
	setupEconomy();
	final FileConfiguration config = this.getConfig();
	config.options().header("edit settings here!");
	config.addDefault("settings.use-message", true);
	config.addDefault("settings.use-lightning", true);
	config.addDefault("settings.use-kick", false);
	config.addDefault("settings.use-explode", false);
	config.addDefault("bypass.use-op-bypass", true);
	config.addDefault("blocked-words.words.list", words);
	                   //Warning system (not done)//
	////////////////////////////////////////////////////////////////////
	//config.addDefault("settings.warnings.use", true);               //
	//config.addDefault("settings.warnings.amount till action", 10);  //
	//config.addDefault("settings.warnings.action.ban", true);        //
	///////////////////////////////////////////////////////////////////
	config.options().copyDefaults(true);
	saveConfig();
	saveCustomConfig();
	pm.registerEvents(new ServerChatPlayerListener(this), this);
	getCommand("sb").setExecutor(new Command(this));
	}
	@Override
	public void onDisable(){
		saveConfig();
		log.info("[SwearingBlocker] SwearingBlocker disabled");
		log.info("[SwearingBlocker] swearing is no longer blocked");
	}
	public void reloadCustomConfig() {
        if (customConfigFile == null) {
        customConfigFile = new File(getDataFolder(), "data.yml");
        }
        customConfig = YamlConfiguration.loadConfiguration(customConfigFile);
        java.io.InputStream defConfigStream = this.getResource("data.yml");
        if (defConfigStream != null) {
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
            customConfig.setDefaults(defConfig);
        }
    }
	public FileConfiguration getCustomConfig(){
        if (customConfig == null) {
            this.reloadCustomConfig();
        }
        return customConfig;
    }
	public void saveCustomConfig() {
        if (customConfig == null || customConfigFile == null) {
        return;
        }
        try {
            getCustomConfig().save(customConfigFile);
        } catch (IOException ex) {
            this.getLogger().log(Level.SEVERE, "Could not save config to " + customConfigFile, ex);}
        }
        public Integer getDefaultWarn(){
             Integer defaultWarnings = Integer.valueOf(getConfig().getInt("settings.warnings.amount-till-action"));
             return defaultWarnings;
           }
           public Integer getRemWarn(String PlayerName) {
           Integer warnRemaining = Integer.valueOf(getCustomConfig().getInt("warnings-left." + PlayerName, getDefaultWarn().intValue()));
             return warnRemaining;
           }
           public void setRemWarn(String PlayerName, Integer warnRemaining) {
            getCustomConfig().set("warnings-left." + PlayerName, warnRemaining);
            saveConfig();
       }
	public void buyTicket(Double price, Player player){
		if (economy.getBalance(player.getName()) <= price.doubleValue()) {
			return;
		}
		economy.withdrawPlayer(player.getName(), price.doubleValue());
		player.sendMessage("[SwearingBlocker] " + ChatColor.GREEN + "you got rid of 1 warning");
	}
	public static Economy economy = null;
	private boolean setupEconomy(){
        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            economy = economyProvider.getProvider();
            log.info("[SwearingBlocker] hook in to " + economy.getName());
        }

        return (economy != null);
    }
	}
