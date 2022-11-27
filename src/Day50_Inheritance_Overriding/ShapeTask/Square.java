package Day50_Inheritance_Overriding.ShapeTask;

public class Square extends Shape{

    public double a;


    public Square(double a){
        this.a=a;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }
    public double calculateArea(){
        return a*a;
    }

    public double calculatePerimeter(){
        return a*4;
    }

}
