package Day41_ObjectPractice;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets ={new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5,3.5,7.5,false);
        carpets[1].customOrder(2.5,1.5,3.5,true);
        carpets[2].customOrder(3.5,2.5,4.5,false);
        carpets[3].customOrder(4.5,2.5,5.5,true);
        carpets[4].customOrder(5.5,3.5,9.5,true);

        /*for (Carpet each: carpets){
            each.getCarpetInfo();
        }

         */


        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        for (int i = 0;i<= carpets.length-1;i++){
            if(carpets[i].isPersian){
               persianCarpets.add(carpets[i]);
            }else{
                regularCarpets.add(carpets[i]);
            }

        }
        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets "+regularCarpets.size());


        }

    }

