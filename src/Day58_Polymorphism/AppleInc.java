package Day58_Polymorphism;

import Day57_Polymorphism.EmployeeTask.Developer;
import Day57_Polymorphism.EmployeeTask.Employee;
import Day57_Polymorphism.EmployeeTask.ScrumMaster;
import Day57_Polymorphism.EmployeeTask.Tester;
import Day57_Polymorphism.Iphone;
import Day57_Polymorphism.Phone;
import Day57_Polymorphism.Samsung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class AppleInc {

    public static void main(String[] args) {
        Employee[] workers =  {
                new Tester("Musa Moylam","QA",1234, 130000, 'M'),
                new Tester("Musa Moylam","QA",1234 , 130000, 'M'),
                new Tester("Musa Moylam", "QA",1234, 130000, 'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Tester("Musa Moylam", "QA",1234, 130000, 'M'),
                new Tester("Musa Moylam","QA",1234 , 130000, 'M'),
                new Tester("Musa Moylam", "QA",1234, 130000, 'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Tester("Musa Moylam","QA",1234 , 130000, 'M'),
                new Tester("Musa Moylam","QA",1234 , 130000, 'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new ScrumMaster("Kamil", "QA",1234, 120000, 'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new ScrumMaster("Kamil", "QA",1234, 120000, 'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M'),
                new Developer("Abdul","QA",1234,110000,'M')

        };

        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));

        int countTester = 0;
        int countDeveloper = 0;
        int countScrumMaster = 0;

        for (Employee each: scrumTeam){
            if(each instanceof Tester){
                countTester++;
            } else if (each instanceof Developer) {
                countDeveloper++;
            }else {
                countScrumMaster++;
            }
        }

        System.out.println(countTester);
        System.out.println(countDeveloper);
        System.out.println(countScrumMaster);




    }

}
