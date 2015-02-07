package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Ban;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "Slam the VJHammer over someone.", usage = "/<command> <playername>")
public class Command_vj extends TFM_Command
{
    @Override
    public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        
        if (args.length != 1)
        {
            return false;
        }
        
        if (args[0].equals("vj"))
        {
            sender.sendMessage(ChatColor.RED + "Nice try, but you can't VJHammer vj!");
        }
        
        if (args[0].equals("VjGamingUK2000"))
        {
            sender.sendMessage(ChatColor.RED + "Nice try, but you can't VJHammer vj!");
        }
        
        final Player player = getPlayer(args[0]);

        if (player == null)
        {
            sender.sendMessage(TFM_Command.PLAYER_NOT_FOUND);
            return true;
        }
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                for (final Player player : server.getOnlinePlayers())
                {
                    // plays sound of a woman screaming to all players
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }
            }
            
        }.runTaskLater(plugin, 4L * 20L);  
        
        TFM_Util.bcastMsg(ChatColor.DARK_RED + "vj13573 - I AM REALLY DISAPPOINTED IN YOU " + player.getName() + "!!!");
        TFM_Util.bcastMsg(ChatColor.DARK_PURPLE + "vj13573 - YOU SHALL FACE MY PURPLE WRATH!");
        TFM_Util.bcastMsg(ChatColor.RED + "vj13573 - I WILL RIP YOUR ENTIRE ASS APART, YOU'RE CLOSE TO PERMBAN!");
        player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().strikeLightning(player.getLocation());
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.setFireTicks(10000);        

        final String ip = player.getAddress().getAddress().getHostAddress().trim();

        // remove from superadmin
        if (TFM_AdminList.isSuperAdmin(player))
        {
            TFM_Util.adminAction(sender.getName(), "Removing " + player.getName() + " from the superadmin list.", true);
            TFM_AdminList.removeSuperadmin(player);
        }

        // remove from whitelist
        player.setWhitelisted(false);

        // deop
        player.setOp(false);

        // ban IPs
        for (String playerIp : TFM_PlayerList.getEntry(player).getIps())
        {
            TFM_BanManager.addIpBan(new TFM_Ban(playerIp, player.getName()));
        }

        // ban uuid
        TFM_BanManager.addUuidBan(player);
                
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.getWorld().strikeLightning(player.getLocation());
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.setFireTicks(10000);                
                
                
                for (final Player player : server.getOnlinePlayers())
                {
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }                     
            }
        }.runTaskLater(plugin, 1L * 20L);         
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                    TFM_Util.bcastMsg(ChatColor.RED + player.getName() + " will be sent to mars!");
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.getWorld().strikeLightning(player.getLocation());
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.setFireTicks(10000);
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.getWorld().strikeLightning(player.getLocation());
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    
                
                for (final Player player : server.getOnlinePlayers())
                {
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }                     
            }
        }.runTaskLater(plugin, 1L * 20L);          
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.getWorld().strikeLightning(player.getLocation());
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.setFireTicks(10000);                
                
                for (final Player player : server.getOnlinePlayers())
                {
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }                     
            }
        }.runTaskLater(plugin, 2L * 20L);         
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {         
                //
            }
        }.runTaskLater(plugin, 2L * 20L);  

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.getWorld().strikeLightning(player.getLocation());
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.setFireTicks(10000);
                
                for (final Player player : server.getOnlinePlayers())
                {
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }                
            }
        }.runTaskLater(plugin, 4L * 20L);         
        
        // set gamemode to survival
        player.setGameMode(GameMode.SURVIVAL);

        // clear inventory
        player.closeInventory();
        player.getInventory().clear();

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
               
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);
                
                for (final Player player : server.getOnlinePlayers())
                {
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }                
            }
        }.runTaskLater(plugin, 3L * 20L);        
        
        // ignite player
        player.setFireTicks(10000);

        // generate explosion
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
        player.getWorld().createExplosion(player.getLocation(), 4F);
        player.getWorld().strikeLightning(player.getLocation());
        player.getWorld().createExplosion(player.getLocation(), 4F);

        

        // Shoot the player in the sky
        player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
              
                TFM_Util.adminAction(sender.getName(), "VJ'ing " + player.getName() + "!", true);
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.setHealth(0.0);                
            }
        }.runTaskLater(plugin, 2L * 20L);           
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                // strike lightning and explosion
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.setFireTicks(10000);
                
                // machat (force player to talk in chat)
                player.chat("NO, im sorry!");
                player.chat("Please vj13573, please don't obliviate your purple powers on me..");
                player.chat("*screams*");
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);               
                for (final Player player : server.getOnlinePlayers())
                {
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }
                
                // response
                TFM_Util.bcastMsg(ChatColor.WHITE + "<" + ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "Developer" + ChatColor.DARK_GRAY + "]" + ChatColor.DARK_RED + " vj13573" + ChatColor.WHITE + "> Yeah well... it's too late... you deserved it.");
                TFM_Util.bcastMsg(ChatColor.WHITE + "<" + ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "Developer" + ChatColor.DARK_GRAY + "]" + ChatColor.DARK_RED + " vj13573" + ChatColor.WHITE + "> Good day to you.");
            }
        }.runTaskLater(plugin, 3L * 20L);        
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);              
                player.getWorld().createExplosion(player.getLocation(), 4F);
                // strike lightning
                player.getWorld().strikeLightning(player.getLocation());
                
                player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                
                // mini orbit
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));

                // kill (if not done already)
                player.setHealth(0.0);
            }
        }.runTaskLater(plugin, 1L * 20L);        
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                
                player.getWorld().createExplosion(player.getLocation(), 4F);
                // strike lightning
                player.getWorld().strikeLightning(player.getLocation());
                
                // Play sound; woman screaming
                player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.setHealth(0.0);                
                
                // mini orbit
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));

            }
        }.runTaskLater(plugin, 1L * 20L);      
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                
                player.getWorld().createExplosion(player.getLocation(), 4F);
                // strike lightning
                player.getWorld().strikeLightning(player.getLocation());
                
                player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                
                // mini orbit
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));

            }
        }.runTaskLater(plugin, 2L * 20L);           
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                
                TFM_Util.bcastMsg(ChatColor.AQUA + sender.getName() + " - Shooting " + player.getName() + " into the sky");
                // strike lightning
                player.getWorld().strikeLightning(player.getLocation());
                
                // mini orbit
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));

            }
        }.runTaskLater(plugin, 2L * 20L);
        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.setHealth(0.0);
            }
        }.runTaskLater(plugin, 4L * 20L);

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                
                player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().createExplosion(player.getLocation(), 4F);
                player.setHealth(0.0);                
           
                TFM_Util.adminAction(sender.getName(), "Slamming the VJHammer over " + player.getName() + "!", true);
                for (final Player player : server.getOnlinePlayers())
                {
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                }
                player.getWorld().strikeLightning(player.getLocation());
                
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.getWorld().strikeLightning(player.getLocation());
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.setFireTicks(10000);      
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.getWorld().strikeLightning(player.getLocation());
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.setHealth(0.0);

                    

                
                TFM_Util.adminAction(sender.getName(), "Banning " + player.getName() + ", IP: " + ip, true);

                // generate explosion
                player.getWorld().createExplosion(player.getLocation(), 4F);

                TFM_Util.bcastMsg(ChatColor.GOLD + "Player " + ChatColor.DARK_GRAY + "[" + ChatColor.LIGHT_PURPLE + "Senior Admin" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + sender.getName() + ChatColor.GOLD + " banned " + ChatColor.RED + player.getName() + ChatColor.GOLD + " for " + ChatColor.DARK_PURPLE + "The purple overlord of the VJHammer has spoken!" + ChatColor.GOLD + ".");
                // kick player
                player.kickPlayer(ChatColor.DARK_PURPLE + "The purple overlord of the VJHammer has spoken!");
            }
        }.runTaskLater(plugin, 5L * 20L);

        return true;
    }
}

