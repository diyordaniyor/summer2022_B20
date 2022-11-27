package Day26_ArrayContinue;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        String sentence = "Java, Java, Python, Python";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String word1 = "Java";
        String word2= "Python";
        int count1 = 0;
        int count2 = 0;
        for( String each :words){
            String s = each;
            if(s.contains(word1)){
                count1++;
            }
            if(s.contains(word2)){
                count2++;
            }
        }
        System.out.println(word1+count1);
        System.out.println(word2+count2);

    }
}
