package Day45_Constructor;

public class PayCheck {
    public static void main(String[] args) {
        SalaryCalculator obj1 = new SalaryCalculator(55,40,0.09,0.24);
        System.out.println(obj1.salary());
        System.out.println(obj1.salaryAfterTax());
        System.out.println(obj1);
    }
}
