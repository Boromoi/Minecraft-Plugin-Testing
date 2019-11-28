package Sans.commands;

import Sans.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SansCommand implements CommandExecutor {

    private Main plugin;

    public SansCommand(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("sans").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only players may execute this command! Otherwise Sans will slap you.");
            return true;
        }
        Player p = (Player) sender;

        if (p.hasPermission("sans.use")){
            p.sendMessage("hi!");
            return true;
        } else {
            p.sendMessage("You do not have permission to execute this command!");
        }
        return false;
    }
}
