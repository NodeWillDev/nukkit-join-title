package title;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import title.events.Event;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.GREEN+"Enable");
        this.getServer().getPluginManager().registerEvents(new Event(this), this);
    }
}
