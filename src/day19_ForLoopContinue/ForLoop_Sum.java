package day19_ForLoopContinue;

public class ForLoop_Sum {
    public static void main(String[] args) {
        int sum=0;
        for(int a =0;a<=100;a+=2){
            sum +=a ;
        }
        System.out.println(sum);
        System.out.println();
        int summ = 0;
        for(int b = 1;b<=100;b+=2){
            summ+=b;
        }
        System.out.println(summ);
        System.out.println();
        int sumofN= 0;
        for(int c=1;c<=50;c++){
            sumofN+=c;
        }
        System.out.println(sumofN);
    }
}
