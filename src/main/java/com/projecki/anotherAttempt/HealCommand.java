package com.projecki.anotherAttempt;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Your health as been restored!");
            player.setHealth(20);
        }



        return false;
    }
}
