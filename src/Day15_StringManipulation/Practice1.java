package Day15_StringManipulation;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your logo");
        String logo = input.next();
        char ch1 = logo.charAt(0);
        int lastIndexNumber = logo.length()-1;
        char ch2 = logo.charAt(lastIndexNumber);
        System.out.println(ch1+" "+ch2);
    }
}
