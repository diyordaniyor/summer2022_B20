package Day43_StaticContinue;

public class Static_VS_instance {

    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {
        Static_VS_instance obj1 = new Static_VS_instance();
        obj1.instanceVariable=100;
        obj1.staticVariable=500;
        Static_VS_instance obj2 = new Static_VS_instance();
        obj2.instanceVariable=200;
        obj2.staticVariable=400;
        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);
        System.out.println("=======================");
        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);
    }
}
