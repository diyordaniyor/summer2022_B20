package Day8_LogicalOperators;

public class Practice3 {
    public static void main(String[] args) {

        int c =5;
        boolean r2 = c++ == 6 || c-- == 5;

        System.out.println(r2);

        boolean x = true, z = true;
        int y = 20;
        x = (y!=10) || (z=false);
        // true || false
        // true
        System.out.println(z);

    }
}
