package Day47_Encapsulations;

public class Test {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable); //public is accessable everywhere
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable);// default is accessable within same package
        AccessModifiers.defaultMethod();

        Encapsulation obj1 = new Encapsulation();
        System.out.println(obj1.getSsn());

        obj1.setSsn(7654321);
        System.out.println(obj1.getSsn());

    }

}
