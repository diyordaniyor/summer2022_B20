package Day39_CustomClass;

public class Car {

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void seInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice){
        brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
        mileage=carMileage;
        price=carPrice;

    }
    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+", "+color+", "+mileage+", $ "+ price);
    }

    public void start(){
        System.out.println(brand+" "+model+" is started");
    }

}
