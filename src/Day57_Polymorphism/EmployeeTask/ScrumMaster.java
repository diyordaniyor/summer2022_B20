package Day57_Polymorphism.EmployeeTask;

public class ScrumMaster extends Employee{


    public ScrumMaster(String name, String jobTitle, int id, double salary, char gender) {
        super(name, jobTitle, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Scrum Master "+name+" is working");
    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
