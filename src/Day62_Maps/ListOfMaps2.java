package Day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] friends = {"Diyor", "Zoir","Nodir","Saxib","Shaxzod"};
        LocalDate[] DOBFriends = {LocalDate.of(2001,4,16),
                LocalDate.of(2001,6,27),
                LocalDate.of(2000,2,16),
                LocalDate.of(2000,1,16),
                LocalDate.of(2000,12,16)};

        String[] classmates = {"Abbos","Rasul","Mike"};
        LocalDate[] DOBclassmates = {LocalDate.of(1997,2,26),
                LocalDate.of(2000,3,6),
                LocalDate.of(2002,10,11)};

        String[] family = {"Doniyor","Ulugbek"};
        LocalDate[] DOBFamily = {LocalDate.of(1970,9,1),
                LocalDate.of(1980,4,24)};

        List<Map<String , LocalDate>> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));






        for (int i= 0;i<=friends.length-1;i++){
            list.get(0).put(friends[i], DOBFriends[i] );
        }

        for (int i= 0;i<=classmates.length-1;i++){
            list.get(1).put(classmates[i], DOBclassmates[i] );
        }

        for (int i= 0;i<=family.length-1;i++){
            list.get(2).put(family[i], DOBFamily[i] );
        }


        System.out.println(list);


    }

}
