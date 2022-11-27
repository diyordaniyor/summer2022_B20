package Day9_IfStatements;

public class Breaks {

    public static void main(String[] args) {

        String itsBreakTime = "Yes";

        if( itsBreakTime == "Yes"){
            System.out.println("Take 15 mins break");

        }else{
            System.out.println("Continue the class");
        }


        int a = 100;
        int b = 200;

        if(a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
    }

}
