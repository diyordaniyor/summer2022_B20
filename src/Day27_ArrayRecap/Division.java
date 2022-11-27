package Day27_ArrayRecap;

public class Division {
    public static void main(String[] args) {
        int[] scores = {10,20,30,40,50,60,70,80,90};
        for(int each: scores){
            if(each%3!=0){
                continue;
            }
            System.out.print(each+" ");
        }

    }
}
