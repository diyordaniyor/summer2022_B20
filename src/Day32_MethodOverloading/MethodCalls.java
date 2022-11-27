package Day32_MethodOverloading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String first = "elKEM";
        String second = "emET";
        String fullname = Util.Fullname(first,second);
        System.out.println(fullname);

        String uniques = Util.uniques(fullname);
        System.out.println(uniques);
        String reversedname = Util.Reverse(fullname);
        System.out.println(reversedname);
        int[] a ={43,23,65,76,98,245};
        int b = 777;
        a=Util.addElement(a,b);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
