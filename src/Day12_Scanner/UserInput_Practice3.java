package Day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput_Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = scan.nextDouble();
        System.out.println("Number of hours worked this week");
        int num = scan.nextInt();
        System.out.println("Annual Income is "+ salary*num*52);
    }
}
