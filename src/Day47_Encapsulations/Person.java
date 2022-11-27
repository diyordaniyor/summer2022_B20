package Day47_Encapsulations;

public class Person {

    public String name;
    public int age;
    public char gender;
    public int DOB;

    private int SSN;
    private int ID;
    private String address;


    public Person(String name, int age, char gender, int DOB){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.DOB=DOB;
    }

    public void setSSN(int SSN){
        this.SSN=SSN;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public int getSSN(){
        return SSN;
    }

    public int getID(){
        return ID;
    }

    public String getAddress(){
        return address;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", DOB: "+DOB+", SSN: "+getSSN()+", ID:"+getID()+
                ", Address: "+getAddress();
    }
}
