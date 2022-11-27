package Day47_Encapsulations;

public class Constructor {
    static {
        System.out.println("static block");
    }
    public Constructor(int a){
        System.out.println("int arg");
    }
    public Constructor(double a){
        this(10);
        System.out.println("double arg");
    }

    public Constructor(String a){
        this(10.0);
        System.out.println("String arg");
    }
    public static void main(String[] args) {
        new Constructor("AB");
    }
}
