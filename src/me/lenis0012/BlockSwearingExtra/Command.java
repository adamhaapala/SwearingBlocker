package me.lenis0012.BlockSwearingExtra;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor{
	public static BlockSwearingExtra plugin;
	public Command(BlockSwearingExtra instance) { plugin = instance; }
	
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmnd, String label, String[] args){
		if(sender.isOp())
		{
			sender.hasPermission("swearingblocker.command.*");
		}
		if(sender.hasPermission("swearingblocker.command.*"))
		{
			sender.hasPermission("swearingblocker.command.reload");
			sender.hasPermission("swearingblocker.command.addword");
			sender.hasPermission("swearingblocker.command.rmword");
		}
	    if(args[0].equals("info")){
			sender.sendMessage("[SwearingBlocker]"+ChatColor.GREEN + " version: 1.4b");
			sender.sendMessage("[SwearingBlocker]"+ChatColor.GREEN + " author: lenis0012");
			}
		else if(args[0].equals("reload")){
			if(args.length != 1){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "to many arguments");
			}
			else if(!sender.hasPermission("swearingblocker.command.reload")){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "you dont haver permission for this command");
				}
			else{
				plugin.reloadConfig();
				plugin.saveConfig();
			    sender.sendMessage("[SwearingBlocker] " + ChatColor.GREEN + "config reloaded");
				}
			}
		else if(args[0].equals("addword")){
			if(!sender.hasPermission("swearingblocker.command.addword")){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "you dont haver permission for this command");
			}
			else if(args.length < 2){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "not enough arguments");
			}
			else if(args.length > 2){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "to many arguments");
			}
			else if(plugin.words.contains(args[1])){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "this word is already added");
			}
			else{
				plugin.words.add(args[1]);
				sender.sendMessage("[SwearingBlocker] " + ChatColor.GREEN + "the word " + ChatColor.DARK_GREEN + args[1] + ChatColor.GREEN + " is succesfully added");
				plugin.getConfig().addDefault("blocked-words.words.list", plugin.words);
				plugin.getConfig().options().copyDefaults(true);
				plugin.saveConfig();
			}
		}
		else if(args[0].equals("rmword")){
			if(!sender.hasPermission("swearingblocker.command.rmword")){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "you dont haver permission for this command");
			}
			if(args.length < 2){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "not enough arguments");
			}
			else if(args.length > 2){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "to many arguments");
			}
			else if(!plugin.words.contains(args[1])){
				sender.sendMessage("[SwearingBlocker] " + ChatColor.RED + "this word was not added in the list");
			}
			else{
				plugin.words.remove(args[1]);
				sender.sendMessage("[SwearingBlocker] " + ChatColor.GREEN + "the word " + ChatColor.DARK_GREEN + args[1] + ChatColor.GREEN + " is succesfully removed");
				plugin.getConfig().addDefault("blocked-words.words.list", plugin.words);
				plugin.getConfig().options().copyDefaults(true);
				plugin.saveConfig();
			}
		}
	    	return true;
		}
	}
