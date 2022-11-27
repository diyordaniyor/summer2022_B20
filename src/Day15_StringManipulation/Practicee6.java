package Day15_StringManipulation;

import java.util.Scanner;

public class Practicee6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number one: " );
        String char1 = scan.next();
        System.out.println("Enter the second number: ");
        String char2 = scan.next();

        String full = char1.concat(char2);
        System.out.println(full);
    }
}
