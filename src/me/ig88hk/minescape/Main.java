package me.ig88hk.minescape;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	public final Logger logger = Logger.getLogger("Minecraft");
	public PluginDescriptionFile pdfFile = getDescription();
     
    public void onEnable() {
    	logger.info("[" + pdfFile.getName() + "] v" + pdfFile.getVersion() + " is now enabled!");
    }
    	
    public void onDisable() {
    	logger.info("[" + pdfFile.getName() + "] v" + pdfFile.getVersion() + " is now disabled!");
    	}
    
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    	Player player = (Player) sender;
    	
    	  if(cmd.getName().equalsIgnoreCase("ms")) {
  		    if(args.length == 0) {
  		      //send message;
	    		   player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------");// 52 dashes
	      		   player.sendMessage(ChatColor.GRAY + "                 MineScape Version " + pdfFile.getVersion());
	      		   player.sendMessage(ChatColor.YELLOW + "               Type " + ChatColor.RED + "/ms help " + ChatColor.YELLOW + "for list of commands");
	    		   player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------");
    		      return true;
  		    }
		      if(args[0].equals("help")) { //they typed "/ms help"
		        //send message
	    		   player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------"); // 52 dashes
	      		   player.sendMessage(ChatColor.GRAY + "                            MineScape" + ChatColor.GREEN + " Help");
	    		   player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------");
	    		   player.sendMessage(ChatColor.RED + "/mc cmds" + ChatColor.YELLOW + ":" + ChatColor.YELLOW + " Show all commands.");
	    		   player.sendMessage(ChatColor.RED + "/ms admin" + ChatColor.YELLOW + ":" + ChatColor.YELLOW + " Shows all admin commands.");
	    		   player.sendMessage(ChatColor.RED + "/ms" + ChatColor.YELLOW + ":" + ChatColor.YELLOW + " Shows current version your running");
		      	  }return true;
    	  }
	      if(args[0].equals("admin")) { //they typed "/ms help"
		        //send message
	    		   player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------"); // 52 dashes
	      		   player.sendMessage(ChatColor.GRAY + "                            MineScape" + ChatColor.GREEN + "Admin");
	    		   player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------");
	    		   player.sendMessage(ChatColor.RED + "/mc kick" + ChatColor.YELLOW + ":" + ChatColor.YELLOW + " Kick players");
		      	  }
// Help Menu Above ^ --------------
	      if (cmd.getName().equalsIgnoreCase("heal")) {
	    	  player.setHealth(10);
	    	  player.setFoodLevel(10);
	    	  player.setFireTicks(0);
	    	  player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------"); // 52 dashes
     		   player.sendMessage(ChatColor.DARK_GREEN + "                            You have been " + ChatColor.GRAY + "healed" + ChatColor.DARK_GREEN + "!");
   		   player.sendMessage(ChatColor.DARK_GRAY + "----------------------------------------------------");
	    	 
	      }
		      	 
// Commands Above This Line ------------

// Events Below Here -------------





// Nothing Below Here Except return statements ----------------
		return false;
	}
}

