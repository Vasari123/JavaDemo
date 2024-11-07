package com.example.Java8Basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*"Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C"
Given a list of strings, sort them according to increasing order of their length?*/
public class StringOrderTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        list =  list.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("Sorted the give String according to increasing order of their length " + list);
    }
}
