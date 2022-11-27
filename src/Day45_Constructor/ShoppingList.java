package Day45_Constructor;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1 = new Item("Apple", 1.5,3);
        Item item2 = new Item("Bread", 0.97,2);
        Item item3 = new Item("Mango", 11.5,4);
        Item item4 = new Item("Milk", 10.5,5);
        Item item5 = new Item("Chocolate", 5.5,1);

        ArrayList<Item> list=new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));
        System.out.println(list.size());
        double totalCost = 0;
        for (Item each: list){
            totalCost+=each.calcCost();
        }
        System.out.println(totalCost);
        System.out.println("======================");
        Item[] items={item1,item2,item3,item4,item5};
        double totalCost2 = 0;
        for (int i =0;i<=items.length-1;i++){
            totalCost2+=items[i].calcCost();
        }
        System.out.println(totalCost2);
    }
}
