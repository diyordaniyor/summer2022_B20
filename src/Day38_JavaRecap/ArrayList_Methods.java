package Day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","WV","Tesla","Lambo","Lexus"));
        cars.remove("Tesla");
        System.out.println(cars);
        System.out.println("==========================");
        ArrayList<String> groceryList =new ArrayList<>();
        groceryList.addAll(Arrays.asList("Water","Bread","Egg","Milk","Pepsi"));
        System.out.println("Total n of items: "+groceryList.size());
        groceryList.set(groceryList.size()-1, "Apple");
        groceryList.set(groceryList.indexOf("Egg"), "Dish washer" );
        System.out.println(groceryList);

    }
}
