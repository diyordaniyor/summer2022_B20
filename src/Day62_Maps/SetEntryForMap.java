package Day62_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class SetEntryForMap {

    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Username1", "Password1");
        map.put("Username2", "Password2");
        map.put("Username3", "Password3");
        map.put("Username4", "Password4");
        map.put("Username5", "Password5");
        map.put("Username6", "Password6");

        for (Map.Entry<String,String> each : map.entrySet()){
            System.out.println(each.getKey()+" : "+each.getValue());
        }

    }


}
