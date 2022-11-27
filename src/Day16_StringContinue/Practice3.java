package Day16_StringContinue;

public class Practice3 {
    public static void main(String[] args) {
        String str = "";

        if(str.length()==0){
            System.out.println("empty string");
        }else if(str.length()>3){
            System.out.println(str.substring(str.length()-3));
        }else{
            System.out.println(str);
        }
        String r = (str.length()==0)?"empty string":(str.length()>3)?str.substring(str.length()-3):str;
        System.out.println(r);

    }
}
