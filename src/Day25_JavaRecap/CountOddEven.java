package Day25_JavaRecap;

public class CountOddEven {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8,9,10,11};
        int even = 0;
        int odd = 0;
        for(int each: nums){
            if(each%2!=0){
                odd++;
            }
            if(each%2==0){
                even++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
