package Day48_Inheritance.DeviceTask;

public class Phone extends Device{
    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasMemory, double screensize,String OS){
        setInfo(brand, model, price, hasBattery, hasMemory, screensize);
        this.OS=OS;
    }

    public static boolean hasSimCard= true;
    public String OS;

    public void call(long phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting "+phoneNumber);
    }


}
