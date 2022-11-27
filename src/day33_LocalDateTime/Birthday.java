package day33_LocalDateTime;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {
        HappyBiirthday(2001,10,5);
    }


    public static void HappyBiirthday(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();
        if(month2==month && day==day2){
            System.out.println("Today is your birthday");
            return;
        }
        System.out.println("Today is not your birthday yet");
    }
}
