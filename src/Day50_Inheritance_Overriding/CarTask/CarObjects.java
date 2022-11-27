package Day50_Inheritance_Overriding.CarTask;

public class CarObjects {
    public static void main(String[] args) {
        Honda honda1 = new Honda();
        Mercedes mercedes1 = new Mercedes();
        Tesla tesla1 = new Tesla();
        Jeep jeep1 = new Jeep();

        honda1.start();
        System.out.println("=================");
        mercedes1.start();
        System.out.println("=================");
        tesla1.start();
        System.out.println("=================");
        jeep1.start();

    }
}
