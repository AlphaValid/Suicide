package com.alphavalid.suicide;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("suicide")) {
            if (sender instanceof Player) {
                Player player = ((Player) sender);
                ((CraftPlayer)player).getHandle().killEntity();
                sender.sendMessage("§cYou are dead!");
                return true;
            }
            sender.sendMessage("Only the players can use this command.");
            return true;
        }
        return false;
    }
}
