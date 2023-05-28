package es.angelillo15.firstplugin.cmd;

import es.angelillo15.firstplugin.FirstPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class InfoCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        FirstPlugin plugin = FirstPlugin.getInstance();

        if (args.length < 1) {
            return false;
        }

        if (args[0].equalsIgnoreCase("version")) {
            sender.sendMessage("version: " + plugin.getDescription().getVersion());
            return true;
        }

        if (args[0].equalsIgnoreCase("author")) {
            sender.sendMessage("Plugin made by: " + plugin.getDescription().getAuthors().get(0));
            return true;
        }

        return false;
    }
}
