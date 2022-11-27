package Day16_StringContinue;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("The first word is: ");
        String word1 = scan.next();
        System.out.println("The second word is: ");
        String word2 = scan.next();
        System.out.println("The third word is: ");
        String word3 = scan.next();

        if(word1.length()==word2.length()&&word1.length()==word3.length()){
            System.out.println("all the same length" );
        }else if(word1.length()!=word2.length()&&word2.length()!=word3.length()&&word1.length()!=word3.length()){
            System.out.println("all the different");
        }else{
            System.out.println("Not same or different");
        }
    }
}
