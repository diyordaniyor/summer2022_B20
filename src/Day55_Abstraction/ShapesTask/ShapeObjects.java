package Day55_Abstraction.ShapesTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle =new Circle(2.5);
        System.out.println(circle);
        System.out.println("===============");
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);
        System.out.println("===============");
        Cylinder cylinder = new Cylinder(5,4);
        System.out.println(cylinder);

    }

}
