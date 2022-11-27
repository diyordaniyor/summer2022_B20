package Day48_Inheritance.DeviceTask;

public class Device {

    public String brand;
    public String model;
    public double price;
    public static String MadeIn;
    public static boolean isElectronic;
    static {
        MadeIn="China";
        isElectronic=true;
    }
    public boolean hasBattery;
    public boolean hasMemory;
    public double screensize;

    public void setInfo(String brand, String model, double price, boolean hasBattery, boolean hasMemory, double screensize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasMemory = hasMemory;
        this.screensize = screensize;
    }

    public String toString(){
        return "=============================="+
                "\nBrand: "+brand+
                "\nModel: "+model+
                "\nMadein: "+MadeIn+
                "\nScreensize: "+screensize+
                "\nPrice: "+price+
                "\nHas a battery: "+hasBattery+
                "\nHave a memory: "+hasMemory+
                "==============================";
    }
}
