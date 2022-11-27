package Day16_StringContinue;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word: ");
        String word1 = scan.next();
        System.out.println("Enter your second name: ");
        String word2 = scan.next();
        String word3 = " "+word1.substring(1)+word2.substring(1);
        System.out.println(word3);
    }
}
