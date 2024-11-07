package main;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacter {
    public static void main(String[] args) {
        String str = "ashokash";
        Map<Character, Long> countOfEachChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countOfEachChar.forEach((c,a) -> System.out.println(c + " :" + a));
    }
}
