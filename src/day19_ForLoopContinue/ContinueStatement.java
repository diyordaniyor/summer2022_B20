package day19_ForLoopContinue;

public class ContinueStatement {
    public static void main(String[] args) {
        for(char a ='A';a<='F';a++){
            if(a=='C'||a=='F'){
                continue;
            }
            System.out.println(a+" ");
        }
    }
}
