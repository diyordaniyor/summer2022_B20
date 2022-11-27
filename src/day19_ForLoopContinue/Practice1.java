package day19_ForLoopContinue;

public class Practice1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int b=2;b<100;b+=2){
            if(b%5==0&&b%3==0){
                System.out.print(b+" ");
            }
        }
    }
}
