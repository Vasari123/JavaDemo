package com.example.Java8Basics;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,6,1,3,9,8,5,6);
        list.stream().filter(n ->n%2==0).distinct().map(n -> n*n)
                .forEach(System.out::println);
    }
}
