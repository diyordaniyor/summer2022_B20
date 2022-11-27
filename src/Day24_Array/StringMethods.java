package Day24_Array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "ABCDE";
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));

        String sentece = "I love Java";
        String[] words = sentece.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");

        }
        System.out.println();
        String d = "Java";
        String[] arr = d.split("");
        System.out.println(Arrays.toString(arr));

        char[] c = d.toCharArray();
        System.out.println(Arrays.toString(c));
    }
}
