package Day49_InheritancePractice.ScrumTeamTask;

public class Person {

    public String name;
    public int age;
    public char gender;

    private long ssn;

    public long getSsn(){
        return ssn;
    }

    public void setSsn(long ssn){
        this.ssn=ssn;
    }

    private void eat(){
        System.out.println(name+" is eating");
    }

    private void walk(){
        System.out.println(name+" is walking");
    }

    public void sleep(){
        System.out.println(name+" is aleeping");
    }

    public void setInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}
