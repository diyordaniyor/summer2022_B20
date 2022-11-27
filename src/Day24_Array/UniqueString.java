package Day24_Array;

import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String result = "";
        for(int i =0;i<=a.length()-1;i++){
            char s =a.charAt(i);
           int first= a.indexOf(s);
           int last = a.lastIndexOf(s);
            if(first==last){
                result+=s;
            }

        }
        System.out.println(result);
    }
}
