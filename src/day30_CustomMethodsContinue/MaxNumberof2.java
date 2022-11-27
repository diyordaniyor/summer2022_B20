package day30_CustomMethodsContinue;

import java.util.Arrays;

public class MaxNumberof2 {
    public static void main(String[] args) {
        MaxNumof2(15,15);
        int [] arr = {3,2,1,0,6,7,4,5,};
        Descending(arr);
        int[] comb1 = {1,2,3};
        int[] comb2 = {4,5,6};
        Combination(comb1,comb2);
        PosNegZero(0);
        System.out.println("================================");
        int[] a3={100,-100,-200,-300,0,0,900,5000};
        for(int each: a3){
            PosNegZero(each);
        }
    }


    public static void MaxNumof2(int a, int b) {
        if(a==b){
            System.out.println("Equal");
            return;
        }
        if(a>=b){
            System.out.println(a+" is max number");
        }else{
            System.out.println(b+" is max number");
        }

    }


    public static void Descending(int[] arr){
        Arrays.sort(arr);
        int[] desc = new int[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        System.out.println(Arrays.toString(desc));

    }
    public static void Combination(int[] comb1, int[] comb2){
        int size = comb1.length+comb2.length;
        int[] comb = new int[size];
        int index = 0;
        for(int each : comb1){
            comb[index]=each;
            index+=1;
        }
        for(int each: comb2){
            comb[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(comb));


    }

    public static void PosNegZero(int num){
        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }
    }

