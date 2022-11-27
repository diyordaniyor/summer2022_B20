package Day12_Scanner;

import java.util.Scanner;

public class UserInput_Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        int result= num1+num2;
        System.out.println(result);

    }
}
