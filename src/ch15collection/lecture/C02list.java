package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        // List : 순서가 있음, 중복된 원소 저장 가능

        List<String> list = new ArrayList<>();

        // element 추가
        list.add("java");
        list.add("spring");
        list.add("css");
        list.add("react");

        //
        String s = list.get(0);
        String s1 = list.get(0);
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        // 몇 개가 있는지
        int size = list.size();
        System.out.println("size = " + size);

        list.add("react");
        list.add("css");

        System.out.println(list.size());

        // 지우기
        list.remove("react");
        System.out.println(list.size());
        list.remove("java");
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        
        // 있는지 확인
        
        boolean contains = list.contains("java");
        boolean contains2 = list.contains("react");

        System.out.println("contains = " + contains);
        System.out.println("contains2 = " + contains2);

        // 전체 원소 확인
        System.out.println("for문 사용");
        for (int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("향상된 for문 사용");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("foreach 메소드 사용");
        list.forEach(System.out::println);
    }
}
