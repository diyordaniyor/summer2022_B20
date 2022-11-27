package Day23_NestedLoopsPractice;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("Please choose from the following: ");
            System.out.println("1.King bed:120$");
            System.out.println("2.Queen bed:100$");
            System.out.println("3.Single bed:80$");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;

            }
            System.out.println("Do you want to reserve another room? ");
            String a = scan.next().toLowerCase();
            while(!(a.equals("yes")||a.equals("no"))){
                System.out.println("Please re-enter");
                System.out.println("Do you want to reserve another room? ");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }


        }
        System.out.println("Your total price is "+total+"$");
    }
}
