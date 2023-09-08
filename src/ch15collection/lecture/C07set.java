package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        // set : 객체를 담은 객체
        // 중복 저장 불가능
        Set<String> set1 = new HashSet<>();

        // add : 원소 추가.
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        // size : 원소의 갯수
        System.out.println(set1.size()); // 3

        // contains : 있는지 확인
        System.out.println(set1.contains("java"));
        System.out.println(set1.contains("html"));

        // remove
        boolean remove1 = set1.remove("java");
        boolean remove2 = set1.remove("html");

        System.out.println("remove1 = " + remove1);
        System.out.println("remove2 = " + remove2);

        System.out.println(set1.size());

        // of 새로운 객체 만들기(수정 불가능)
        Set<String> set2 = Set.of("css", "react", "html");
//        set2.add("java"); // 생성 불가

        // 전체탐색 (향상된 for문)
        for(String str : set2) {
            System.out.println(str);
        }
        //forEach
        set2.forEach(System.out::println);
    }
}
