package Day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static Day44_Constructor.HumanResources.*;


public class BankOfAzer {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        /*list.add(HumanResources.employee1);
        list.add(HumanResources.employee3);

         */

        //list.addAll(Arrays.asList(employee1,employee2,employee3));

        list.addAll(Arrays.asList(HumanResources.employee1,HumanResources.employee2,HumanResources.employee3));

        System.out.println(list.size());
        System.out.println("=================");

        for (Employee each:list){
            System.out.println(each.name+" : "+each.salary);
        }
    }
}
