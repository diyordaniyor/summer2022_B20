package Day41_ObjectPractice;

public class Tester {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.age=age;
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is crying");
    }

    public String toString(){
        return name+", "+salary+", "+gender+", "+age+" years old";
    }

}

class TesterObject {
    public static void main(String[] args) {


        Tester[] testers = {new Tester(), new Tester(), new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Abbos",120000,"M",24);
        testers[1].setInfo("Diyor",120000,"M",21);
        testers[2].setInfo("Rasul",150000,"M",20);
        testers[3].setInfo("Mike",10000,"M",28);
        testers[4].setInfo("Frank",70000,"M",29);

        for (Tester each: testers){
            System.out.println(each);
        }

    }
}