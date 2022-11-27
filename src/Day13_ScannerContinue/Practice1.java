package Day13_ScannerContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your annual salary");
        int annualsalary = scan.nextInt();
        System.out.println("State tax rate");
        double statetaxrate = scan.nextDouble();
        System.out.println("Enter federal tax rate");
        double federaltaxrate= scan.nextDouble();
        double totaltaxrate= annualsalary*(statetaxrate+federaltaxrate);
        System.out.println("Net salary is "+ (annualsalary-totaltaxrate));

    }
}
