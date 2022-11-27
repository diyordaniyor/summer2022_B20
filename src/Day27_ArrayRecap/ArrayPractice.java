package Day27_ArrayRecap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to input?");
        int a = scan.nextInt();
        String[] students = new String[a];
        scan.nextLine();
        for(int i =0;i<= students.length-1;i++){
            System.out.println("Enter a name");
            students[i]= scan.nextLine();
        }
        System.out.println(Arrays.toString(students));
    }
}
