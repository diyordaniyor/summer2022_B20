package Day16_StringContinue;

public class Practice6 {
    public static void main(String[] args) {
        String word1 = "Match";
        String word2 = "Clapm";

        boolean c1 = word1.charAt(0) == word2.charAt(4);
        boolean c2 = word1.length()>5 || word2.length()>5;

        String r = (c1)?"Fizz":(c2)? "Need to be exactly 5 chars":"Buzz - did not match";
        System.out.println(r);

    }
}
