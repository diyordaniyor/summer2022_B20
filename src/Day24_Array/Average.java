package Day24_Array;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want?");
        int a = scan.nextInt();;
        int[] arr = new int[a];
        for(int i =0;i<=a-1;i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            arr[i]=num;
        }
        int sum = 0;
        for(int i =0;i<= arr.length-1;i++){
            sum+=arr[i];
        }
        double average = sum/a;
        System.out.println(average);


    }
}
