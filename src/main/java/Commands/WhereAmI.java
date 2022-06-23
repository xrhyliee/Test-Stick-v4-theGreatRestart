package Commands;

import org.bukkit.ChatColor;
import org.bukkit.block.Biome;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WhereAmI implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        if (command.getName().equalsIgnoreCase("whereami")) {
            Player player = ((Player) sender).getPlayer();
            int x = player.getLocation().getBlockX();
            int y = player.getLocation().getBlockY();
            int z = player.getLocation().getBlockZ();
            Biome biome = player.getWorld().getBiome(x, y-1, z);
            double xcoord = player.getLocation().getX();
            double ycoord = player.getLocation().getY();
            double zcoord = player.getLocation().getZ();
            long roundX = Math.round(xcoord);
            long roundY = Math.round(ycoord);
            long roundZ = Math.round(zcoord);
            player.sendMessage(ChatColor.GREEN + "You are currently...");
            player.sendMessage(ChatColor.WHITE + "In a " + ChatColor.GREEN + biome + ChatColor.WHITE + "biome.");
            player.sendMessage(ChatColor.GREEN + "And standing at...");
            player.sendMessage(ChatColor.GREEN + "X:" + ChatColor.WHITE + roundX);
            player.sendMessage(ChatColor.GREEN + "Y:" + ChatColor.WHITE + roundY);
            player.sendMessage(ChatColor.GREEN + "Z:" + ChatColor.WHITE + roundZ);
        }
        return false;
    }
}
