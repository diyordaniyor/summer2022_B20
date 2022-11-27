package Day18_ForLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstname");
        String firstname = scan.next();
        System.out.println("Enter secondname");
        String secondname= scan.next();

        char ch1 = firstname.charAt(0);
        char ch2 = secondname.charAt(0);
        String initial = ""+ch1+ch2;
        System.out.println(initial);
    }
}
