package Day57_Polymorphism;

public class Iphone extends Phone implements AppleApp, Downloadable{


    public Iphone(String model, String size, double price) {
        super("Iphone", model, size, price);
        if (price>1500){
            throw new RuntimeException("Iphone price can no be greater than 1500");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+ phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading "+AppStoreName);
    }

    public void faceTimimg(long phoneNumber){
        System.out.println("Iphone is facetiming "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
