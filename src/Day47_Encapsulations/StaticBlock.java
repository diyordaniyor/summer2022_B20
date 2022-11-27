package Day47_Encapsulations;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StaticBlock {
    static String companyName;
    static ArrayList<Integer> list;
    static {
        companyName="BOA";
        list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        System.out.println(companyName);
        System.out.println(list);
    }
}
