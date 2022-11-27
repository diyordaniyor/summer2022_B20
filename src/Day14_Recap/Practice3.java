package Day14_Recap;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street address");
        String street = scan.nextLine();
        System.out.println("Enter your city name");
        String city = scan.nextLine();
        System.out.println("Enter your state name");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zip = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter full name");
        String fullName = scan.nextLine();

        System.out.println(fullName);
        System.out.println(number + " "+street);
        System.out.println(city+", "+state+" "+zip);
    }
}
