package com.example.Java8Basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Orange", 20);
        map.put("Apple", 50);
        map.put("Banana", 10);
        map.put("Grapes", 40);
        map.put("Watermelon", 30);
        List<Integer> result = sortByValues(map);
        System.out.println(result);
    }
    public  static List<Integer> sortByValues(Map<String,Integer> map){
        return map.values().stream().sorted().collect(Collectors.toList());
    }
}
