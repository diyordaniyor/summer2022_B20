package Day11_TernaryNested;

public class Practice5 {
    public static void main(String[] args) {
        int day = 9;

        String r = "";

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                r= "Monday";
            }else if(day==2){
                r="Tuesday";
            }else if(day==3){
                r="Wednesday";
            }else if(day==4){
                r="Thursday";
                }else if(day==5){
                r="Friday";
            }else if(day==6){
                r="Saturday";
            }else{
                r="Sunday";
            }

        }else{
            r="Invalid";
        }
        System.out.println(r);
    }
}
