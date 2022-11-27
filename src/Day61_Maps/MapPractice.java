package Day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Double> employee = new LinkedHashMap<>();
        employee.put("Diyor",100000.0);
        employee.put("Abbos",110000.0);
        employee.put("Rasul",120000.0);
        System.out.println(employee);
        System.out.println(employee.size());
        System.out.println("Salary of employee :"+employee.get("Diyor"));
        employee.remove("Diyor");
        System.out.println(employee);

        boolean r1 = employee.containsKey("Rasul");
        System.out.println(r1);
        boolean r2 = employee.containsValue(110000.0);
        System.out.println(r2);
        employee.clear();
        System.out.println(employee);
        System.out.println(employee.isEmpty());

    }

}
