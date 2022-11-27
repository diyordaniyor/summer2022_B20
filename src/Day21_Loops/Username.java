package Day21_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String u = scan.next();
        System.out.println("Enter your password");
        String p = scan.next();
        int attempt=1;
        while(!(u.equals("Dior")&&p.equals("Rain"))){
            if(attempt==3){
                System.out.println("Account is locked");
                System.exit(0);
            }
            System.out.println("Invalid,Please re-enter");
            System.out.println("Please re-enter your username");
            u = scan.next();
            System.out.println("Re-enter password");
            p=scan.next();

            attempt++;
        }
        System.out.println("You are logged in");

    }
}
