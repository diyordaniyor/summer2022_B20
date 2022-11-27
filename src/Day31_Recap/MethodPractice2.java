package Day31_Recap;

public class MethodPractice2 {
    public static void main(String[] args) {
        String name = "madam";
        String name2= reverse2(name);
        System.out.println(name.equalsIgnoreCase(reverse2(name)));
    }

    public static void reverse1(String str){
        String r ="";
        for(int i=str.length()-1;i>=0;i--){
            r+=str.charAt(i);
        }
        System.out.println(r);
    }


    public static String reverse2(String str){
        String r ="";
        for(int i=str.length()-1;i>=0;i--){
            r+=str.charAt(i);
        }
        return r;
    }
}
