package ru.progrm_jarvis.hq9plus.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.progrm_jarvis.hq9plus.HQ9PlusPlugin;
import ru.progrm_jarvis.hq9plus.compiler.HQ9PlusCompiler;

/**
 * Command Executor for HQ9+ commands
 */
public class CommandCompile implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        String message;
        if (args.length == 0) {
            message = "For HQ9+ syntax see: https://esolangs.org/wiki/HQ9+";
        } else if (args.length == 1) {
            message = HQ9PlusCompiler.compile(args[0]);
        } else {
            message = HQ9PlusCompiler.getUnexpectedCharacterException();
        }
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage(message);
        } else {
            HQ9PlusPlugin.getInstance().getLogger().info(message);
        }
        return false;
    }
}
