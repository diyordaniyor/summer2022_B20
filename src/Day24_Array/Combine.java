package Day24_Array;

import java.util.Arrays;

public class Combine {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int size = arr1.length+arr2.length;
        int[] arr3 = new int[size];
        int index = 0;
        for(int each : arr1){
            arr3[index]=each;
            index+=1;
        }
        for(int each: arr2){
            arr3[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(arr3[arr3.length-1]);




    }
}
