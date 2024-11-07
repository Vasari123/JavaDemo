package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWithCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC","DD","AA");
        Map<String, Long> duplicateCount = list.stream().filter(n -> Collections.frequency(list,n)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(duplicateCount);
    }
}
