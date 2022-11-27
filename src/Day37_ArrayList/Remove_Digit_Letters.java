package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digit_Letters {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','1','2','c','4','3','d','$','+','?'));
        chars.removeIf(p->Character.isDigit(p)||Character.isLetter(p));
        System.out.println(chars);
        System.out.println("================");
        ArrayList<Character> list =new ArrayList<>();
        list.addAll(Arrays.asList('a','b','1','2','c','4','3','d','$','+','?'));
        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list);
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println("Digits: "+digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p->!Character.isLetter(p));
        System.out.println("Letters " +letters);
        ArrayList<Character> specChars= new ArrayList<>();
        specChars.addAll(list);
        specChars.removeIf(p->Character.isDigit(p)||Character.isLetter(p));
        System.out.println("SpecChars "+specChars);


    }
}
