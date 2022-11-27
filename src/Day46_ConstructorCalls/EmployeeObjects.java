package Day46_ConstructorCalls;

import java.util.ArrayList;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Diyor");
        System.out.println(employee1);
        System.out.println("================");
        Employee employee2 = new Employee("Ferra", "QA");
        System.out.println(employee2);
        System.out.println("=====================");
        Employee employee3 = new Employee("Abbos", "SDET", 100000);
        System.out.println(employee3);
        System.out.println("====================");
        Employee employee4= new Employee("Rasul", "QA", 100001, 125000);
        System.out.println(employee4);
        System.out.println("=====================");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(list);
    }
}
