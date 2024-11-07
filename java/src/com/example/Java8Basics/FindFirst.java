package com.example.Java8Basics;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,1,3,9,8,5,6);
        list.stream().findFirst().ifPresent(System.out::println);
    }
}
