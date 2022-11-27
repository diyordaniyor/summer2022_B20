package Day22_NestedLoop;

import java.sql.SQLOutput;

public class NestedLoop3 {
    public static void main(String[] args) {
        int j=1;
        while(j<=4){
            for(int i = 1;i<=7;i++){
                System.out.print("*");
            }
            System.out.println();
            j++;
        }

    }
}
