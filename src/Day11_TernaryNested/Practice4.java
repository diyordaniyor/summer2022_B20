package Day11_TernaryNested;

public class Practice4 {
    public static void main(String[] args) {

        int a = 50;
        int b = 20;

        String result = "";

        if(a>b){
            result= a+" is greater";
        }else if (a<b){
            result= b+" is greater";
        }else if (a==b){
            result=a+" is equal to "+b;
        }

        System.out.println(result);

        String r = (a>b)?"a is greater": (a<b)?"b is greater": "a is equal to b";
        System.out.println(r);
    }
}
