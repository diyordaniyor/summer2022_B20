package day30_CustomMethodsContinue;

import java.util.Arrays;

public class ReturnMethods4 {
    public static void main(String[] args) {
        int[] comb1 = {1,2,3};
        int[] comb2 = {4,5,6};
        int[] a3 = Combination2(comb1,comb2);
        System.out.println(Arrays.toString(a3));
        System.out.println(a3[0]);
    }


    public static int[] Combination2(int[] comb1, int[] comb2) {
        int size = comb1.length + comb2.length;
        int[] comb = new int[size];
        int index = 0;
        for (int each : comb1) {
            comb[index] = each;
            index += 1;
        }
        for (int each : comb2) {
            comb[index] = each;
            index++;
        }
        return comb;
    }
}
