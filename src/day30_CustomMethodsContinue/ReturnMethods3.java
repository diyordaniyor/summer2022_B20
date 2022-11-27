package day30_CustomMethodsContinue;

import java.util.Arrays;

public class ReturnMethods3 {
    public static void main(String[] args) {
        int[] arr={2,1,0,7,4,5};
        int num = Max(arr);
        System.out.println(num);
        System.out.println(num>10);
    }

    public static int Max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
    public static void Max2(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        System.out.println(max);
    }

}
