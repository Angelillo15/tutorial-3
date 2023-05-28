package es.angelillo15.firstplugin;

import es.angelillo15.firstplugin.cmd.InfoCMD;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {
    private static FirstPlugin instance;
    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
        getLogger().info("Plugin iniciado!");
        getLogger().info("Corriendo la version: " + getDescription().getVersion());
    }

    public void registerCommands() {
        getCommand("info").setExecutor(new InfoCMD());
    }

    @Override
    public void onDisable() {
        getLogger().info("Adios gracias por usar mi plugin :)");
    }

    public static FirstPlugin getInstance() {
        return instance;
    }
}
