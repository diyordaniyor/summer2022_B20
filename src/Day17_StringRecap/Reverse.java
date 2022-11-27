package Day17_StringRecap;

public class Reverse {
    public static void main(String[] args) {
        String word = "Java";
        String r = word.substring(1)+word.substring(0,1);
        System.out.println(r);

        char ch1 = word.charAt(0);
        String r1 = word.substring(1)+ch1;
        System.out.println(r1);
    }
}
