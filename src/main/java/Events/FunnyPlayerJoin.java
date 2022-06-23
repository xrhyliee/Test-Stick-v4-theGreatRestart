package Events;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class FunnyPlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Location playerLoc = event.getPlayer().getLocation();
        Block block = playerLoc.getBlock();
        block.getWorld().spawnEntity(playerLoc, EntityType.FIREWORK);
        player.sendMessage("You joined the server!");
    }
}
