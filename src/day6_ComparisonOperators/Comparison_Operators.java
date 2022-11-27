package day6_ComparisonOperators;

public class Comparison_Operators {
    public static void main(String[] args) {

        int rate = 75;
        double stateTaxRate = 0.04;
        double federalTax = 0.2;
        int weeklyhours = 45;

        double salary = rate * weeklyhours * 48;
        double totalTax = salary * (stateTaxRate + federalTax);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Salary Before Tax: " +salary+"$");
        System.out.println("Total Tax: "+totalTax+"$");
        System.out.println("Salary After Tax: " +salaryAfterTax+"$");



    }
}
