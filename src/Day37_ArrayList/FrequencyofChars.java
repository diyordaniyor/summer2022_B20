package Day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyofChars {
    public static void main(String[] args) {


        String str = "AABBBCCDF";
        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("")) {
            list.add(each);
        }
        System.out.println(list);

        String nonDup = Util.Duplicates(str);
        System.out.println(nonDup);

        for (String each : nonDup.split("")) {

            int count = Collections.frequency(list, each);
            System.out.print(each+count);
        }
    }
}