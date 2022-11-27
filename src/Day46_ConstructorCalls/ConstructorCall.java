package Day46_ConstructorCalls;

public class ConstructorCall {


    public ConstructorCall(){
        System.out.println("A");
    }


    public ConstructorCall(int a ){
        this();
        System.out.println("B");
    }

    public ConstructorCall(String str){
        this(4);
        System.out.println("C");
    }

    public ConstructorCall (char a){
        this();
        System.out.println("D");
    }

    public static void main(String[] args) {
        new ConstructorCall("Diyor");
    }
}
