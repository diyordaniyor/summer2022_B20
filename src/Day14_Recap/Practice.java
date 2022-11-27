package Day14_Recap;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many years");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter full name of school");
        String name = input.nextLine();
        System.out.println(name + " is "+ age + " years old");
    }
}
