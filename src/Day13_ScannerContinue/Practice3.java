package Day13_ScannerContinue;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your house number");
        int housenumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your zip code");
        int zip = scan.nextInt();
        System.out.println("Home address is "+ housenumber+ " " +street+" " +zip);



    }
}
