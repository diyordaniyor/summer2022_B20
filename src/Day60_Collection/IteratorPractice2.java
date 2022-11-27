package Day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice2 {
    public static void main(String[] args) {
        String[] arr = {"Diyor" , "Abbos","Mike","Mike","Mike"};


        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if(it.next().equals("Mike")){
                it.remove();
            }
        }
        System.out.println(names);
        System.out.println("====================");

        ArrayList<String> employee = new ArrayList<>(Arrays.asList(arr));
        for (Iterator<String> i = employee.iterator(); i.hasNext();){
            if (i.next().equals("Mike")){
                i.remove();
            }
        }
        System.out.println(employee);
        System.out.println("====================");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(p->p.equals("Mike"));
        System.out.println(list);
    }
}
