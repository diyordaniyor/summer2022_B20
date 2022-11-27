package Day24_Array;

import java.util.Scanner;

public class UniqueFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";
        for (int j = 0; j <= str.length() - 1; j++) {


            char ch1 = str.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);
                if (ch1 == each) {
                    count += 1;
                }
            }
            if (count == 1) {
                result += ch1;
            }

        }
        System.out.println(result);
    }
}
