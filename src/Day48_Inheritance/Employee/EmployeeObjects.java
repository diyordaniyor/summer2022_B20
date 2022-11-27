package Day48_Inheritance.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Diyor", 100000, 123456, "QA", 'M');
        tester1.findingBugs();
        System.out.println(tester1);
        System.out.println("======================");
        Developer developer1 = new Developer("Rasul", 125000, 654321, "SDET", 'M');
        developer1.fixingBugs();
        System.out.println(developer1);
    }
}
