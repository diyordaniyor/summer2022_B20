package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class Employee {

    public String name;
    final public char gender;
    final public LocalDate DofB;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate dofB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DofB = dofB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+",Gender: "+gender+",DOB: "+DofB+", Job Title: "+jobTitle+",Salary: "+salary;
    }






}
