package Day17_StringRecap;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1  = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();
        boolean r = word1.charAt(word1.length()-1)==word2.charAt(0);
        if(r){
            System.out.println(word1.concat(word2.substring(1)));
        }else{
            System.out.println(word1.concat(word2));
        }
    }
}
