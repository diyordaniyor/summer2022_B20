package Day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str);
        System.out.println(str+1);
        System.out.println(a+1);

        Double d1= Double.parseDouble("7.5");
        System.out.println(d1-1);

        String s2 = "100.5";
        double d2=Double.valueOf(s2);
        System.out.println(d2);

        String s3 = "FaLsE";
        boolean b = Boolean.parseBoolean(s3);
        System.out.println(b);
    }
}
