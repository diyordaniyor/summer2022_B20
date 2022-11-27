package Day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 =new Car();


        /*car1.brand="Toyota";
        car1.model="Corola";
        car1.year=2020;
        car1.color="White";
        car1.mileage=10000;
        car1.price=19000.50;

         */
        car1.seInfo("Toyota", "Corolla", 2021, "White", 10000, 15000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("==========================");

        Car car2 = new Car();

        car2.brand="MB";
        car2.model="GLE";
        car2.year=2021;
        car2.color="Black";
        car2.mileage=2000;
        car2.price=70000.70;


        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println("============================");
        car1.getInfo();






    }
}
