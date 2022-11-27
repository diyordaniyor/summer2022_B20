package Day29_CustomMethods;

public class MethodWithParameter {
    public static void main(String[] args) {
        print(2);
    }

    public static void print(int numberOfTimes){
        for( int i=0;i<numberOfTimes;i++){
            System.out.println("Hello World");
        }
    }
}
