//import java.time.*;
//import java.time.format.DateTimeFormatter;
//
//public class ExampleDate {
//    public static void main(String[] args) {
//        LocalDate ld = LocalDate.of(2023, Month.APRIL, 23);
//        System.out.println(ld);
//        ld.plusDays(1);
//        ld=ld.plusMonths(1);
//        System.out.println(ld);
//
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-dd-MM");
//        System.out.println(ld.format(dtf));
//        System.out.println(dtf.format(ld));
//        LocalTime lt = LocalTime.of(23, 23);
//        System.out.println(lt);
//
//        LocalDateTime10 ldt = LocalDateTime10.of(ld, LocalTime.from(lt));
//        System.out.println(ldt);
//
//        ZonedDateTime zdt =ZonedDateTime.of(ldt,ZoneId.of("Asia/Ust-Nera"));
//        System.out.println(zdt);
//    }
//}
