package Day60_Collection;

import Day54_Abstraction.CarTask.Car;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.add(6);

        System.out.println("ArrayList: "+list1);
        System.out.println(list1.get(2));

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));
        list2.addAll(Arrays.asList(1,2,3,4,5));
        list2.add(6);
        System.out.println("LinkedList: "+list2);
        System.out.println(list2.get(2));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));
        list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Vector: "+list3);
        System.out.println(list3.get(2));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(1,2,3,4,5));
        list4.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack: "+list4);
        System.out.println(list4.get(2));
        ((Stack)list4).pop();
        System.out.println(list4);
        System.out.println("=====================");

        Stack<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list5);

        int lastobj = list5.pop();
        System.out.println(list5);
        list5.pop();
        System.out.println(list5);
        list5.removeAll(Arrays.asList(1,4,5));
        System.out.println(list5);
        System.out.println("=====================");

        int[] arr1 = {1,2,3,4};
        int[][] arr2 = {{1,2,3,4},{5,6,7,8}};

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");



        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>();
        //l2.add("M");
        //l2.add(5);

        l2.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));

        l2.add(new ArrayList<>(Arrays.asList(5,6,7,8)));

        System.out.println(l2);

        l2.get(0).removeAll(Arrays.asList(1,3));
        System.out.println(l2);

        System.out.println("Size of first array list: "+l2.get(0).size());
        System.out.println("Size of second array list: "+l2.get(1).size());

        /*List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();
        List<String> group4 = new ArrayList<>();
        List<String> group5 = new ArrayList<>();

         */

        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>()));

        groups.get(0).addAll(Arrays.asList("D","A","C","V","F"));
        groups.get(1).addAll(Arrays.asList("F","A","C","V","F"));
        groups.get(2).addAll(Arrays.asList("G","B","C","V","F"));
        groups.get(3).addAll(Arrays.asList("H","B","C","V","F"));
        groups.get(4).addAll(Arrays.asList("S","C","C","V","U"));

        for (List<String> eachGroup: groups){
            System.out.println(((Stack)eachGroup).pop());
            System.out.println(eachGroup);
            /*for (String eachStudent: eachGroup){
                System.out.print(" "+eachStudent);
            }

             */
        }


        //System.out.println(groups);
        //System.out.println(groups.get(0));


        System.out.println("==================================");

        List<Car> SUVs= new ArrayList<>();
        List<Car> sedans = new ArrayList<>();
        List<Car> trucks = new ArrayList<>();
        List<Car> convertible = new ArrayList<>();


        List<List<Car>> cars = new ArrayList<>();





    }







}
