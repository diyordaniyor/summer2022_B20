package Day32_MethodOverloading;

import java.util.Scanner;

public class CalculateOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char operator = scan.next().charAt(0);
        double r = CalculateOperator(num1,num2,operator);
        System.out.println(r);
    }
    public static double CalculateOperator (double num1, double num2, char operator){
        double r = 0;
        switch(operator){
            case '+':
                r=num1+num2;
                System.out.println(r);
                break;
            case '-':
                r=num1-num2;
                System.out.println(r);
                break;
            case'*':
                r=num1*num2;
                System.out.println(r);
                break;
            case'/':
                r=num1/num2;
                System.out.println(r);
                break;
            case'%':
                r=num1%num2;
                System.out.println(r);
                break;
            default:
                System.out.println(0);



        }
        return r;
    }
}
