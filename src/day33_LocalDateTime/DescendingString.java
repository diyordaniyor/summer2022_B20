package day33_LocalDateTime;

import java.util.Arrays;

public class DescendingString {
    public static void main(String[] args) {
        String[] arr = {"Me","You","He"};
        Descending(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static String[] Descending(String[] arr){
            Arrays.sort(arr);
            String[] desc = new String[arr.length];
            int k= desc.length-1;
            for(int i=0;i<= desc.length-1;i++){
                desc[i]=arr[k];

                k--;

            }
            return desc;
        }

    public static char[] Descending(char[] arr){
        Arrays.sort(arr);
        char[] desc = new char[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    }

