package Day42_static;

public class Developer {
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;


    public void setInfo(String name, char gender, long employeeID, String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBugs(){
        System.out.println(name+" is fixing the bug");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job title: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;

    }

}
