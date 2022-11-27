package Day12_Scanner;

public class Practice1 {
    public static void main(String[] args) {

        int n1= -2;
        int n2= 2;
        int n3 = 5;

        boolean n1IsBigger = n1>n2 && n1>n3;
        boolean n2IsBigger = n2>n1&& n2>n3;
        boolean n3IsBigger = !n1IsBigger&&!n2IsBigger;

        /*String result = "";

        if(n1IsBigger){
            result= "n1 is bigger";
        }else if(n2IsBigger){
            result= "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }*/

        String result = (n1IsBigger)?"n1 is bigger":(n2IsBigger)?"n2 is bigger":"n3 is bigger";
        System.out.println(result);




    }
}
