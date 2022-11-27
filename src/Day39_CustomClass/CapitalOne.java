package Day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();

        employee1.setEmployeeInfo("Roman",'M', 123456789,"QA",75000 );
        employee2.setEmployeeInfo("Mike",'M', 123456789,"QA",750000 );
        employee3.setEmployeeInfo("Diyor",'M', 123456789,"QA",7500000 );
        employee4.setEmployeeInfo("Abbos",'M', 123456789,"QA",7000 );
        employee5.setEmployeeInfo("Rasul",'M', 123456789,"QA",5000 );

        ArrayList<Employees> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));
        double max = Integer.MIN_VALUE;
        String name ="";
        for (Employees each: employeeList){
            double eachSalary=each.salary;
            if(eachSalary>max){
                max=eachSalary;
                name= each.name;
            }
        }
        System.out.println("Max salary is: "+max);
        System.out.println("Name: "+name);

        employeeList.removeIf(p->p.salary<50000);
        for (Employees each: employeeList){
            each.getEmployeeInfo();
        }
    }
}
