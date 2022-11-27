package Day62_Maps;

public class StringVsBuilderVsBuffer {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat("School");
        System.out.println(str1);

        System.out.println("=====================");
        String str2 = new String("Cybertek");
        StringBuilder sb1 = new StringBuilder("Cybertek");
        sb1.append("School");
        sb1.reverse();
        System.out.println(sb1);

        System.out.println("====================");

        String name = "kayak";
        String reversedName = new StringBuilder(name).toString();
        System.out.println(name.equalsIgnoreCase(reversedName));

        System.out.println("====================");

        String s1 = "Friday";
        StringBuilder s2 = new StringBuilder(s1);
        String s3 = s2.toString();

        System.out.println("====================");

        StringBuffer t1 = new StringBuffer("aaa");


    }

}
