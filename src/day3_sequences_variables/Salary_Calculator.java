package day3_sequences_variables;

public class Salary_Calculator {
    public static void main(String[] args) {

        int salary = 150000;
        double tax = 0.28;
        double totaltax = salary*tax;
        double salaryAftertax = salary - totaltax;

        System.out.println(salaryAftertax);



    }
}
