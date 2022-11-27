package Day21_Loops;

public class Division {
    public static void main(String[] args) {
        int a =15;
        int b =3;

        int count = 0;
        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+ " with remainder of "+a);
    }
}
