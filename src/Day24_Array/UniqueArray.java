package Day24_Array;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int a = scan.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i <= a - 1; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String result = "";
        for(int i = 0;i<= arr.length-1;i++){
            int r = arr[i];

        }

    }
}
