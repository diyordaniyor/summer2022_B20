package Day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicats {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,2,3,3,34,4,4,6,5,4,3,21,0));
        System.out.println(numbers);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);
        System.out.println(set);

        numbers.clear();
        numbers.addAll(set);
        System.out.println(numbers);

    }

}
