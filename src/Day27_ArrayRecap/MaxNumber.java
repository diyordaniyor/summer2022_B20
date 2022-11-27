package Day27_ArrayRecap;

public class MaxNumber {
    public static void main(String[] args) {
        int[] score={80,75,65,110,90,50,120};
        int max = score[0];
        for(int each: score){
            if(each>=max){
                max= each;
            }

        }
        System.out.println(max);
    }
}
