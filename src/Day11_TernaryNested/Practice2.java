package Day11_TernaryNested;

public class Practice2 {
    public static void main(String[] args) {
        int month = 3;
        boolean days28 = month==2;
        boolean days30 = month==4||month==6||month==9||month==11;
        boolean invalid= month<1||month>12;

        String result="";

        if(days28){
            result = "28 days";
        }else if(days30){
            result="30 days";
        }else if (invalid){
            result="Invalid";
        }else{
            result="31 days";
        }
        System.out.println(result);
    }
}
