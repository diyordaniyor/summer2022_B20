package Day36_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);
        int a = list.indexOf(40);
        System.out.println(a);
        System.out.println(list.indexOf(60));

        System.out.println(list.lastIndexOf(40));
        boolean r = list.contains(100);
        System.out.println(r);
        System.out.println("==========================");
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Me");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("Me");
        System.out.println(a1.equals(a2));

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1);
        System.out.println(a3.isEmpty());

    }
}
