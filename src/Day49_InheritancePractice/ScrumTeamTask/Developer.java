package Day49_InheritancePractice.ScrumTeamTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, double salary, int id, String jobTitle){
        setEmployeeInfo(name, age, gender, salary, id, jobTitle);
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBug(){
        System.out.println(name+" is fixing bugs");
    }

}
