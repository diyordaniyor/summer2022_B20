package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Classmates {
    public static void main(String[] args) {
        String[] students = {"Diyor", "Rasul", "Abbos"};
        LocalDate[] birthdays = {LocalDate.of(2000,04,16),
         LocalDate.of(2002,9,27),
        LocalDate.of(1997,12,12)};
        for(int i = 0;i<=students.length-1;i++){
            System.out.println(students[i]+" : "+birthdays[i]);
        }
        System.out.println("======================");
        for (LocalDate each: birthdays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }

    }
}
