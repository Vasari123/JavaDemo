package com.example.main;

import com.example.model.Icore;
import com.example.model.Npci;
import com.example.model.Transaction;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Icore> icores = new ArrayList<>();

        icores = IntStream.rangeClosed(0, 8000000)
                 .parallel()
                .mapToObj(i -> new Icore("adasd","sdsd","gtrtgrt","adasd","sdsd","gtrtgrt","adasd","sdsd","gtrtgrt","adasd","sdsd"))
                .collect(Collectors.toList());

        icores.add(new Icore("adasd","sdsd","25-12-1986","123","sdsd","gtrtgrt","adasd","sdsd","gtrtgrt","200000","sdsd"));

        List<Npci> npci = new ArrayList<>();

        Random r = new Random();
        npci = IntStream.rangeClosed(1, 8000000)
                .parallel()
                .mapToObj(i -> new Npci("sdas"+r.nextInt(),"sdsd","gtrtgrt","adasd","sdsd","dsfsdfsdf"+r.nextInt(),"200000","sdsd","adasd","sdsd","25-12-1986","adasd","sdsd","gtrtgrt","adasd","sdsd","gtrtgrt","200000","sdsd","sdsd","gtrtgrt","adasd","sdsd","gtrtgrt","200000","sdsd","sdasd","dscsdsa","sdasd","dscsdsa"))
                .collect(Collectors.toList());

        npci.add(new Npci("123","sdsd","gtrtgrt","adasd","sdsd","25-12-1986","200000","sdsd","adasd","sdsd","25-12-1986","adasd","sdsd","gtrtgrt","adasd","sdsd","gtrtgrt","200000","sdsd","sdsd","gtrtgrt","adasd","sdsd","gtrtgrt","200000","sdsd","sdasd","dscsdsa","sdasd","dscsdsa"));

        long startTime = System.nanoTime();

        Set<Transaction> transactions = icores.parallelStream()
                .map(p -> new Transaction(p.getTranId(), p.getTranDate()))
                .collect(Collectors.toSet());

        // Find common fields in employeeList
        List<Npci> commonRecords = npci.parallelStream()
                .filter(e -> transactions.contains(new Transaction(e.getTxId(), e.getTranDate())))
                .toList();
                //.collect(Collectors.toList());


        System.out.println("Common records between 2 lists : "+ commonRecords);

        // Now, 'persons' contains 2 million Person objects
        System.out.println("Size of the list: " + icores.size()+" "+npci.size());
        // Optionally, print the first 10 records to verify
        //persons.stream().limit(10).forEach(System.out::println);


        long endTime = System.nanoTime();

        // Calculate the duration in milliseconds
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Time taken to add 2 million records: " + duration + " ms");


     //   System.out.println("Hello world!");
    }
}
