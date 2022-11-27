package Day16_StringContinue;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        if(word.endsWith("ly")){
            System.out.println("really");
        }else{
            System.out.println("Never mind");
        }



    }
}
