package ru.bukkitserver;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ExpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		if(!sender.hasPermission("exp.getexp"))
		{
			sender.sendMessage("You dont has permission!");
			return true;
		}
		if(!(sender instanceof Player))
		{
			sender.sendMessage("You try to get console exp? You mad, bro.");
			return true;
		}
		else{
		if(args.length == 1)
		{
			if(!sender.hasPermission("exp.getotherexp"))
			{
				sender.sendMessage("You dont has permission!");
				return true;
			}
				if(!Bukkit.getOfflinePlayer(args[0]).isOnline())
				{
					sender.sendMessage(args[0] +ChatColor.RED +" not online!");
					return true;
				}
				Player pl = Bukkit.getPlayer(args[0]);
				sender.sendMessage(args[0] + "'s"+ChatColor.GOLD +" exp is: " + pl.getExp());
				return true;
		}
		}
		if(sender instanceof Player)
		{
			if(args.length == 0)
			{
			Player p = (Player)sender;
			sender.sendMessage(ChatColor.GOLD +"You exp is: " + p.getExp());
			}
		else
		{
			sender.sendMessage(ChatColor.RED + "Error! Something went wrong...");
			return false;
		}
	}
		return true;
		}
}
