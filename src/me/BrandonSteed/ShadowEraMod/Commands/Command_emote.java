package me.BrandonSteed.TotalFreedomMod.Commands;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.StevenLawson.Commands.*;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Custom Emotes Chat.", usage = "/<command> <power> [args]")
public class Command_gtfo extends TFM_Command
{
  @Override
  public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    if (args.length == 0)
    {
      sender.sendMessage(ChatColor.RED + "/emote <power> [args]");
      return true;
    }
    
    if (args[0].equals("list"))
    {
      sender.sendMessage(ChatColor.DARK_PURPLE + "== Action Emotes ==");
      sender.sendMessage(ChatColor.RED + "/emote selfie - Take a selfie.");
      sender.sendMessage(ChatColor.RED + "/emotes kiss <player> - Kiss a player.");
      sender.sendMessage(ChatColor.RED + "/emotes hug <player> - Hug a player.");
      return true;
    }
    
    if (args[0].equals("selfie"))
    {
      Bukkit.broadcastMessage(ChatColor.YELLOW + sender.getName() + " just took a selfie!");
      return true;
    }
    
    if (args[0].equals("kiss"))
    {
      if (args.length == 1)
      {
        sender.sendMessage(ChatColor.RED + "/emote kiss <player>");
        return true;
      }
      
      final Player player = getPlayer(args[1]);
      
      if (player == null)
      {
        sender.sendMessage(ChatColor.GRAY + args[1] + " not found!");
        return true;
      }
      
      Bukkit.broadcastMessage(ChatColor.YELLOW + sender.getName() + " kissed " + player.getName() + "!");
      
      return true;
    }
    
    if (args[0].equals("hug")) 
    {
      if (args.length == 1)
      {
        sender.sendMessage(ChatColor.RED + "/emote hug <player>");
        return true;
      }
      
      final Player player = getPlayer(args[1]);
      
      if (player == null)
      {
        sender.sendMessage(ChatColor.GRAY + args[1] + " not found!");
        return true;
      }
      
      Bukkit.broadcastMessage(ChatColor.YELLOW + sender.getName() + " has hugged " + player.getName() + "!");
      
      return true;      
    }
    
    return true;
  }
}
