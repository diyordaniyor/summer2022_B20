package Day7_UnaryShorthand;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        boolean result = year % 4 == 0;
        System.out.println(result);

        int number = 100;

        boolean divisiblyby2 = number % 2 ==0;
        boolean divisiblyby3 = number % 3 ==0;
        boolean divisiblyby5 = number % 5 ==0;

        System.out.println(number + " is evenly divisible by 2: " + divisiblyby2);
        System.out.println(number + " is evenly divisible by 3: " + divisiblyby3);


    }
}
