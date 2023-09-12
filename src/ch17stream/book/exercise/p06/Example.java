package ch17stream.book.exercise.p06;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26));
        list.stream()
                .forEach(s-> System.out.println(s.getAge()));

        list.stream()
                .map(m -> m.getAge())
                .forEach(System.out::println);

        System.out.println("나이들의 합 reduce로 구해서 출력");

        Integer sum = list.stream()
                .map(m -> m.getAge())
                .reduce(0, (m, n) -> m+n);
        System.out.println("sum = " + sum);

        System.out.println("가장 많은 나이 출력");

        Integer max = list.stream()
                .map(m -> m.getAge())
                .reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
        System.out.println("max = " + max);

        System.out.println("가장 적은 나이 출력");

        Integer min = list.stream()
                .map(m -> m.getAge())
                .reduce(Integer.MAX_VALUE, (x,y) -> Math.min(x, y));
        System.out.println("min = " + min);
    }
}
