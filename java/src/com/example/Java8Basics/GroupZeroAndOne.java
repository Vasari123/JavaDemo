package com.example.Java8Basics;

import java.util.*;
import java.util.stream.*;

public class GroupZeroAndOne {
    public static void main(String[] args) {
        String input = "101010";
        
        // Using Stream to group all 0s and 1s and convert them to 000 and 111
        String result = getGroupedZeroAndOne(input);
        
        // Printing the result
        System.out.println(result);  // Output: [000 111]
    }

    public static String getGroupedZeroAndOne(String input) {
        // First, we'll group the input by 0 and 1 and join them
        Map<Character, Long> counts = input.chars()  // Convert to IntStream
            .mapToObj(c -> (char) c)  // Convert IntStream to Character stream
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));  // Count occurrences of '0' and '1'
        
        List<String> result = new ArrayList<>();
        
        // Add "000" for '0' and "111" for '1' based on counts
        counts.forEach((key, count) -> {
            if (key == '0') {
                result.add("0".repeat(count.intValue()));  // Repeat '0' based on the count of '0'
            }
            if (key == '1') {
                result.add("1".repeat(count.intValue()));  // Repeat '1' based on the count of '1'
            }
        });

        // Replace "0" with "000" and "1" with "111"
        String formattedResult = result.stream()
            .map(s -> s.equals("0") ? "000" : s.equals("1") ? "111" : s)
            .collect(Collectors.joining(" "));  // Join the groups with a space
        
        // Wrap the final result with square brackets and return
        return "[" + formattedResult + "]";
    }
}
