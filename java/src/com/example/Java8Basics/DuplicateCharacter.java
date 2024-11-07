package com.example.Java8Basics;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "ashokash";
        Map<Character,Long> duplicateCharacter = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        duplicateCharacter.entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .forEach(entry -> System.out.println(entry.getKey() + " :" + entry.getValue()));
    }
}
