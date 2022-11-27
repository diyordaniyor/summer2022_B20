package Day24_Array;

public class UniqueWords2 {
    public static void main(String[] args) {
        String[] words = {"C", "C", "Java", "Python", "Python", "C++"};
        for (String each :words) {

            String s = each;
            int count = 0;
            for (String b : words) {
                if (s.equals(b)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(s);
            }
        }
    }
}
