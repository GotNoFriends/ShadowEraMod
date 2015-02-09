package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Clear your own chat.", usage = "/<command>")
public class Command_cy extends TFM_Command
{
  @Override
  public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    if (args.length == 0)
    {
      Player player = (Player) sender;
      
      for (int i = 0; i <= 100; i++)
      {
        sender.sendMessage("");
      }
      
      sender.sendMessage(ChatColor.BLUE + "You have cleared your personal chat.");
      
      return true;
    }
    
    return true;
  }
  
}
