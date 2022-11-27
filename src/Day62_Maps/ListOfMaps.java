package Day62_Maps;

import java.util.*;

public class ListOfMaps {

    public static void main(String[] args) {

        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("Diyor","SS");
        map1.put("Abbos","SS");
        map1.put("Rasul","SDET");
        map1.put("Ferrro","MB");
        map1.put("Mike","QA");

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("Roni","BA");
        map2.put("Toni","MB");
        map2.put("Biro","SDET");
        map2.put("Fe","MB");
        map2.put("Nike","QA");

        Map<String, String> map3 = new LinkedHashMap<>();
        map3.put("Mark","SDET");
        map3.put("M","SS");
        map3.put("R","QA");
        map3.put("F","MB");
        map3.put("Tra","QA");

        List<Map<String , String>> teams = new ArrayList<>();
        teams.addAll(Arrays.asList(map1,map2,map3));
        System.out.println(teams);

        System.out.println("============================");

        for (Map<String,String> each: teams){
            System.out.println(each);
            for (Map.Entry<String , String> each1 : each.entrySet()){
                String name = each1.getKey();
                String jobTitle = each1.getValue();
                if (jobTitle.equalsIgnoreCase("SDET")){
                    System.out.println(name);
                }
            }
        }






    }

}
