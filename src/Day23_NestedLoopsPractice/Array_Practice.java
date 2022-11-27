package Day23_NestedLoopsPractice;

public class Array_Practice {
    public static void main(String[] args) {
        String[] students ={"Mike", "Adam","Tonny","John","Ammy"};
        int[] scores = {85,70,95,90,100};


        for(int i =0;i<=4;i++){
            System.out.println(students[i]+" "+scores[i]);
        }


        String[] classmates= new String[5];
        classmates[0]="Fatih";
        classmates[1]="Hazel";
        classmates[2]="Ahmed";
        for(int i=0;i<=2;i++){
            System.out.println(classmates[i]);
        }


    }
}
