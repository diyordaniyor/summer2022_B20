package Day32_MethodOverloading;

import java.util.Scanner;

public class Fullname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();

        /*first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        System.out.println(first);
        second=second.substring(0,1).toUpperCase()+second.substring(1).toLowerCase();
        System.out.println(second);
        String fullname = first+" "+second;
        */
        String fullname= Fullname(first,second);
        System.out.println(fullname);
    }


    public static String Fullname(String first, String second){
        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        second=second.substring(0,1).toUpperCase()+second.substring(1).toLowerCase();
        String fullname = first+" "+second;

        return fullname;
    }

}
