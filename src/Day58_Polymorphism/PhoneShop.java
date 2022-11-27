package Day58_Polymorphism;

import Day57_Polymorphism.Iphone;
import Day57_Polymorphism.Phone;
import Day57_Polymorphism.Samsung;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {

    public static void main(String[] args) {
        Phone[] phone={
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100)
        };


        ArrayList<Phone>phoneShop = new ArrayList<>(Arrays.asList(phone));
        int countIphone = 0;
        int countSamsung = 0;
        int countHuawei = 0;

        /*for (int i=0;i<=phoneShop.size()-1;i++){
            if (phoneShop.get(i) instanceof Iphone){
                countIphone++;
            } else if (phoneShop.get(i)instanceof Samsung) {
                countSamsung++;
            }else {
                countHuawei++;
            }
        }

         */

        for (Phone each: phoneShop){
            if(each instanceof Iphone){
                countIphone++;
            } else if (each instanceof Samsung) {
                countSamsung++;
            }else {
                countHuawei++;
            }
        }

        System.out.println(countIphone);
        System.out.println(countSamsung);
        System.out.println(countHuawei);
    }

}
