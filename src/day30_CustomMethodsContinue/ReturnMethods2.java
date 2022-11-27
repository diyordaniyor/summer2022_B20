package day30_CustomMethodsContinue;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name="level";
        String rev = Reverse2(name);
        System.out.println(name.equalsIgnoreCase(name));

    }
    public static void Reverse(String word){
        String r = "";
        for(int i=word.length()-1;i>=0;i--){
            r+=word.charAt(i);
        }
        System.out.println(r);
    }
    public static String Reverse2(String word){
        String r = "";
        for(int i=word.length()-1;i>=0;i--){
            r+=word.charAt(i);
        }
        return r;
    }


}
