package Day25_JavaRecap;

public class ShortArray {
    public static void main(String[] args) {
        String[] arr = {"Diyor","Abdurasul","Azamat"};
        int minlength = arr[0].length();
        for(int i = 0;i<= arr.length-1;i++){
            int l = arr[i].length();
            if(l<=minlength){
                minlength=l;
            }
        }
        for(int i = 0;i<= arr.length-1;i++){
            if(arr[i].length()==minlength){
                System.out.println(arr[i]);
            }
        }


    }
}
