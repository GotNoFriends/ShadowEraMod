package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

@commandpermissions(level = AdminLevel.SENIOR, source = SourceType.ONLY_IN_GAME)
@commandparameters(description = "Fuck someone!", usage = "/<command> <player>")
public class Command_fuck extends TFM_Command
{
   @Override
   public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
   {
      if (args.length == 0)
      {
         return false;
      }
      
      final Player player = getPlayer(args[0]);
      
      if (player == null)
      {
         playerMsg(TotalFreedomMod.PLAYER_NOT_FOUND, ChatColor.RED);
         return true;
      }
      
      // Strike lightning on player 25 times
      for (int i = 0; i <= 25; i++)
      {
         player.getWorld().strikeLightning(player.getLocation());
      }

      player.setHealth(0.0);
      player.setFireTicks(10000);
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> WHAT THE FUCK IS WRONG WITH YOU, YOU FUCKING DUMBASS???");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> THIS IS THE SERVER SPEAKING, YOU ARE ON MOTHER FUCKING THIN ICE, YOU HEAR ME??");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I WILL RIP YOUR ENTIRE ASS APART, YOUR CLOSE TO PERMBAN!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I WILL RIP ALL YOUR ORGANS OUT, YOU FUCKFACE!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE MOTHER FUCKING BLOCK, IT'S PERMBAN FUCKING BITCH!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I BET YOU'RE NOT EVEN LISTENING, YOU PIECE OF FUCKING SHIT! YOU DO THAT SHIT AGAIN, ITS PERMBAN YOU SHITHEAD!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> YOU'RE ON FUCKING THIN ICE!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE FUCKING BLOCK, ITS PERMBAN, ILL PERMBAN YOUR ASS!!!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> NOW GET YOUR FUCKING SHIT TOGETHER YOU FUCKING SHITTY TWATTY FUCKFACE!");
      
      new BukkitRunnable()
      {
         @Override
         public void run()
         {
            Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has been a VERY VERY naughty, naughty boy.");
            Bukkit.broadcastMessage(ChatColor.RED + "Disconnecting " + player.getName() + ".");
            player.kickPlayer(ChatColor.RED + "FUCKOFF AND DON'T REJOIN UNTIL YOU GET YOUR SHIT TOGETHER YOU FUCKFACE!");
         }
         
      }.runTaskLater(plugin, 3L * 20L);
      
      return true;
   }
}
