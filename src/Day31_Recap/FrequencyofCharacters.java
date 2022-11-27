package Day31_Recap;
import Library.Util;

public class FrequencyofCharacters {
    public static void main(String[] args) {

        String str1 = "AABBBCCC";
        String expectedresult = "";
        String nonDup = Util.Duplicates(str1);

        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);
            int count = Util.Frequency(str1, ch);
            expectedresult = "" + ch + count;
            System.out.print(expectedresult);


        }
        System.out.println();
        System.out.println("=====================");
        String str2 = "wwweeerrrtttttuuuyyy";
        String expectedr2 = FrequencyOfChars(str2);
        System.out.println(expectedr2);
    }


    public static String FrequencyOfChars(String str){
        String expectedresult = "";
        String nonDup = Util.Duplicates(str);

        for (char each : nonDup.toCharArray()) {
            int count = Util.Frequency(str, each);
            expectedresult += "" + each + count;
        }
        return expectedresult;

    }
}
