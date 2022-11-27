package Day15_StringManipulation;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your las name: ");
        String lastName = scan.next();
        String fullname= firstName+" " +lastName;
        fullname= fullname.toUpperCase();
        System.out.println(fullname);
    }
}
