package Day10_IfStatementsContinue;


public class MultibranchPractice {
    public static void main(String[] args) {


        int score = 32;
        String grade = "";

        if (score >= 90 && score <= 100) {
            grade = score + " a A grade";
        } else if (score >= 80 && score <= 89) {
            grade = score + " a B grade";
        } else if (score >= 70 && score <= 79) {
            grade = score + " a C grade";
        } else if (score >= 60 && score <= 69) {
            grade = score + " a D grade";
        } else {
            grade = score + " a F grade";
        }

        System.out.println(grade);

    }
}
