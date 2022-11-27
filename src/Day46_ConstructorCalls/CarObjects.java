package Day46_ConstructorCalls;

public class CarObjects {
    public static void main(String[] args) {
        System.out.println(new Car("Toyota"));
        System.out.println("=====================");
        System.out.println(new Car("Toyota", "Highlander"));
        System.out.println("=====================");
        System.out.println(new Car("Toyota", "Highlander", 2022));
        System.out.println("=====================");
        System.out.println(new Car("Toyota", "Highlander",2022,50000));
        System.out.println("=====================");
        System.out.println(new Car("Toyota", "Highlander",2022,50000,"White"));

    }
}
