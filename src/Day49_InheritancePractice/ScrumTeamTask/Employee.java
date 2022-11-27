package Day49_InheritancePractice.ScrumTeamTask;

public class Employee extends Person{

    public double salary;
    public int id;
    public String jobTitle;

    public void setEmployeeInfo(String name, int age, char gender, double salary, int id, String jobTitle){
        setInfo(name, age, gender);
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString(){
        return "ID: "+id+",Job Title: "+jobTitle+
                ",Name: "+name+",Age: "+age+",Gender: "+
                gender+", Salary: "+salary;
    }
}
