package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestExample {
    public static void main(String[] args) {
        double[] array = {1.2, 3.4, 2.5, 4.1, 2.2};
        
        // Convert array to ArrayList
        List<Double> arrayList = new ArrayList<>();
        for (double num : array) {
            arrayList.add(num);
        }

        // Find the second largest number using Java 8
        Optional<Double> secondLargest = arrayList.stream()
            .distinct()  // Remove duplicates
            .sorted(Comparator.reverseOrder())  // Sort in descending order
            .skip(1)  // Skip the largest element
            .findFirst();  // Get the next element

        // Print the second largest number
        secondLargest.ifPresentOrElse(
            num -> System.out.println("The second largest number is: " + num),
            () -> System.out.println("There is no second largest number.")
        );
    }
}
