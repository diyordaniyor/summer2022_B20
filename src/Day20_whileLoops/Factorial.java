package Day20_whileLoops;

public class Factorial {
    public static void main(String[] args) {
        int sum=1;
        for(int i = 5;i>=1;i--){
            sum= sum * i;
        }
        System.out.println(sum);
    }
}
