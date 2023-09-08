package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("spring");
        set.add("react");

        for(String str : set) {
            System.out.println(str);
        }
        set.forEach(System.out::println);
        // 순서가 보장되지 않음 <- HashSet의 특징.

    }
}
