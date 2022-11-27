package Day41_ObjectPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {
        Carpet[] carpets ={new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5,3.5,7.5,false);
        carpets[1].customOrder(2.5,1.5,3.5,true);
        carpets[2].customOrder(3.5,2.5,4.5,false);
        carpets[3].customOrder(4.5,2.5,5.5,true);
        carpets[4].customOrder(5.5,3.5,9.5,true);


        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p->!p.isPersian);
        System.out.println("Number of persian carpets: "+persianCarpets.size());

        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        regularCarpets.removeIf(p->p.isPersian);
        System.out.println("Number of regular carpets "+regularCarpets.size());
    }
}
