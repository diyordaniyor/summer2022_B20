package Day11_TernaryNested;

public class NestedIf {
    public static void main(String[] args) {
        int score = 100;
        String result = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("================================================");


        double salary = 30000;
        int experience = 6;

        String r = "";
        if(salary>=30_000){
            if(experience>=2){
                r="Eligible to work";
            }
        }else{
            r="Not eligible to work";
        }
        System.out.println(r);

    }
}
