package Day57_Polymorphism;

public class Samsung extends Phone implements AndroidApp{


    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);

        if(price>1200){
            throw new RuntimeException("Samsung brice can not be greater than 1200");
        }

    }

    @Override
    public void download() {
        System.out.println("Samsung is downloading "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
