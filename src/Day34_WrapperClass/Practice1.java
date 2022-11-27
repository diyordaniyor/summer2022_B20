package Day34_WrapperClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};

        Integer[] arr2 = {1,2,3,4};
        for(int each: arr2){
            System.out.println(each);
        }

        Double[] arr4 = {1.0,2.0,3.0,4.0,5.0};
        for(Double each1: arr4){
            System.out.println(each1);
        }

        char[] arr5 = {65,66,67};
        System.out.println(Arrays.toString(arr5));

        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch2);

        String[] nums1 = {"12.0","13.0","14.0","15.0"};
        double[] nums2 = new double[nums1.length];
        for(int i =0; i<=nums1.length-1;i++){
            nums2[i]=Double.parseDouble(nums1[i]);

        }
        System.out.println(Arrays.toString(nums2));


    }
}
