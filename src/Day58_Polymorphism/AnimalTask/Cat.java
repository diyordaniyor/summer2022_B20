package Day58_Polymorphism.AnimalTask;

public class Cat extends Animal{
public String catName;

    public Cat(String catName,int age, char gender) {
        super(age, gender);
        this.catName=catName;
    }

    public void scratch(){
        System.out.println("Cat "+catName+" is scratching");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
