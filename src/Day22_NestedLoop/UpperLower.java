package Day22_NestedLoop;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word=scan.next();
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        boolean start = first>='A'&&first<='Z';
        boolean finish = last>='a'&&last<='z';

        System.out.println(start&finish);

    }
}
