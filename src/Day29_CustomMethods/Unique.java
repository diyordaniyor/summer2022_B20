package Day29_CustomMethods;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        String[] arr = {"A", "A", "B", "C", "C"};
        for (String word : arr) {
            int unique = 0;

            for (String each : arr) {
                if (word.equals(each)) {
                    unique++;
                }


            }
            if (unique == 1) {
                System.out.println(word);
            }
        }
    }
}

