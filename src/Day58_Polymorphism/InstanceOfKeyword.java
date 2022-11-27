package Day58_Polymorphism;

import Day55_Abstraction.ShapesTask.Circle;
import Day55_Abstraction.ShapesTask.Cylinder;
import Day55_Abstraction.ShapesTask.Rectangle;
import Day55_Abstraction.ShapesTask.Shape;
import Day58_Polymorphism.AnimalTask.Animal;
import Day58_Polymorphism.AnimalTask.Cat;
import Day58_Polymorphism.AnimalTask.Dog;

public class InstanceOfKeyword {

    public static void main(String[] args) {
        Animal animal2 = new Animal(10, 'F');
        Animal animal3 = new Dog("Winston", 1, 'M');
        Animal animal4 = new Cat("Mary", 4, 'F');


        boolean r1 = animal4 instanceof Animal;
        System.out.println(r1);

        boolean r2 = animal4 instanceof Cat;
        System.out.println(r2);

        boolean r3 = animal4 instanceof Dog;
        System.out.println(r3);
        System.out.println("===================");

        Shape shape1 = new Circle(3);
        identifyShape(shape1);

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        System.out.println(equalShapes(c1,c2));

    }

    public static void identifyShape(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("The shape is circle");
        } else if (shape instanceof Cylinder) {
            System.out.println("The shape is cylinder");
        } else {
            System.out.println("The shape is rectangle");
        }

    }

    public static boolean equalShapes(Shape shape1, Shape shape2){
        boolean result = false;
        boolean bothCircle = shape1 instanceof Circle&&shape2 instanceof Circle;
        boolean bothRectangle = shape1 instanceof Rectangle&&shape2 instanceof Rectangle;
        boolean bothCylinder = shape1 instanceof Cylinder&&shape2 instanceof Cylinder;
        if(bothCircle){
            Circle c1 = (Circle) shape1;
            Circle c2 = (Circle) shape2;
            if(c1.radius==c2.radius){
                result=true;
            }
            }

        if (bothRectangle){
            Rectangle r1 = (Rectangle) shape1;
            Rectangle r2 = (Rectangle) shape2;
            if (r1.width==r2.width&&r1.length==r2.length){
                result=true;
            }


        }

        if (bothCylinder){
            Cylinder cl1 = (Cylinder) shape1;
            Cylinder cl2 = (Cylinder) shape2;
            if(cl1.height==cl2.height&&cl1.radius==cl2.radius){
                result=true;
            }
        }

        return result;




        }


    }

