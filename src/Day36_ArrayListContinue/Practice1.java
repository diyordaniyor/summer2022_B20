package Day36_ArrayListContinue;
import java.util.Collections;
import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        String s = "ABABCDEE";
        String uniques ="";
        ArrayList<String> list = new ArrayList<>();
        for (String each :s.split("")){
            list.add(each);
        }
        System.out.println(list);

        for (String each :list) {
            int count = Collections.frequency(list, each);

            if (count == 1) {
                uniques+=each;
            }
        }
        System.out.println(uniques);


    }
}
