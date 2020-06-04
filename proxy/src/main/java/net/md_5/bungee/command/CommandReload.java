package net.md_5.bungee.command;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.event.ProxyReloadEvent;
import net.md_5.bungee.api.plugin.Command;

public class CommandReload extends Command
{

    public CommandReload()
    {
        super( "greload", "bungeecord.command.reload", "blreload" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
        BungeeCord.getInstance().config.load();
        BungeeCord.getInstance().reloadMessages();
        BungeeCord.getInstance().getPluginManager().callEvent( new ProxyReloadEvent( sender ) );

        sender.sendMessage( ChatColor.BOLD.toString() + ChatColor.GREEN.toString() + "Bowline has been reloaded." );
    }
}
