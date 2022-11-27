package Day20_whileLoops;

public class WhileLoop_Practtice3 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while(num<=10){
            if(num%2==0){
                sum+=num;

            }
            num+=2;
        }
        System.out.println(sum);
    }
}
