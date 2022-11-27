package Day58_Polymorphism.AnimalTask;

import Day55_Abstraction.ShapesTask.Shape;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Boo",2,'M');
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        System.out.println(dog1);
        System.out.println(dog1.dogName);
        System.out.println(dog1.age);
        System.out.println("=====================");
        Animal animal1 = new Dog("Bee",1,'F');
        System.out.println(animal1);
        animal1.sleep();
        animal1.eat();
        //System.out.println(animal1.dogName);
        System.out.println(animal1.age);
        System.out.println(animal1.gender);
        System.out.println("=====================");




    }

}
