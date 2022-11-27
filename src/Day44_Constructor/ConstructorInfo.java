package Day44_Constructor;

public class ConstructorInfo {

    public ConstructorInfo(String arr){
        System.out.println("Hello "+arr);

    }

    public static void main(String[] args) {
        //ConstructorInfo obj  =new ConstructorInfo(10);

        //ConstructorInfo obj2= new ConstructorInfo();

        ConstructorInfo obj3= new ConstructorInfo("Diyor");
        ConstructorInfo obj4= new ConstructorInfo("Abbos");
        ConstructorInfo obj5= new ConstructorInfo("Rasul");

    }
}
