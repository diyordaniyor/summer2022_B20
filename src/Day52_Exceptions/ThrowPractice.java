package Day52_Exceptions;

import Day34_WrapperClass.LocalDate;

import java.time.LocalTime;

public class ThrowPractice {

    public static void main(String[] args) {
        String driverName = "chrome";

        if (driverName.equals("chrome")){
            System.out.println("set up home");
        }else if(driverName.equals("firefox")){
            System.out.println("set up firefox");
        } else if (driverName.equals("opera")) {
            System.out.println("set up opera");
        }else {
            throw new RuntimeException("Invalid Browser Name");
        }

        System.out.println("===========================");

        if (LocalTime.now().getMinute()==56){
            throw new RuntimeException("Its break time");
        }else {
            System.out.println("Continue");
        }

        throw new ArithmeticException();



    }

}
