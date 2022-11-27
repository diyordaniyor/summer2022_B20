package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        boolean r1 = list.contains(1);
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);
        boolean r2=list.containsAll(elements);
        System.out.println(r2);
        System.out.println("=========================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        boolean r3=list2.containsAll(Arrays.asList(1,2,4));
        System.out.println(r3);
        System.out.println("==========================");
        ArrayList<Integer> numbers =new ArrayList<>();
        /*Integer[] nums = {30,25,40,15,55,65,75,85,95,100};
        numbers.addAll(Arrays.asList(nums));
        */
        numbers.addAll(Arrays.asList(30,25,40,15,55,65,75,85,95,100));
        System.out.println(numbers);
        System.out.println("==========================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,4,5,6,7,8,9,10));
        nums.removeAll(Arrays.asList(1,2,5,10));
        System.out.println(nums);
        System.out.println("==============================");
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,7,7,8,9,10,11,12,13,14));
        num1.removeAll(Arrays.asList(1,2,3,9));
        System.out.println(num1);
        System.out.println("========================");
        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll(Arrays.asList("Ahmed","Diyor","Ahmed","Abbos","Rasul"));
        System.out.println(employeeName);
        employeeName.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);



    }
}
