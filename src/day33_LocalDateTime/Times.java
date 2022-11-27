package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        LocalTime a=LocalTime.of(15,45,55);
        System.out.println(a);
        LocalTime today = LocalTime.now();
        System.out.println(today);

        LocalDateTime t1 = LocalDateTime.of(2020,7,25,15,25);
        System.out.println(t1);

        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

    }
}
