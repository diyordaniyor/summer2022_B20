package Day43_StaticContinue;

import Day41_ObjectPractice.Tester;

public class StaticBlock2 {
    static int a;
    static  String b;
    static Tester tester1;
    static Tester tester2;
    static {
        a=100;
        b="Cybertek";
        tester1 = new Tester();
        tester1.setInfo("Diyor",100000, "M",21);
        tester2=new Tester();
        tester2.setInfo("RAM",12000,"M",22);

    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
