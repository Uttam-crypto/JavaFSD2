package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

    public static void main(String[] args) {
        // HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("HashMap Example:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();

        // TreeMap Example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Orange", 5);
        treeMap.put("Apple", 2);
        treeMap.put("Banana", 3);

        System.out.println("TreeMap Example (Sorted by Keys):");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();
    }
}

