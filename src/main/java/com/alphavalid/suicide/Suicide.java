package com.alphavalid.suicide;

import org.bukkit.plugin.java.JavaPlugin;

public final class Suicide extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("suicide").setExecutor(new Command());
    }
}
