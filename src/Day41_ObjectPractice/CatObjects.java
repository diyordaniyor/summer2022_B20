package Day41_ObjectPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {

        Cat[] catlist = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};


        catlist[0].setCatInfo("Mike", 2, 'M',"White","Huskee");
        catlist[1].setCatInfo("Jack", 3, 'M',"Black","Huskee");
        catlist[2].setCatInfo("Lisa", 1, 'F',"Grey","Huskee");
        catlist[3].setCatInfo("Mary", 4, 'F',"White","Huskee");
        catlist[4].setCatInfo("Martin", 5, 'M',"White","Huskee");




        ArrayList<Cat> maleCats = new ArrayList<>();


        ArrayList<Cat> femaleCats = new ArrayList<>();
        for (int i =0;i<= catlist.length-1;i++){
            if (catlist[i].gender=='M'){
                maleCats.add(catlist[i]);
            }else {
                femaleCats.add(catlist[i]);
            }
        }
        System.out.println(maleCats.size());
        System.out.println(femaleCats.size());






    }
}
