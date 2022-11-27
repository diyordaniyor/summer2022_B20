package Day36_ArrayListContinue;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(3);
        list3.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer element: list3) {

            int count = Collections.frequency(list3,element);

            if (count == 1) {
                uniques.add(element);
            }
        }
        System.out.println(uniques);
    }
}
