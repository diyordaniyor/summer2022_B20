package Day41_ObjectPractice;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
    }

    public double calcCost(){
     double totalPrice=(width*length)*unitPrice;
     return (isPersian)? totalPrice+200:totalPrice;
    }

    public void getCarpetInfo(){
        System.out.println("====================");
        System.out.println("Width: "+width);
        System.out.println("Length: "+length);
        System.out.println("Unit Price: "+unitPrice);
        System.out.println("Total Price: "+ calcCost());
        System.out.println("====================");
    }

    public String toString(){
        return "hello";
    }



}
