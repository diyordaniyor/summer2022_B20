package Day43_StaticContinue;

public class Variables {
    int d;
    static  int s;
    public void method2(){
        System.out.println(d);
        System.out.println(s);
    }


    public static void main(String[] args) {
        //System.out.println(d);
        System.out.println(s);

        Variables obj = new Variables();
        System.out.println(obj.d);

    }

    public static void method1(){
        int a =10;

        if(true){
            int b=20;
        }
        System.out.println(a);
    }
}
