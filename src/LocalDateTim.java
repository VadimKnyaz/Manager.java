import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTim{
    public static void main(String[] args) {
        String time="12:55 29 04 23";
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("HH:mm dd MM yy");
        LocalDateTime localDateTime=LocalDateTime.parse(time,dtf);
        System.out.println(localDateTime);

        String temp = localDateTime.format(dtf);

        System.out.println(temp);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(LocalDateTime.now().format(dtf1));
        System.out.println(LocalDateTime.now().format(dtf2));

        LocalDate ld =LocalDate.now();
        LocalTime lt=LocalTime.now();
        LocalDateTime ldt=LocalDateTime.of(ld,lt);
        System.out.println(ldt);

    }

}
