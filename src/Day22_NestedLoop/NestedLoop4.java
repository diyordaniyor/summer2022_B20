package Day22_NestedLoop;

public class NestedLoop4 {
    public static void main(String[] args) {
        for(int j=1;j<=7;j++){
            for(int i = 1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
