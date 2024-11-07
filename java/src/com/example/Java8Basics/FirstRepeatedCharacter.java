package com.example.Java8Basics;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {

        String str = "durgaprasad";
        Character firstNonRepeated =  str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println("The non repeated character is : " + firstNonRepeated);
    }
}
