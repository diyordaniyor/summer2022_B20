package Day8_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {


        String firstname = "Khabib";
        String lastname = "Legend";
        int age = 31;
        String citizen1 = "Russia";
        String citizen2 = "France";
        String fullname = firstname+ " " +lastname;

        boolean eligibleAge = age >= 18;
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        boolean eligibleToVote = eligibleAge && usCitizen;

        System.out.println(fullname + " is eligible to vote for Trump: "+ eligibleToVote);

    }
}
