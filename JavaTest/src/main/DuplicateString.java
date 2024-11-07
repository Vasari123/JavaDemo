package main;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "ashokashok";
        String result = str.chars().mapToObj(c -> (char) c)
                .distinct().map(String::valueOf)
                        .collect(Collectors.joining());
        System.out.println(result);
    }
}
