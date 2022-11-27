package Day48_Inheritance.DeviceTask;

public class TV extends Device{
    public TV(String brand, String model, double price, boolean hasBattery, boolean hasMemory, double screensize, boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory, screensize);
        this.hasRemoteControl=hasRemoteControl;
    }

    public boolean hasRemoteControl;

    public void watch(){
        System.out.println("watching"+brand+" "+model);
    }
}
