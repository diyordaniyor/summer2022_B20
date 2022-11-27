package Day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {
        Map<String,String> countries = new LinkedHashMap<>();
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Turkistan", "Tashkent");
        countries.put("Kazakhstan", "Tashkent");
        countries.put("Tajikistan", "Tashkent");


        for (String eachKey : countries.keySet()){
            String eachValue = countries.get(eachKey);
            System.out.println("Country name is: "+ eachKey+", "+"Capital city is "+eachValue);
        }
    }

}
