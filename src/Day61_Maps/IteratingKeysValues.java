package Day61_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {
        Map<String, LocalDate> students = new LinkedHashMap<>();
        students.put("Hasan", LocalDate.of(2001,4,16));
        students.put("Diyor", LocalDate.of(2000,5,15));
        System.out.println(students);

        for (String each: students.keySet()){
            System.out.println(each);
        }
        System.out.println("==================");

        for (LocalDate each1 : students.values()){
            System.out.println(each1);
        }

    }

}
