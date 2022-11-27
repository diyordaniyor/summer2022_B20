package day30_CustomMethodsContinue;

public class ReturnMethods {
    public static void main(String[] args) {

        addition(5,6);
        int m=addition2(10,20)*7;
        System.out.println(m);
    }
    public static void addition(int a,int b){
        int sum =a+b;
        System.out.println(sum);
    }

    public static int addition2(int a,int b){
        int sum = a+b;
        return sum;
    }
}
