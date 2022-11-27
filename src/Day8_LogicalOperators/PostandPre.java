package Day8_LogicalOperators;

public class PostandPre {
    public static void main(String[] args) {

        int a = 200; // a=199
        int b = -a++ + - --a * a-- %2;
        // b = -200+ (-200)*200 % 2
        // b = -200 +0
        // b = -200
        System.out.println(b);


        int x =300;
        int y =400;
        int z = x+y-x*y+x/y;
        // z = 300+400 - 120000 + 3/4;
        // z = -119300
        System.out.println(z);


    }
}
