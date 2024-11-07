package main;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {

        String str = "ashokash";
        Map<Character,Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .forEach(System.out::println);
    }
}
