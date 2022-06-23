package Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class ouchie implements Listener {
    @EventHandler
    public void onFall(EntityDamageEvent event) {
        if(event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if(event.getCause() == EntityDamageEvent.DamageCause.FALL) {
                player.sendMessage(ChatColor.RED + "OUCH! You fell!");
                event.setCancelled(true);
            }
        }
    }
}

