package Day62_Maps;

import Day55_Abstraction.ShapesTask.Circle;
import Day55_Abstraction.ShapesTask.Rectangle;

public class GarbageCollectionReview {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1 = null;

        System.out.println(str1);

        String s1 = new String("John");
        String s2 = new String("Mike");
        s1=s2;
        System.out.println(s1+" : "+s2);

        System.out.println("======================");

        Circle c1 = new Circle(3);
        c1=null;
        System.out.println(c1);

        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(5,6);
        r1=r2;
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("===================");





    }

}
