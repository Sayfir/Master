package Task2_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();


        doAddingValueComparison("ArrayList", arraylist);
        doAddingValueComparison("LinkedList", linkedList);
        doDeletingComparison("ArrayList", arraylist);
        doDeletingComparison("LinkedList", linkedList);
        findElementComparison("ArrayList", arraylist);
        findElementComparison("LinkedList", linkedList);
    }

    public static void doAddingValueComparison(String type, List<Integer> list) {
        for (int i = 0; i < 1e5; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        //Adding items at the end of the list
        for (int i = 0; i < 1e5; i++) {
            list.add(i);
        }
        long middle = System.nanoTime();
        //Adding items at the beginning of the list
        for (int i = 0; i < 1e5; i++) {
            list.add((0), i);
        }
        long end = System.nanoTime();
        System.out.println("Adding to the begging: " + (end - middle) + " ns; " + " Adding to the end: " + (middle - start) + " ns for " + type);
    }

    public static void doDeletingComparison(String type, List<Integer> list) {
        for (int i = 0; i < 1e5; i++) {
            list.add(i);
        }
        long start = System.nanoTime();

        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.nanoTime();
        System.out.println("Deleting elements: " + (end - start) + " ns for " + type);
    }

    public static void findElementComparison(String type, List<Integer> list) {
        for (int i = 0; i < 1e5; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 1e5; i++) {
            list.get((int) 1e3);
        }
        long end = System.nanoTime();
        System.out.println("Finding element: " + (end - start) + " ns for " + type);
    }
}
