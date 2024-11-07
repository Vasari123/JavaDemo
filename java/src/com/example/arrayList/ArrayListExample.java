package com.example.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ashok");
        list.add("naveen");
        list.add("naresh");
        list.add("vyshnavi");
        list.add("sruthi");
        for (String str:list)
            System.out.println(str);
    }
}
