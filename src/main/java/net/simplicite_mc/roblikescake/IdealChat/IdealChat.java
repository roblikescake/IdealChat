package net.simplicite_mc.roblikescake.idealchat;

import net.simplicite_mc.roblikescake.idealchat.Commands.CommandChannel;

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