package Day55_Abstraction.ShapesTask;

public final class Circle extends Shape{
public double radius;

static {
    name="Circle";
    hasVolume=false;
}

public Circle(double radius){
    this.radius=radius;
    area=calcArea();
    perimeter=calcPerimeter();
    volume=calcVolume();
}

    @Override
    public double calcArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double calcVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
