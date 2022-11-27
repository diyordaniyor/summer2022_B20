package Day55_Abstraction.ShapesTask;

import java.text.DecimalFormat;

public final class Cylinder extends Shape{

    public double radius;
    public double height;

    static {
        name="Cylinder";
        hasVolume=true;
    }

    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
        area=calcArea();
        perimeter=calcPerimeter();
        volume=calcVolume();
    }

    @Override
    public double calcArea() {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calcPerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calcVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume) +
                '}';
    }
}
