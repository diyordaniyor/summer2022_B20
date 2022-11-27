package Day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {
        Employee employee1 = new Tester("Diyor","QA",1234,100000,'M');
        Employee employee2 = new Tester("Musa","QA",3333,80000,'M');
        Employee employee3 = new Developer("Abbos", "SDET",2222,120000,'M');
        Employee employee4 = new Developer("Rasul", "SDET",22,125000,'M');

        Employee scrumMaster1=new ScrumMaster("Didi", "QA", 1111,110000,'M');


        ArrayList<Employee> scrumTeam= new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(employee1,employee2,employee3,employee4, scrumMaster1));

        for (Employee each: scrumTeam){
            System.out.println(each);
        }

    }

}
