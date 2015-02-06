package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Clear the chat.", usage = "/<command>")
public class Command_cc extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length == 0)
        {
            Player player = (Player) sender;
            
            for (int i = 0; i <= 100; i++)
            {
              Bukkit.broadcastMessage("");
            }
            
            Bukkit.broadcastMessage(ChatColor.BLUE + "Chat Cleared by " + sender.getName() + ".");
            
            return true;
        }
        
        return true;
    }
}
