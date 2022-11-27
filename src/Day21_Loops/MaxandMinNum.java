package Day21_Loops;

import java.util.Scanner;

public class MaxandMinNum {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int max = -21321214;
    int min = 324324234;
    for (int i = 10; i<=50;i+=10){
        System.out.println("Enter your number");
        int num = scan.nextInt();
        if(num>max){
            max=num;
        }
        if(num<min){
            min=num;
        }
    }
    System.out.println("Max number is "+max);
    System.out.println("Min number is "+ min);

}
}
