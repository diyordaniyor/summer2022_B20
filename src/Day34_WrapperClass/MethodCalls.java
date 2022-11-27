package Day34_WrapperClass;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {5,6,7,8};
        Integer[] arr3=Util.Combination2(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        Integer max =Util.MaxNum(arr3);
        System.out.println(max);

        int min = Util.MinNum(arr3);
        System.out.println(min);

        Character[] ch = {'A','B','A','C','D'};
        ch= Util.Descending(ch);
        System.out.println(Arrays.toString(ch));

    }
}
