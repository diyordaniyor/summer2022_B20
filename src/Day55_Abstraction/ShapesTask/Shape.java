package Day55_Abstraction.ShapesTask;

public abstract class Shape {

    public static String name;
    public double area;
    public double perimeter;
    public static boolean hasVolume;
    public double volume;


    public abstract double calcArea();

    public abstract double calcPerimeter();

    public abstract double calcVolume();
}
