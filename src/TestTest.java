import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yy");//часы:минуты:секунды день- месяц-год
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
