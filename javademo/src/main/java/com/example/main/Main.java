package com.example.main;

import com.example.kafkaservice.KafkaService;
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
        Random r = new Random();
        icores = IntStream.rangeClosed(0, 10)
                .parallel()
                .mapToObj(i -> new Icore("POOL1234567890", "2024-09-10", "2024-09-10", "TRN1234567890"+r.nextInt(), "Payment for services", "Invoice #98765", "DummyValue1", "DummyValue2", "0987654321", "1000.00", "DR"))
                .collect(Collectors.toList());

        icores.add(new Icore("POOL1234567890", "2024-09-10", "2024-09-10", "TRN1234567890", "Payment for services", "Invoice #98765", "DummyValue1", "DummyValue2", "0987654321", "1000.00", "DR"));

        List<Npci> npci = new ArrayList<>();


        npci = IntStream.rangeClosed(1, 10)
                .parallel()
                .mapToObj(i -> new Npci("TX1234567890", "Credit", "Column2Value", "0001", "00", "2024-09-10", "12:30:45", "1000.00", "Column3Value", "Column4Value", "INV123", "Column7Value", "Column8Value", "payer@bank", "Column9Value", "Column10Value", "payee@bank", "PART12345", "IFSC0001234", "Column11Value", "1234567890", "Column12Value", "Column13Value", "Column14Value", "Column15Value", "INST001", "IN", "INR", "1500.00", "0.00","TRN1234567890"+r.nextInt()))
                .collect(Collectors.toList());

        npci.add(new Npci("TX1234567890", "Credit", "Column2Value", "0001", "00", "2024-09-10", "12:30:45", "1000.00", "Column3Value", "Column4Value", "INV123", "Column7Value", "Column8Value", "payer@bank", "Column9Value", "Column10Value", "payee@bank", "PART12345", "IFSC0001234", "Column11Value", "1234567890", "Column12Value", "Column13Value", "Column14Value", "Column15Value", "INST001", "IN", "INR", "1500.00", "0.00","TRN1234567890"));

        long startTime = System.nanoTime();

        // Sending data to Kafka topics
        icores.forEach(icore -> kafkaService.sendIcoreMessage("icore-topic", icore.getTranId(),icore));
        npci.forEach(npciRecord -> kafkaService.sendNpciMessage("npci-topic",npciRecord.getTranId(), npciRecord));

        long endTime = System.nanoTime();

        // Calculate the duration in milliseconds
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Time taken to send data to Kafka: " + duration + " ms");
    }
}