package Day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {
        ArrayList<Character> chars =new ArrayList<>();
        chars.addAll(Arrays.asList('F','D','G','A','V','G'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan","Diyor","Rasul","Abbos"));
        Collections.swap(students,1,3);
        System.out.println(students);
        System.out.println("==============");
        ArrayList<String> items =new ArrayList<>();
        items.addAll(Arrays.asList("Coffee","Egg","Battery","Battery","Battery","Battery"));
        int count = Collections.frequency(items,"Battery");
        System.out.println(count);

        ArrayList<String> unique =new ArrayList<>();
        for(String each: items){
            int i=Collections.frequency(items,each);
            if(i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);


        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p->Collections.frequency(unique2,p)>1);
        System.out.println(unique2);


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,89,1000,2000,3000,30,40,-50,1000));
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);


        Collections.replaceAll(list,1000,100000);
        System.out.println(list);
    }
}
