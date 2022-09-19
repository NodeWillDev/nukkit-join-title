package title;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.TextFormat;
import title.events.Event;
import java.io.File;
import java.util.LinkedHashMap;

public class Main extends PluginBase {

    public String[] messages = new String[2];

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.GREEN+"Enable");
        this.getServer().getPluginManager().registerEvents(new Event(this), this);

        //noinspection deprecation
        Config config = new Config(
                new File(this.getDataFolder(), "config.json"),
                Config.JSON,
                new LinkedHashMap<String, Object>(){
                    {
                        put("title", "§l§aWelcome §r§a{name}");
                        put("sub-title", "§aTo Server");
                    }
                });
        this.messages[0] = (String) config.get("title");
        this.messages[1] = (String) config.get("sub-title");
    }
}
