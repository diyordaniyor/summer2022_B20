package Day32_MethodOverloading;

public class MethodOverloading {

    public static void addition2Numbers(double a ,double b){
        System.out.println(a+b);
    }
    public static void addition3Numbers(double a ,double b,double c){
        System.out.println(a+b+c);
    }
    public static void addition4Numbers(double a ,double b,double c ,double d){
        System.out.println(a+b+c+d);
    }


    public static void addition(double a ,double b){
        System.out.println(a+b);
    }
    public static void addition(double a ,double b,double c){
        System.out.println(a+b+c);
    }
    public static void addition(double a ,double b, double c, double d){
        System.out.println(a+b+c+d);
    }
}
