package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,15,56,78,0,100,-1,-3,500));
        int max=Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
    }
}
