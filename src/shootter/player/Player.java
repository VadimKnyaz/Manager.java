package shootter.player;

import shootter.monst.Monstr;
import shootter.potion.Potion;
import shootter.weapon.Knife;
import shootter.weapon.Pistol;
import shootter.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private int level;
    private String name;
    private int expiriens;
    private int hp;
    private int maxHp;
    private int damage;
    private int money;

    private List<Potion>;
    private Weapon currentWeapon;

    public Player(String name) {
        this.name = name;
        level = 1;
        expiriens = 0;
        hp = 200;
        maxHp = 200;
        damage = 100;
        currentWeapon = new Pistol();
        weapons.add(currentWeapon);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public ArrayList<Weapon> getArrayList() {
        return weapons;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpiriens() {
        return expiriens;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getcurrentWeapo() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExpiriens(int expiriens) {
        this.expiriens = expiriens;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void rest(int second) throws InterruptedException {
        for (int i = 0; i < second; i++) {
            Thread.sleep(1000);
            if (this.hp < maxHp) {
                this.hp += 1;
            }
        }
        System.out.println("Игрок отдохнул и востановил "+second);
    }

    public boolean attackAndDeathCheck(Monstr monstr) {
        int temp = currentWeapon.attack()+damage;
        monstr.setHp(monstr.getHp() - temp);
        System.out.println("Игрок " + this.name + " нанес " + temp + " урона. У монстра осталось " + monstr.getHp());
        if (monstr.getHp() <= 0) {
            return true;
        } else {
            return false;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return level == player.level && expiriens == player.expiriens && hp == player.hp && maxHp == player.maxHp && damage == player.damage && weapons.equals(player.weapons) && name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapons, level, name, expiriens, hp, maxHp, damage);
    }

    @Override
    public String toString() {
        return "Player{" +
                "arrayList=" + weapons +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", expiriens=" + expiriens +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", damage=" + damage +
                '}';
    }

}
//предложение по улучшению бизнес логики , повторить старое