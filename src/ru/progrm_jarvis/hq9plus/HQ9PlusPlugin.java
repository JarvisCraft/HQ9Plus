package ru.progrm_jarvis.hq9plus;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import ru.progrm_jarvis.hq9plus.command.CommandCompile;

import java.util.logging.Logger;

/**
 * HQ9+ Main Class
 */
public class HQ9PlusPlugin extends JavaPlugin {
    private static HQ9PlusPlugin instance;
    public static HQ9PlusPlugin getInstance () {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
        PluginDescriptionFile pluginDescriptionFile = getDescription();
        Logger logger = getLogger();
        logger.info(pluginDescriptionFile.getName() + " has been enabled. Version: " + pluginDescriptionFile.getVersion());
    }
    @Override
    public void onDisable() {
        PluginDescriptionFile pluginDescriptionFile = getDescription();
        Logger logger = getLogger();
        logger.info(pluginDescriptionFile.getName() + " has been disabled. Version: " + pluginDescriptionFile.getVersion());
    }
    private void registerCommands () {
        getCommand("hq9plus").setExecutor(new CommandCompile());
    }
    private long accumulator = 0;
    public boolean plusAccumulator () {
        accumulator++;
        return true;
    }
}
