package Day12_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 65;
        boolean validnumber = age > 0 && age < 150;

        boolean Teenager = age < 21;
        boolean Adult = age >= 21 && age < 55;

        /*String result = "";

        if (validnumber) {
            if (Teenager) {
                result = "teenager";
            } else if (Adult) {
                result = "Adult";
            } else {
                result = "Senior";
            }

        } else {
            result = "Invalid";
        }*/

        String result = (Teenager)?"teenager":(Adult)?"Adult":"Senior";
        System.out.println(result);
    }
}
