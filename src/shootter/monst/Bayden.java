package shootter.monst;

public class Bayden extends Monstr{
    public Bayden(String level){
        this.name = "JO";
        switch (level){
            case "1":
                this.hp=100;
                this.damage=10;
                this.maxHp=100;
                break;
            case"2":
                this.hp=150;
                this.damage=12;
                this.maxHp=150;
                break;
            case "3":
                this.hp=200;
                this.damage=20;
                this.maxHp=200;
                break;
            default:
                this.hp=100;
                this.damage=10;
                this.maxHp=100;
        }

    }
}
