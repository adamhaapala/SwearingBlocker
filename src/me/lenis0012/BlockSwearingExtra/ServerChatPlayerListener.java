package me.lenis0012.BlockSwearingExtra;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class ServerChatPlayerListener implements Listener{
	@EventHandler
	public void onPlayerChat(PlayerChatEvent chat){
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		ChatColor RED = ChatColor.RED;
		ChatColor GREEN = ChatColor.GREEN;
		if(p.isOp()){
			p.hasPermission("SwearingBlocker.bypass.chat");
		}
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
    		if(message_lower.contains("dick")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
    			chat.setCancelled(true);
    		}
		}
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
    		if(message_lower.contains("fuck")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
    			chat.setCancelled(true);

    		}
    	}
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
    		if(message_lower.contains("shit")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
    			chat.setCancelled(true);
    		}
        }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
    		if(message_lower.contains("asshole")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
    			chat.setCancelled(true);
    		}
        }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
    		if(message_lower.contains("dumass")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
    			chat.setCancelled(true);
    		}
        }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("gay")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("damn")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("@$$")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("ahole")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("dyke")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("fuck*")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("shit*")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("amick")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("andskota")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("anus")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("arschloch")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("arse*")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("ash0le")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("assh0les")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.chat")) {
     		if(message_lower.contains("asholes")) {
     			p.sendMessage(RED + "[Server]" + GREEN + " Hey, " + RED + p.getName() + GREEN + " no swearing!");
     			chat.setCancelled(true);
     		}
         }
	}
}
