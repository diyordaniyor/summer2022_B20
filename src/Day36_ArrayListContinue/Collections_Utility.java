package Day36_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(0);
        list.add(9);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Max number is: "+list.get(list.size()-1));
        System.out.println("Min num is: "+ list.get(0));

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("A","B","C","D","E"));
        System.out.println(list2);
        Collections.swap(list2,1,2);
        System.out.println(list2);

        Collections.swap(list2,0,list2.size()-1);
        System.out.println(list2);

        ArrayList<Character> a1 = new ArrayList<>();
        a1.addAll(Arrays.asList('A','A','B','C','A','A'));
        int count =Collections.frequency(a1,'A');
        System.out.println(count);


    }
}
