package Day41_ObjectPractice;

public class Cat {

    String name;
    int age;
    char gender;
    String color;
    String breed;

    public void setCatInfo(String name, int age, char gender, String color, String breed){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.color=color;
        this.breed=breed;
    }

    public void catEat(){
        System.out.println("This "+breed+" is eating only noodles");
    }

    public void catDrink(){
        System.out.println("This "+breed+" is drinking soda");
    }

    public String toString(){
        return color+" "+breed+", "+gender+", "+name+", "+age+" years old";
    }

}
