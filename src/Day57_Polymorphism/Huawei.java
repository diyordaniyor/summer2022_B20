package Day57_Polymorphism;

public class Huawei extends Phone implements AndroidApp, AppleApp, Downloadable{
    public Huawei(String model, String size, double price) {
        super("Huawei", model, size, price);
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading "+AndroidApp.AppStoreName+" and "+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling "+ phoneNumber);
    }

    public void stealInfo(){
        System.out.println("Huawei is steeling your info");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
