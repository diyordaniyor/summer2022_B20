package Day58_Polymorphism;

import Day58_Polymorphism.AnimalTask.Animal;
import Day58_Polymorphism.AnimalTask.Dog;

public class TypeCastings {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Mi",2,'F');

        Animal animal = dog1;

        System.out.println("=================");
        int x =100;
        byte y = (byte) x;

        Animal animal3 = new Dog("A",1,'M');

        Dog dog2 = (Dog) animal3;
        dog2.bark();


    }

}
