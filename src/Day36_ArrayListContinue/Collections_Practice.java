package Day36_ArrayListContinue;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Collections_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,40,50,15));
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> Desc = new ArrayList<>();
        for (int i = list.size()-1;i>=0;i--){
            Desc.add(list.get(i));
        }
        System.out.println(Desc);
    }
}
