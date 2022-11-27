package Day41_ObjectPractice;

public class PrintingCustomClassObjects {
    public static void main(String[] args) {
        String str = new String("Cybertek");
        System.out.println(str);
        System.out.println(new String("School"));
        System.out.println(str.toString());
        System.out.println(new String("School").toString());
        System.out.println("==================");

        Carpet c1 = new Carpet();
        c1.customOrder(2.5,3.5,4.5,true);
        System.out.println(c1);



    }
}
