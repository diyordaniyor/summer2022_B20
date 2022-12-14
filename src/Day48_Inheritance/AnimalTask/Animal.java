package Day48_Inheritance.AnimalTask;

public class Animal {

    public String name;
    public String size;
    public int age;
    public char gender;

    public void setInfo(String name,String size, int age, char gender){
        this.name=name;
        this.size=size;
        this.age=age;
        this.gender=gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString(){
        return "Name: "+name+", Size: "+size+", Age: "+age+", Gender: "+gender;
    }


}
