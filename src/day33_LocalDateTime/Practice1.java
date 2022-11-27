package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice1 {
    public static void main(String[] args) {
        String[] students = {"Diyor", "Rasul", "Abbos"};
        LocalDate[] birthdays = {LocalDate.of(2000,04,16),
                LocalDate.of(2002,9,27),
                LocalDate.of(1997,12,12)};
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        for(int i = 0;i<= students.length-1;i++){
            System.out.println(students[i]+" : "+birthdays[i].format(dateFormat));
        }
    }
}
