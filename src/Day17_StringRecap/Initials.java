package Day17_StringRecap;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String secondName= scan.next();
        String r = firstName.toUpperCase().substring(0,1)+secondName.toUpperCase().substring(0,1);
        System.out.println(r);
    }
}
