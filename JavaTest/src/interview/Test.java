package interview;

/*take array which have double data type numbers
Convert array to arrayList
return the second largest number from arrayList using java 8*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Test {
    public static void main(String[] args) {

        double[] arr = {10.0,15.5,20.5,5.0};
        DoubleStream result = Arrays.stream(arr);
        result.sorted().skip(2).forEach(System.out::println);

    }
}
