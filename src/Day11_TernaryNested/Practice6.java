package Day11_TernaryNested;

public class Practice6 {
    public static void main(String[] args) {
        double salary = 30000;
        int experience = 3;


        if(salary>=30000){
            if(experience>=2){
                System.out.println("Eligible to work");
            }else{
                System.out.println("You must have at least 2 years of experience");
            }
        }else{
            System.out.println("Not eligible to work");
        }
    }
}
