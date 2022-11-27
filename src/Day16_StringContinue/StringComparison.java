package Day16_StringContinue;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first word");
        String word1= scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();
        String r = (word1.equalsIgnoreCase(word2))?"Equal":"Not equal";
        System.out.println(r);
    }
}
