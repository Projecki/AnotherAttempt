package com.projecki.anotherAttempt;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("projeckiheal").setExecutor(new HealCommand());



    }
}
