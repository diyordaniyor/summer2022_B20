package Day14_Recap;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class NestedIf_Practice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double score = input.nextDouble();
        input.close();
        String r = "";
        if (score>=0&&score<=100){
            if(score>=90){
                r="Excellent";
            }else if(score>=80){
                r="Great";
            }else if(score>=70){
                r="Good";
            }else if(score>=60){
                r="Passed";
            }else{
                r="Failed";
            }
        }else{
            r="Invalid";
        }
        System.out.println(r);
    }
}
