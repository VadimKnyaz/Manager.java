package dateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatLocalDateTimeDemo2 {
    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM, dd, yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }
}
