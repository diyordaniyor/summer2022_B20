package Day17_StringRecap;

public class Return {
    public static void main(String[] args) {
        String email = "abcdefg@gmail.com";
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");

        email= email.substring(index1+1,index2);
        System.out.println(email);

    }
}
