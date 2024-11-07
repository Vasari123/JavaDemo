package com.example.Java8Basics;

import java.util.stream.Collectors;

public class DuplicateStringElement {
    public static void main(String[] args) {

        String string = "ashokash";
        String result = string.chars().mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
