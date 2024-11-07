package com.example.Java8Basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 99);

        // Find the second largest element using Stream
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Optional: remove duplicates if necessary
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the largest element
                .findFirst(); // Get the first element after skipping

        secondLargest.ifPresentOrElse(
                value -> System.out.println("Second largest element is: " + value),
                () -> {

                }
        );
    }
}
