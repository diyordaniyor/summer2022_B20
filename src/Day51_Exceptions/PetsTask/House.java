package Day51_Exceptions.PetsTask;

public class House {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max","scotty", 'M',3,"black");
        System.out.println(dog1);

        Cat cat1 = new Cat("Fera","B",'F', 2, "White");
        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Bi", "A",'M',4,"White");
        System.out.println(tiger1);
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();


    }
}
