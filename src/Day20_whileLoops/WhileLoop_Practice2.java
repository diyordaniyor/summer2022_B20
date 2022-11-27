package Day20_whileLoops;

import java.sql.SQLOutput;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        int num = 10;
        while(num<15){
            System.out.println("Cybertek");
            num++;
        }


        System.out.println("====================");
        String str="Ferrari";
        String result="";
        for(int i = str.length()-1; i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
