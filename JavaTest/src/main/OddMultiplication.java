package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddMultiplication {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = Arrays.stream(array).flatMapToInt(Arrays::stream)
                .filter(n ->n%2 !=0)
                .map(n ->n*n)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
