package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringOrderTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        list = list.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(list);
    }
}
