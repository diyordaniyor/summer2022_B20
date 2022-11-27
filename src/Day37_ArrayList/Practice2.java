package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,6,7,8,9,9,10));
        numbers.removeIf(p-> Collections.frequency(numbers, p)!=1);
        System.out.println(numbers);
    }
}
