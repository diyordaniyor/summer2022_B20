package Day51_Exceptions;

import Library.Util;

public class ExceptionPractice {

    public static void main(String[] args) {
        System.out.println("Hello");

        /*try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }

         */
        sleep(3);
        System.out.println("World");
sleep(2);

        /*try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

         */
        System.out.println("How are you?");


        Util.sleep(2);
        System.out.println("Good bye");






    }

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){

        }

    }


}
