package Day44_Constructor;

public class Employee {

    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static {
        isEmployed=true;
        hasSalary=true;

    }

    public void setInfo(String name, int id, int ssn, String jobTitle, double salary, char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;

    }

    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+id+"\nSSN: "+ssn+"\nJob Title: "+jobTitle+"\nSalary: "+salary;
    }
}
