package com.example.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printSquare = number -> System.out.println(number * number);

        numbers
               .forEach(printSquare);
    }
}
