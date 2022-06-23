package teststickv4.tsv4;

import Events.FunnyPlayerJoin;
import Events.ouchie;
import Vectors.bhopperSimulator;
import org.bukkit.plugin.java.JavaPlugin;

public final class TSv4 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("If you see this in your console, TSv4 is now enabled! Be sure to check for errors!");
        getServer().getPluginManager().registerEvents(new FunnyPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new bhopperSimulator(), this);
        getServer().getPluginManager().registerEvents(new ouchie(), this);
        getServer().getPluginCommand("whereami").setExecutor(new Commands.WhereAmI());

    }

    @Override
    public void onDisable() {
        getLogger().info("If you see this in your console, TSv4 is now disabled! Be sure to check for errors!");
    }
}
