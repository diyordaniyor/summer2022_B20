package Day21_Loops;

public class Dowhile_Practice {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 20);
        System.out.println();
        System.out.println("========================");
        char c = 'Z';
        do {
            System.out.print(c+" ");
            c--;
        } while (c >= 'A');
    }
}
