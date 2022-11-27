package Day47_Encapsulations;

public class PersonObject {
    public static void main(String[] args) {
        Person prs1 = new Person("Diyor",21,'M',16);
        prs1.setSSN(7148);
        prs1.setID(1604);
        prs1.setAddress("PA");
        System.out.println(prs1);
    }
}
