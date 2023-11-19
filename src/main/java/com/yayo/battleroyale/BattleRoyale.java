package com.yayo.battleroyale;

import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

import static com.yayo.battleroyale.controller.BorderManager.initializeBorder;


// Main Java Method !!!!!!!
public final class BattleRoyale extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("PLugin Started, Hello World!");

        World world = getServer().getWorlds().get(0); // This gets the first world loaded by the server, usually the "world" world.
        initializeBorder(world);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("PLugin Ended, Goodbye World!");
    }
}
