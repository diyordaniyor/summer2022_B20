package Day25_JavaRecap;

public class Combine {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};
        for (int i = 0; i <= words.length - 1; i++) {
            System.out.println(words[i].substring(0, 3));
        }
    }
}
