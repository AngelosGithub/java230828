package ch17stream.book.exercise.p05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expression");

        list.stream()
                .filter(n -> n.toLowerCase().matches(".*java.*"))
                .forEach(System.out::println);
    }
}
