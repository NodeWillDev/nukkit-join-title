package title.events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import title.Main;

public class Event implements Listener {

    public Main main;

    public Event(Main main){
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String title = this.getFormatMessage(0, "{name}", player.getName());
        String sub_title = this.getFormatMessage(1, "{name}", player.getName());

        player.sendTitle(title, sub_title, 15, 60, 30);
    }

    public String getFormatMessage(int msg_index, String format, String replace) {
        return this.main.messages[msg_index].replace(format, replace);
    }
}
