package com.example.Java8Basics;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacter {
    public static void main(String[] args) {

        String str = "ashokash";
        Map<Character,Long> countOfEachCharacter =  str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        countOfEachCharacter.forEach(((character, aLong) -> System.out.println(character + ":" + aLong)));
    }
}
