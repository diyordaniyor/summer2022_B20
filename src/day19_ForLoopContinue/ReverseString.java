package day19_ForLoopContinue;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Cyber";
        String result = ""+str.charAt(str.length()-1)+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(result);
        String r = "";
        for(int i =4;i>=0;i--){
            r+=str.charAt(i);
        }
        System.out.println(r);
    }
}
