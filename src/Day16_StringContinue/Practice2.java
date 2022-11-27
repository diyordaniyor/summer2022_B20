package Day16_StringContinue;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scan.next();
        boolean r = word.charAt(0) == word.charAt((word.length()-1));
        System.out.println(r);
    }
}
