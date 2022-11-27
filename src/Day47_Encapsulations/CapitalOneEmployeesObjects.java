package Day47_Encapsulations;

public class CapitalOneEmployeesObjects {
    public static void main(String[] args) {


        CapitalOneEmployees obj1 = new CapitalOneEmployees("Diyor", 21, "QA");

        obj1.setID(1234567);
        obj1.setSalary(125000);
        obj1.setAddress("15203 Bernita Drive");

        System.out.println(obj1.getID());
        System.out.println(obj1.getSalary());
        System.out.println(obj1.getAddress());

        System.out.println(obj1);
    }
}