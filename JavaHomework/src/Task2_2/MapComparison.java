package Task2_2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        doAdditionComparison("HashMap", hashMap);
        doAdditionComparison("TreeMap", treeMap);
        doDeletingElementComparison("HashMap", hashMap);
        doDeletingElementComparison("TreeMap", treeMap);
        findElement("HashMap", hashMap);
        findElement("TreeMap", treeMap);
    }

    public static void doAdditionComparison(String type, Map<Integer, String> map) {
        for (int i = 0; i < 1e5; i++) {
            map.put(i, null);
        }
        long start = System.nanoTime();
        //Adding elements to the end of the map
        for (int i = 0; i < 1e5; i++) {
            map.put(i, null);
        }
        long end = System.nanoTime();
        System.out.println("Adding elements to the end: " + (end - start) + " ns " + type);
    }

    public static void doDeletingElementComparison(String type, Map<Integer, String> map) {
        for (int i = 0; i < 1e5; i++) {
            map.put(i, null);
        }
        long start = System.nanoTime();
        //Deleting elements
        for (int i = map.size() - 1; i >= 0; i--) {
            map.remove(i);
        }
        long end = System.nanoTime();
        System.out.println("Deleting elements: " + (end - start) + " ns " + type);
    }

    public static void findElement(String type, Map<Integer, String> map){
        for (int i = 0; i < 1e5; i++) {
            map.put(i, null);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 1e5; i++) {
            map.get(1000);
        }
        long end = System.nanoTime();
        System.out.println("Finding elements: " + (end - start) + " ns " + type);
    }
}
