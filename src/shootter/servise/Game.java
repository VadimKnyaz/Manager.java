package shootter.servise;

import shootter.cazino.Cazino777;
import shootter.monst.Bayden;
import shootter.monst.Monstr;
import shootter.monst.Zelenskiy;
import shootter.player.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static ArrayList<Monstr> monstrs = new ArrayList<>();

    public static final Random RANDOM = new Random();
    public static final Scanner SCANNER = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void showHP(Player player, Monstr monstr) {
        int currentHp = (int) (player.getHp()*1.0 / player.getMaxHp() * 10);
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.print(ANSI_RED + "|");
            } else if (i == currentHp) {
                System.out.print( "|"+ANSI_RESET );
            } else {
                System.out.print("|");
            }
        }
        System.out.print(" "+player.getName()+"    "+monstr.getName());
        int currentHpMonstr=(int)(monstr.getHp()*1.0/monstr.getMaxHp()*10);
        for (int i = 1; i <=10; i++) {
            if (i==1){
                System.out.print(ANSI_RED+"|");
            } else if (i==currentHpMonstr) {
                System.out.print("|"+ANSI_RESET);
            }else {
                System.out.print("|");
            }
        }


    }
//битва shouHp интегрировать в метод боя сделать так что бы после обмена ударами отображались хп у обоих
    public static void initMonsters(String level) {
        monstrs.add(new Bayden(level));
        monstrs.add(new Zelenskiy(level));
    }

    public static void main(String[] args) throws InterruptedException {

//        System.out.println("Введите уровень сложности 1.2.3");
//        String level = SCANNER.nextLine();
//        initMonsters(level);
//        System.out.println(ANSI_BLUE + "ПРИВЕТ Я РАЗРАБОТЧИК" + ANSI_RESET);
//        System.out.println(ANSI_RED+"ПРИВЕТ Я РАЗРАБОТЧИК");
        Player player = new Player("AAAA");
        Cazino777.gameCazino(player);
        Monstr monstr=new Bayden("1");
        player.setHp(player.getMaxHp()/3);
        showHP(player,monstr);

//        player.setMoney(100);
//        Cazino777.bones(player);
//        for (int i = 0; i < monstrs.size(); i++) {
//            System.out.println("\n" + (i + 1) + " раунд.\n");
//            if (!battleEndCheckWinner(monstrs.get(i), player)) {
//                System.out.println("Игра закончена игрок проиграл");
//                System.exit(0);
//            }
//
//        }
//        System.out.println("Игрок победил");
//
//        player.rest(10);
//        player.setMoney(3000);
//        Trader.trade(player);
    }

    public static void experiensGain(Player player) {
        player.setExpiriens(50 + player.getExpiriens());
        if (player.getExpiriens() % 100 == 0) {
            player.setLevel(player.getLevel() + 1);
            System.out.println("Игрок " + player.getName() + " повысил уровень до " + player.getLevel());
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean battleEndCheckWinner(Monstr monstr, Player player) throws InterruptedException {
        while (player.getHp() > 0 || monstr.getHp() > 0) {
            showHP(player,monstr);
            if (player.attackAndDeathCheck(monstr)) {
                System.out.println("Игрок " + player.getName() + " победил");
                experiensGain(player);

                return true;
            }
            Thread.sleep(1000);
            if (monstr.attackAndDeathCheck(player)) {
                System.out.println("Монстр " + monstr.getName() + " победил");
                return false;
            }
            Thread.sleep(600);
        }
        return true;

    }

}
//полностью отдебажить , принять человеческий вид , кто кого атакует насколько и как
//5 фич на псевдокоде
//1 отдых
//2 по времени ночью монстры мощные
//3 задания по чек поинтам
//4 добавление плееров  в комнду команда
//5 добавление различного оружия паралич ослепление замедление
//6 минные поля карты
//7 динамическая погода зимой болше энергии тратиться есмли не одеться ураган и тд
//8 транспорт передвижение по точкам по картам
//9 локации подводой вода подземелье горы
//10 возможность купить ночную винтовку для убивания ночных монстор
//11 зайти в казино

//Продумать зелья и системы блоков алгоритмика