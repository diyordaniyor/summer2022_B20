package Day41_ObjectPractice;

public class Develooper {
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

class DeveloperObject{
    public static void main(String[] args) {
        Develooper[] develoopers= {new Develooper(), new Develooper(), new Develooper(),new Develooper(), new Develooper()};

        develoopers[0].setInfo("Abbos",100000,"M",24);
        develoopers[1].setInfo("Diyor",120000,"M",21);
        develoopers[2].setInfo("Rasul",150000,"M",20);
        develoopers[3].setInfo("Mike",10000,"M",28);
        develoopers[4].setInfo("Frank",70000,"M",29);

        for (Develooper each:develoopers){
            each.coding();
        }
        System.out.println("==========================");
        for (int i=0;i<=develoopers.length-1;i++){
            develoopers[i].fixBugs();
        }

    }
}
