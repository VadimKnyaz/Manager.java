package dateTimeFormatter;

import javax.xml.crypto.Data;
import java.util.Date;

public class DateTimeApi {
    public static void main(String[] args) {
        Date md1 = new Date();
        long start = md1.getTime();
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
        }
        Date md2=new Date();
        long finish=md2.getTime();
//        md2.setTime(165164864);
//        System.out.println(md2);
        System.out.println((double)(finish-start)/1000);
    }
}
