package Day23_NestedLoopsPractice;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {10,20,3,4,5,6,7,-10,20,-100,200};
        int max = arr[0];
        int min = arr[1];
        for(int i =0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
