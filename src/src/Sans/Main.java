package Sans;

import Sans.commands.SansCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new SansCommand(this);
    }

}
