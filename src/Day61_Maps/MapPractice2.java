package Day61_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MapPractice2 {

    public static void main(String[] args) {
        LinkedHashMap<String , Integer> list = new LinkedHashMap<>();
        list.put("Diyor", 89);
        list.put("Abbos", 89);
        list.put("Rasul", 69);
        list.put("Frank", 59);
        list.put("Mike", 79);

        //LinkedHashMap<String , Integer> earlybirds = new LinkedHashMap<>();
        //LinkedHashMap<String , Integer> angryBirds = new LinkedHashMap<>();

        List<String> earlyBirdList = new ArrayList<>();




        for (String eachKey : list.keySet()){
            Integer eachValue = list.get(eachKey);
            /*if (eachValue>80){
                earlybirds.put(eachKey,eachValue);
            }else {
                angryBirds.put(eachKey,eachValue);
            }

             */
            if (eachValue>80){
                earlyBirdList.add(eachKey);
            }
        }
        //System.out.println(earlybirds);
        //System.out.println(angryBirds);
        System.out.println(earlyBirdList);
    }

}
