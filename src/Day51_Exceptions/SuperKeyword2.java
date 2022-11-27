package Day51_Exceptions;

class B{
    public B(){
        System.out.println("Super class' default constructor");
    }
}

public class SuperKeyword2 extends B{

    public SuperKeyword2(){
        super();
        System.out.println("Sub class' defaulr constructor");
    }

    public static void main(String[] args) {
        new SuperKeyword2();
    }

}
