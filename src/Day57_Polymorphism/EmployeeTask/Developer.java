package Day57_Polymorphism.EmployeeTask;

public class Developer extends Employee{


    public Developer(String name, String jobTitle, int id, double salary, char gender) {
        super(name, jobTitle, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Developer "+name+" is working");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
