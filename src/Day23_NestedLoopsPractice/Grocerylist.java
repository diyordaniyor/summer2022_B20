package Day23_NestedLoopsPractice;

public class Grocerylist {
    public static void main(String[] args) {
        String[] list = new String[6];
        list[0]="Toilet paper";
        list[1]="Sanitizer";
        list[2]="Bread";
        list[3]="Milk";
        list[4]="Banana";
        list[5]="Chocolate";

        int[] price= new int[6];
        price[0]=12;
        price[1]=15;
        price[2]=16;
        price[3]=17;
        price[4]=18;
        price[5]=19;
        for(int i=0;i<=5;i++){
            System.out.println(list[i]+" "+price[i]);
        }

    }
}
