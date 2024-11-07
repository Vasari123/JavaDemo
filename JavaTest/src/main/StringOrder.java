package main;

import java.util.*;

public class StringOrder {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.
                asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        List<String> list = stationeryList.stream().distinct().sorted().toList();
        System.out.println(list);
/*        // Step 1: Remove duplicates by converting to a Set
        Set<String> uniqueItems = new TreeSet<>(stationeryList);

        // Step 2: Convert the Set back to a List if needed
        List<String> sortedList = new ArrayList<>(uniqueItems);

        // Print the result
        System.out.println(sortedList);*/
    }
}
