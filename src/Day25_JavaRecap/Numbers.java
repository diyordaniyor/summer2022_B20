package Day25_JavaRecap;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i <= arr.length-1; i++){
            arr[i]=i+1;


        }
        System.out.println(Arrays.toString(arr));
        for(int each :arr){
            if(each%2!=0){
                continue;
            }
            System.out.print(each+" ");
        }
    }
}
