package Day56_AbstractionInterface.AnimalTask;

public class Duck extends Animal implements Swimable, Flyable, Playable{
    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void play() {
        System.out.println("Duck is playing");
    }
}
