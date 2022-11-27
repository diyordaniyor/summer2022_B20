package Day23_NestedLoopsPractice;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String nonDup = "";
        String result = "";
        for (int i = 0; i <= a.length() - 1; i++) {
            String s = "" + a.charAt(i);
            if (!nonDup.contains(s)) {
                nonDup += s;
            }

        }
        System.out.println(nonDup);
        for (int j = 0; j<=nonDup.length() - 1;j++){

            char s = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= a.length() - 1; i++) {
                if (a.charAt(i) == s) {
                    count += 1;
                }
            }
            result += "" + s + count;


            System.out.println(result);


        }
    }
}
