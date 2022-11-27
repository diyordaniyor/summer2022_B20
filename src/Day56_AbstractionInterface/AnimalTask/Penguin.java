package Day56_AbstractionInterface.AnimalTask;

public class Penguin extends Animal implements Playable,Swimable,Talkative{
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Penguin is playing");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void talk() {
        System.out.println("Penguin is talking");
    }
}
