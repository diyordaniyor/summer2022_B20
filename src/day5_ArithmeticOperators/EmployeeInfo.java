package day5_ArithmeticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstname = "Diyor";
        String lastname = "Doniyorov";
        char gender = 'M';
        byte age = 21;
        String companyname = "CapitalOne";
        String jobtitle = "SDET";
        boolean isFulltime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        String fullname = firstname + " " +lastname;

        System.out.println("Employee' full name is: " + fullname);
        System.out.println(fullname + "' gender is: " + gender);
        System.out.println(fullname+"' age is: " + age + "years old");
        System.out.println(fullname+"' works at: " + companyname);
        System.out.println(fullname+"' Job Title is: " + jobtitle);
        System.out.println(fullname+"' salary is " + salary +"$");
        System.out.println(fullname+" is full time employee: " + isFulltime);
        System.out.println(fullname+" is married: " + isMarried);

    }
}
