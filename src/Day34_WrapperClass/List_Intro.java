package Day34_WrapperClass;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        ArrayList<Integer>scores=new ArrayList<>();
        scores.add(95);
        scores.add(100);
        scores.add(85);
        scores.add(75);
        scores.add(1,65);
        scores.add(5,55);
        System.out.println(scores);
        System.out.println(scores.get(2));
    }
}
