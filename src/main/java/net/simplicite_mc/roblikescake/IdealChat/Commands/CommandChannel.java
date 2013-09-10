package net.simplicite_mc.roblikescake.idealchat.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandChannel implements CommandExecutor {

    private CommandExecutor channelKickCommand = new CommandChannelKick();
    private CommandExecutor channelJoinCommand = new CommandChannelJoin();
    private CommandExecutor channelLeaveCommand = new CommandChannelLeave();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("channel")){
            switch (args.length) {
                case 1:
                    if (args[0].equalsIgnoreCase("list")) {
                        //Execute command
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("kick")) {
                        return channelKickCommand.onCommand(sender, command, label, args);
                    }
                    if (args[0].equalsIgnoreCase("join")) {
                        return channelJoinCommand.onCommand(sender, command, label, args);
                    }
                    if (args[0].equalsIgnoreCase("leave")) {
                        return channelLeaveCommand.onCommand(sender, command, label, args);
                    }
            }
        }
        return false;
    }
}