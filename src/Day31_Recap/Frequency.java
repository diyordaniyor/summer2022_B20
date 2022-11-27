package Day31_Recap;

import Day29_CustomMethods.Unique;

public class Frequency {
    public static void main(String[] args) {


        String str = "aabbcd";
        String uniques = "";

        for(char each: str.toLowerCase().toCharArray()){
            int count = Frequency(str,each);
            if(count==1){
                uniques+=each;
            }

        }
        System.out.println(uniques);
        System.out.println("======================");
        String str2 = "pppoiiiiuuuuytttttr";
        String uniques2 = uniques(str2);
        System.out.println(uniques2);
    }




    public static int Frequency(String word, char ch){
        int count=0;
        for(int i =0;i<=word.length()-1;i++){
            char s =word.charAt(i);
            if(s==ch){
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str){
        String uniques = "";

        for(char each: str.toLowerCase().toCharArray()){
            int count = Frequency(str,each);
            if(count==1){
                uniques+=each;
            }

        }
        return uniques;

    }


}
