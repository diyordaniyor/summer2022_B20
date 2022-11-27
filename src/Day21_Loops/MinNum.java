package Day21_Loops;

import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 3423532;
        for (int i = 10; i<=50;i+=10){
            System.out.println("Enter your number");
            int num = scan.nextInt();
            if(num<min){
                min=num;
            }
        }
        System.out.println("Min number is "+min);

    }
}
