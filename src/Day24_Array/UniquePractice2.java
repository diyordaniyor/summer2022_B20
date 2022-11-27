package Day24_Array;

public class UniquePractice2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4};
        for(int a: arr){
            int s =a;
            int count =0;
            for(int b: arr){
                if(s==b){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s);
            }
        }
    }
}
