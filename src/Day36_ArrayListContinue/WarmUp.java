package Day36_ArrayListContinue;
import java.util.ArrayList;

public class WarmUp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(4, 0);
        System.out.println(list);

        System.out.println("=======================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list2.add(i);
        }
        System.out.println(list2);
        for (int i = 0; i <= list2.size() - 1; i++) {
            Integer each = list2.get(i);
            if (each % 2 != 0) {
                list2.set(i, each * 2);
            }
        }
        System.out.println(list2);
        System.out.println("=======================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(3);
        list3.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer element: list3) {

            int count = 0;
            for (Integer each : list3) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(element);
            }
        }
        System.out.println(uniques);
    }
}
