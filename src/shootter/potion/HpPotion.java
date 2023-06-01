package shootter.potion;

import shootter.player.Player;

public class HpPotion extends Potion {

    @Override
    public void use(Player player) {
        player.setHp(player.getMaxHp());
    }
}
