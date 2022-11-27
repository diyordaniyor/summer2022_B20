package Day39_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String DogBreed, String DogSize, int DogAge, String DogColor, String DogName){
        breed = DogBreed;
        size = DogSize;
        age=DogAge;
        color=DogColor;
        name = DogName;

    }

    public void getDogInfo(){
        System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+" years old");
    }
}
