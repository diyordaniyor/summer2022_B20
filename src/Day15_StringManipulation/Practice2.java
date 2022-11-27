package Day15_StringManipulation;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your last name: ");
        String Lastname = input.next();
        String fullname = firstName.concat(" "+Lastname);
        System.out.println(fullname);

    }
}
