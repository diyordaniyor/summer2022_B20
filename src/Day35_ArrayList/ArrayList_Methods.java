package Day35_ArrayList;
import java.util.ArrayList;
public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> earlyBird = new ArrayList<>();
        earlyBird.add("Diyor");
        earlyBird.add("Abbos");
        earlyBird.add("Rasul");
        earlyBird.add("Frank");
        earlyBird.add("Esebo");

        earlyBird.set(2,"Aslan");
        earlyBird.set(0,"Alan");
        System.out.println(earlyBird);
        earlyBird.clear();
        System.out.println(earlyBird);
        System.out.println(earlyBird.size());
        System.out.println("================");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        list.remove(3);
        System.out.println(list);
        System.out.println("==========================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        int a =1;
        list2.remove(a);
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Diyor");
        list3.add("Abbos");

        list3.add("Rasul");

        list3.add("Frank");

        list3.add("Esebo");
        list3.remove("Frank");
        System.out.println(list3
        );

    }
}
