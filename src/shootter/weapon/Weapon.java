package shootter.weapon;

import shootter.servise.Game;

import java.util.Objects;
import java.util.Random;

public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int durabilyti;
    protected int price;
    protected int maxDrability;

    public int getMaxDrability() {
        return maxDrability;
    }

    public void setMaxDrability(int maxDrability) {
        this.maxDrability = maxDrability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int attack(){

            int temp = Game.RANDOM.nextInt(0,100);
        if (temp >0 && temp<=10){
            return 0;
        }else if (temp>10 && temp <= 40){
            durabilyti-=1;
            return damage*3;

        } else {
            durabilyti-=1;
            return damage;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurabilyti() {
        return durabilyti;
    }

    public void setDurabilyti(int durabilyti) {
        this.durabilyti = durabilyti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weapon)) return false;
        Weapon weapon = (Weapon) o;
        return damage == weapon.damage && durabilyti == weapon.durabilyti && name.equals(weapon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, damage, durabilyti);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", durabilyti=" + durabilyti +
                '}';
    }
}
//магазин,  реализовать логику приложения батл  . доклад клонебл усовершенствовать приложение