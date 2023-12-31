package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        OptionalInt max = IntStream.of(9,10,0,3,1,22,77,33)
                .max();

        System.out.println("max = " + max);

        OptionalInt min = IntStream.of(9,10,0,3,1,22,77,33)
                .min();

        System.out.println("min = " + min);

        OptionalDouble avg = IntStream.of(9,10,0,3,1,22,77,33)
                .average();

        System.out.println("avg = " + avg);

    }
}
