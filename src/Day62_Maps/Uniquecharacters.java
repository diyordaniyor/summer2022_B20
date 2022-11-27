package Day62_Maps;

import java.util.*;

public class Uniquecharacters {

    public static void main(String[] args) {
        String str = "abacbdeef";

        Map<String, Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));

        for (String each: list){
            int frequency = Collections.frequency(list,each);
            if (frequency==1){
                map.put(each,frequency);

                /*if(Collections.frequency(list, each) == 1){
                map.put(each, 1);
                }
                 */
            }
        }
        System.out.println(map);

    }

}
