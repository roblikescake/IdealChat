package main.java.net.simplicite_mc.roblikescake.IdealChat;

import main.java.net.simplicite_mc.roblikescake.IdealChat.Commands.CommandChannel;
import org.bukkit.plugin.java.JavaPlugin;

public class IdealChat extends JavaPlugin {
    public static IdealChat p;

    @Override
    public void onEnable() {
        p = this;
        getCommand("channel").setExecutor(new CommandChannel());
    }

    @Override
    public void onDisable() {}
}