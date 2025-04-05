package home_work.hw_46_Task_1;

import java.util.HashMap;
import java.util.Map;

public class IntersectionMap {

    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> intersectionMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                intersectionMap.put(key, map1.get(key));
            }
        }
        return intersectionMap;
    }

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);

        for (String key : intersectionMap.keySet()) {
            System.out.println(key + ": " + intersectionMap.get(key));
        }
    }
}
