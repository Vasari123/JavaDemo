package com.example.basics;

import java.util.stream.IntStream;

public class FactorialExample {
    public static void main(String[] args) {
        int number = 5;
        long factorial = factorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to calculate the factorial of a number
    private static long factorial(int number) {
        return IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }
}
