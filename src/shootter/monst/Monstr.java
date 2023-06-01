package shootter.monst;

import shootter.player.Player;
import shootter.servise.Game;

import java.time.LocalDateTime;
import java.util.Random;

public abstract class Monstr {
    protected String name;

    protected int hp;
    protected int maxHp;
    protected int damage;

    public boolean attackAndDeathCheck(Player player) {
        int damageModifier = 1;
        if(LocalDateTime.now().getHour()>0 && LocalDateTime.now().getHour()<=5){
            damageModifier=2;
        }

        int temp = Game.RANDOM.nextInt(0, 100);
        if (temp > 0 && temp <= 30) {
            player.setHp(player.getHp() - damage * 2*damageModifier);
            System.out.println("Монстр " + getName() + " нанес урона " + damage * 2 + ", осталось " + player.getHp());
        } else if (temp > 30 && temp <= 70) {
            player.setHp(player.getHp() - damage*damageModifier);
            System.out.println("Монстр " + getName() + " нанес урона " + damage + " , осталось " + player.getHp());
        } else {
            System.out.println("Монстр " + getName() + " промахнулся");
        }
        if (player.getHp() <= 0) {
            return true;
        } else {
            return false;
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
