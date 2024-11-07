package com.example.Java8Basics;

import java.util.Arrays;
import java.util.List;

public class DataWithoutDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,3,4,8,56,45,78,99,3131,54,6,1,1654,55);
        list.stream().distinct().forEach(System.out::println);
    }
}
