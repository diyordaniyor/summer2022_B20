package Day36_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','A','B','B','C','C'));
        System.out.println(list);
        ArrayList<Character> nonDup = new ArrayList<>();
        for (Character element : list){
            if(!nonDup.contains(element)){
                nonDup.add(element);
            }
        }
        System.out.println(nonDup);

    }
}
