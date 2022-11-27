package Day42_static;

public class Car {
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;

    static boolean hasWheel = true;
    static int numberofTires = 4;
    static boolean hasEngine= true;

    public void start(){
        System.out.println("Starting "+brand+" "+model);
    }

    public static void printTires(){
        System.out.println(numberofTires+" Tires");
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Year: "+year+", Color: "+color
                +"\nNumber of tires "+numberofTires+"\nHas Engine: "+hasEngine+"\nHas Wheel: "+hasWheel;
    }
}
