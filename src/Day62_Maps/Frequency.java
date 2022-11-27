package Day62_Maps;

import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        String str = "aaabbbccb";


        Map<String,Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));

        for (String each : list){
            int frequency = Collections.frequency(list,each);
            map.put(each,frequency);
        }
        System.out.println(map);






    }

}
