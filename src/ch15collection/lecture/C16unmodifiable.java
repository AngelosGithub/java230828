package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C16unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("spring");
        list.add("html");

        list.remove(1);

        // 수정불가 리스트 만들기
        List<String> list2 = List.of("java", "spring", "css");

//        list2.add("vue"); // 에러
//        list2.remove(2); // 에러
    }
}
