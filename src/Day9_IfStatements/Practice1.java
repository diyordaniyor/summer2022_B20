package Day9_IfStatements;

public class Practice1 {

    public static void main(String[] args) {
        int a = 70;
        int b = 20;
        int c = 30;

        boolean aIsMax = a>b && a>c;
        boolean bIsMax = b>c && b>a;
        boolean cIsMax = c>a && c>b;

        if(aIsMax){
            System.out.println(a + " - the maximum number");
        }
        if(bIsMax){
            System.out.println(b + " - the maximum number");
        }
        if(cIsMax){
            System.out.println(c + " - the maximum number");
        }
    }
}
