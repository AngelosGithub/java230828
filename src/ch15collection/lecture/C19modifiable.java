package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19modifiable {
    public static void main(String[] args) {
        List<String > list = List.of("html", "css", "react", "js");
        List<String> list2 = new ArrayList<>();

        list2.add("java");

        System.out.println("list1.size() = " + list.size());
        System.out.println("list2.size() = " + list2.size());
        System.out.println("프로그램 실행 중... ");
    }



}
