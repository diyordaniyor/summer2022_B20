package Day48_Inheritance.Employee;

public class Employee {
    public double salary;
    public String name;
    public int ID;
    public String jobTitle;
    public char gender;

    public void setInfo(String name, double salary, int ID, String jobTitle, char gender){
        this.name=name;
        this.salary=salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public String toString(){
        return "Name: "+name+", Salary: "+salary+", ID: "+ID+", Job Title: "+jobTitle+", Gender: "+gender;
    }
}
