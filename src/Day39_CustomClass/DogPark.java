package Day39_CustomClass;


import Day39_CustomClass.Dog;

public class DogPark {
    public static void main(String[] args) {
        Dog[] dogPark={new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogPark[0].setDogInfo("Huskee","Medium",3,"Black","Jack");
        dogPark[1].setDogInfo("Huske","Medium",2,"Black","Jack");
        dogPark[2].setDogInfo("Hus","Medium",3,"Black","Jack");
        dogPark[3].setDogInfo("H","Medium",3,"Black","Jack");
        dogPark[4].setDogInfo("Huskeeg","Medium",3,"Black","Jack");
        for (int i=0;i<=dogPark.length-1;i++){
            dogPark[i].getDogInfo();
        }

    }
}
