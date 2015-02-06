package me.StevenLawson.TotalFreedomMod.Commands;
import me.StevenLawson.TotalFreedomMod.TFM_Ban;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
@CommandPermissions(level=AdminLevel.ALL, source=SourceType.BOTH)
@CommandParameters(description="For the bad Superadmins", usage="/<command> <playername>")
public class Command_oblivion
extends TFM_Command
{
public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
{
if (!sender.getName().equals("xTyph"))
{
sender.sendMessage(TotalFreedomMod.MSG_NO_PERMS);
return true;
}
if (args.length != 1) {
return false;
}
final Player player = getPlayer(args[0]);
if (player == null)
{
sender.sendMessage(TotalFreedomMod.PLAYER_NOT_FOUND);
return true;
}
sender_p.chat("Hey " + player.getName() + ", you know what?");
player.chat("What....?");
sender_p.chat("YOU FUCKED WITH THE WRONG DAMN PERSON!");
TFM_Util.adminAction(sender.getName(), "INCOMING OBLIVION! Casting a dark, fiery shadow of oblivion over " + player.getName(), true);
TFM_Util.bcastMsg(player.getName() + " is getting hell sent over them by Typhlosion147", ChatColor.RED);
final String ip = player.getAddress().getAddress().getHostAddress().trim();
player.setWhitelisted(false);
player.setOp(false);
player.setGameMode(GameMode.SURVIVAL);
player.closeInventory();
player.getInventory().clear();
player.setFireTicks(10000);
player.getWorld().createExplosion(player.getLocation(), 4.0F);
player.chat("OH FUCK! FUUUUUUUUUUUUUUCCCCKKKKKK!!!!!!!!!!! AAAAAHHHHHHHHHHHHHHHHH!!!!!!!!!!!");
new BukkitRunnable()
{
public void run()
{
player.getWorld().strikeLightning(player.getLocation());
}
}
.runTaskLater(this.plugin, 40L);
player.getWorld().createExplosion(player.getLocation(), 4.0F);
new BukkitRunnable()
{
public void run()
{
player.getWorld().strikeLightning(player.getLocation());
player.chat("OH SHIT! WHY'D I THINK THIS WAS A GOOD IDEA????!??!??? AAAAAHHHHHHHHHHHHHHHHH!!!!!!");
// ban uuid
TFM_BanManager.addUuidBan(player);
}
}
.runTaskLater(this.plugin, 40L);
TFM_Util.adminAction(player.getName(), "Has been Obliterated by Typhlosion147! Hopefully this di'kut has learn their fucking lesson... ", true);
player.setFireTicks(10000);
// ban IPs
for (String playerIp : TFM_PlayerList.getEntry(player).getIps())
{
TFM_BanManager.addIpBan(new TFM_Ban(playerIp, player.getName()));
}
new BukkitRunnable()
{
public void run()
{
TFM_Util.adminAction(sender.getName(), "Has sent oblivion over: " + player.getName() + ", IP: " + ip, true);
player.getWorld().createExplosion(player.getLocation(), 4.0F);
player.kickPlayer(ChatColor.RED + "You're messing with fire and you don't want to get burned, so next time you join.... GET YOUR FUCKING SHIT TOGETHER YOU WORTHLESS DI'KUT!");
}
}
.runTaskLater(this.plugin, 80L);
return true;
}
}
