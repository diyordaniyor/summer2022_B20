package Day47_Encapsulations;

public class CredentialsObjects {
    public static void main(String[] args) {
        Credentials obj1 =new Credentials("Diyor",21);
        obj1.setUsername("diyordaniyor");
        obj1.setPassword("Rain");

        System.out.println(obj1.getUsername());
        System.out.println(obj1.getPassword());
    }
}
