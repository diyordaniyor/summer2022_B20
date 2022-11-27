package Day25_JavaRecap;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr = {10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr);
        int[] desc = new int[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        System.out.println(Arrays.toString(desc));

    }
}
