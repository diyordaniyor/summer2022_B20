package Day49_InheritancePractice.ScrumTeamTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, double salary, int id, String jobTitle){
        setEmployeeInfo(name, age, gender, salary, id, jobTitle);
    }

    public void smokeTesting(){
        System.out.println(name+" is rumming SmokeTest");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating Ticket on Jira");
    }

}
