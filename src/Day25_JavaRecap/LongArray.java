package Day25_JavaRecap;

public class LongArray {
    public static void main(String[] args) {
        String[] arr = {"Diyor","Abdurasul","Azamat"};
        int maxlength = arr[0].length();
        for(int i = 0;i<= arr.length-1;i++){
            int l = arr[i].length();
            if(l>=maxlength){
                maxlength=l;
            }
        }
        for(int i = 0;i<= arr.length-1;i++){
            if(arr[i].length()==maxlength){
                System.out.println(arr[i]);
            }
        }


    }
}
