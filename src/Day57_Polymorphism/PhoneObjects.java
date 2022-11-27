package Day57_Polymorphism;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PhoneObjects {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("!3 ","Pro",1100);
        Samsung samsung = new Samsung("S22","Ultra", 1000);
        Huawei huawei = new Huawei("Bla","Bla",800);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("11","Pro",800);
        Phone phone2 = new Samsung("10","Pro",600);

        //Iphone[] phones = {iphone,phone1};

        Phone[] phones = {iphone,samsung,huawei,phone1,phone2};
        System.out.println(Arrays.toString(phones));
    }

}
