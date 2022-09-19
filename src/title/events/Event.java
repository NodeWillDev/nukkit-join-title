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
        player.sendMessage("test message");
    }
}
