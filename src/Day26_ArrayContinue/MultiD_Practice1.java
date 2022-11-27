package Day26_ArrayContinue;

import java.util.Arrays;

public class MultiD_Practice1 {
    public static void main(String[] args) {
        String[] testers = {"Lilia", "Odina", "Christina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmameet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};
        String[] testers1 = {"Rasl","Abboss"};

        String[] [] scrumteam = {testers, developers, SM , PO, BA};

        scrumteam[1][2]= "Diyor";

        scrumteam[4][0]= "Adem";
        scrumteam[0]= testers1;
        System.out.println(Arrays.deepToString(scrumteam));

        for( String[] each :scrumteam){
            System.out.println(Arrays.toString(each));
        }
        System.out.println("=================================================");

        int[][] scores = {{10,20,30}, {40,50}, {60,70}};
        for(int[] each1DArray : scores){
            for(int eachElement: each1DArray){
                if(eachElement%3==0&&eachElement%5==0){
                    System.out.println(eachElement+" ");
                }
            }
        }
        System.out.println("=========================================");

        int[][] a1 = {{1,2},{3,4}};
        int[][] a2 = {{5,6},{7,8}};
        int[][][] arr3D={a1,a2};
        System.out.println(Arrays.deepToString(arr3D));
    }

}
