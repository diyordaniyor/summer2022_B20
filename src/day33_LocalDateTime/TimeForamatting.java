package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeForamatting {

    public static void main(String[] args) {
        DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

                LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld);
        System.out.println(ld.format(DateFormat));


        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));


        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time.format(DTFormat));

        System.out.println("===============");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);
        System.out.println(Now.format(dtf));
    }
}
