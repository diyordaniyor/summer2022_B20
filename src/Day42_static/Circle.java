package Day42_static;

public class Circle {

    double radius;
    double diametr;
    static double pi=3.14;

    public void setInfo(double radius){
        this.radius=radius;
        diametr=radius*2;

    }

    public double calcArea(){
        return radius*radius*pi;
    }

    public double calcPerimeter(){
        return diametr*pi;
    }

    public String toString(){
        return "The area of circle whith the radius of "+radius+" is: "+calcArea();
    }
}
