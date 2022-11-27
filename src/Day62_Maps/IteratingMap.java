package Day62_Maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String , LocalDate> map = new LinkedHashMap<>();

        map.put("John", LocalDate.of(1999,8,26));
        map.put("Frank", LocalDate.of(1990,5,6));
        map.put("Mike", LocalDate.of(1997,2,17));
        map.put("Bo", LocalDate.of(1993,3,10));
        map.put("Flora", LocalDate.of(1979,4,3));

        System.out.println(map);

        for (String each: map.keySet()){
            System.out.println(each);
        }

        List<String> names = new ArrayList<>(map.keySet());
        System.out.println(names);
        System.out.println(names.get(1));

        System.out.println("====================");

        for (LocalDate each: map.values()){
            System.out.println(each);
        }

        List<LocalDate> DOB = new ArrayList<>(map.values());

        System.out.println(DOB.get(1));

        System.out.println("=========================");


        for (Map.Entry<String, LocalDate> each: map.entrySet()){
            System.out.println(each.getKey()+" : "+each.getValue());
        }


    }

}
