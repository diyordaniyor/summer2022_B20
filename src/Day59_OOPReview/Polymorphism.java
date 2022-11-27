package Day59_OOPReview;


import Day55_Abstraction.ShapesTask.Circle;
import Day55_Abstraction.ShapesTask.Rectangle;
import Day55_Abstraction.ShapesTask.Shape;

public class Polymorphism {

    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        System.out.println(((Circle)shape1).radius);

        //System.out.println( ((Rectangle)shape1) .length  );


        Rectangle r1 = new Rectangle(3,5);
        Shape shape2 = r1;



    }


}
