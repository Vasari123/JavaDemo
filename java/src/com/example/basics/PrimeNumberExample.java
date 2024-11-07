package com.example.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberExample {
    public static void main(String[] args) {
        int limit = 100; // Specify the upper limit

        List<Integer> primeNumbers = IntStream.rangeClosed(2, limit) // Generate a stream of numbers from 2 to limit
            .filter(PrimeNumberExample::isPrime) // Filter out non-prime numbers
            .boxed() // Convert IntStream to Stream<Integer>
            .toList(); // Collect results into a List

        System.out.println("Prime numbers up to " + limit + ": " + primeNumbers);
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
            .noneMatch(i -> number % i == 0); // Check for factors
    }
}
