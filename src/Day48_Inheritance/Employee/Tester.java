package Day48_Inheritance.Employee;

public class Tester extends Employee{

    public Tester(String name, double salary, int ID, String jobTitle, char gender){
        setInfo(name, salary, ID, jobTitle, gender);
    }

    public void findingBugs(){
        System.out.println(name+" is finding bugs");
    }
}
