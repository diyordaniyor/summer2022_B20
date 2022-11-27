package Day48_Inheritance.Employee;

public class Developer extends Employee{
    public Developer(String name, double salary, int ID, String jobTitle, char gender){
        setInfo(name, salary, ID, jobTitle, gender);
    }

    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }
}
