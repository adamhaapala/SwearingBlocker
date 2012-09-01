package me.lenis0012.BlockSwearingExtra;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class ServerChatPlayerListener implements Listener{
	public BlockSwearingExtra plugin;
	public boolean opUse;
	public boolean muse;
	public boolean luse;
	public boolean kuse;
	public boolean euse;
	public boolean wuse;
	public boolean UseBan;
	public int wamount;
	public FileConfiguration cc;
	public ServerChatPlayerListener(BlockSwearingExtra plugin) {
		this.plugin = plugin;
			plugin.saveConfig();
			opUse = plugin.getConfig().getBoolean("bypass.use-op-bypass");
			muse = plugin.getConfig().getBoolean("settings.use-message");
			luse = plugin.getConfig().getBoolean("settings.use-lightning");
			kuse = plugin.getConfig().getBoolean("settings.use-kick");
			euse = plugin.getConfig().getBoolean("settings.use-explode");
			wuse = plugin.getConfig().getBoolean("settings.warnings.use");
			wamount = plugin.getConfig().getInt("settings.warnings.amount till action");
			UseBan = plugin.getConfig().getBoolean("settings.warnings.action.ban");
			cc = plugin.getCustomConfig();
			}
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent chat){
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		ChatColor RED = ChatColor.RED;
		ChatColor GREEN = ChatColor.GREEN;
		if(p.hasPermission("swearingblocker.bypass.*")){
			p.hasPermission("swearingblocker.bypass.chat");
			p.hasPermission("swearingblocker.bypass.kick");
			p.hasPermission("swearingblocker.bypass.lightning");
		}
		if(opUse == true && p.isOp()){
			p.hasPermission("swearingblocker.bypass.*");
		}
		for (String word : plugin.getConfig().getStringList("blocked-words.words.list")) {
	         if (message_lower.contains(word.toLowerCase())){
        		if(muse == true && !p.hasPermission("swearingblocker.bypass.chat")){
        			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
        			chat.setCancelled(true);
        		}
         		if(luse == true && !p.hasPermission("swearingblocker.bypass.lightning")){
         			p.getWorld().strikeLightning(p.getLocation());
         			chat.setCancelled(true);
         			}
         		if(kuse == true && !p.hasPermission("swearingblocker.bypass.kick")){
         			chat.setCancelled(true);
         			p.kickPlayer("no swearing allowed");
         		if(euse == true && !p.hasPermission("swearingblocker.bypass.explode")){
         			p.getWorld().createExplosion(p.getLocation(),2);
         			chat.setCancelled(true);
         			}
         		if(wuse == true && !p.hasPermission("swearingblocker.bypass.warnings")){
         			chat.setCancelled(true);
         			if(cc.getInt("warnings." + p.getName()) != wamount)
         			{
         					cc.addDefault("warnings." + p.getName(), cc.getInt("warnings." + p.getName()) + 1);
         					cc.options().copyDefaults(true);
         					plugin.saveCustomConfig();
         			}
         			else{
         				if(UseBan)
         				{
         					p.setBanned(true);
         					p.kickPlayer("You have been banned for swearing!");
         				}
         			}
         			}
         		}
			}
		}  			
   }
	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent command){
		String message = command.getMessage();
		Player p = command.getPlayer();
		if(message.equals("/sb"))
		{
			p.sendMessage("============= SwearingBlocker commands ============");
			p.sendMessage(ChatColor.RED + "/sb info" + ChatColor.WHITE + " - " + ChatColor.GREEN + "gives info about the plugin");
			p.sendMessage(ChatColor.RED + "/sb reload" + ChatColor.WHITE + " - " + ChatColor.GREEN + "reloads the config");
			p.sendMessage(ChatColor.RED + "/sb addword" + ChatColor.WHITE + " - " + ChatColor.GREEN + "adds a word");
			p.sendMessage(ChatColor.RED + "/sb rmword" + ChatColor.WHITE + " - " + ChatColor.GREEN + "removes a word");
			command.setCancelled(true);
		}
	}
}
