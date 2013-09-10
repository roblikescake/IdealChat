package net.simplicite_mc.roblikescake.idealchat.Commands;

import net.simplicite_mc.roblikescake.idealchat.Channels.ChannelHandler;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandChannelJoin implements CommandExecutor {
    public static ChannelHandler channelHandler = new ChannelHandler();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (channelHandler.addPlayer(sender)) {
            sender.sendMessage(ChatColor.GRAY + "You have joined the channel!");
        } else {
            sender.sendMessage(ChatColor.GRAY + "You're already in this channel!");
        }
        return true;
    }
}