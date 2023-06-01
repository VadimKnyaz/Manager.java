import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Newwa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("MM dd yyyy HH:mm:ss");
        String s = scanner.nextLine();

        LocalDateTime ldt=LocalDateTime.parse(s,formatter);

        System.out.println(ldt);
    }
}
