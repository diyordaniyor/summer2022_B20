package Day9_IfStatements;

public class Practice2 {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID && age > 21;

        if(eligible == true){
            System.out.println("Eligible to buy alcohol");
        }
        if(eligible == false){
            System.out.println("You buy your milk");
        }
    }
}
