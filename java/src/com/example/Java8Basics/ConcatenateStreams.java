package com.example.Java8Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateStreams {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Ashok","Reddy");
        List<String> list2 = Arrays.asList("Kafka","Developer");
        Stream<String> stream = Stream.concat(list1.stream(),list2.stream());
        stream.forEach(System.out::println);

    }
}
