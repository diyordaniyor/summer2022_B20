package Day51_Exceptions;

class C{
    public C(int a){
        System.out.println("Super class' int arg");
    }
}

public class SuperKeyword3 extends C{

    public SuperKeyword3(int a) {
        super(100);
        System.out.println("Sub class");
    }
    /*public void method(){
        super(300);

     */
    public static void main(String[] args) {
        new SuperKeyword3(10);
    }

}
