package shootter.potion;

import shootter.player.Player;

public class LevelUpPotion extends Potion{

    @Override
    public void use(Player player) {
        player.setLevel(player.getLevel()+1);
    }
}
