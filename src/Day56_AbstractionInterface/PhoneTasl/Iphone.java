package Day56_AbstractionInterface.PhoneTasl;

import com.sun.corba.se.impl.legacy.connection.USLPort;

public class Iphone extends Phone{


    public Iphone(String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price<=0||price>1500){
            throw new RuntimeException("Invalid Price "+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    public void facetimimg(long phoneNumber){
        System.out.println("Facetiming to "+phoneNumber);
    }

    public void facetiming(long num1, long num2){
        facetimimg(num1);
        facetimimg(num2);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
