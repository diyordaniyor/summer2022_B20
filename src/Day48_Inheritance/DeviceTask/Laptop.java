package Day48_Inheritance.DeviceTask;

public class Laptop extends Device{
    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasMemory, double screensize,String OS){
        setInfo(brand, model, price, hasBattery, hasMemory, screensize);
        this.OS=OS;
    }

    public static boolean hasCPU;
    public static boolean hasMouse;
    public static boolean hasKeyBoard;

    public String OS;

    public void coding(String language){
        System.out.println("Coding: "+language+" in "+brand+" "+model);
    }
}
