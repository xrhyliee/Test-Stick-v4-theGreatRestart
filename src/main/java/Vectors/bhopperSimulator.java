package Vectors;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import java.util.Random;

public class bhopperSimulator implements Listener {
    //be the bhopper you always dreamed to be
    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Vector vector = player.getLocation().getDirection();
        Location loc = player.getLocation();
        String playerIGN = player.getName();
        if (loc.subtract(0, 1, 0).getBlock().getType().equals(Material.WHITE_WOOL)) {
            vector.clone();
            vector.setY(0.2);
            player.setVelocity(vector);
        } else {
            return;
        }
        //can't be a true bhopper without the flood of angry people in chat
        while (true) {
            Random random = new Random();
            String angry[]={"HACKER!!111!","BHOPPER1!111!!","GET BANNEED!!111","./WDR " + playerIGN + " CHEATING!!11!!111!!","GET OUT OF UR MOMS BASEMENT KIDDO","YOU ARE THE SCUM OF THE EARTH!!!!","I WILL BE IN UR WALLS TONIGHT"};
            int randomNumber = random.nextInt(angry.length);
            StringBuilder sb = new StringBuilder();
            player.sendMessage(sb.append(angry[randomNumber]).toString());
            if (!(loc.subtract(0, 1, 0).getBlock().getType().equals(Material.WHITE_WOOL))){
                break;
            }
        }
    }

}



