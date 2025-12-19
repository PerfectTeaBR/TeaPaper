package net.perfect.tea.teapaper.TeaPaperCommands;

import net.minecraft.server.MinecraftServer;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.io.File;

public class TeaPaperCommands  extends Commands {
    public TeaPaperCommands(String name) {
        getCommand("about").setExecutor(new Commands());
        getCommand("paper").setExecutor(new Commands());
        getCommand("repo").setExecutor(new Commands());
        getCommand("howtolaunch").setExecutor(new Commands());
    }
}