package Day50_Inheritance_Overriding.ShapeTask;

public class Circle extends Shape{

    public double readius;
    public double diametr;
    public static double PI = 3.14;

    public Circle(double readius){
        this.readius=readius;
        diametr=readius*2;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }


    public double calculateArea(){
        return readius*readius*PI;
    }

    public double calculatePerimeter(){
        return diametr*PI;
    }

}
