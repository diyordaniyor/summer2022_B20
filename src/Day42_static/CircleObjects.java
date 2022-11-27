package Day42_static;

public class CircleObjects {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setInfo(25);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());
        System.out.println(c1);
    }
}
