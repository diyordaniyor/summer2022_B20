package Day52_Exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {


        int[] arr = {10, 20};
        try {
            System.out.println(arr[20]);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }catch (ClassCastException e) {
            System.out.println("Class cast exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out og bounds");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of Bounds");
        }catch (RuntimeException e){
            System.out.println("run Time Exception");
        }

        System.out.println("==========================");

        String str = "";
        try {
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("========================");

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("Completed");


    }
}
