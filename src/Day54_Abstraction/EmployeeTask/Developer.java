package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public final class Developer extends Employee{

    public Developer(String name, char gender, LocalDate dofB, String jobTitle, double salary){
        super(name, gender, dofB, jobTitle, salary);
    }

}
