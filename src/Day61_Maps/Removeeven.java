package Day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Removeeven {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbers));
        System.out.println(list);


        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }

        }
        System.out.println(list);


    }

}
