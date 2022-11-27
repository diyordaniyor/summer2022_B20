package Day55_Abstraction.ShapesTask;

import java.text.DecimalFormat;

public final class Rectangle extends Shape{

    public double width;
    public double length;

    static {
        name="Rectangle";
        hasVolume=false;
    }

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        area=calcArea();
        perimeter=calcPerimeter();
        volume=calcVolume();
    }

    @Override
    public double calcArea() {
        return width*length;
    }

    @Override
    public double calcPerimeter() {
        return (width+length)*2;
    }

    @Override
    public double calcVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
