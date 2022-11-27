package Day9_IfStatements;

public class Minimum {
    public static void main(String[] args) {
        int a = 70;
        int b = 20;
        int c = 30;

        boolean aIsMin = a<b && a<c;
        boolean bIsMin = b<c && b<a;
        boolean cIsMin = c<a && c<b;

        if(aIsMin){
            System.out.println(a + " - the minimum number");
        }
        if(bIsMin){
            System.out.println(b + " - the minimum number");
        }
        if(cIsMin){
            System.out.println(c + " - the minimum number");

        }
    }
}
