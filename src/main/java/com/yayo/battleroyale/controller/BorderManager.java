package com.yayo.battleroyale.controller;
import org.bukkit.World;
import org.bukkit.WorldBorder;

public class BorderManager {
    public static void initializeBorder(World world) {
        WorldBorder border = world.getWorldBorder();

        // Set the center of the world border
        border.setCenter(0.0, 0.0);

        // Set the initial size of the world border to 250x250
        border.setSize(250);

        // Start shrinking the border to 0x0 over 5 minutes (300 seconds)
        border.setSize(0, 300);
    }

}
