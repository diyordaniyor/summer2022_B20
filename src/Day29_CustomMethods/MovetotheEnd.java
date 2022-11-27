package Day29_CustomMethods;

import java.util.Arrays;

public class MovetotheEnd {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,0,6,2,0,1,0,2,-1,2,0};
        int[] num = new int[arr.length];
        int j = 0;
        for(int i = 0;i<= arr.length-1;i++){
            if(arr[i]!=0){
                num[i-j]=arr[i];
            }else{
                j++;
            }

        }
        System.out.println(Arrays.toString(num));
    }
}
