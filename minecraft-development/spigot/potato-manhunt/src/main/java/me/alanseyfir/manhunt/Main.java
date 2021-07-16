package me.alanseyfir.manhunt;

import me.alanseyfir.manhunt.commands.HunterCommand;
import me.alanseyfir.manhunt.listeners.CompassListener;
import me.alanseyfir.manhunt.listeners.RespawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    //Hold the name that is hunted
    public String hunted = "";

    @Override
    public void onEnable() {
        // Plugin startup logic
        new HunterCommand(this);
        new CompassListener(this);
        new RespawnListener(this);

    }
}
