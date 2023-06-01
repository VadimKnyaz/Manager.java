package shootter.monst;

public class Zelenskiy extends Monstr {
    public Zelenskiy(String level) {
        this.name = "ZELEN";
        switch (level){
            case "1":
                this.hp = 200;
                this.damage = 20;
                this.maxHp = 200;
                break;
            case"2":
                this.hp = 250;
                this.damage = 30;
                this.maxHp = 250;
                break;
            case"3":
                this.hp = 300;
                this.damage = 40;
                this.maxHp = 300;
                break;
            default:
                this.hp = 200;
                this.damage = 20;
                this.maxHp = 200;
                break;
        }


    }
}
