package Day20_whileLoops;

import java.util.Scanner;

public class WhileLoop_Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Rain";
        System.out.println("Enter your password");
        String input = scan.nextLine();
        while(!input.equals(password)) {
                System.out.println("Please re-enter your password");
                input = scan.nextLine();
            }
        System.out.println("Logged in");
        }



    }
