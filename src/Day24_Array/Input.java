package Day24_Array;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you want to input?");
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i <= a - 1; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            arr[i] = num;
        }
        int max = arr[0];
        int min = arr[1];
        for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
    }
}
