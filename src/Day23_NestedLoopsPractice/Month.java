package Day23_NestedLoopsPractice;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        String[] month ={"Jan","Feb","Mar","Apr"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number between 1-12");
        int n=scan.nextInt();
        System.out.println(month[n-1]);
    }
}
