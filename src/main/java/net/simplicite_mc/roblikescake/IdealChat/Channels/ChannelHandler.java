package net.simplicite_mc.roblikescake.IdealChat.Channels;

import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class ChannelHandler {

    List<String> playerList = new ArrayList<String>();

    public boolean addPlayer(CommandSender sender) {
        String playerName = sender.getName();
        if (playerList.contains(playerName)) {
            return false;
        } else {
            playerList.add(playerName);
            return true;
        }
    }

    public boolean removePlayer(CommandSender sender) {
        String playerName = sender.getName();
        if (playerList.contains(playerName)) {
            playerList.remove(playerName);
            return true;
        } else {
            return false;
        }
    }
}