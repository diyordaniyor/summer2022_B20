package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
//        List<String> s1= Arrays.asList("Abbos");
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslam");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        boolean r1=students.containsAll(Arrays.asList("Ulku","Bursa"));
        System.out.println(r1);

    }
}
