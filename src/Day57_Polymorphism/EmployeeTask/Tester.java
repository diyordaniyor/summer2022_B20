package Day57_Polymorphism.EmployeeTask;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, int id, double salary, char gender) {
        super(name, jobTitle, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Tester "+name+" is working");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
