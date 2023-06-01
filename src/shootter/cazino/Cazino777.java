package shootter.cazino;

import shootter.player.Player;
import shootter.servise.Game;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Cazino777 {
    public static void gameCazino(Player player) {
        System.out.println("Добро пожаловать в казино выберите игру из представленных");
        System.out.println("1 Кости \n2 Викторина \n3Выход");
        String numbervariant = Game.SCANNER.nextLine();
        switch (numbervariant){
            case "1":
                bones(player);
                break;
            case "2":
                victorina(player);
                break;
            case "3":
                return;
            default:
                System.out.println("Нет такой игры");
        }
    }

    public static void bones(Player player) {
        System.out.println("Здраствуйте уважаемый " + player.getName() + " ставки делаются на конкретное число из кости и по результату выпадает вознаграждение");
        System.out.println("Сделайте вашу ставку в формате \"Ставка №кости\"");
        String[] temp = Game.SCANNER.nextLine().trim().split(" ");
        int bet;
        int boneNumber;
        try {
            bet = Integer.parseInt(temp[0]);
            boneNumber = Integer.parseInt(temp[1]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный формат ввода ставок");
            return;
        }
//        как улучшить программу , метод бон доделать ,оттестить картинки , инициализация.
        int gameResult = throwBone();
        if (player.getMoney() < bet) {
            System.out.println("Пошел вон нищеброд");
            return;
        }
        if (boneNumber == gameResult) {
            System.out.println("Игрок " + player.getName() + " победил.Награда составляет " + (bet * 3));
            player.setMoney(player.getMoney() + (bet * 3));
        } else {
            System.out.println("Игрок проиграл ");
            player.setMoney(player.getMoney() - bet);
        }
        System.out.println("Баланс составляет " + player.getMoney());
    }

    public static int throwBone() {
        int resultBone = Game.RANDOM.nextInt(1, 7);
        switch (resultBone) {
            case 1:
                System.out.println("                               .\n" +
                        "                                       .\n" +
                        "                                       .\n" +
                        "                                       .\n" +
                        "                 .:~~:                 .\n" +
                        "                ^G####P:               .\n" +
                        "                J#BBBB#7               .\n" +
                        "                .?5PP57.               .\n" +
                        "                  ...                  .\n" +
                        "                                " +
                        "");

                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println("    ..             ..   .        \n" +
                        "         .B&&B.         ?&@@Y  :.       \n" +
                        "         :&@@&:         J@@@P  ::       \n" +
                        "          .::.           .:.   ::       \n" +
                        "                               ::       \n" +
                        "                               ::       \n" +
                        "                               ::       \n" +
                        "           ..             .    ::       \n" +
                        "         .B&@B.         7&@&J  ::       \n" +
                        "         :@@@@^         5@@@G  ::       \n" +
                        "        . .^^.           :^:  .^.       ");
                break;
            case 5:
                System.out.println();
                break;
            case 6:
                System.out.println();
                break;
        }
        return resultBone;
    }

    public static void victorina(Player player) {
        String[] arrayQwestions = {"Какое животное является символом США?",
                " Какой город является столицей Италии?", "Кто написал 'Войну и мир'?", " Какой год считается началом Второй мировой войны?" ,
                " Какая планета является ближайшей к Солнцу?", "Какая страна является самой большой по территории?", " Какая река является самой длинной в мире?",
                " Как называется научная дисциплина, изучающая землю и ее окружение?",
                "Кто является автором 'Гарри Поттера'?", "Какой материк является самым маленьким по территории?"};
        String[] arrayAnswers = {"Орел", "Рим", "Лев Толстой", "1939 год", "Меркурий",

                "Россия",


                "Амазонка",


                "География",


                "ДжоанРоулинг",


                "Австралия"};
        System.out.println("Выберите уровень сложности : 1 2 3 ");
        int questionsCount;
        switch (Game.SCANNER.nextLine()) {
            case "1":
                questionsCount = 3;
                break;
            case "2":
                questionsCount = 6;
                break;
            case "3":
                questionsCount = 9;
                break;
            default:
                questionsCount = 5;

        }
        System.out.println("Введите ставку ");
        int bid = Integer.parseInt(Game.SCANNER.nextLine());


        List<Integer> alreadyUsed = new ArrayList<>();
        for (int i = 0; i < questionsCount; i++) {
            int qwestionIndex = Game.RANDOM.nextInt(0, 10);
            while (alreadyUsed.contains(qwestionIndex)) {
                qwestionIndex = Game.RANDOM.nextInt(0, 10);
            }
            alreadyUsed.add(qwestionIndex);
            System.out.println(arrayQwestions[qwestionIndex]);
            System.out.println("Введите ваш ответ ");
            String answer = Game.SCANNER.nextLine();
            if (answer.equalsIgnoreCase(arrayAnswers[qwestionIndex])) {
                System.out.println("Вы верно ответили переходите в следующий раунд");
            } else {
                System.out.println("Вы проиграли ");
                player.setMoney(player.getMoney() - bid);
                return;
            }
        }
        System.out.println("Вы победили награда составляет " + bid * questionsCount);

    }
}
//1 представление знакомство с игроком 2 Сделайте вашу ставку и укажите на какую кость вы ставите 3 бросок 4 вознаграждение или нет