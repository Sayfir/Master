package Task2_2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        doAddingValueComparison("HashSet", hashSet);
        doAddingValueComparison("TreeSet", treeSet);
        doDeletingElementsComparison("HashSet", hashSet);
        doDeletingElementsComparison("TreeSet", treeSet);
        findElementsComparison("HashSet", hashSet);
        findElementsComparison("TreeSet", treeSet);

    }

    public static void doAddingValueComparison(String type, Set<Integer> set) {
        for (int i = 0; i < 1e5; i++) {
            set.add(i);
        }
        long start = System.nanoTime();
        //Adding items to the end of the set
        for (int i = 0; i < 1e5; i++) {
            set.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Adding elements to the end: " + (end - start) + " ns " + type);
    }

    public static void doDeletingElementsComparison(String type, Set<Integer> set) {
        for (int i = 0; i < 1e5; i++) {
            set.add(i);
        }
        long start = System.nanoTime();
        //Deleting elements
        for (int i = set.size() - 1; i >= 0; i--) {
            set.remove(i);
        }
        long end = System.nanoTime();
        System.out.println("Deleting elements: " + (end - start) + " ns " + type);
    }

    public static void findElementsComparison(String type, Set<Integer> set) {
        for (int i = 0; i < 1e5; i++) {
            set.add(i);
        }
        long start = System.nanoTime();
        //Find element
        for (int i = set.size() - 1; i >= 0; i--) {
            set.contains(1000);
        }
        long end = System.nanoTime();
        System.out.println("Finds element: " + (end - start) + " ns " + type);
    }
}
