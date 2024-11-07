package interview;

/*frequency of each character in a string using Java 8 streams

String input = "Welcome to Java world";*/


import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequently {
    public static void main(String[] args) {
        String input = "Welcome to Java world";
        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
