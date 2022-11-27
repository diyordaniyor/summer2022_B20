package Day35_ArrayList;

import java.util.ArrayList;
import Library.Util;

public class WarmUp {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        for (int i =list.size()-1;i>=0;i--) {
            System.out.print(list.get(i) + " ");
        }

            System.out.println();
            System.out.println("===========================");

            String str = "a1b2c3";
            int sum = 0;
            for (int f=0;f<=str.length()-1;f++){
                char each = str.charAt(f);
                if(each>=48&&each<=57){
                    sum+=Integer.parseInt(""+each);
                }
            }
            System.out.println(sum);
        System.out.println("=========================");

        String str1 = "Today is date is 04/27/2020";
        int sum1=0;
        for (char each :str1.toCharArray()){
            if(Character.isDigit(each)){
                sum1+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum1);

        System.out.println("===================");

        String[] group1 = {"Diyor","Rasul","Abbos"};
        String[] group2 = {"Mike","Krap","Nick"};
        ArrayList<String> studentlist = new ArrayList<>();
        for(String each:group1){
            studentlist.add(each);
        }
        for(String each:group2){
            studentlist.add(each);
        }
        System.out.println(studentlist);









    }
}
