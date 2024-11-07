package com.example.arrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("After adding elements " + fruits);
        String indexStr = fruits.get(2);
        System.out.println("Get the particular index element " + indexStr);

        fruits.set(2, "Citrus");
        System.out.println("After setting index 2: " + fruits);
        fruits.remove(3);
        System.out.println("After removing element at index 3: " + fruits);

        // Remove element by value
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Check if the list contains an element
        boolean hasApple = fruits.contains("Apple");
        System.out.println("List contains 'Apple': " + hasApple);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // Iterate through the ArrayList
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);

        // Check if the list is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

    }
}
