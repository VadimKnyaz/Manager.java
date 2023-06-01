import java.util.Scanner;

public class Main1 {
    private static int inputN() throws Exception {
        System.out.println("Введите число n, 0 < n < 100");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 100 && n > 0) {
            throw new Exception("Успешный ввод!");
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        int n = inputN();
        System.out.println("Неверный ввод");
    }
}

