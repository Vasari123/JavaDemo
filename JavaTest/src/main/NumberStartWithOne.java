package main;

import java.util.Arrays;
import java.util.List;

public class NumberStartWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,14,54,65);
        List<Integer> result = list.stream()
                .filter(n -> String.valueOf(n).startsWith("1")).toList();
        System.out.println(result);
    }
}
