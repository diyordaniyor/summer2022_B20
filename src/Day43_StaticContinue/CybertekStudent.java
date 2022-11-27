package Day43_StaticContinue;

class A{
    static int a =100;
}

public class CybertekStudent {
    String studentName;
    int age;
    char gender;
    static String schoolname = "Cybertek School";

    public void getInfo(){
        System.out.println("Name: "+studentName);
    }

    public void printSchoolName(){
        System.out.println("Schhol name: "+schoolname);
    }
}
