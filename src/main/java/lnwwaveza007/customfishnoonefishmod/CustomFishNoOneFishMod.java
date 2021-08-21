package lnwwaveza007.customfishnoonefishmod;

import nf.noonefishing.API.NoOneFishingEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomFishNoOneFishMod extends JavaPlugin {

    static Plugin plugin = null;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "            CustomFishing 1.0                 ");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "          By Lnwwaveza007               ");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "              Enabled                    ");
        getServer().getPluginManager().registerEvents(new Main(), this);
        plugin = this;
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "            CustomFishing 1.0                 ");
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "          By Lnwwaveza007               ");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "              Disabled                    ");
        // Plugin shutdown logic
    }
}
