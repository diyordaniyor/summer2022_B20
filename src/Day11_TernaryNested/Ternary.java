package Day11_TernaryNested;

import java.sql.SQLOutput;

public class Ternary {
    public static void main(String[] args) {

        int num = 101;
        String result = "";

        if (num % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        System.out.println(result);
        System.out.println("=========================");

        String resul2 = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(resul2);
        System.out.println("=====================");

        int num1 = 10;
        int num2 = 20;
        int max1 = 0;

        if (num1 > num2) {
            max1 = num1;
        }else{
            max1=num2;
        }
        System.out.println(max1);

        int max2= (num1>num2)?num1:num2;
        System.out.println(max2);

        int age=28;
        boolean eligible= false;
        if(age>=21){
            eligible=true;
        }else{
            eligible=false;
        }
        System.out.println(eligible);

        boolean eligible2 = (age>=21)?true:false;
        System.out.println(eligible2);

        System.out.println("=============================");


        int age1=14;
        String citizen1= "USA";

        String result1= "";
        if(age1>=18 && citizen1=="USA"){
            result1 = "Can Vote";
        }else{
            result1="Can not Vote";
        }
        System.out.println(result1);

        String result2 = (age1>=18&& citizen1=="USA")?"Can Vote":"Can not Vote";
        System.out.println(result2);


    }
}
