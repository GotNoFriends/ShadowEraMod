package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "Run a command <amount> times.", usage = "/<command> <times> <outcommand>")
public class Command_multirun extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (!TFM_AdminList.isTelnetAdmin(sender, false))
        {
            playerMsg(TFM_Command.MSG_NO_PERMS, ChatColor.RED);
            return true;
        }
        if (args.length < 2)
        {
            return false;
        }
        
        if (args[1].equals("multirun"))
        {
            playerMsg("You can't multirun a multirun!", ChatColor.RED);
            return true;
        }
        
        if (Integer.parseInt(args[0]) == 1 || Integer.parseInt(args[0]) == 0)
        {
            TFM_Util.playerMsg(sender, String.format("Why are you trying to run the command %s times?", Integer.parseInt(args[0])), ChatColor.RED);
            return true;
        }
        String baseCommand = StringUtils.join(args, " ", 1, args.length);
        TFM_Util.playerMsg(sender, String.format("Running: %s %s times", baseCommand, Integer.parseInt(args[0])), ChatColor.DARK_PURPLE);
        int i = 0;
        do
        {
            Bukkit.dispatchCommand(sender, baseCommand);
            i++;
        }
        while (i < Integer.parseInt(args[0]));
        return true;
    }
}
