package Day10_IfStatementsContinue;

public class Multibranch {
    public static void main(String[] args) {
        int number = 100;
        int number1=200;

        if(number>0){
            System.out.println(number + " is positive");
        }
        if(number<0){
            System.out.println(number + " is negative");
        }
        if(number==0){
            System.out.println(number + " is zero");
        }

        System.out.println("=====================");

        if(number1>0){
            System.out.println(number1+" is positive");
        }else if (number1<0){
            System.out.println(number1+ " is negative");
        }else {
            System.out.println(number1+ " is zero");
        }










    }
}



