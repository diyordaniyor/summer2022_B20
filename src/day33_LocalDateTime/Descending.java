package day33_LocalDateTime;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr={3,2,1,0,5,13,2};
        Descending(arr);
        System.out.println(Arrays.toString(Descending(arr)));
        System.out.println("==================");

        double[] arr1 = {2.0, 1.5, 0.4, 23.7};
        System.out.println(Arrays.toString(Descending(arr1)));
    }

    public static int[] Descending (int[] arr){
        Arrays.sort(arr);
        int[] desc = new int[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    public static double[] Descending (double[] arr){
        Arrays.sort(arr);
        double[] desc = new double[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }
}
