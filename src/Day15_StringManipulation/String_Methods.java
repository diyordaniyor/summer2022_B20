package Day15_StringManipulation;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek";
        char ch1 = name.charAt(0);
        System.out.println(ch1);

        int l = name.length();
        System.out.println(l);

        int LastIndexNumber = name.length()-1;
        System.out.println(LastIndexNumber);

        char lastChar = name.charAt(LastIndexNumber);
        System.out.println(lastChar);

        String schoolName = "Cybertek";
        schoolName=schoolName.concat(" School");
        System.out.println(schoolName);

        String name1= "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        String p = "          Cybertek School       ";
        p = p.trim();
        System.out.println(p);


        String sentence2 = "I like Movies and Tv Series";
        //                  0123456789101112
        String word3= sentence2.substring(7 , 14 );
        System.out.println(word3);





    }
}
