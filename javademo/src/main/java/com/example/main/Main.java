package com.example.main;

import com.example.kafkaservice.KafkaService;
import com.example.model.Icore;
import com.example.model.Npci;
import com.example.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private KafkaService kafkaService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Icore> icores = new ArrayList<>();

        icores = IntStream.rangeClosed(0, 8000000)
                .parallel()
                .mapToObj(i -> new Icore("adasd", "sdsd", "gtrtgrt", "adasd", "sdsd", "gtrtgrt", "adasd", "sdsd", "gtrtgrt", "adasd", "sdsd"))
                .collect(Collectors.toList());

        icores.add(new Icore("adasd", "sdsd", "25-12-1986", "123", "sdsd", "gtrtgrt", "adasd", "sdsd", "gtrtgrt", "200000", "sdsd"));

        List<Npci> npci = new ArrayList<>();

        Random r = new Random();
        npci = IntStream.rangeClosed(1, 8000000)
                .parallel()
                .mapToObj(i -> new Npci("sdas" + r.nextInt(), "sdsd", "gtrtgrt", "adasd", "sdsd", "dsfsdfsdf" + r.nextInt(), "200000", "sdsd", "adasd", "sdsd", "25-12-1986", "adasd", "sdsd", "gtrtgrt", "adasd", "sdsd", "gtrtgrt", "200000", "sdsd", "sdsd", "gtrtgrt", "adasd", "sdsd", "gtrtgrt", "200000", "sdsd", "sdasd", "dscsdsa", "sdasd", "dscsdsa"))
                .collect(Collectors.toList());

        npci.add(new Npci("123", "sdsd", "gtrtgrt", "adasd", "sdsd", "25-12-1986", "200000", "sdsd", "adasd", "sdsd", "25-12-1986", "adasd", "sdsd", "gtrtgrt", "adasd", "sdsd", "gtrtgrt", "200000", "sdsd", "sdsd", "gtrtgrt", "adasd", "sdsd", "gtrtgrt", "200000", "sdsd", "sdasd", "dscsdsa", "sdasd", "dscsdsa"));

        long startTime = System.nanoTime();

        // Sending data to Kafka topics
        icores.forEach(icore -> kafkaService.sendIcoreMessage("icore-topic", icore));
        npci.forEach(npciRecord -> kafkaService.sendNpciMessage("npci-topic", npciRecord));

        long endTime = System.nanoTime();

        // Calculate the duration in milliseconds
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Time taken to send data to Kafka: " + duration + " ms");
    }
}