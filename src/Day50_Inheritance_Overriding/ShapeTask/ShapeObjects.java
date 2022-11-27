package Day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println("======================");
        Rectangle rectangle= new Rectangle(2.2,3.3);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println("======================");
        Square square = new Square(5);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}
