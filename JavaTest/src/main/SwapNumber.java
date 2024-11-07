package main;

import java.util.Arrays;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping a = " + a + " b =" + b );

        int[] swapped =  Arrays.stream(new int[]{b,a}).toArray();
        a = swapped[0];
        b = swapped[1];
        System.out.println("After swapping a = " + a + " b =" + b );
    }
}
