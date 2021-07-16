package me.alanseyfir.manhunt.commands;

import me.alanseyfir.manhunt.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HunterCommand implements CommandExecutor {
    private Main plugin;

    public HunterCommand(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("manhunt").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        //  /manhunt player_name
        this.plugin.hunted = args[0];

        return true;
    }
}
