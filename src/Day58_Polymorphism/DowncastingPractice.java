package Day58_Polymorphism;


import Day57_Polymorphism.Iphone;
import Day57_Polymorphism.Phone;
import Day57_Polymorphism.Samsung;

public class DowncastingPractice {

    public static void main(String[] args) {

        Phone phone1 = new Iphone("11","Pro", 1200);
        Iphone iphone1 = (Iphone) phone1;
        iphone1.faceTimimg(1234);
        ((Iphone)phone1).faceTimimg(3333);

        System.out.println("=============");
        Phone phone2 = new Samsung("S","22",500);
        ((Samsung)phone2).freezing();


    }

}
