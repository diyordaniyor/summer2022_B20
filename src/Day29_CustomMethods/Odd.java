package Day29_CustomMethods;

public class Odd {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("Hello");
        EvenNumber();

    }


    public static void oddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void EvenNumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();
    }
}

