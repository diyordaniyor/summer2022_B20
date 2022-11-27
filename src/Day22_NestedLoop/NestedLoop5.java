package Day22_NestedLoop;

public class NestedLoop5 {
    public static void main(String[] args) {
        for(int j=1;j<=7;j++){
            for(int i = 1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("============================");
        for(int j=7;j>=1;j--){
            for(int i = j;i>=1;i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
