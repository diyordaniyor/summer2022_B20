package Day48_Inheritance;

public class BOA {
    public static void main(String[] args) {
        BankAccountForBOA obj1 = new BankAccountForBOA("Diyor","Doniyorov");
        obj1.setAccountHolder("Diyor D");
        obj1.setAccountNumber(12345678);
        obj1.deposit(1000);
        System.out.println(obj1.getBalance());
        System.out.println("=================");
        obj1.deposit(1500);
        obj1.withDraw(500);
        System.out.println(obj1.getBalance());
        System.out.println("===================");
        System.out.println(obj1);
    }
}
