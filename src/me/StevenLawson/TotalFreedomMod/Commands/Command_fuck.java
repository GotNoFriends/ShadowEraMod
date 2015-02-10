package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Sic the FuckHammer on people!", usage = "/<command> <player>")
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
      
      if (args[0].equals("vj"))
      {
         sender.sendMessage(ChatColor.RED + "I wouldn't do that");
      }
      
      if (args[0].equals("VjGamingUK2000"))
      {
         sender.sendMessage(ChatColor.RED + "I wouldn't do that");
      }
      
      if (args[0].equals("Got_No_Friends"))
      {
         sender.sendMessage(ChatColor.RED + "Get off");
         Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has been a VERY VERY naughty, naughty boy.");
            
            TFM_Util.adminAction(sender.getName(), "Banning " + player.getName() + ", IP: " + ip, true);
            player.kickPlayer(ChatColor.RED + "Get off my server, PRICK.");
      }
      
      // Strike lightning on player 25 times
      for (int i = 0; i <= 25; i++)
      {
         player.getWorld().strikeLightning(player.getLocation());
      }
      
      TFM_Util.adminAction(sender.getName(), "Slamming the Fuckhammer over " + player.getName() + "!", true);
      TFM_Util.bcastMsg(ChatColor.DARK_RED + player.getName() + " deserves to be cyber-bullied and fucked up!");
      player.setHealth(0.0);
      player.setFireTicks(10000);
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> WHAT THE FUCK IS WRONG WITH YOU, YOU FUCKING DUMBASS???");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> THIS IS THE SERVER SPEAKING, YOU ARE ON MOTHER FUCKING THIN ICE, YOU HEAR ME??");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I WILL RIP YOUR ENTIRE ASS APART, YOUR CLOSE TO PERMBAN!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I WILL RIP ALL YOUR ORGANS OUT, YOU FUCKFACE!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I WILL RAPE YOUR ENTIRE NIGGA FAMILY IF YOU DO THAT FUCKING BULLSHIT AGAIN!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE MOTHER FUCKING BLOCK, IT'S PERMBAN FUCKING BITCH!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I BET YOU'RE NOT EVEN LISTENING, YOU PIECE OF FUCKING SHIT! YOU DO THAT SHIT AGAIN, ITS PERMBAN YOU SHITHEAD!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> YOU'RE ON FUCKING THIN ICE!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE FUCKING BLOCK, ITS PERMBAN, ILL PERMBAN YOUR ASS!!!!!");
      Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> NOW GET YOUR FUCKING SHIT TOGETHER YOU FUCKING SHITTY TWATTY ASSHOLE");
      
      final String ip = player.getAddress().getAddress().getHostAddress().trim();
      
      new BukkitRunnable()
      {
         @Override
         public void run()
         {
            player.chat("What did I do Mr. Server?");
            
            for (final Player player : server.getOnlinePlayers())
            {
               player.playSound(player.getLocation(), Sound.WITHER_SPAWN, 5, 5);
            }
            
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> DON'T YOU DARE FUCKING ANSWER ME BACK YOU PIECE OF FUCKING SHIT! YOU KNOW WHAT YOU DID FUCKING BITCH!");
         }
         
      }.runTaskLater(plugin 3L * 20L);
      
      new BukkitRunnable()
      {
         @Override
         public void run()
         {
            player.chat("I didn't do anything...");
            for (final Player player : server.getOnlinePlayers())
            {
               player.playSound(player.getLocation(), Sound.WITHER_SPAWN, 5, 5);
            }
            
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> IF YOU FUCKING BACKTALK ME ONE MORE TIME, WATCH BY TOMORROW WHEN I COME TO YOUR HOUSE AND TALK TO YOUR PARENTS");
            player.chat("Noooooo!");
            player.chat("Please! My parents will kill me if you do.");
            
            // Insult suggestions by Azzieuss. C:
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I DON'T FUCKING CARE, ITS TOO LATE WHEN YOU FUCKING IGNORED ME YOU DUMBASS, GOOD DAY DICKHEAD");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> YOU STUPID FUCKING IDIOT.");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> GO FUCKING KILL YOURSELF YOU WORTHLESS PIECE OF FUCKING SHIT.");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> NOBODY FUCKING CARES ABOUT YOU.");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> YOUR PARENTS FUCKING HATE YOU, YOU'RE FUCKING ADOPTED YOU STUPID FUCK.");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> YOUR PARENTS THINK YOU'RE A WORTHLESS PIECE OF SHIT, NO ONE LIKES YOU.");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> EVERYBODY HATES YOU, YOU STUPID FUCKING IDIOT.");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> GO DIE, NO ONE WANTS YOU IN THIS WORLD. YOU TRY ANY FUNNY SHIT AGAIN...");
            Bukkit.broadcastMessage("<" + ChatColor.RED + "Server" + ChatColor.WHITE + "> I WILL KILL YOUR FAMILY YOU FUCKING IDIOT.");
            player.chat("I'm freaking done. Ban me please Mr.Server");
            
         }
      }.runTaskLater(plugin 5L * 20L);
      
      new BukkitRunnable()
      {
         @Override
         public void run()
         {
            Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has been a VERY VERY naughty, naughty boy.");
            
            TFM_Util.adminAction(sender.getName(), "Banning " + player.getName() + ", IP: " + ip, true);
            
            player.kickPlayer(ChatColor.RED + "FUCKOFF AND DON'T REJOIN UNTIL YOU GET YOUR SHIT TOGETHER YOU NIGGA!");
         }
         
      }.runTaskLater(plugin, 7L * 20L);
      
      return true;
   }
}
