package Day16_StringContinue;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double n1 = scan.nextDouble();
        System.out.println("Enter second number");
        double n2 = scan.nextDouble();
        System.out.println("Enter your math operator");
        char operator = scan.next().charAt(0);

        boolean ValidOperator = operator=='*'||operator=='/'||operator=='+'||operator=='%'||operator=='-';

        if(ValidOperator){
            switch(operator){
                case '*':
                    System.out.println(n1*n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
                case'%':
                    System.out.println(n1%n2);
                    break;
                case'+':
                    System.out.println(n1+n2);
                    break;
                default:
                    System.out.println(n1-n2);

            }
        }else{
            System.out.println("Invalid operator");
        }
    }
}
