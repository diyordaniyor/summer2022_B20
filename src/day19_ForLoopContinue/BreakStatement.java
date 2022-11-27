package day19_ForLoopContinue;

public class BreakStatement {
    public static void main(String[] args) {
        for(char ch= 'A';ch <='H';ch++){
            System.out.println(ch+" ");
            if(ch=='C'){
                break;
            }
        }

        for(char a ='A';a<='H';a++){
            if(a=='C'){
                break;
            }
            System.out.println(a+" ");
        }
    }
}
