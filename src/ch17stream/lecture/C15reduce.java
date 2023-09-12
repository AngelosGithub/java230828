package ch17stream.lecture;

import java.util.List;

public class C15reduce {
    public static void main(String[] args) {
        // reduce (줄이다)

        var list = List.of(5,1,3);
        int reduce = list.stream()
                .reduce(0, (r, e) -> 0);
        System.out.println("reduce = " + reduce);

        System.out.println("모든 값 더하기");
        Integer reduce2 = list.stream()
                .reduce(0, (r, e) -> r+e);
        System.out.println("reduce2 = " + reduce2);

        System.out.println("최대값 구하기");
        Integer reduce3 = list.stream()
                .reduce(Integer.MIN_VALUE, (x, y) -> Math.max(x, y));
        System.out.println("reduce3 = " + reduce3);

        System.out.println("최소값 구하기");
        Integer reduce4 = list.stream()
                .reduce(Integer.MAX_VALUE, (x, y) -> Math.min(x, y));
        System.out.println("reduce4 = " + reduce4);

        var list2 = List.of("ja", "va", "is", "g", "ood");
        System.out.println();
        System.out.println("고전적인 for문");
        String res1 = "";
        for (String e : list2) {
            res1 += e;
        }
        System.out.println("res1 = " + res1);

        System.out.println("stream 이용");
        String reduce5 = list2.stream()
                .reduce("",  String::concat);

        System.out.println("reduce5 = " + reduce5);
        
    }
}
