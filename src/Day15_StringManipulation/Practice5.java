package Day15_StringManipulation;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        System.out.println( sentence.charAt(0) );
        System.out.println( sentence.charAt(sentence.length()-1) );
    }
}
