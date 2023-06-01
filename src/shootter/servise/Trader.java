package shootter.servise;

import shootter.player.Player;
import shootter.weapon.Knife;
import shootter.weapon.Pistol;
import shootter.weapon.Stone;
import shootter.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Trader {
    static List<Weapon> allWeapons = new ArrayList<>(List.of(new Knife(), new Pistol(), new Stone()));

    public static List<Weapon> generationWeaponAssrt() {
        List<Weapon> assortimentWeapons = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int temp = Game.RANDOM.nextInt(0, allWeapons.size());
            assortimentWeapons.add(allWeapons.get(temp));
        }
        return assortimentWeapons;
    }

    public static void trade(Player player) {
        List<Weapon> weapons =generationWeaponAssrt();
        Vasya:
        while (true) {
            System.out.println("Для того чтобы починить предметы нажмите 1");
            System.out.println("Для того чтобы купить предметы  нажмите 2");
            System.out.println("Для того выйти нажмите 3");
            String temp = Game.SCANNER.nextLine();
            switch (temp) {
                case "1":
                    System.out.println("Выберите что починить");
                    for (int i = 0; i <player.getWeapons().size() ; i++) {
                        Weapon weapon= player.getWeapons().get(i);
                        System.out.println(i+1+" "+ weapon.getName()+ " "+ weapon.getDurabilyti()+"/"+weapon.getMaxDrability());
                    }
                    int repear ;
                   try {
                       repear=Integer.parseInt(Game.SCANNER.nextLine())-1;
                   }catch (NumberFormatException e ){
                       System.out.println("Не корректный ввод метода оружия ");
                       continue Vasya;
                   }
                    Weapon toRepear ;
                    try {
                        toRepear=player.getWeapons().get(repear);
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Такого оружия не существует");
                        continue Vasya;
                }

                    if(player.getMoney()>=10){
                        if(toRepear.getDurabilyti()<toRepear.getMaxDrability()) {
                           toRepear.setDurabilyti(toRepear.getMaxDrability());
                            player.setMoney(player.getMoney() - 10);
                            System.out.println("Предмет "+toRepear.getName()+" отремонтирован");
                            System.out.println("Осталось денег "+player.getMoney());
                        }else {
                            System.out.println("Ремонт не нужен");
                        }
                    }else {
                        System.out.println("Не достатчно средств");
                    }
                    break;
                case "2":
                    System.out.println("Выберите предмет");
                    for (int i = 0; i <weapons.size() ; i++) {
                        Weapon iWep= weapons.get(i);
                        System.out.println(i+1+")"+iWep.getName()+" "+iWep.getPrice());
                    }
                    int choice = Integer.parseInt(Game.SCANNER.nextLine())-1;
                    Weapon toBuy= weapons.get(choice);
                    if(player.getMoney()>=toBuy.getPrice()){
                    player.setMoney(player.getMoney()-toBuy.getPrice());
                    player.getWeapons().add(toBuy);
                        System.out.println("Вы купили "+ toBuy.getName()+". Осталось средтсnв "+player.getMoney());
                    }else {
                        System.out.println("Не достаточно средств");
                    }
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Неверная команда");
            }
            System.out.println();
        }
    }

    public static void printGpt(){
        System.out.println("                                                          \n" +
                "!5!7?JJ!JY?:                                ..:.                                                    \n" +
                " ^~~?J!77.                              .!5BBBBBBP7:                                                \n" +
                "      .                                7#&5!:..:7B@&BBBGP?^                                         \n" +
                "                                    ^!Y@B:  .~JG#GJ!^:^~JG@P^                                       \n" +
                "                                 .?B&G&@~ .5##57: .!J!:   !&&^                                      \n" +
                "                                :B@Y: B@~ :@? .~JP5JYB#BY~ ?@5                                      \n" +
                "                                5@J   B@~ :@P5PYPBY~. :!5###@Y                                      \n" +
                "                                G@7   B@~ :@5^   .~##PJ~  ^Y&#~                                     \n" +
                "                                ~@#~  !PPY?@7      BP.!B&!  ~@&:                                    \n" +
                "                                 ~&@G?^ .~JGGJ~.:75@5  5@?   G@!                                    \n" +
                "                                 :@&JG##5!. ~P@B5?^BP  P@?  !@#:                                    \n" +
                "                                 .&@^ .~YB#GPJ~. :7@P  P@J~5@B^                                     \n" +
                "                                  ~&&?.   .: .!5B#GJ:  B@#B5!                                       \n" +
                "                                   :Y##G5YY5B&BY~.   ^G@5.                                          \n" +
                "                                      ^7?JJJB@GJ77?YG&B!                                            \n" +
                "                                             ^7Y555Y7^                                              \n" +
                "                                                                                                    \n" +
                "                                                                                                    \n" +
                "                                                                                                    \n" +
                "                                                                       ");
    }
}
// продумать родительский клас зелье какие методы он будет содержать и его наследников минимум 3 шт , доделать метод
//проблема не уменьшается прочность оружия после удара , происходит ремонт не поврежденного оружия и нет
// уведмления о ремонте исправить для покупки нет инфы для покупки  и суммы денег осталось
// доделать чтобы не выкидывало исключений , игры для казино
