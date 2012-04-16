package me.lenis0012.BlockSwearingExtra;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.EventHandler;

public class LightningListener implements Listener{
	@EventHandler
	public void onPlayerChat(PlayerChatEvent chat){
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		if(p.isOp()){
			p.hasPermission("SwearingBlocker.bypass.lightning");
		}
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
    		if(message_lower.contains("dick")) {
    			chat.setCancelled(true);
    			p.getWorld().strikeLightning(p.getLocation());
    		}
		}
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
    		if(message_lower.contains("fuck")) {
    			chat.setCancelled(true);
    			p.getWorld().strikeLightning(p.getLocation());

    		}
    	}
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
    		if(message_lower.contains("shit")) {
    			chat.setCancelled(true);
    			p.getWorld().strikeLightning(p.getLocation());
    		}
        }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
    		if(message_lower.contains("asshole")) {
    			chat.setCancelled(true);
    			p.getWorld().strikeLightning(p.getLocation());
    		}
        }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
    		if(message_lower.contains("dumass")) {
    			chat.setCancelled(true);
    			p.getWorld().strikeLightning(p.getLocation());
    		}
        }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("gay")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("damn")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("@$$")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("ahole")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("dyke")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("fuck*")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("shit*")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("amick")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("andskota")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("anus")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("arschloch")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("arse*")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("ash0le")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("assh0les")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
        if (!p.hasPermission("SwearingBlocker.bypass.lightning")) {
     		if(message_lower.contains("asholes")) {
     			chat.setCancelled(true);
     			p.getWorld().strikeLightning(p.getLocation());
     		}
         }
	}

}
