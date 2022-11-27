package Day29_CustomMethods;

public class Unique2 {
    public static void main(String[] args) {
        String[] arr = {"A","B","B","C"};

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

