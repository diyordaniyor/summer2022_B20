package Day29_CustomMethods;

public class Age {
    public static void main(String[] args) {
        Age(2001, 2000);

    }

    public static void Age(int n, int currentyear) {
        if (currentyear < n) {
            System.out.println("INVALID");
        } else {
            int age = currentyear - n;
            System.out.println("You are " + age + " years old.");

        }
    }
}
