package main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByKeysAndValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Orange", 20);
        map.put("Apple", 50);
        map.put("Banana", 10);
        map.put("Grapes", 40);
        map.put("Watermelon", 30);
        Map<String,Integer> result =  sortByValues(map);
        System.out.println(result);
    }

    public static Map<String,Integer> sortByValues(Map<String,Integer> map){
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,(e1,e2) -> e1,
                        LinkedHashMap::new));
    }
}
