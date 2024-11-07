package com.example.Java8Basics;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,56,151,465,78,552);
        int max = list.stream().map(n -> n*n).max(Integer::compare).get();
        System.out.println(max);
        int min = list.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
