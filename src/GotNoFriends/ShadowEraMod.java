package me.GotNoFriends.ShadowEraMod;

import me.RyanWild.CJFreedomMod.Player.CJFM_DonatorList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import me.RyanWild.CJFreedomMod.Listener.CJFM_PlayerListener;
import me.StevenLawson.TotalFreedomMod.TFM_Log;
import static me.StevenLawson.TotalFreedomMod.TotalFreedomMod.plugin;
import static me.StevenLawson.TotalFreedomMod.TotalFreedomMod.server;
import org.bukkit.plugin.PluginManager;

public class ShadowEraMod
{

    public static final String DONATOR_FILE = "donator.yml";

    public void onEnable()
    {
        loadDonatorConfig();
    }

    public static void loadDonatorConfig()
    {
        try
        {
            SEM_DonatorList.load();
            SEM_DonatorList.createBackup();
        }
        catch (Exception ex)
        {
            TFM_Log.severe("Error loading donator list: " + ex.getMessage());
        }
    }
     }
}
