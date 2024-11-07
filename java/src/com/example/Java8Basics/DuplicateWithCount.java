package com.example.Java8Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWithCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC","DD","AA");
        Map<String, Long> duplicateWitCount = list.stream()
                .filter(n -> Collections.frequency(list,n)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(duplicateWitCount);
    }
}
