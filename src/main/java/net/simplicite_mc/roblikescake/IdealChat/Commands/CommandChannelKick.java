package net.simplicite_mc.roblikescake.IdealChat.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandChannelKick implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (args.length) {
            case 2:
                sender.sendMessage(ChatColor.RED + "Not enough arguments. Eat some cake and try again! :)");
            case 3:
                String playerName = args[1];
                String channelName = args[2];

                sender.sendMessage(playerName + " " + channelName);
            default:
                sender.sendMessage(ChatColor.RED + "Not enough arguments. Eat some cake and try again!");
        }


        return false;
    }
}