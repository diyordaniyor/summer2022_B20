package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public final class Tester extends Employee{

    public Tester(String name, char gender, LocalDate dofB, String jobTitle, double salary){
        super(name, gender, dofB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name+" is finding bugs");
    }

}
