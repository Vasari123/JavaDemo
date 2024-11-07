package main;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {

        String str = "ashok";
        String result = reverse(str);
        System.out.println(result);
    }

    public static String reverse(String input){
        return IntStream.rangeClosed(1, input.length())
                .mapToObj(i -> input.charAt(input.length() -i))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
