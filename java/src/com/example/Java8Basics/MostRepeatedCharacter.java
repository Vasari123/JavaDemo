package com.example.Java8Basics;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedCharacter {
    public static void main(String[] args) {
        String str = "vasariashok";
        Optional<Map.Entry<Character, Long>> mostRepeatedCharacter = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        mostRepeatedCharacter.ifPresent(entry -> System.out.println(
                entry.getKey() + " :" + entry.getValue()
        ));

    }
}
