package Day7_UnaryShorthand;

public class Positive_Negative {
    public static void main(String[] args) {

        int number = 100;

        boolean positive = number > 0;
        boolean negative = number <0;
        boolean zero = number == 0;
        System.out.println(number+" is positive? "+positive);
        System.out.println(number + " is negative? "+negative);
        System.out.println(number+ " is Zero? "+zero);

        int x =2;
        int y = x++;

        System.out.println(y);
        System.out.println(x);

        int a = 1;// a=0
        a = -a-- + a++ / -a-- * --a;
        // -1+ 0/-1*0


        int b =50; //b=50
        b= --b + b++ + b-- + b++;
        // 49 + 49  + 50 + 49
        // 197

        int c =4;
        int d = c*4 - c++;
        // 16 - 4
        System.out.println(d);
        System.out.println(c);





    }
}
